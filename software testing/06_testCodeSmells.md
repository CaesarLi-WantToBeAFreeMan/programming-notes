# week #5: Test Code Smells

# Platform: Edx

# Course Name: DelftX ST1x Automated Software Testing: Unit Testing, Coverage Criteria and Design for Testability

# Author: Caesar James LEE

## Unknown Keywords

| English           | Pronunciation     | Chinese Meaning            |
| :---------------: | :---------------: | :------------------------: |
| smell             | smɛl              | 異味                       |
| smelly            | ˈsmɛlɪ            | 臭的                       |
| idiomatic         | ˌɪdɪǝˈmætɪk       | 慣用語句的                  |
| flaky             | ˈflеkɪ            | 薄片的；古裡古怪的          |
| symptom           | ˈsɪmptǝm          | 症狀；表徵                 |
| suite             | swit              | （總稱）隨員；組；套；套房   |

## triple A principle

* a **simple**, **clean** pattern for writing unit tests that are easy to read and maintain

### `arrange`

* prepare the environment
* set up
    1. `inputs`
    2. `test data`
    3. `mocks/stubs`
    4. the object under test
* example
    ```java
        Product chocolateCake = new Product("chocolate", 8.99, "HOME"),
                firedChicken = new Product("fired chicken", 5.99, "BUSINESS");
        ProductDao pd = Mockito.mock(ProductDao.class);
        List <Product> products = Arrays.asList(chocolateCake, firedChicken);
        Mockito.when(pd.all()).thenReturn(products);
        DiscountApplier da = new DiscountApplier(pd);
    ```

### `act`

* run the test method
* execute the actual method that you want to test - `System Under Test`  (`SUT`)
* example
    ```java
        da.setNewPrices();
    ```

### `assert`

* verify result
* check that the result is what you expected
* example
    ```java
        Assertions.assertEquals(8.091, chocolateCake.getPrice(), 1e-9);
        Assertions.assertEquals(6.589, firedChicken.getPrice(), 1e-9);
    ```

## `code smells` meaning

* `indicate`, `symptoms` that usually point to a **deeper problem** in the system
* example: a long method or long class
* we should try to **avoid code smells** as much as possible
* test smells are **widely** spread throughout the software system studied
* most of the test smells have a **strong negative impact** on the comprehensibility of test suites and production code

* tests with smells are more change and defect-prone
* `indirect testing`, `eager test` and `assertion roulette` are the most significant smells for change-proneness
* production code is more defect-prone when tested by smelly tests