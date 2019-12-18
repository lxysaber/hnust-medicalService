package com.medical.audit_service.serviceTest;

import com.medical.audit_service.basejunit4test.BaseJunit4Tests;
import com.medical.audit_service.entity.User;
import com.medical.audit_service.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService extends BaseJunit4Tests {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void testUser(){
        User user = new User();
        user = userServiceImpl.getUserById(1);
        System.out.println("UserInfo=========="+user);
    }

}
