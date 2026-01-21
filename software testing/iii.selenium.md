# Selenium Note

# Author: Caesar James LEE

## `Python`

### What Is `Python`

- a **high-level**, **general-purpose** programming language
- emphasize **code readability**, with of **significant indentation**
- support **dynamically typing** and **garbage-collected**
- support multiple paradigms: **procedural**, **object-oriented** and **functional programming**

#### Difference Table (`Python` vs `C++`)

1. Statements & Operators

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

2. Comments

    |        type        |  C++   |       Python       |
    | :----------------: | :----: | :----------------: |
    |  **single line**   |  `//`  |        `#`         |
    | **multiple lines** | `/**/` | `''''''`, `""""""` |

3. Input/Output

    |        feature        |                    C++                    |              Python               |
    | :-------------------: | :---------------------------------------: | :-------------------------------: |
    |       **input**       |              `std::cin >> a`              | `a = input()` (store in `string`) |
    |      **output**       | `std::cout << "Hello World" << std::endl` |      `print("Hello World")`       |
    | **formatting output** |       `printf("name: %s\n", name)`        |     `print(f"name: {name}")`      |

4. Variables

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

5. Conditional Statements

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

6. Loop Statements

    |  feature   |              C++              |         Python          |
    | :--------: | :---------------------------: | :---------------------: |
    |   `for`    | `for(int i = 0; i < 10; i++)` |  `for i in range(10)`   |
    | `for-each` | `for(auto number : numbers)`  | `for number in numbers` |
    |  `while`   |        `while(i < 10)`        |     `while i < 10:`     |
    | `do while` |      `do{}while(i < 10)`      |     doesn't support     |
    |  `break`   |            support            |          same           |
    | `continue` |            support            |          same           |

7. Functions

    |        feature        |                 C++                 |        Python         |
    | :-------------------: | :---------------------------------: | :-------------------: |
    |    **declaration**    |         `type name(args){}`         |   `def name(args):`   |
    |    **overloading**    |               support               |      use `*args`      |
    |   **pass by value**   |               default               |  `object reference`   |
    | **pass by reference** |                 `&`                 |       implicit        |
    |      **lambda**       | `auto f = [](int x){return x + 1;}` | `f = lambda x: x + 1` |
    |       `return`        |           **fixed** type            |     **any** type      |

8. Libraries

    |   feature   |              C++              |       Python       |
    | :---------: | :---------------------------: | :----------------: |
    |   include   |      `#include <ctime>`       |   `import time`    |
    |   install   | manual/system/`vcpkg`/`conan` | `pip install name` |
    | **linking** |        often required         |   **automatic**    |

9. Classes & `OOP`

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

                    double Rectangle::getArea() const{
                        return width * height;
                    }

                    double Rectangle::getPerimeter() const{
                        return 2 * (width + height);
                    }

                    double Rectangle::getDiagonal() const{
                        return std::sqrt(width * width + height * height);
                    }

                    bool Rectangle::isSquare() const{
                        return width == height;
                    }

                    std::string Rectangle::getType() const{
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

                    double Circle::getArea() const{
                        return PI * radius * radius;
                    }

                    double Circle::getPerimeter() const{
                        return 2 * PI * radius;
                    }

                    std::string Circle::getType() const{
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
                    import math

                    class Shape(ABC):                               #inheritance
                        def __int__(self, nodes: int, edges: int):  #constructor
                            self._nodes = nodes
                            self._edges = edges

                        def __del__(self):                          #destructor
                            pass                                    #null statement

                        def get_nodes(self) -> int:
                            return self._nodes

                        def get_edges(self) -> int:
                            return self._edges

                        @abstractmethod
                        def get_area(self) -> float:
                            pass

                        @abstractmethod
                        def get_perimeter(self) -> float:
                            pass

                        @abstractmethod
                        def get_type(self) -> str:
                            pass
                ```

            - `rectangle.py`

                ```python
                    import math
                    from shape import Shape

                    class Rectangle(Shape):
                        def __int__(self, width: float, height: float):
                            super().__int__(nodes = 4, edges = 4)
                            self._width = width
                            self._height = height

                        def get_width(self) -> float:
                            return self._width

                        def get_height(self) -> float:
                            return self._height

                        def get_area(self) -> float:
                            return self._width * self._height

                        def get_perimeter(self) -> float:
                            return 2 * (self._width + self._height)

                        def get_type(self) -> str:
                            return "Rectangle"

                        def get_diagonal(self) -> float:
                            return math.sqrt(self._width ** 2 + self._height ** 2)

                        def set_width(self, width: float):
                            self._width = width

                        def set_height(self, height: float):
                            self._height = height

                        def is_square(self) -> bool:
                            return self._width == self._height
                ```

            - `circle.py`

                ```python
                    import math
                    from shape import Shape

                    class Circle(Shape):
                        def __int__(self, radius: float):
                            super().__int__(nodes = 0, edges = 0)
                            self._radius = radius

                        def get_radius(self) -> float:
                            return self._radius

                        def get_area(self) -> float:
                            return math.pi * self._radius ** 2

                        def get_perimeter(self) -> float:
                            return 2 * math.pi * self._radius

                        def get_type(self) -> str:
                            return "Circle"

                        def set_radius(self, radius: float):
                            self._radius = radius
                ```

            - `main.py`

                ```python
                    from rectangle import Rectangle
                    from circle import Circle
                    from shape import Shape

                    def main():
                        shapes: list [Shape] = []

                        shapes.append(Rectangle(3, 4))
                        shapes.append(Circle(5))

                        for shape in shapes:
                            print("Type: ", shape.get_type())
                            print("Area: ", shape.get_area())
                            print("Permimeter: ", shape.get_perimeter())
                            print()
                            print("=" * 3)

                    if __name__ == "__main__":
                        main()
                ```

10. Containers/Types

    |     container     |                     C++                      |           Python            |
    | :---------------: | :------------------------------------------: | :-------------------------: |
    | **static array**  |              `type name [size]`              |       doesn't support       |
    |      `array`      |        `std::array <type, size> name`        |       doesn't support       |
    | **dynamic array** |        `std::vector <type>name(args)`        |      list (`[values]`)      |
    |       `set`       |            `std::set <type>name`             |       doesn't support       |
    |  `unordered_set`  |       `std::unordered_set <type>name`        |      set (`{values}`)       |
    |       `map`       |      `std::map <keyType, valueKey>name`      |       doesn't support       |
    |  `unordered_map`  | `std::unordered_map <keyType, valueKey>name` | dictionary (`{key: value}`) |
    |      `list`       |            `std::list <type>name`            |       doesn't support       |
    |  `forward_list`   |        `std::forward_list <type>name`        |       doesn't support       |
    |      `stack`      |           `std::stack <type>name`            |       doesn't support       |
    |      `queue`      |           `std::queue <type>name`            |       doesn't support       |
    |      `deque`      |           `std::deque <type>name`            |           `deque`           |

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

#### Example

- `test.py`

```python
    import pytest
    import time

    def is_caesar_fucking_python():
        tm_structure = time.localtime()
        return tm_structure.tm_hour <= 2 or (tm_structure.tm_hour >= 9 and tm_structure.tm_hour)

    def test_is_caesar_fucking_python():
        assert is_caesar_fucking_python()
```

- command

```bash
    pytest test.py
```
