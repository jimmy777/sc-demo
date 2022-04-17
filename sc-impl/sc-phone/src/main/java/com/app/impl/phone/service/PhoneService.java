package com.app.impl.phone.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Y.Z.Y
 * @Descriptions:
 * @Date: Created in 2022/4/16
 */
@RestController
@RequestMapping("phone/api/v1")
public interface PhoneService {

    @PostMapping("sendRegCode")
    String sendRegCode(String mobileNumber);
}
