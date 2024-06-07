package Builder;

public class Main {
    public static void main(String[] args) {
        Product_Builder builder = new Product_Builder();
        Product product = builder.setName("Apple").setType("Fruit").setPrice(1.99).build();
        System.out.println(product.toString());
    }
}
