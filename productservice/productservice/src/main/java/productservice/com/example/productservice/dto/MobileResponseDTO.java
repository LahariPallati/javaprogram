package productservice.com.example.productservice.dto;
public class MobileResponseDTO {

    private String model;
    private String manufacturer;
    private int manufactureYear;

    // Constructor
    public MobileResponseDTO(String model, String manufacturer, int manufacturedYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufacturedYear;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufacturedYear) {
        this.manufactureYear = manufacturedYear;
    }
}
