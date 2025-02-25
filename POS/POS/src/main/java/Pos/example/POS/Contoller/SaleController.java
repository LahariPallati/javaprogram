package Pos.example.POS.Contoller;

import Pos.example.POS.Entity.Sale;
import Pos.example.POS.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sales")
public class SaleController {
    @Autowired
    private SaleService service;

    @PostMapping
    public Sale createSale(@RequestBody Sale sale) {
        return service.recordSale(sale);
    }
}



