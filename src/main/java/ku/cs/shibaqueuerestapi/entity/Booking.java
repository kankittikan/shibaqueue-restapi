package ku.cs.shibaqueuerestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
}
