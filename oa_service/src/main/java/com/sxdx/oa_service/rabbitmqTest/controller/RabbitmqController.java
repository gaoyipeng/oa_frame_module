package com.sxdx.oa_service.rabbitmqTest.controller;

import com.sxdx.oa_service.rabbitmqTest.model.Meeting;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gaoypieng
 * @create 2018-11-18 10:46
 *     1、交换机.交换机的主要作用是接收相应的消息并且绑定到指定的队列.交换机有四种类型,分别为Direct,topic,headers,Fanout.
 * 　　   （1）Direct是RabbitMQ默认的交换机模式,也是最简单的模式.即创建消息队列的时候,指定一个BindingKey.当发送者发送消息的时候,指定对应的Key.
 *          当Key和消息队列的BindingKey一致的时候,消息将会被发送到该消息队列中.
 * 　　   （2）topic转发信息主要是依据通配符,队列和交换机的绑定主要是依据一种模式(通配符+字符串),而当发送消息的时候,只有指定的Key和该模式相匹配的时候,
 *           消息才会被发送到该消息队列中.
 * 　　   （3）headers也是根据一个规则进行匹配,在消息队列和交换机绑定的时候会指定一组键值对规则,而发送消息的时候也会指定一组键值对规则,
 *          当两组键值对规则相匹配的时候,消息会被发送到匹配的消息队列中.
 * 　　   （4）Fanout是路由广播的形式,将会把消息发给绑定它的全部队列,即便设置了key,也会被忽略.
 */
@Controller
public class RabbitmqController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    /**
     * 测试 direct 交换器
     */
    @GetMapping(value = "/testRabbitmq01")
    @ResponseBody
    public Meeting testRabbitmq01(){
        Meeting meeting = new Meeting();
        meeting.setMeetingName("会议名称");
        meeting.setMeetingContent("会议内容");
        rabbitTemplate.convertAndSend("amq.direct","meeting",meeting);
        //Meeting meeting1  = (Meeting) rabbitTemplate.receiveAndConvert("meeting");
        return meeting;
    }

    @RabbitListener(queues = "meeting")
    public void listeningRabbitmq(Meeting meeting){
        System.out.println("收到会议通知，准备发送："+meeting);
    }
}
