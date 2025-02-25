package productservice.com.example.productservice.dto;
public class MobileResponseDTO {

    private String model;
    private String manufacturer;
    private int manufacturedYear;

    // Constructor
    public MobileResponseDTO(String model, String manufacturer, int manufacturedYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.manufacturedYear = manufacturedYear;
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

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }
}
