package com.app.impl.phone.service.impl;

import com.app.impl.phone.service.PhoneService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @Author: Y.Z.Y
 * @Descriptions:
 * @Date: Created in 2022/4/16
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class PhoneServiceImpl implements PhoneService {

    @Override
    public String sendRegCode(String mobileNumber) {

        Random random = new Random();
        int code = random.nextInt(8999) + 1000;

        return String.valueOf(code);
    }
}
