package com.example.demo.service;

import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public Userdto SaveUser(Userdto userdto){
        userRepo.save(modelMapper.map(userdto, User.class));
        return userdto;

    }
}
