package ku.cs.shibaqueuerestapi.repository;

import ku.cs.shibaqueuerestapi.ShibaqueueRestapiApplication;
import ku.cs.shibaqueuerestapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    Customer findByUsername(String username);
}
