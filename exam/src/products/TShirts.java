package products;

public class TShirts {
    private String name;
    private String productCode;
    private double price;
    private String brand;
    private String description;
    private String[] availableSizes;

    public TShirts(String name, String productCode, double price, String brand, String description, String[] availableSizes) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.availableSizes = availableSizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }

    public void display() {
        System.out.println("Item name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + productCode);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + arrayToString(availableSizes));
        System.out.println();
    }

    private String arrayToString(String[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}