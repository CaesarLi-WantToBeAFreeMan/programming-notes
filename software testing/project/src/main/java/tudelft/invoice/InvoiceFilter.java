package tudelft.invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceFilter{
    //for mock
    private InvoiceDao dao;
    public InvoiceFilter(InvoiceDao dao){
        this.dao = dao;
    }
    public List<Invoice> filter(){
        List  <Invoice> filtered = new ArrayList<>();
        /*
        use real database
        for(Invoice inv : new InvoiceDao().all())
        */
        for(Invoice i : this.dao.all())
            if(i.getValue() < 100.0)
                filtered.add(i);
        return filtered;
    }
}