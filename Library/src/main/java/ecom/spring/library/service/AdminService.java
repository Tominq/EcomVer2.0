package ecom.spring.library.service;

import ecom.spring.library.dto.AdminDto;
import ecom.spring.library.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
