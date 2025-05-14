# week #5: Test Code Smells

# Platform: Edx

# Course Name: DelftX ST1x Automated Software Testing: Unit Testing, Coverage Criteria and Design for Testability

# Author: Caesar James LEE

## Unknown Keywords

| English           | Pronunciation     | Chinese Meaning                           |
| :---------------: | :---------------: | :---------------------------------------: |
| smell             | smɛl              | 異味                                       |
| smelly            | ˈsmɛlɪ            | 臭的                                       |
| idiomatic         | ˌɪdɪǝˈmætɪk       | 慣用語句的                                  |
| flaky             | ˈflеkɪ            | 薄片的；古裡古怪的                           |
| symptom           | ˈsɪmptǝm          | 症狀；表徵                                  |
| suite             | swit              | （總稱）隨員；組；套；套房                   |
| prone             | pron              | 有……傾向的；面向下的；傾斜的                 |
| eager             | ˈiɡɚ              | 熱心的；渴望的                              |
| roulette          | ruˈlɛt            | 輪盤賭；轉跡線                              |
| proneness         | pronnɪs           | 俯伏；傾向                                 |
| anonymize         | anonymised        | 匿名化                                     |
| fixture           | ˈfɪkstʃɚ          | 配件；長期固定於某項工作（或某種活動）的人    |
| resilient         | rɪˈzɪlɪǝnt        | 彈回的；迅速恢復精力的                      |

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

## `code smells`

* `indicate`, `symptoms` that usually point to a **deeper problem** in the system
* example: a long method or long class
* when your code has smells:
    1. become harder to read
    2. more difficult to maintain
    3. may not properly test what it's supposed to
* we should try to **avoid code smells** as much as possible
* test smells are **widely** spread throughout the software system studied
* most of the test smells have a **strong negative impact** on the comprehensibility of test suites and production code
* tests with smells are more change and defect-prone
    1. `change-prone`
        * your tests break more easily when the system changes
    2. `defect-prone`
        * your production code ends up with more bugs, because it's not properly tested
* `indirect testing`, `eager test` and `assertion roulette` are the most significant smells for change-proneness
    1. `indirect testing`
        * testing behavior through another object, instead of directly
        * hard to know what exactly failed
        * changes in unrelated code can break the test
    2. `eager testing`
        * a single test covers too many things (e.g., multiple methods or behaviors)
        * hard to understand
        * if the test fails, you don't know what went wrong
    3. `assertion roulette`
        * test has many `assert` statements with no clear message or separation
        * when the test fails, you don't know which `assert` caused the failure without reading through everything
* production code is more `defect-prone` when tested by smelly tests
    1. developers don't trust them, so they ignore failures
    2. bugs slip into production because test don't really check correctness
    3. refactoring or changing code becomes risky, because tests are hard to update or break easily

## `FIRST` properties of good tests

### `F` - fast

* tests should be fast
* minimize the amount of code that ultimately depends on slow things 
* fast test code gives you feedback in a fast way

### `I` - isolated

* good `unit test` focus on a small chunk of code to verify
* good `unit test` also don't depend on other `unit test`s
* be careful with shared resources

### `R` - repeatable

* a repeatable test is one that produces the same results each time you run it
* to achieve that, tests must be well isolated

### `S` - self-validating

* tests aren't tests unless they assert that things went as expected
* manually verifying the resources of tests is a time-consuming
* they must also be self-arranging
    * `self-arranging`: the test is also responsible for making sure that all the required initial state is there before the test runs

### `T` - timely

* `unit test` should become a habit
* we should write some `unit test`s after writing or changing a block of code all the time

## some common test smells

### 1. duplicated code

* every test method has the same block of code
* if you have to change in one place, you have to change in multiple places
* hard to maintain

### 2. assertion roulette

* hard to understand a test's assertions if an assertion failed
* we cannot design just only one assertion per method

### 3. slow test

* developers didn't want to wait for a long time

### 4. resource optimism

* example: your tests depend on a database and you have the database in your local machine, but you colleague doesn't have it
* two options to avoid this situation
    1. avoid using external resources, and using mock objects
    2. make sure your test code is resilient enough, like providing a filed message

### 5. 