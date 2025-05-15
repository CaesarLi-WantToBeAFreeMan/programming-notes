package tudelft.product;

public class Product{
    private String name = "default";
    private double price = 0.0;
    private String category = "default";

    public Product(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString(){
        return this.name + " - " + this.price + " - " + this.category + "\n";
    }
}