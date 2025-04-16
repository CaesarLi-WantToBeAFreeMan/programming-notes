# Title: Dynamic Arrays

# Author: Caesar James LEE

## definition

* a `vector` is a dynamic array that can change size

## syntax

### library
* `#include <vector>`

### declarations
1. empty vector
    ```cpp
        vector <int> integers;
    ```
2. from an array
    ```cpp
        vector <int> v = {1, 2, 3};
        //---------- separator ----------
        int integerArray = {0, -1, -2};
        vector <int> v1(integerArray, integerArray + 3);
    ```
3. from another vector
    ```cpp
        vector <int> integers({1, 2, 3}),
                     integersCopy(integers);
    ```

### access an element
* like `array`
```cpp
    integers [0]
```

### reassign an element
* like array
```cpp
    integers [0] = 0;
```

### types
* you can replace `int` with any type
* example
    1. `vector <char> characters;`
    2. `vector <double> floats;`
    3. `vector <pair <int, int>> pairIntInts;`
    4. `vector <set <int>> sets;`
    5. etc

## methods
1. iterators
    * works like pointers to elements
    1. `begin()`: the first element
    2. `end()`: the end
    3. `rbegin()`: the last element
    4. `rend()`: the beginning
    5. `cbegin()`: const begin
    6. `cend()`: const end
    7. `crbegin()`: const rbegin
    8. `crend()`: const rend

2. capacities
    1. `size()`: number of elements
    2. `max_size()`: max possible elements
    3. `resize(num)`: resize to num
    4. `capacity()`: current located size
    5. `empty()`: is empty
    6. `reserve(num)`: preallocate space
    7. `shrink_to_fit()`: release unused space

3. access an element
    1. `at(pos)`: safe access, cannot change
    2. `front()`: first element
    3. `back()`: last element
    3. `data()`: pointer to vector

4. modifiers
    1. `assign(num, value)`: fill with num values
    2. `assign(startIterator, endIterator)`: copy [start, end)
    3. `push_back(value)`: add value to end
    4. `pop_back()`: remove last
    5. `insert(iterator, value)`: add value at iterator
    6. `insert(iterator, num, value)`: add num values at iterator
    7. `insert(iterator, valueStartIterator, valueEndIterator)`: add [start, end) at iterator
    8. `erase(iterator)`: erase at iterator
    9. `erase(startIterator, endIterator)`: erase [start, end)
    10. `swap(vector)`: swap with vector
    11. `clear()`: remove all elements
    12. `emplace(iterator, value)`: insert value at iterator in-place
    13. `emplace_back(value)`: insert value at end in-place