package com.medical.audit_service.repository;

import com.medical.audit_service.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
      //根据Id查找用户信息
      User getUserInfoById(Integer id);
}