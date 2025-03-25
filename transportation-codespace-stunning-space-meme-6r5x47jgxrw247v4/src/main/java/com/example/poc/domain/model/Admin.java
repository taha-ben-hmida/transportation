package com.example.poc.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.example.poc.domain.model.Livreur;
import com.example.poc.domain.model.AdminRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private String id;
     
     @Column(unique = true,nullable = false)
     private String adminName;

     @Column(nullable = false)
     private String password;
     
     @Column(unique = true, nullable = false)
     private String email;

     @Column(nullable = false)
     private boolean isActive = true ;

     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private AdminRole role;

     @OneToMany(mappedBy = "admin" ,cascade= CascadeType.ALL)
     private List<Livreur> livreur;



     public Admin(String adminName, String password, String email,  AdminRole role, boolean isActive) {
        this.adminName = adminName;
        this.password = password;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }
}
