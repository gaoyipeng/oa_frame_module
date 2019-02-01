package com.sxdx.oa_client01.feignTest.service.fallBack;

import com.sxdx.oa_client01.feignTest.service.DeptService;
import com.sxdx.oa_client01.ribbonTest.bean.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DeptServiceFallBack implements FallbackFactory<DeptService> {

    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public Dept getDeptMap(Integer id) {
                return new Dept(id,"id为："+id+"的部门查询失败");
            }

            @Override
            public List<Dept> getDeptList() {
                return null;
            }
        };
    }
}
