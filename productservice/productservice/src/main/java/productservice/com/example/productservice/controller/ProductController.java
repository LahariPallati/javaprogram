package productservice.com.example.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import productservice.com.example.productservice.dto.MobileRequestDTO;
import productservice.com.example.productservice.entity.Mobile;
import productservice.com.example.productservice.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService mobileService;

    @Autowired
    public ProductController(ProductService mobileService) {
        this.mobileService = mobileService;
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        try {
            return ResponseEntity.ok(mobileService.getAllMobiles());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error fetching products: " + e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity<Mobile> createMobile(@RequestBody MobileRequestDTO mobileRequestDTO) {
        try {
            // Save the mobile data
            Mobile savedMobile = mobileService.saveMobile(mobileRequestDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedMobile);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
