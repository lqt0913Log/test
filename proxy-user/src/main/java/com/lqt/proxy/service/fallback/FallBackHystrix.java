package com.lqt.proxy.service.fallback;

import com.lqt.proxy.service.feign.UserFeignService;
import org.springframework.stereotype.Component;

@Component
public class FallBackHystrix implements UserFeignService {

    @Override
    public String home(String name) {
        return name+ " 服务暂时不通！";
    }
}
