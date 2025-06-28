package com.example.userordersapp.dto;

import java.util.List;

public record UserDTO(Long id, String name, String email, List<OrderDTO> orders) {}