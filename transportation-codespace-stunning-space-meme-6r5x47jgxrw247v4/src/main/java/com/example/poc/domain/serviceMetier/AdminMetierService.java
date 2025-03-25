package com.example.poc.domain.serviceMetier;

import com.example.poc.domain.model.Admin;
import java.util.List;

public interface AdminMetierService {


    Admin saveAdmin(Admin admin);
    Admin getAdminById(Long id);
    List<Admin> getAllAdmin();
    void desactivAdmin(Long id);
}
