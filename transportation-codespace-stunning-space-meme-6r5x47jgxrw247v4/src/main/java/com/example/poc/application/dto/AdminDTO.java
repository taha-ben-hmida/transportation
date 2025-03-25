package com.example.poc.application.dto;

import com.example.poc.domain.model.Admin;
import com.example.poc.domain.model.AdminRole;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AdminDTO{
 private String adminName;
 private String password;
 private String email;
private AdminRole role;
private  boolean isActive;
 
 public AdminDTO(String adminName, String password,String email,AdminRole role, boolean isActive )
 {
     this.adminName = adminName;
     this.password = password;
     this.email = email;
     this.role = role;
     this.isActive = isActive;
 }

}
