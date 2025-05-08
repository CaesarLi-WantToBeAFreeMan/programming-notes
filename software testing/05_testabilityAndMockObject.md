# week #4: Testability And Mock Object

# Platform: Edx

# Course Name: DelftX ST1x Automated Software Testing: Unit Testing, Coverage Criteria and Design for Testability

# Author: Caesar James LEE

## Unknown Keywords

| English           | Pronunciation     | Chinese Meaning            |
| :---------------: | :---------------: | :------------------------: |
| flaky             | ˈflеkɪ            | 薄片的；成層狀的；不穩定的   |
| mock              | mɑk               | 假的；模擬的                |
| invoice           | ˈɪnvɒɪs           | 開……的發票；將……列入清單     |
| infrastructure    | ˈɪnfrǝˌstrʌktʃɚ   | 公共建設；基礎建設           |
| legacy            | ˈlɛɡǝsɪ           | 遺產                       |
| precise           | prɪˈsaɪs          | 精確的；嚴格的              |
| verbose           | vɚˈbos            | 囉嗦的；冗長的              |
| decorator         | ˈdɛkǝˌrеtɚ        | 室內設計師                  |
| stub              | stʌb              | 殘端；菸蒂；存根             |
| snapshot          | ˈsnæpˌʃɑt         | 快照；急射；簡要印象         |
| tie               | taɪ               | 繫；束縛；打成平手           |


## Unknown phrase

| English               | Pronunciation     | Chinese Meaning            |
| :-------------------: | :---------------: | :------------------------: |
| so on and so forth    | so ɑn ænd so forθ | 等等                       |

## test levels

1. `unit testing`:
    * test a single and isolated unit like a function, method, class, etc
    * isolated from an external systems (e.g., databases, networks)
    * advantages
        1. very fast
        2. easy to control using parameters or mocks
        3. easy to write and maintain
    * disadvantages
        1. less real
        2. some bugs cannot be reproduced at this level
2. `system testing`
    * test the complete system as a whole (end-to-end)
    * mimic real user workflows in a production-like environment
    * advantages
        1. very realistic
        2. capture the user perspective
    * disadvantages
        1. slow
        2. hard to write
        3. flaky
3. `integration testing`
    * test the interaction between multiple components or units
    * ensures that units work together correctly
    * often include external dependencies like databases, APIs, or file systems
    * advantages
        1. more realistic than `unit testing`
        2. detect bugs in the interfaces or communication between parts
    * disadvantages
        1. slower than `unit testing`
        2. more complex to write and maintain
        3. may require set up real or fake environment

```mermaid
    graph TD;
    subgraph left [testing level]
        direction TB;
        unit([unit testing<br>🟩]);
        integration([integration testing<br>🟨]);
        system([system testing<br>🟧]);
        manual([manual testing<br>🟥]);
    end;

    subgraph right [properties]
        direction TB;
        unitDescription[[cheap<br>fast<br>simple<br>frequent]];
        box[ ]:::invisible;
        box[ ]:::invisible;
        manualDescription[[expensive<br>slow<br>complex<br>rare]];
    end;

    unit --> unitDescription;
    manual --> manualDescription;

    style box opacity:0;
```

## mock object

* fake implementations of real objects used to simulate the behavior of complex, real components
* mainly used in `unit testing` to isolate the code being tested
* advantages
    1. without dependencies(e.g. databases, web services, etc)
    2. simulate specific behaviors or error conditions
    3. verify interactions with the expected parameters
    4. test run faster since no real external resources are used

### popular mock libraries

1. `C++`
    * `Google Mock` (`gMock`)
        * features
            1. powerful matchers
            2. mock classes
            3. integration with `gTest`
        * open source (license)
            * ✅ (`BSD`)
        * IDE
            1. `JetBrains CLion`
            2. `Microsoft Visual Studio Code`
            3. `QT creator`
        * platform
            1. `Linux`
            2. `Microsoft Windows`
            3. `Apple macOS`
        * pros
            1. native C++ support
            2. strong matcher system
        * cons
            1. more setup required
            2. C++ template complexity
2. `Java`
    * `Mockito`
        * features
            1. easy to use
            2. annotations
            3. `BDD-style` API
            4. argument matching
        * open source (license)
            * ✅ (`MIT`)
        * IDE
            1. `JetBrains IntelliJ IDEA`
            2. `Eclipse`
            3. `Microsoft Visual Studio Code`
        * platform
            * cross-platform
        * pros
            1. simple syntax
            2. well-documented
            3. large community
        * cons
            1. limited to Java
            2. cannot mock `static` and `final` methods
    * `EasyMock`
        * features
            1. `record-replay` model
            2. strict expectations
        * open source (license)
            * ✅ (`apache 2.0`)
        * IDE
            1. `JetBrains IntelliJ IDEA`
            2. `Eclipse`
        * platform
            * cross-platform
        * pros
            1. strict control
            2. useful for legacy code
        * cons
            1. more verbose
            2. less flexible then `Mockito`
    * `JMock`
        * features
            1. precise expectation rules
        * open source (license)
            * ✅ (`BSD`)
        * IDE
            1. `JetBrains IntelliJ IDEA`
            2. `Eclipse`
        * platform
            * cross-platform
        * pros
            1. fine-grained control
        * cons
            1. verbose syntax
            2. stepper learning curve
3. `Python`
    * `unittest.mock`
        * features
            1. build-in
            2. patch decorator
            3. call assertions
        * open source (license)
            * ✅ (`PSF`)
        * IDE
            1. `JetBrains PyCharm`
            2. `Microsoft Visual Studio Code`
            3. `Thonny`
        * platform
            * cross-platform
        * pros
            1. included in standard lib
            2. no installed need
        * cons
            1. less powerful for complex behavior
4. `JavaScript`
    * `sinon.js`
        * features
            1. fakes, spies, stubs
            2. work with `Mocha`, `Jasmine`, etc
        * open source (license)
            * ✅ (`BSD`)
        * IDE
            1. `Microsoft Visual Studio Code`
            2. `JetBrains WebStorm`
        * platform
            1. web
            2. `node.js`
        * pros
            1. great for frontend
            2. work with all test libs
        * cons
            1. not suitable for `non-JS` code
    * `Jest Mocks`
        * features
            1. build-in mocking
            2. auto mocks
            3. mock functions
        * open source (license)
            * ✅ (`MIT`)
        * IDE
            1. `Microsoft Visual Studio Code`
            2. `JetBrains WebStorm`
        * platform
            1. web
            2. `node.js`
        * pros
            1. easy setup
            2. snapshot testing
        * cons
            1. tied to `Jest`

### example for `Mockito`

* I've four class: `Invoice` (entity for invoice), `InvoiceDao` (access the database), `InvoiceFilter` (filter the data) and `InvoiceFilterTest`  (test class)
* access database
    * `Invoice`
        ```java
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
                    //>>> for unsigned right shift
                    result = 31 * result + (int)(temp ^ (temp >>> 32));
                    return result;
                }
            }    
        ```
    * `InvoiceDao`
        ```java
            public class InvoiceDao{
                private static Connection c;
                public InvoiceDao(){
                    try{
                        if(c != null)
                            return;
                        c = DriverManager.getConnection("jdbc:hsqldb:file:mymemdb.db", "SA", "");
                        c.prepareStatement("CREATE TABLE IF NOT EXISTS invoice (name VARCHAR(100), value DOUBLE)").execute();
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
        ```
    * `InvoiceFilter`
        ```java
            public class InvoiceFilter{
                public List<Invoice> filter(){
                    List  <Invoice> filtered = new ArrayList<>();
                    for(Invoice inv : new InvoiceDao().all())
                        if(i.getValue() < 100.0)
                            filtered.add(i);
                    return filtered;
                }
            }
        ```
* `InvoiceFilterTest`
    ```java
        public class InvoiceFilterTest{
            @Test
            void filterInvoices(){
                InvoiceDao dao = new InvoiceDao();
                Invoice mauricio = new Invoice("Mauricio", 20.0),
                        arie = new Invoice("Arie", 300.0);
                dao.save(mauricio);
                dao.save(arie);
                InvoiceFilter filter = new InvoiceFilter(dao);
                List <Invoice> result = filter.filter();
                Assertions.assertEquals(mauricio, result.get(0));
                Assertions.assertEquals(1, result.size());
                dao.close();
            }
        }
    ```
* mock
    * `InvoiceFilter`
    ```java
        public class InvoiceFilter{
            private InvoiceDao dao;
            public InvoiceFilter(InvoiceDao dao){
                this.dao = dao;
            }
            public List<Invoice> filter(){
                List  <Invoice> filtered = new ArrayList<>();
                for(Invoice i : this.dao.all())
                    if(i.getValue() < 100.0)
                        filtered.add(i);
                return filtered;
            }
        }
    ```
    * `InvoiceFilterTest`
    ```java
        public class InvoiceFilterTest{
            @Test
            void filterInvoices(){
                Invoice mauricio = new Invoice("Mauricio", 20.0),
                        arie = new Invoice("Arie", 300.0);
                //create a mock of the InvoiceDao class
                InvoiceDao dao = Mockito.mock(InvoiceDao.class);
                //create a list that contains both invoices
                List <Invoice> list = Arrays.asList(mauricio, arie);
                //stub the all method to return the list instead of hitting a database
                Mockito.when(dao.all()).thenReturn(list);
                InvoiceFilter filter = new InvoiceFilter(dao);
                List <Invoice> result = filter.filter();
                Assertions.assertEquals(mauricio, result.get(0));
                Assertions.assertEquals(1, result.size());
                dao.close();
            }
        }
    ```

### technical terms

1. `controllability`
    * determine the work it takes to set up and run test cases and the extent to which individual functions and features of the system under test (SUT) can be made to respond to test cases.
    * in other words, how easy it is for us to provide inputs and invoke the behavior that we want in the system under test
2. `observability`
    * determine the work it takes to set up and run test cases and the extent to which the response of the system under test (SUT) to test cases can be verified
    * in other words, how easy it is for us to observe the system under test in order to verify whether the system behaved as expected
3. `System Under Test` (`SUT`)
    * the code, module, class, function, or full system that you're currently testing