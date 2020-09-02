package com.colourful.springbootlittiledemo.oldSomething.endpoint;

import com.colourful.springbootlittiledemo.oldSomething.bean.UserRequest;
import com.colourful.springbootlittiledemo.oldSomething.bean.UserResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Date;

/**
 * @Description
 * @Version
 * @Date 8/31/2020
 * @Author Gon
 */

@Endpoint
public class UserEndpoint
{
    @PayloadRoot(namespace = "http://www.hifreud.com/ws/demo", localPart = "UserRequest")
    @ResponsePayload
    public UserResponse findUserById(@RequestPayload UserRequest request) throws Exception
    {
        System.out.println(request.getUserId());

        UserResponse userResponse = new UserResponse();
        userResponse.setUsername("Freud");
        userResponse.setGender("Male");
        userResponse.setBirthday(new Date());
        userResponse.setLocation("Dalian");
        return userResponse;
    }
}
