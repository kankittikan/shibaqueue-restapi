package ku.cs.shibaqueuerestapi.repository;

import ku.cs.shibaqueuerestapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
