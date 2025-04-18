package com.example.poc.serviceApplicatif;

import com.example.poc.model.UserDTO;
import com.example.poc.mapper.UserMapper;
import com.example.poc.domain.User;
import com.example.poc.domain.UserRole;
import com.example.poc.servicemetier.UserMetierService;
import com.example.poc.servicemetier.UserMetierServiceImpl;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceApplicatif {

    final private UserMapper userMapper;
    final private UserMetierService userMetierService;
   final private PasswordEncoder passwordEncoder;


    public UserServiceApplicatif(UserMapper userMapper, UserMetierService userMetierService, PasswordEncoder passwordEncoder){
        this.userMapper= userMapper;
        this.userMetierService= userMetierService;
        this.passwordEncoder= passwordEncoder;
    }

    
    //Méthode pour enregistrer un user avec un mot de passe encodé
     public UserDTO saveUser(UserDTO userDTO){
        //convertir en entity 

        User  user= userMapper.toEntity(userDTO);
      //sauvgarde dans la base 
        User usersaved = userMetierService.saveUser(user);
       
        return userMapper.toDto(usersaved);

    }

 
    public UserDTO getUserById(Long id) {
        User user = userMetierService.getUserById(id);
       return  userMapper.toDto(user);
           
    }

    public List<UserDTO> getAllUsersByRole(){
        List<User> users = userMetierService.getAllUserByRole();
        return userMapper.toDtoList(users);
       }
    
  
       public void desactiveUser(Long id){
        
            userMetierService.desactiveUser(id);

       }


public void activateUser(Long id) {
     
    userMetierService.activateUser(id);

}

}
public User putUser(Long id, UserDTO userDTO){
    
      User user = userMapper.toEntity(userDTO);
      User userupdated = userMetierService.putUser(id, user);
      return userupdated.us
}

    /* 
    public AdminDTO creerSuperAdminSiAbsent(){
        if(!adminMetierService.superAdminExiste()){
            Admin superAdmin = new Admin(
                "SuperAdmin",
                "admin123",
                "superadmin@example.com",
                AdminRole.SUPER_ADMIN,
                true
            );
            superAdmin.setPassword(passwordEncoder.encode(superAdmin.getPassword()));
            Admin saved = adminMetierService.saveAdmin(superAdmin);
            return adminMapper.toDTO(saved);
                }
        return null;
    }

}
    */
