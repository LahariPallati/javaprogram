package products.com.example.productsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import products.com.example.productsdemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
