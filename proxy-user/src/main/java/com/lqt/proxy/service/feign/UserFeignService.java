package com.lqt.proxy.service.feign;

import com.lqt.proxy.service.fallback.FallBackHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "serv-user",fallback = FallBackHystrix.class)
public interface UserFeignService {
    @GetMapping("/hi")
    String home(@RequestParam String name);
}
