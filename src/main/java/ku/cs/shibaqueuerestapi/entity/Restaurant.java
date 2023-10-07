package ku.cs.shibaqueuerestapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.util.UUID;

@Data
@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private UUID idRestaurant;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Admin admin;

    @OneToOne
    private Booking booking;

    private Image restaurantImage;
    private String username;
    private String password;
    private String email;
    private String restaurantName;
    private String description;

}
