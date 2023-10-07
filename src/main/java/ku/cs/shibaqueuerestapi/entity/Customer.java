package ku.cs.shibaqueuerestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private UUID idCustomer;

    private String username;
    private String password;
    private String email;
}
