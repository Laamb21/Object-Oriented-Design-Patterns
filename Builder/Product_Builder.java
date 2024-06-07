package Builder;

public class Product_Builder {
    private String name;
    private String type;
    private double price;

    public Product_Builder() {}

    public Product_Builder(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Product_Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Product_Builder setType(String type) {
        this.type = type;
        return this;
    }

    public Product_Builder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Product build() {
        return new Product(name, type, price);
    }
}
