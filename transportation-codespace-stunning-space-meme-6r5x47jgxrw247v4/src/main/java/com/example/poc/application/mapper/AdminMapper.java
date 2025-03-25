package com.example.poc.application.mapper;

import org.springframework.stereotype.Component;

import com.example.poc.application.dto.AdminDTO;
import com.example.poc.domain.model.Admin;

public class AdminMapper {

    public AdminDTO toDTO(Admin admin) {
        return new AdminDTO(
            admin.getAdminName(),
            admin.getPassword(),
            admin.getEmail(),
            admin.getRole(),
            admin.isActive()
               
               
        );
    }

    public Admin toEntity(AdminDTO adminDTO) {
        return new Admin(
            adminDTO.getAdminName(),
            adminDTO.getPassword(),
            adminDTO.getEmail(),
            adminDTO.getRole(),
            adminDTO.isActive()
           
        );
    }
}

