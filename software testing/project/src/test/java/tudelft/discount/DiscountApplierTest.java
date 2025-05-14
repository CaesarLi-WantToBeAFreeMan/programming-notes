package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest{
    @Test
    public void mockTest(){
        Product chocolateCake = new Product("chocolate", 8.99, "HOME"),
                firedChicken = new Product("fired chicken", 5.99, "BUSINESS");
        ProductDao pd = Mockito.mock(ProductDao.class);
        List <Product> products = Arrays.asList(chocolateCake, firedChicken);
        Mockito.when(pd.all()).thenReturn(products);
        DiscountApplier da = new DiscountApplier(pd);
        da.setNewPrices();
        Assertions.assertEquals(8.091, chocolateCake.getPrice(), 1e-9);
        Assertions.assertEquals(6.589, firedChicken.getPrice(), 1e-9);
    }
}