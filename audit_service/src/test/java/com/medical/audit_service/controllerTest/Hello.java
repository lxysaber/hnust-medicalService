package com.medical.audit_service.controllerTest;

import com.medical.audit_service.basejunit4test.BaseJunit4Tests;
import com.medical.audit_service.controller.HelloController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Hello extends BaseJunit4Tests {

    @Autowired
    private HelloController helloController;

    @Test
    public void test(){
        String testString =  helloController.selectUser();
        System.out.println("testString======"+testString);
    }

}
