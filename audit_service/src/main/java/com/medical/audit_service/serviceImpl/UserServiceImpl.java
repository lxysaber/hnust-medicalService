package com.medical.audit_service.serviceImpl;


import com.medical.audit_service.entity.User;
import com.medical.audit_service.repository.UserMapper;
import com.medical.audit_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer Id){
        User user = new User();
        user = userMapper.getUserInfoById(1);
        return user;
    }

}
