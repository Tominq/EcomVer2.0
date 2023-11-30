package ecom.spring.library.service;

import ecom.spring.library.dto.CustomerDto;
import ecom.spring.library.model.Customer;

public interface CustomerService {
    Customer save(CustomerDto customerDto);
    Customer findByUsername(String username);

    Customer update(CustomerDto customerDto);

    Customer changePass(CustomerDto customerDto);

    CustomerDto getCustomer(String username);
}
