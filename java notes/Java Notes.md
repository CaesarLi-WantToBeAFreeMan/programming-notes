# Title: Java Notes
# Author: Caesar James LEE
# Begin Date: Jan. 8, 2025

## Basic
### 1. main methond
```java
    public class className{
        public static void main(String [] args){
            //single line comment
            /*multi-line
            comment*/
        }
    }
```
* In java, you **must declare a class** in a java file
* You must share the same name between **file name** and **public class name**
* `static` is a keyword so that the JVM (Java Virtual Machine) will not to **create an object to invoke the `static` method**
* `main` method represents the **starting point of the program**
* `void` is a method return type that means the method will **return nothing**
* `String [] args` is used for command line argument. Each command is stored as a string, and all of them are stored as an array of strings. Like `java Main a b 1`, `Main` is a java file name, `a`, `b` and `1` are three different commands
### 2. output
##### 1. `System.out.println()`
* It's used to **display something on your console**. Note that this statement will **add a new line at the end**
* example:
```java
    System.out.println("Hello World!\n" + "By The Way, I'm " + 18 + " years old!");
    result:
        Hello World
        By The Way, I'm 18 years old!

```
##### 2. `System.out.print()`
* It likes `System.out.println()`, but it **won't add a new line at the end**
* example:
    ```java
        System.out.print("Hello World\n" + "By The Way, I\'m " + 18 + "-year-old boy!");
        result:
            Hello World
            By The Way, I'm 18-year-old boy!
    ```
##### 3. `System.out.printf()`
* It likes `System.out.print()` and `System.out.println()`, but you can add a `format string` to control something
* format string: `"%[arg$][flags][width][.precision]conversion"`
###### `arg$`
* **Optional**
* A number followed by a `$` sign
* It's useful when **reordering** arguments or **referring to the same argument multiple times**.
* By default, the number is `1`
* example:
    ```java
        System.out.printf("I'm %2$d years old, and Lisa is %1$d years old, and Taylor is %2$d years old!\n", 21, 18);
        result:
            I'm 18 years old, and Lisa is 21 years old, and Taylor is 18 years old!
    ```
###### `flags`
* **Optional**
* It's used to modifies aligning or adding signs
* Formats:
    1. `-`: Makes the output **left-justified** by **adding spaces to right**, **by default to left**
    2. `+`: Forces **positive numbers** to always be prefixed with `+`
    3. ` `(a space): Forces **positive numbers** to always be prefixed with ` `(a space)
    4. `(`: Encloses **negative numbers** in parentheses
    5. `0`: Pads the output with **zeros** until the specified width is reached
    6. `,`: Adds a **comma** to group thousands in numbers
    7. `#`: Controls a prefix
        * For `o` conversion, it prefixes **`0`**
        * For `x` conversion, it prefixes **`0x`**
        * For `X` conversion, it prefixes **`0X`**
            * For `f` ,`e`, `E`, `g` and `G`, it ensures the **result contains a decimal point**
    * example:
        ```java
            System.out.printf("%-5d", 12);
            result: 12   (3 spaces at the end)

            System.out.printf("%5d", 12);
            result:    12(3 spaces at the beginning)

            System.out.printf("%05d", 12);
            result: 00012

            System.out.printf("%+d", 12);
            result: +12

            System.out.printf("% d", 12);
            result:  12(a space at the beginning)

            System.out.printf("%(d", -12);
            result: (12)

            System.out.printf("%,d", 123456789);
            result: 123,456,789
        ```
###### `width`
* **Optional**
* Specifies the **minimum number** of characters to be printed
* If the width of the number is more than the specified width, the width is **useless**
* example:
    ```java
        System.out.printf("%03d", 12);
        result: 012
    ```
######`.precision`
* **Optional**
* A `.` followed by a whole number indicating **how many decimal digits to show** for floating number types(`float` and `double`)
* example:
    ```java
        System.out.printf("%.15f\n", Math.PI);
        result: 3.141592653589793

        System.out.printf("%.3f\n", Math.PI);
        result: 3.142

        System.out.printf("%f\n", Math.PI);
        result: 3.141593
        by default, the JVM noly displays 6 decimal digits for a floating number
    ```
###### `conversion`
* **Required**
* Specifies the data type
* Formats:
    1. `%`
        * Displays **`%`**
    2. `n`
        * Displays a **line break**
    3. `b`
        * Displays a **boolean value in lowercase**(`false` or `true`)
    4. `B`
        * Displays a **boolean value in uppercase**(`FALSE` or `TRUE`)
    5. `c`
        * Displays **a unicode character**
    6. `C`
        * Displays **a unicode character in uppercase** possibly
    7. `s`
        * Displays **a string**
    8. `S`
        * Displays **a string in uppercase** possibly
    9. `d`
        * Displays **an integer**
    10. `h`
        * Displays **an unsigned hexadecimal integer** (a-f) regardless of whether it is a positive number
    11. `H`
        * Displays **an unsigned hexadecimal integer in uppercase** (A-F) regardless of whether it is a positive number
    12. `o`
        * Displays **an octal integer**
    13. `x`
        * Displays **a hexadeciaml integer** (a-f)
    14. `X`
        * Displays **a hexadecimal integer in uppercase** (A-F)
    15. `e`
        * Displays a floating number in **scientific notation** (e)
    16. `E`
        * Displays a floating number in **scientific notation in uppercase** (E)
    17. `f`
        * Displays a **floating number**
    18. `g`
        * Displays the shortest representation between **`f` and `e`**
    19. `G`
        * Displays the shortest representation between **`f` and `E`**
    20. `a`
        * Displays **a hexadecimal floating number** (a-f)
    21. `A`
        * Displays **a hexadecimal floating number in uppercase** (A-F)
### 3. data types
![java's data types](/markdown%20images/java-data-types.png)
* java's data types
| Primitive Data Type | Default Value | Default Size |
| :-----------------: | :-----------: | :----------: |
| boolean             | false         | 1 bit        |
| char                | '\u0000'      | 2 bytes      |
| byte                | 0             | 1 byte       |
| short               | 0             | 2 bytes      |
| int                 | 0             | 4 bytes      |
| long                | 0L            | 8 bytes      |
| float               | 0.0f          | 4 bytes      |
| double              | 0.0d          | 8 bytes      |
* Primitive data types are the **building blocks of data manipulation**
* Non-prinitive data types, also known as reference data types, are used to store **complex object rather than simple values**
* Unlike primitive data types that store the actual values, reference data types store references or memory addresses that point to location of the object in memory
* Reference data types include `class`, `interface`, `array`, `String`, `Enums`, `List`, `ArrayList`, `CopyOnWriteList`, `LinkedList`, `Vector`, `Set`, `HashSet`, `LinkedHashSet`, `TreeSet`, `Queue`, `PriorityQueue`, `Map`, `HashMap`, `LinkedHashMap`, `TreeMap`, `Deque`, `ArrayDeque`, `LinkedDeque`, `Stack`, etc.
### 4. variables
* A variable is a container to **hold the value** while the program is executed
* A variable is **a name of a reserved area allocated in memory**
* You can **change** the varibale value
* If you want a variable to retain a value forever, you need type the `final` keyword, like `final double pi = 3.1415926d;`
##### declaration
* format:
    1. no custom initialization
        * `dataType variableName;`
        * example:
            ```java
                int test;
            ```
    2. custom initialization
        * dataType variableName = initialValue;`
        * example:
            ```java
                int test = 8964;
            ```
##### invoking
* format: `variableName`
* example:
    ```java
        int test = 8964;
        System.out.println("test:\t" + test);
    ```
##### changing value
* format: `existVariableName = newValue;`
* example:
    ```java
        int test = 8964;
        test = 12;
    ```
* 3 types:
##### 1. local variables
* A variable declared **inside the body of the method**
* You can only use the variable **within the method**
* the **others cannot access** the local variable
* **Cannot be defined with `static` keyword**
* example:
    ```java
        public class Main{
            public static void main(String [] args){
                int testLocalVariable = 10;
                System.out.println("testLocalVariable:\t" + testLocalVariable);//access the testLocalVariable
            }
            public static void testMethod(){
                System.out.println("testLocalVariable:\t" + testLocalVariable);//cannot access the testLocalVariable
            }
        }
    ```
##### 2. instance variables
* Declares **inside the class** but **outside the body of the method**
* Its value is **instance-specific and isn't shared among instances**
* You need to specific its **access modifier** (`public`, `private`, `protected` and `default` (when you type nothing))
* **Cannot be defined with `static` keyword**
* example:
```java
    public class Main{
        private int test = 12;//instance variable
        public static void main(String [] args){
            System.out.println("test:\t" + test);
        }
    }
```
##### 3. static variables
* Declares as `static`
* Memory allocation for static variables happens only once when the class is loaded in the memory
* example:
```java
    public class Main{
        public static void main(String [] args){
            Test test1 = new Test(), test2 = new Test();//both test1 and test2 are two objects of Test class
            test1.num = 1;//changing test1.num value to 1
            test2.num = 2;//changing test2.num value to 2
            Test.num = 3;//changing all instances of Test class's num to 3
            System.out.println("test1.num:\t" + test1.num);
            System.out.println("test2.num:\t" + test2.num);
        }
    }

    class Test{
        static int num;
    }
```
### 5. input
##### `Scanner`
* It's used to get user input
* It's found in the `java.util` package
* To use `Scanner`, you should create a `Scanner` object
###### constructors
1. `Scanner(System.in)`
    * From console input
2. `Scanner("fileNmae.fileType")`
    * From a specified file
3. `Scanner("text")`
    * From a specified `String`
###### methods
1. `nextBoolean()`
    * Reads a `boolean` value
2. `nextByte()`
    * Reads a `byte` value
3. `nextDouble()`
    * Reads a `double` value
4. `nextFloat()`
    * Reads a `float` value
5. `nextInt()`
    * Reads an `int` value
6. `nextLine()`
    * Reads the whole line as a `String` value
7. `nextLong()`
    * Reads a `long` value
8. `nextShort()`
    * Reads a `short` value
9. `next()`
    * Reads a word as a `String` value
10. `nextBigInteger()`
    * Reads a `BigInteger` value
11. `nextBigDecimal()`
    * Reads a `BigDecimal` value
12. `hasNext()`
    * Returns whether there is another word in a `boolean` value
13. `hasNextLine()`
    * Returns whether there is another line in a `boolean` value
14. `hasNextInt()`
    * Returns whether there is another `int` in a `boolean` value
15. `hasNextDouble()`
    * Returns whether there is another `double` in a `boolean` value
16. `hasNextBoolean()`
    * Returns whether there is another `boolean` in a `boolean` value
17. `useDelimiter(String)
    * Sets the delimiter pattern to be used for parsing words
    * By default, delimiter is ` ` (a space)
18. `reset()`
    * Resets the delimiter to the default, ` ` (a space)
19. `close()`
    * Closes the `Scanner`
* example:
```java
    import java.util.Scanner;

    public class Main{
        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your name:\t");
            String name = scanner.nextLine();
            System.out.print("Please enter your age:\t");
            int age = 0;
            if(scanner.hasNextInt())
                age = scanner.nextInt();
            scanner.close();
            System.out.println("Hello " + age + "-year-old " + name);
        }
    }
```