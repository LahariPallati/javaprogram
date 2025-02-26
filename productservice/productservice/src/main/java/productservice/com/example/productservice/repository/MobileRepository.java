package productservice.com.example.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import productservice.com.example.productservice.entity.Mobile;
@Repository
public interface MobileRepository extends JpaRepository<Mobile,Long> {
    // Custom query methods if needed
}
