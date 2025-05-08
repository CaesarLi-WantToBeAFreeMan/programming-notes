package tudelft.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class InvoiceFilterTest{
    @Test
    void filterInvoices(){
        /*
        real
        InvoiceDao dao = new InvoiceDao();
        */
        Invoice mauricio = new Invoice("Mauricio", 20.0),
                arie = new Invoice("Arie", 300.0);
        /*
        real
        dao.save(mauricio);
        dao.save(arie);
        */
        //mock
        InvoiceDao dao = Mockito.mock(InvoiceDao.class);
        List <Invoice> list = Arrays.asList(mauricio, arie);
        //call all method of the mock class, then return an in-memory list
        Mockito.when(dao.all()).thenReturn(list);

        InvoiceFilter filter = new InvoiceFilter(dao);
        List <Invoice> result = filter.filter();
        Assertions.assertEquals(mauricio, result.get(0));
        Assertions.assertEquals(1, result.size());
        dao.close();
    }
}