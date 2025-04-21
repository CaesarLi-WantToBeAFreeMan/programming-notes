# Title: Static Arrays

# Author: Caesar James LEE

## definition

* an `array` stores **multiple values** of the **same type** in one variable
* **NOTE**:
    * Must define size at declaration
    * It cannot change during runtime

## syntax

### declaration
1. size + elements
    ```cpp
        int integers [5] = {-2, -1, 0, 1, 2};
    ```
2. only elements
    ```cpp
        int integers [] = {-2, -1, 0, 1, 2};
    ```
3. only size
    ```cpp
        int integers [5];
    ```

### access
* array indicates are **`0-based`**
```cpp
    integers [0]
```

### modify
```cpp
    integers [0] = 0;
```

### types
1. integer arrays
    1. `short integers [3];`
    2. `int integers [3];`
    3. `long integers [3];`
    4. `long long integers [3];`
    5. etc
2. floating point arrays
    1. `float floats [3];`
    2. `double floats [3];`
    3. `long double floats [3];`
    4. etc
3. boolean arrays
    1. `bool booleans [3];`
4. character arrays (**`C-style strings`**)
    1. `char characters [3];`