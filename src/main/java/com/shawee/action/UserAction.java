package com.shawee.action;

import com.opensymphony.xwork2.ActionContext;
import com.shawee.enity.UserEntity;
import com.shawee.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.List;
import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by shawee on 2018/7/19
 */
@Controller
public class UserAction {
    @Autowired
    public UserService userService;

    public String user(){
        List<UserEntity> userList = userService.getAll();
        Map map = (Map) ActionContext.getContext().get("request");
        map.put("userList", userList);
        return SUCCESS;
    }
}
