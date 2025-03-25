package com.example.poc.domain.serviceMetier;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.poc.domain.model.Admin;
import com.example.poc.domain.repository.AdminRepository;

@Service
public class AdminMetierServiceImpl  implements AdminMetierService{


private final AdminRepository adminRepository ;
private final PasswordEncoder passwordEncoder;
 
public AdminMetierServiceImpl(AdminRepository adminRepository, PasswordEncoder passwordEncoder){

    this.adminRepository = adminRepository;
    this.passwordEncoder = passwordEncoder;
  
}

@Override
public Admin saveAdmin(Admin admin){
    
    String encodedPassword = passwordEncoder.encode(admin.getPassword());
    admin.setPassword(encodedPassword);
    return adminRepository.save(admin);
}
@Override
public Admin getAdminById(Long id){
    return adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin not found"));
}

   public List<Admin> getAllAdmin(){
    return adminRepository.findAll();
   }

public void desactivAdmin(Long id){
    Optional <Admin> adminOpt = adminRepository.findById(id);
    if (adminOpt.isPresent()){
        Admin admin =  adminOpt.get();
        admin.setActive(false); // descative admin
        adminRepository.save(admin);
    } else {
        throw new RuntimeException("Admin not found");
    }


}

}