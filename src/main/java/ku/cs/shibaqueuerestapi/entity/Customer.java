package ku.cs.shibaqueuerestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.awt.*;
import java.util.ArrayList;
import java.util.UUID;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private UUID idCustomer;

    @OneToMany//(mappedBy = "customer")
    private ArrayList<Booking>  bookingList = new ArrayList<>() ;

    private Image customerImage;
    private String username;
    private String password;
    private String email;
}
