package ku.cs.shibaqueuerestapi.repository;

import ku.cs.shibaqueuerestapi.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
    Restaurant findByRestaurantName(String restaurantName);
}
