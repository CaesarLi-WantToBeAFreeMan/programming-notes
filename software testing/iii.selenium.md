# Selenium Note

# Author: Caesar James LEE

## `Python`

### What Is `Python`

- a **high-level**, **general-purpose** programming language
- emphasize **code readability**, with of **significant indentation**
- support **dynamically typing** and **garbage-collected**
- support multiple paradigms: **procedural**, **object-oriented** and **functional programming**

#### Difference Table (`Python` vs `C++`)

1.  Statements & Operators

    |       feature        |                                C++                                 |                      Python                       |
    | :------------------: | :----------------------------------------------------------------: | :-----------------------------------------------: |
    | **statement ending** |                                `;`                                 |                      newline                      |
    |      **block**       |                                `{}`                                |                    indentation                    |
    |    **assignment**    |                                `=`                                 |                       same                        |
    |    **arithmetic**    | `+`, `-`, `*`, `int/double`, `int/int`, `%`, `pow(base, exponent)` | `+`, `-`, `*`, `/`, `//`, `%`, `base ** exponent` |
    |    **increment**     |                             `++`, `--`                             |                  `+= 1`, `-= 1`                   |
    |     **logical**      |                         `!`, `&&`, `\|\|`                          |                `not`, `and`, `or`                 |
    |    **comparison**    |                  `==`, `!=`, `<`, `>`, `<=`, `>=`                  |                       same                        |
    |     **bitwise**      |                  `&`, `\|`, `^`, `~`, `<<`, `>>`                   |                       same                        |
    |     **ternary**      |                        `condition ? a : b`                         |              `a if condition else b`              |

2.  Comments

    |        type        |  C++   |       Python       |
    | :----------------: | :----: | :----------------: |
    |  **single line**   |  `//`  |        `#`         |
    | **multiple lines** | `/**/` | `''''''`, `""""""` |

3.  Input/Output

    |        feature        |                    C++                    |              Python               |
    | :-------------------: | :---------------------------------------: | :-------------------------------: |
    |       **input**       |              `std::cin >> a`              | `a = input()` (store in `string`) |
    |      **output**       | `std::cout << "Hello World" << std::endl` |      `print("Hello World")`       |
    | **formatting output** |       `printf("name: %s\n", name)`        |     `print(f"name: {name}")`      |

4.  Variables

    |       feature       |                                                              C++                                                              |                        Java                        |
    | :-----------------: | :---------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------: |
    |   **declaration**   |                                                          `int a = 1`                                                          |                      `a = 1`                       |
    |     **typing**      |                                                          **static**                                                           |                    **dynamic**                     |
    |  **reassignment**   |                                                     usually **same** type                                                     |                    **any** type                    |
    | **type converting** | `const_cast <int>(cost)`, `static_cast <int>(cost)`, `dynamic_cast <ParentClass>(childClass)`, `reinterpret_cast <int>(cost)` |                    `int(cost)`                     |
    |      **array**      |                                              `int []`/`std::array`/`std::vector`                                              |                   `list`/`tuple`                   |
    |     **pointer**     |                                                              `*`                                                              |                  doesn't support                   |
    |    **reference**    |                                                              `&`                                                              | implicit(variables hold **references to objects**) |
    |    **structure**    |                                                       `struct`/`class`                                                        |                      `class`                       |

5.  Conditional Statements

    |   feature   |          C++           |          Java           |
    | :---------: | :--------------------: | :---------------------: |
    |    `if`     |   `if(condition){}`    |     `if condition:`     |
    |   `else`    |        `else{}`        |         `else:`         |
    |  `else if`  | `else if(condition){}` |    `elif condition:`    |
    |  `switch`   |  `switch(variable){}`  |    `match variable:`    |
    | **ternary** |  `condition ? a : b`   | `a if condition else b` |
    - `switch`/`match` example
        - `C++`
            ```cpp
                char grade = 'A';
                swicth(grade){
                    case 'A':
                        std::cout << "Excellent\n";
                        break;
                    case 'B':
                        std::cout << "Good\n";
                        break;
                    case 'C':
                        std::cout << "Not Bad\n";
                        break;
                    case 'D':
                        std::cout << "Passed\n";
                        break;
                    default:
                        std::cout << "Good Luck\n";
                        break;
                }
            ```
        - `Python`
            ```python
                grade = "A"
                match grade:
                    case "A":
                        print("Excellent")
                    case "B":
                        print("Good")
                    case "C":
                        print("Not Bad")
                    case "D":
                        print("Passed")
                    case _:
                        print("Good Luck")
            ```

6.  Loop Statements

    |  feature   |              C++              |         Python          |
    | :--------: | :---------------------------: | :---------------------: |
    |   `for`    | `for(int i = 0; i < 10; i++)` |  `for i in range(10)`   |
    | `for-each` | `for(auto number : numbers)`  | `for number in numbers` |
    |  `while`   |        `while(i < 10)`        |     `while i < 10:`     |
    | `do while` |      `do{}while(i < 10)`      |     doesn't support     |
    |  `break`   |            support            |          same           |
    | `continue` |            support            |          same           |

7.  Functions

    |        feature        |                 C++                 |        Python         |
    | :-------------------: | :---------------------------------: | :-------------------: |
    |    **declaration**    |         `type name(args){}`         |   `def name(args):`   |
    |    **overloading**    |               support               |      use `*args`      |
    |   **pass by value**   |               default               |  `object reference`   |
    | **pass by reference** |                 `&`                 |       implicit        |
    |      **lambda**       | `auto f = [](int x){return x + 1;}` | `f = lambda x: x + 1` |
    |       `return`        |           **fixed** type            |     **any** type      |

8.  Libraries

    |   feature   |              C++              |       Python       |
    | :---------: | :---------------------------: | :----------------: |
    |   include   |      `#include <ctime>`       |   `import time`    |
    |   install   | manual/system/`vcpkg`/`conan` | `pip install name` |
    | **linking** |        often required         |   **automatic**    |

9.  Classes & `OOP`

    |        concept        |                   C++                   |              Python              |
    | :-------------------: | :-------------------------------------: | :------------------------------: |
    |      `attribute`      |              data memeber               |            attribute             |
    |       `method`        |            memeber function             |              method              |
    |   **encapsulation**   | `public`/`private`(default)/`protected` |         `_name`/`__name`         |
    |    **inheritance**    |      `class Dog : public Animal{}`      |       `class Dog(Animal):`       |
    |   **polymorphism**    |          `virtual`/`override`           | `duck typing`/`dynamic dispatch` |
    |    **constructor**    |            `className(args)`            |          `__int_(args)`          |
    |    **destructor**     |           `~className(args)`            |   `__del__(args)`(**rarely**)    |
    | **getter**/**setter** |               **common**                |     `@property` recommanded      |
    |  **abstract class**   |              pure virtual               |  `abd.ABC` + `@abstractmethod`   |
    - example
        - `C++`
            - `Shape.hpp`

                ```cpp
                    #ifndef SHAPE_HPP
                    #define SHAPE_HPP

                    #include <string>

                    class Shape{
                        protected:
                            int nodes;
                            int edges;

                        public:
                            Shape(int nodes, int edges);
                            virtual ~Shape();

                            int getNodes() const;
                            int getEdges() const;

                            virtual double getArea() const = 0;
                            virtual double getPerimeter() const = 0;
                            virtual std::string getType() const = 0;
                    };

                    #endif
                ```

            - `Shape.cpp`

                ```cpp
                    #include "Shape.hpp"

                    Shape::Shape(int nodes, int edges): nodes(nodes), edges(edges){}

                    Shape::~Shape(){}

                    int Shape::getNodes() const{
                        return nodes;
                    }

                    int Shape::getEdge() const{
                        return edges;
                    }
                ```

            - `Rectangle.hpp`

                ```cpp
                    #ifndef RECTANGLE_HPP_
                    #define RECTANGLE_HPP_

                    #include "Shape.hpp"

                    class Rectangle : public Shape{
                        private:
                            double width;
                            double height;

                        public:
                            void Rectangle(double width, double height);
                            ~Rectangle() override();

                            void setWidth(double width);
                            void setHeight(double height);

                            double getWidth() const;
                            double getHeight() const;
                            double getArea() const override;
                            double getPerimeter() const override;
                            std::string getType() const override;

                            double getDiagonal() const;
                            bool isSquare() const;
                    };

                    #endif
                ```

            - `Rectangle.cpp`

                ```cpp
                    #include "Rectangle.hpp"
                    #include <cmath>

                    Rectangle::Rectangle(double width, double height): Shape(4, 4), width(width), height(height){}

                    Rectangle::~Rectangle(){}

                    double Rectangle::getWidth() const{
                        return width;
                    }

                    double Rectangle::getHeight() const{
                        return height;
                    }

                    void Rectangle::setWidth(double w){
                        width = w;
                    }

                    void Rectangle::setHeight(double h){
                        height = h;
                    }

                    double Rectangle::getArea() const override{
                        return width * height;
                    }

                    double Rectangle::getPerimeter() const override{
                        return 2 * (width + height);
                    }

                    double Rectangle::getDiagonal() const{
                        return std::sqrt(width * width + height * height);
                    }

                    bool Rectangle::isSquare() const{
                        return width == height;
                    }

                    std::string Rectangle::getType() const override{
                        return "Rectangle";
                    }
                ```

            - `Circle.hpp`

                ```cpp
                    #ifndef CIRCLE_HPP
                    #define CIRCLE_HPP

                    #include "Shape.hpp"

                    class Circle : public Shape{
                        private:
                            double radius;

                        public:
                            Circle(double radius);
                            ~Circle() override;

                            double setRadius(double radius);

                            double getRadius() const;
                            double getArea() const override;
                            double getPerimeter() const override;
                            std::string getType() const override;
                    };

                    #endif
                ```

            - `Circle.cpp`

                ```cpp
                    #include "Circle.hpp"
                    #include <cmath>

                    static constexpr double PI = std::acos(-1.0);

                    Circle::Circle(double radius): Shape(0, 0), radius(radius){}

                    Circle::~Circle(){}

                    void Circle::setRadius(double r){
                        radius = r;
                    }

                    double Circle::getRadius() const{
                        return radius;
                    }

                    double Circle::getArea() const override{
                        return PI * radius * radius;
                    }

                    double Circle::getPerimeter() const override{
                        return 2 * PI * radius;
                    }

                    std::string Circle::getType() const override{
                        return "Circle";
                    }
                ```

            - `main.cpp`

                ```cpp
                    #include <iostream>
                    #include <vector>
                    #include <memory>

                    #include "Rectangle.hpp"
                    #include "Circle.hpp"

                    int main(){
                        std::vector <std::unique_ptr <Shape>> shapes;

                        shapes.emplace_back(std::make_unique <Rectangle>(3, 4));
                        shapes.emplace_back(std::make_unique <Circle>(5));

                        for(const auto & shape : shapes){
                            std::cout << "Type: " << shape -> getType() << std::endl;
                            std::cout << "Area: " << shape -> getArea() << std::endl;
                            std::cout << "Perimeter: " << shape -> getPerimeter() << std::endl;
                            std::cout << "\n===\n" << std::endl;
                        }

                        return 0;
                    }
                ```

        - `Python`
            - `shape.py`

                ```python
                    from abc import ABC, abstractmethod
                    #abc = Abstract Base Class system
                    #python uses `ABC` + `@abstractmethod` instead of `virtual`/`override` like C++

                    class Shape(ABC):

                        """
                            Abstract Base Class
                            equivalent C++ concept:
                                class Shape{
                                    public:
                                        virtual double getArea() const = 0;
                                };
                        """

                        def __init__(self, nodes: int, edges: int):

                            """
                                constructor
                                self = implicit object reference (similar to `this` pointer in C++)

                                python methods are just **`functions`** stored inside a class
                                python doesn't have an implicit class environment

                                    r = Rectangle()
                                    r.get_area()
                                python will actually execute these lines of code as
                                    Shape.get_area(r)

                                `self` must be passed explicitly
                            """

                            self._nodes = nodes
                            self._edges = edges

                            """
                                python objects are **dynamic** and **`dictionary`-based**

                                every object has
                                    self.__dict__
                                for instance
                                    {
                                        "_nodes": 4,
                                        "_edges": 4
                                    }

                                attributes are **created at runtime** when assigned
                                so you can create new attributes at runtime FUUUUUUUUUUUUUUUUUUUCKING!!!!!!!!!!!!!!
                            """

                        def __del__(self):

                            """
                                destructor

                                unlike C++, Python destructor are:
                                    - not deterministic
                                    - not guaranteed to run immediately

                                memory is managed by Garbage Collection (G C)

                                __del__ should almost **never** be used in real python code
                            """

                            pass                                    #null statement means do nothing

                        def get_nodes(self):

                            """
                                getter
                                type hint (-> int) is optional and has **not** runtime effect
                            """

                            return self._nodes

                        def get_edges(self)
                            return self._edges

                        @abstractmethod                             #pure virtual function
                                                                    #must be implemented by child class
                        def get_area(self):
                            raise NotImplementedError               #throw NotImplementedError when you haven't implemented in any child class

                        @abstractmethod
                        def get_perimeter(self):
                            raise NotImplementedError

                        @abstractmethod
                        def get_type(self)
                            raise NotImplementedError
                ```

            - `rectangle.py`

                ```python
                    import math
                    from shape import Shape                             #import parent (base) class

                    class Rectangle(Shape):

                        """
                            inheritance

                            equivalent to C++:
                                class Rectangle : public Shape
                        """
                                                                        #equivalent to Class Rectangle : public Shape
                        def __init__(self, width: float, height: float):

                            """
                                `super` isn't an object - a **built-in `function`**
                                `super()` returns a `proxy object` that represents
                                the next class in Method Resolution Order (MRO)

                                python uses
                                    runtime constructor chaining (MRO-safe)
                                instead of same class name constructor
                                    Shape::Shape(...)
                            """

                            super().__init__(nodes = 4, edges = 4)
                            self._width = width
                            self._height = height

                        def get_width(self):
                            return self._width

                        def get_height(self):
                            return self._height

                        def get_area(self):

                            """
                                override abstract method
                                python automatically performs virtual dispatch
                            """

                            return self._width * self._height

                        def get_perimeter(self):
                            return 2 * (self._width + self._height)

                        def get_type(self):
                            return "Rectangle"

                        def get_diagonal(self):
                            return math.sqrt(self._width ** 2 + self._height ** 2)

                        def set_width(self, width):
                            self._width = width

                        def set_height(self, height):
                            self._height = height

                        def is_square(self):
                            return self._width == self._height
                ```

            - `circle.py`

                ```python
                    import math
                    from shape import Shape

                    class Circle(Shape):
                        def __init__(self, radius: float):
                            super().__init__(nodes = 0, edges = 0)
                            self._radius = radius

                        def get_radius(self):
                            return self._radius

                        def get_area(self):
                            return math.pi * self._radius ** 2

                        def get_perimeter(self):
                            return 2 * math.pi * self._radius

                        def get_type(self):
                            return "Circle"

                        def set_radius(self, radius):
                            self._radius = radius
                ```

            - `main.py`

                ```python
                    from rectangle import Rectangle
                    from circle import Circle
                    from shape import Shape

                    def main():

                        """
                            python doesn't require an entry function (int main())
                            code runs **top-to-bottom** (procedural)
                        """

                        shapes: list [Shape] = []               #type hint (list [Shape])
                                                                #equivalent to shapes = []

                        """
                            variables in python behave like `safe pointers`

                                shape = Rectangle(...)
                            equivalent to C++
                                Shape * shape = new Rectangle(...)

                            no delete, no memory leaks
                            GC manages lifetime
                        """

                        shapes.append(Rectangle(3, 4)
                        shapes.append(Circle(5))

                        for shape in shapes:
                            #runtime polymorphism
                            # same as virtual function dispatch in C++
                            print("Type: ", shape.get_type())
                            print("Area: ", shape.get_area())
                            print("Permimeter: ", shape.get_perimeter())
                            print()
                            print("=" * 3)

                    """
                        python files have two identities: `program` and `library`

                        when executed directly:
                            __name__ = "__main__"
                        when imported:
                            __name__ = "main"

                        without the condition, importing this file would run the code
                    """

                    if __name__ == "__main__":
                        main()
                ```

10. Containers/Types

    |       container        |            C++             |            Python             |                      explanation                      |
    | :--------------------: | :------------------------: | :---------------------------: | :---------------------------------------------------: |
    |    **static array**    |        `T arr [N]`         |              ❌               |        Python has no built-in fixed-size array        |
    |  **fixed-size array**  |    `std::array <T, N>`     |     `tuple` (`(values)`)      |        tuple has fixed length but is immutable        |
    |   **dynamic array**    |     `std::vector <T>`      |      `list` (`[values]`)      |          both are dynamic contiguous arrays           |
    | **immutable sequence** |             ❌             |      `tuple`(`(values)`)      |    Python explicitly supports immutable sequences     |
    |      **hash set**      |  `std::unordered_set <T>`  |       `set`(`{values}`)       |          both implemented using hash tables           |
    |      **hash map**      | `std::unordered_map <K,V>` | `dicttionary`(`{key: value}`) |          both implemented using hash tables           |
    | **ordered set (tree)** |       `std::set <T>`       |              ❌               | C++ uses red-black tree; Python has no tree-based set |
    | **ordered map (tree)** |      `std::map <K,V>`      |              ❌               | C++ uses red-black tree; Python has no tree-based map |
    | **doubly linked list** |      `std::list <T>`       |      `collections.deque`      |             closest behavioral equivalent             |
    | **singly linked list** |  `std::forward_list <T>`   |              ❌               |             not provided in Python stdlib             |
    |       **deque**        |      `std::deque <T>`      |      `collections.deque`      |            same concept in both languages             |
    |   **stack adapter**    |      `std::stack <T>`      |  `list`/`collections.deque`   |          implemented via container adapters           |
    |   **queue adapter**    |      `std::queue <T>`      |      `collections.deque`      |                     FIFO behavior                     |
    |   **priority queue**   | `std::priority_queue <T>`  |            `heapq`            |              binary heap implementation               |

## What Is `Selenium`

- an open source project that aims at supporting browser automation
- enable testers and developers to automate browser interactions and perform functional testing

## `WebDriver`

### What Is `WebDriver`

- an **interface** to write instructions that work interchangeably across browsers
- accept commands, which were sent in `Selenese` (`Selenium` script language) in `Selenium IDE` or via client API, and sends to a browser
- implement a browser-specific browser driver, includes `Mozilla Firefox`, `Google Chrome`, `Microsoft Edge`, `Apple Safari` or `Microsoft Internet Explorer`, which sends commands to a browser and retrieves results
- support `JavaScript` (`Node.js`), `Python`, `Ruby`, `Java`, `Kotlin` and `C#`

### Installation

1. [download Python](https://www.python.org/downloads/)
2. verify `Python` and `pip`

```bash
    python --version; pip --version
```

3. installation

```bash
    pip install selenium
```

4. [download Google Chrome web driver](https://googlechromelabs.github.io/chrome-for-testing/)

### Commands

#### Browser Information

##### Attributes

|        attribute        |                  description                   |
| :---------------------: | :--------------------------------------------: |
|         `title`         |               current page title               |
|      `current_url`      |                current page URL                |
|      `page_source`      |               full `HTML` source               |
|    `window_handles`     |       list(array) of all window/tab IDs        |
| `current_window_handle` |               current window ID                |
|         `name`          |                  browser name                  |
|      `session_id`       |          current webdriver session ID          |
|     `capabilities`      | browser capabilities dictionary(unordered_map) |

##### Methods

|   method    |      description       |
| :---------: | :--------------------: |
| `get(url)`  |     open a webpage     |
|  `back()`   |        go back         |
| `forward()` |       go forward       |
| `refresh()` |      reload page       |
|  `close()`  |   close current tab    |
|   `quit`    | close browser + driver |

#### Element Locating

##### Methods

|           method           |        description         |
| :------------------------: | :------------------------: |
| `find_element(by, value)`  |    find **one** element    |
| `find_elements(by, value)` | find **multiple** elements |

##### `By` Enumeration

|         value          |        description        |
| :--------------------: | :-----------------------: |
|        `By.ID`         |        find by ID         |
|       `By.NAME`        |       find by name        |
|    `By.CLASS_NAME`     |    find by class name     |
|     `By.TAG_NAME`      |     find by tag name      |
|   `By.CSS_SELECTOR`    |  find by `CSS` selector   |
|       `By.XPATH`       |       find by xpath       |
|     `By.LINK_TEXT`     | find by entire link text  |
| `By.PARTIAL_LINK_TEXT` | find by partial link text |

#### `JavaScript` Execution

##### Methods

|                method                 |                 description                 |
| :-----------------------------------: | :-----------------------------------------: |
|    `execute_script(script, *args)`    |   run the script, often don't send `args`   |
| `execute_async_script(script, *args)` | run `async` script, often don't send `args` |

#### Window & Text Control

##### Methods

|            method            |     description     |
| :--------------------------: | :-----------------: |
|  `switch_to.window(handle)`  |  switch tab/window  |
| `switch_to.new_window(type)` | open new tab/window |
|     `maximize_window()`      |  maximize browser   |
|     `minimize_window()`      |  minimize browser   |
|    `fullscreen_window()`     |     fullscreen      |

#### Frame & Alert Handling

##### Attributes

|         method         |     description      |
| :--------------------: | :------------------: |
| `switch_to.alert.text` | return text of alert |

##### Methods

|            method             |         description         |
| :---------------------------: | :-------------------------: |
|   `switch_to.frame(frame)`    |      switch to iframe       |
|  `switch_to.parent_frame()`   |     go to parent frame      |
| `switch_to.default_content()` |       exit all frames       |
|  `switch_to.alert.accept()`   |        accept alert         |
|  `switch_to.alert.dismiss()`  |        dismiss alert        |
| `switch_to.alert.send_keys()` | send key(s)/string to alert |

#### Cookies

##### Methods

|          method          |                   description                   |
| :----------------------: | :---------------------------------------------: |
|     `get_cookies()`      | get all cookies in dictionary (`unordered_map`) |
|    `get_cookie(key)`     |             get cookie value by key             |
| `add_cookie(dictionary)` | add cookie using a dictionary (`unordered_map`) |
|   `delete_cookie(key)`   |              delete cookie by key               |
|  `delete_all_cookies()`  |               delete all cookies                |

#### Navigation & Timeouts

##### Methods

|                                       method                                       |                           description                            |
| :--------------------------------------------------------------------------------: | :--------------------------------------------------------------: |
|                             `implicitly_wait(second)`                              |                         global wait time                         |
|                   `object_name = WebDriverWait(driver, second)`                    | set maximum wait time for the given driver, and return an object |
| `object_name.until(EC.visibility_of_element_located((ByEnumerationValue, value)))` |          return an `HTML` element or `null` if timeout           |
|                          `set_page_load_timeout(second)`                           |                        page load timeout                         |
|                            `set_script_timeout(second)`                            |                          script timeout                          |

#### Screenshots

##### Methods

|             method             |        description         |
| :----------------------------: | :------------------------: |
|    `save_screenshot(path)`     |      save screenshot       |
| `get_scrrenshot_as_file(path)` |   get screenshot in file   |
|   `get_scrrenshot_as_png()`    |  get scrrenshot in `.png`  |
|  `get_scrrenshot_as_base64()`  | get scrrenshot in `base64` |

#### Browser Logs & Debugging

##### Methods

|       method        |        description         |
| :-----------------: | :------------------------: |
|   `get_log(type)`   |    browser/driver logs     |
| `get_window_rect()` | get window size & position |
| `set_window_rect()` | set window size & position |

#### `WebElement` object

##### Getters

|                            getter                            |         description         |
| :----------------------------------------------------------: | :-------------------------: |
|  `element = driver.find_element(ByEnumerationValue, value)`  |    get the given element    |
| `elements = driver.find_elements(ByEnumerationValue, value)` | get elements in list(array) |

##### Attributes

| attribute  |      description       |
| :--------: | :--------------------: |
|   `text`   |      visible text      |
| `tag_name` |       `HTML` tag       |
|   `rect`   |    size + position     |
| `location` |  element coordinates   |
|   `size`   |      element size      |
|    `id`    | internal `Selenium` ID |

##### Methods

|             method             |          description          |
| :----------------------------: | :---------------------------: |
|           `click()`            |         click element         |
|   `send_keys(Keys.KEYNAME)`    |      send a specific key      |
|       `send_keys(text)`        |           send text           |
|           `clear()`            |          clear input          |
|   `get_attribute(attribute)`   |     get `HTML` attribute      |
| `get_dom_attribute(attribute)` |      get `DOM` attribute      |
|    `get_property(property)`    |   get `JavaScript` property   |
|        `is_displayed()`        |        visible or not         |
|         `is_enabled()`         |        enabled or not         |
|        `is_selected()`         | whether the checkbox selected |
|           `submit()`           |          submit form          |

### Example

```python
    from selenium import webdriver
    from selenium.webdriver.common.by import By
    from selenium.webdriver.common.keys import Keys
    import time

    driver = webdriver.Chrome()

    driver.maximize_window()
    driver.implicitly_wait(1)
    driver.get("https://www.wikipedia.org")

    #search wikipedia
    driver.find_element(By.ID , "searchInput").send_keys("selenium")
    driver.find_element(By.ID, "searchLanguage").click()
    english = driver.find_element(By.XPATH, '//*[@id="searchLanguage"]/option[17]')
    if not english.is_selected():
        english.click()
    driver.find_element(By.XPATH, '//*[@id="search-form"]/fieldset/button').click()
    driver.save_screenshot("selenium_result_default.png")

    #selenium selenium
    driver.find_element(By.ID, "skin-client-pref-vector-feature-custom-font-size-value-2").click()
    driver.find_element(By.ID, "skin-client-pref-vector-feature-limited-width-value-0").click()
    driver.find_element(By.ID, "skin-client-pref-skin-theme-value-night").click()
    driver.save_screenshot("selenium_result_large_wide_dark.png")

    time.sleep(3)
    driver.quit()
```

## `Pytest`

### What Is It

- a testing framework that supports `unit testing`, `integration testing`, `end-to-end testing` and `functional testing`
- enable `parametrized testing`, `fixtures` and `assert re-writing`
- the **most widely used** Python testing framework in industry

### Installation

- installation

```bash
    pip install pytest
```

- verification

```bash
    pytest --version
```

### Assertions

- use `Python` built-in keyword `assert` to assert a statement
- `pytest` **rewrites** `assert` statement to show detailed error info

#### Example

- `test.py`

```python
    import pytest
    import time

    def is_caesar_fucking_python(tm = None):
        if tm is None:
            tm = time.localtime()
        return tm.tm_hour <= 2 or tm.tm_hour >= 9

    def test_is_caesar_fucking_python0():
        assert is_caesar_fucking_python()

    def test_is_caesar_fucking_python1():
        assert is_caesar_fucking_python(time.struct_time((1989, 6, 4, 6, 4, 0, 0, 0, -1)))
```

- command

|     command      |                    description                    |
| :--------------: | :-----------------------------------------------: |
|  `pytest file`   |          run assertions inside the file           |
| `pytest -v file` | display function names, skipped reasons and so on |
| `pytest -s file` |       display output inside test functions        |

### Exception Assertion

- `pytest` can test exceptions

#### Example

```python
    import pytest

    def divide(a, b):
        return a / b

    def test_devide_zero():
        with pytest.raises(ZeroDivisionError):      #passed if throws ZeroDivisionError
            divide(1, 0)
```

### Parametrized Testing

- used to run the same test with different inputs
- avoid duplicated test functions

#### Example

```python
    import pytest

    def add(a, b):
        return a + b

    @pytest.mark.parametrize(
        "a, b, expected", [
            (1, 2, 3),
            (1, -1, 0),
            (-12, -21, -33)
        ]
    )
    def test_add(a, b, expected):
        assert add(a, b) == expected
```

### Parametrized Testing Using `.csv`

- use `Python`'s built-in `csv` module to read `.csv` file
- write a function to process data

#### Example

- `data.csv`

    ```csv
        a,b,expected
        1,2,3
        -1,1,0
        12,21,33
        -12,-21,-33
        12,-21,-9
    ```

- `test.py`

    ```python
        import pytest
        import csv

        def add(a, b):
            return a + b

        def load_csv_data(path):
            data = []
            with open(path, newline = "") as file:
                reader = csv.DictReader(file)
                for row in reader:
                    data.append(
                        (
                            int(row ["a"]),
                            int(row ["b"]),
                            int(row ["expected"])
                        )
                    )
            return data

        @pytest.mark.parametrize(
            "a, b, expected",
            load_csv_data("data.csv")
        )
        def test_add_from_csv_data(a, b, expected):
            assert add(a, b) == expected
    ```

### Fixture

- used to **prepare test data or environment**
- automatically injected into test functions

#### Scope

- used to control how often a fixture runs

|   scope    |         description         |
| :--------: | :-------------------------: |
| `function` | once per **test** (default) |
|  `class`   |   once per **test class**   |
|  `module`  |      once per **file**      |
| `session`  |   once per **pytest run**   |
| `package`  |    once per **package**     |

#### Example

```python
    import pytest

    def add(a, b):
        return a + b

    def minus(a, b):
        return a - b

    @pytest.fixture(scope = "session")
    def data():
        return [
            (1, 2),
            (-1, 1),
            (12, -21),
            (-21, 12)
        ]

    def test_add(data):
        for d in data:
            assert add(d [0], d [1]) == d [0] + d [1]

    def test_minus(data):
        for d in data:
            assert minus(d [0], d [1]) == d [0] - d [1]
```

### Skip Tests

- `@pytest.mark.skip` annotation is used to skip a test function
- `@pytest.mark.skipif` annotation is used to skip a test function conditionally

#### Example

```python
    import pytest
    import time

    def add(a, b):
        return a + b

    def minus(a, b):
        return a - b

    @pytest.fixture(scope = "session")
    def data():
        return [
            (1, 2),
            (-1, 1),
            (12, -21),
            (-21, 12)
        ]

    @pytest.mark.skip(reason = "tested add function")
    def test_add(data):
        for d in data:
            assert add(d [0], d [1]) == d [0] + d [1]


    @pytest.mark.skipif(time.localtime().tm_min % 2 == 0, reason = "odd minute only")
    def test_minus(data):
        for d in data:
            assert minus(d [0], d [1]) == d [0] - d [1]
```

## `pytest` Report with `allure`

### Installation

```bash
    pip install allure-pytest
```

### Verification

```bash
    pytest --help | grep allure
```

### Annotations

|      annotation       |       description       |
| :-------------------: | :---------------------: |
|    `@allure.title`    |        test name        |
| `@allure.description` |    test description     |
|  `@allure.severity`   | importance of test case |
|    `@allure.epic`     |      system label       |
|   `@allure.feature`   |      feature label      |
|    `@allure.story`    |     function label      |
|    `@allure.step`     |       step label        |

### `severity` Levels

|   level    |       meaning        |
| :--------: | :------------------: |
| `blocker`  |   system unusable    |
| `critical` | core feature broken  |
|  `normal`  | major business logic |
|  `minor`   |     minor issue      |
| `trivial`  |    UI or cosmetic    |

### Example

- `mathematics.py`:

    ```python
        class Mathematics:
            def _validate_args(self, args):
                if args is None:
                    raise ValueError("args cannot be None")
                if not args:
                    raise ValueError("args cannot be empty")

            def add(self, args):
                self._validate_args(args)
                result = 0
                for arg in args:
                    result += arg
                return result

            def minus(self, args):
                self._validate_args(args)
                result = args [0]
                for arg in args [1:]:
                    result -= arg
                return result

            def times(self, args):
                self._validate_args(args)
                result = args [0]
                for arg in args [1:]:
                    result *= arg
                return result

            def divide(self, args):
                self._validate_args(args)
                result = args [0]
                for arg in args [1:]:
                    if arg == 0:
                        raise ZeroDivisionError("division by zero")
                    result /= arg
                return result

            def modulo(self, args):
                self._validate_args(args)
                result = args [0]
                for arg in args [1:]:
                    if arg == 0:
                        raise ZeroDivisionError("modulo by zero")
                    result %= arg
                return result
    ```

- `web.py`:

    ```python
        import allure
        from selenium import webdriver
        from selenium.webdriver.common.by import By

        @allure.epic("web")
        @allure.title("login")
        @allure.description("verify UI features")
        class Web:
            def __init__(self):
                self.driver = webdriver.Chrome()
                self.driver.get("http://172.17.89.63:8916/")
                self.driver.maximize_window()
                self.driver.implicitly_wait(3)

            @allure.step("login {username}")
            def login(self, username, password):
                self.driver.find_element(By.XPATH, '//*[@id="app"]/div/form/div[1]/div/div/input').clear()
                self.driver.find_element(By.XPATH, '//*[@id="app"]/div/form/div[1]/div/div/input').send_keys(username)
                self.driver.find_element(By.XPATH, '//*[@id="app"]/div/form/div[2]/div/div/input').clear()
                self.driver.find_element(By.XPATH, '//*[@id="app"]/div/form/div[2]/div/div/input').send_keys(password)
                screenshot = self.driver.get_screenshot_as_png()
                allure.attach(
                    screenshot,
                    name = "login screenshot",
                    attachment_type = allure.attachment_type.PNG
                )

            def quit(self):
                self.driver.quit()
    ```

- `test.py`:

    ```python
        import pytest
        import allure
        from mathematics import Mathematics
        from web import Web

        @allure.epic("mathematics")
        @allure.feature("calculation")
        class TestMathematics:
            @pytest.fixture(scope = "class")
            def math(self):
                return Mathematics()

            def test_add(self, math):
                assert math.add([1, 2, 3]) == 6

            def test_minus(self, math):
                assert math.minus([8, 9]) == -1

            def test_times(self, math):
                assert math.times([6, 4]) == 24

            def test_divide(self, math):
                assert math.divide([1, 8, 4]) == 0.03125

            def test_modulus(self, math):
                assert math.modulo([7, 3, 2]) == 1

        @allure.epic("web")
        @allure.feature("ui test")
        class TestWeb:
            @pytest.fixture(scope = "class")
            def web(self):
                w = Web()
                yield w
                w.quit()

            @pytest.mark.parametrize(
                "username, password",
                [
                    ("admin", "123456"),
                    ("Caesar", "8964"),
                    ("James", "8964"),
                    ("LEE", "8964"),
                    ("Voldmort", "Harry Poter")
                ]
            )
            def test_login(self, web, username, password):
                web.login(username, password)
    ```

- command

    ```bash
        rm allure-results/*;pytest --alluredir=allure-results test.py;allure serve allure-results
    ```
