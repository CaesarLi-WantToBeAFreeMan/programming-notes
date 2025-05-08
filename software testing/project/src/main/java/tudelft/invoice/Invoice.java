package tudelft.invoice;

public class Invoice{
    private String customer;
    private double value;
    //constructor
    public Invoice(String customer, double value){
        this.customer = customer;
        this.value = value;
    }

    //getters
    public String getCustomer(){
        return customer;
    }

    public double getValue(){
        return value;
    }

    //override methods
    @Override
    public boolean equals(Object object){
        if(this == object)
            return true;
        if(object == null || this.getClass() != object.getClass())
            return false;
        Invoice invoice = (Invoice)object;
        if(Double.compare(invoice.value, this.value) != 0)
            return false;
        return this.customer != null ? this.customer.equals(invoice.customer) : invoice.customer == null;
    }

    @Override
    public int hashCode(){
        int result = customer != null ? customer.hashCode() : 0;
        long temp  = Double.doubleToLongBits(value);
        result = 31 * result + (int)(temp ^ (temp >>> 32));
        return result;
    }
}