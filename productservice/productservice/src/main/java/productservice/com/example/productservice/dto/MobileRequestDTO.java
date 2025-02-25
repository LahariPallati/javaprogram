package productservice.com.example.productservice.dto;

public class MobileRequestDTO {
    private String model;
    private String manufacturer;
    private int manufactureYear; // ✅ Ensure this matches JSON request field

    // Default constructor (needed for Jackson serialization)
    public MobileRequestDTO() {}

    public MobileRequestDTO(String model, String manufacturer, int manufactureYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
    }

    // ✅ Ensure getters and setters are correct
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

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "MobileRequestDTO{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
