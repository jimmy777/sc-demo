package com.app.impl.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Y.Z.Y
 * @Descriptions: 手机服务feign客户端
 * @Date: Created in 2022/4/17
 */
@Component
@FeignClient(name = "phone-server") //服务名称
public interface PhoneServiceFeign {

    @PostMapping("phone/api/v1/sendRegCode") // 服务全路径，与提供服务的方法和路径相同
    String sendRegCode(@RequestParam("mobileNumber") String mobileNumber); // 与提供服务的方法中的参数名称保持一致
}
