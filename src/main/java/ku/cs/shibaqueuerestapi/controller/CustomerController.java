package ku.cs.shibaqueuerestapi.controller;

import ku.cs.shibaqueuerestapi.entity.Customer;
import ku.cs.shibaqueuerestapi.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return service.getAll();
    }

    @GetMapping("/customer/{idCustomer}")
    public Customer getCustomerById(@PathVariable UUID idCustomer) {
        return service.getCustomerById(idCustomer);
    }

    @GetMapping("/customer/name/{username}")
    public Customer getCustomerByUsername(@PathVariable String username) {
        return service.getCustomerByUsername(username);
    }

    @PostMapping("/customer")
    public Customer create(@RequestBody Customer customer){
        return service.create(customer);
    }

    @PutMapping("/customer")
    public Customer update(@RequestBody Customer customer) {
        return service.update(customer);
    }

    @DeleteMapping("/customer/{idCustomer}")
    public Customer delete(@PathVariable UUID idCustomer) {
        return service.delete(idCustomer);
    }
}
