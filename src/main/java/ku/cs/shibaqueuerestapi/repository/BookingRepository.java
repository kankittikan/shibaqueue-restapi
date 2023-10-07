package ku.cs.shibaqueuerestapi.repository;

import ku.cs.shibaqueuerestapi.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository<UUID> extends JpaRepository<Booking, UUID> {
}
