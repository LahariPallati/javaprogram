package Pos.example.POS.Service;

import Pos.example.POS.Entity.Sale;
import Pos.example.POS.Repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    public Sale recordSale(Sale sale) {
        return repository.save(sale);
    }
}
