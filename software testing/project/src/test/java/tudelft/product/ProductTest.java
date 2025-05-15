package tudelft.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest{
    @Test
    void testProduct(){
        /*
        Product product = new Product("icy americano", 3.99, "drink");
        */
        String name = "icy americano";
        double price = 3.99;
        String category = "drink";
        Product product = new Product(name, price, category);
        Assertions.assertEquals("icy americano - 3.99 - drink\n", product.toString());
    }
}