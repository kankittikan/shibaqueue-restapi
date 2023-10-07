package ku.cs.shibaqueuerestapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private UUID idBooking;
    private LocalDateTime dateTime;

    @ManyToOne
    private Customer idCustomer;

    @OneToOne
    private Restaurant idRestaurant;

    @OneToOne
    private TableType idTableType;

}
