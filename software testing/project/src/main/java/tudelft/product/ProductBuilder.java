package tudelft.product;

public class ProductBuilder{
    private String name = "default";
    private double price = 0.0;
    private String category = "default";

    public ProductBuilder withName(String name){
        this.name = name;
        return this;
    }

    public ProductBuilder withPrice(double price){
        this.price = price;
        return this;
    }

    public ProductBuilder withCategory(String category){
        this.category = category;
        return this;
    }

    public Product build(){
        return new Product(this.name, this.price, this.category);
    }
}