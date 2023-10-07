package ku.cs.shibaqueuerestapi.repository;

import ku.cs.shibaqueuerestapi.entity.TableType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TableTypeRepository extends JpaRepository<TableType, UUID> {
}
