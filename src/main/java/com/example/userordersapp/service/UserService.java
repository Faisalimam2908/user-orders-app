package com.example.userordersapp.service;

import com.example.userordersapp.dto.*;
import com.example.userordersapp.entity.User;
import com.example.userordersapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO getUserWithOrders(Long id) {
        User user = userRepository.findUserWithOrders(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<OrderDTO> orderDTOs = user.getOrders().stream()
                .map(o -> new OrderDTO(o.getId(), o.getProduct(), o.getAmount()))
                .collect(Collectors.toList());

        return new UserDTO(user.getId(), user.getName(), user.getEmail(), orderDTOs);
    }
}