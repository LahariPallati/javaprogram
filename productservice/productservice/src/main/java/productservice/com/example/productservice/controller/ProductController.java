package productservice.com.example.productservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import productservice.com.example.productservice.dto.MobileRequestDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    private final List<MobileRequestDTO> mobileProducts = new ArrayList<>();

    @PostMapping
    public ResponseEntity<MobileRequestDTO> addProduct(@RequestBody MobileRequestDTO mobile) {
       ProductController.log.info("Received: " + mobile); // Debugging print
        mobileProducts.add(mobile);
        return ResponseEntity.ok(mobile);
    }

    @GetMapping
    public List<MobileRequestDTO> getProducts() {
        return mobileProducts;
    }
}
