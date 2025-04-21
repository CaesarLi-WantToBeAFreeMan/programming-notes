# week #2: Functional Testing

# Platform: Edx

# Course Name: DelftX ST1x Automated Software Testing: Unit Testing, Coverage Criteria and Design for Testability

# Author: Caesar James LEE

## Unknown Keywords

| English           | Pronunciation     | Chinese Meaning      |
| :---------------: | :---------------: | :------------------: |
| artifact          | ˈɑrtɪˌfækt        | 工藝品               |
| equivalence       | ɪˈkwɪvǝlǝns       | 相等                 |
| constraint        | kǝnˈstrеnt        | 限制                 |

## Unknown Abbreviations
| Abbreviations | Full Name     | Pronunciation | Chinese Meaning   |
| :-----------: | :-----------: | :-----------: | :---------------: |
| specs         | specification | spɛks         | 規格；說明         |


## Partition

* often, programs are just too big, so we need to divide it into different partitions
* each partition represents a different case that has to be tested
* all tests are belong to the same equivalence partition

### category partition method
* ideas
    1. identify the parameters
    2. the characteristics of each parameter
        * from the specs
        * not from the specs
    3. add constrains
        * remove invalid combinations
        * reduce number of exceptional behaviors
    4. generate combinations

## Leap Year

### Code

* simple way
```java
    public class LeapYear{
        public boolean isLeapYear(int year){
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }
```

* partition way
```java
    public class LeapYear{
        public boolean isLeapYear(int year){
            if(year % 400 == 0)
                return true;
            if(year % 100 == 0)
                return false;
            return year % 4 == 0;
        }
    }
```

### Test

```java
    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.Test;

    public class LeapYearTest{
        @Test
        public void leapYearsThatAreNonCenturialYears(){
            Assertions.assertTrue(new LeapYear().isLeapYear(2016));//assert result is true
        }

        @Test
        public void leapCenturialYears(){
            Assertions.assertTrue(new LeapYear().isLeapYear(2000));
        }

        @Test
        public void nonLeapCenturialYears(){
            Assertions.assertFalse(new LeapYear().isLeapYear(1500));//assert result is false
        }

        @Test
        public void nonLeapYears(){
            Assertions.assertFalse(new LeapYear().isLeapYear(2017));
        }
    }
```

## Boundary Testing