package com.app.impl.member.controller;

import com.app.core.common.base.ApiResult;
import com.app.impl.member.feign.PhoneServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Y.Z.Y
 * @Descriptions:
 * @Date: Created in 2022/4/15
 */
@RestController
@RequestMapping("member/api/v1")
public class MemberController {

    @Autowired
    private PhoneServiceFeign phoneServiceFeign;

    /**
     * 发送手机验证码
     * {
     *     code: 状态码,
     *     message: 消息，
     *     data: 响应数据
     * }
     */
    @PostMapping("sendRegCode")
    public ApiResult sendRegCode(String mobileNumber) {
        // 1.校验手机号码格式

        // 2.判断手机号是否存在

        // 3.调用手机服务发送验证码
        String regCode = phoneServiceFeign.sendRegCode(mobileNumber);
        return ApiResult.success().put("code",regCode).put("number", 123).setMessage("操作完成");
    }
}
