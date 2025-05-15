package tudelft.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductBuilderTest{
    @Test
    void testProductBuilder() {
        Product product = new ProductBuilder()
                .withName("icy americano")
                .withPrice(3.99)
                .withCategory("drink")
                .build();
        Assertions.assertEquals("icy americano - 3.99 - drink\n", product.toString());
    }
}