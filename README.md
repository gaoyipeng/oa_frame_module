# oa_frame_module项目说明：

##一、常用URL
*swagger接口文档：*   
<http://127.0.0.1:8080/swagger-ui.html>  
<http://127.0.0.1:8081/swagger-ui.html>  
<http://127.0.0.1:8091/swagger-ui.html>  
<http://127.0.0.1:8092/swagger-ui.html>  

*eureka服务端页面：* 
<http://localhost:7001/>  


##二、修改hosts文件
127.0.0.1 eureka7001.com  
127.0.0.1 eureka7002.com  
127.0.0.1 zuul8888.com  

##三、hystrix 连接
<http://127.0.0.1:8091/hystrix>  
<http://127.0.0.1:8091/actuator/hystrix.stream>  
##四、zuul配置访问示例
<http://zuul8888.com:8888/module/oaservice/getDeptList>  
