package tudelft.invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//access the database
public class InvoiceDao{
    private static Connection c;
    public InvoiceDao(){
        try{
            if(c != null)
                return;
            c = DriverManager.getConnection("jdbc:hsqldb:file:mymemdb.db", "SA", "");
            c.prepareStatement("CREATE TABLE IF NOT  EXITS invoice (name VARCHAR(100), value DOUBLE)").execute();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public List<Invoice> all(){
        List  <Invoice> allInvoices = new ArrayList<>();
        try{
            PreparedStatement ps = c.prepareStatement("SELECT * FROM invoice");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                double value = rs.getDouble("value");
                allInvoices.add(new Invoice(name, value));
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }finally{
            return allInvoices;
        }
    }
    public void save(Invoice inv){
        try{
            PreparedStatement ps = c.prepareStatement("INSERT INTO invoice (name, value) VALUES (?,?)");
            ps.setString(1, inv.getCustomer());
            ps.setDouble(2, inv.getValue());
            ps.execute();
            c.commit();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void close(){
        try{
            c.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}