package productservice.com.example.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productservice.com.example.productservice.dto.MobileRequestDTO;
import productservice.com.example.productservice.entity.Mobile;
import productservice.com.example.productservice.repository.MobileRepository;

import java.util.List;

@Service
public class ProductService{

    private final MobileRepository mobileRepository;

    @Autowired
    public ProductService(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    public List<Mobile> getAllMobiles() {
        return mobileRepository.findAll();
    }

    // Method to save the mobile data to the database
    public Mobile saveMobile(MobileRequestDTO mobileRequestDTO) {
        Mobile mobile = new Mobile();
        mobile.setModel(mobileRequestDTO.getModel());
        mobile.setManufacturer(mobileRequestDTO.getManufacturer());
        mobile.setManufactureYear(mobileRequestDTO.getManufactureYear());

        return mobileRepository.save(mobile);
    }
}
