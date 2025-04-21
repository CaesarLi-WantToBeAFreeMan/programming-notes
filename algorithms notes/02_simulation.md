# Title: Simulation Algorithm

# Author: Caesar James LEE

## explanation

* Also called `simulation-based implementation`
* A method that mimics the behavior of a system step by step
* Usefully when the problem doesn't need fancy algorithms but just a faithful reproduction of the given rules

## time complexity

* Depends on the specific problem

## space complexity

* Also depends on the problem

## code

* No general template, depends on what you're simulating

## example: simulate a traffic light at a specific second

### rules

* the traffic light cycles in this order:
    * `green -> yellow -> red -> green -> ...`
* each color lasts:
    1. green: 60 seconds
    2. yellow: 5 seconds
    3. red: 55 seconds

### simple
* given second: `8964`
* light color: `red`

### idea

* The full cycle lasts `120` seconds
    * Use `second % 120` to find the color at a given second

### code

```cpp
    int second;
    std::cin >> second;
    second %= 120;
    std::cout << (second <= 60 ? "green" : second <= 65 ? "yellow" : "red") << '\n';
```