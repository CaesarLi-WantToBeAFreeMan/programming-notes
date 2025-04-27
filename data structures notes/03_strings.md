# Title: Strings

# Author: Caesar James LEE

## definition

* similar to `vector <char>`, but optimized for text manipulation

## syntax

### library
* `#include <string>`

### conversions from `<string>`

#### convert from string
1. `stoi(string, * index = 0, base = 10)`: convert string to an `int`
    * `string` is the resource string
    * `* index` is a pointer to a `size_t` that receives the index of the next character after the number
        * in other words, after conversion, `* index` will hold the size of the string
        * the parameter is optional
        * `base` is a numerical base (e.g. 2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal)
        * default is `10`
    * example
        ```cpp
            std::string test = "101";
            size_t nextIndex;
            int number = stoi(test, &nextIndex, 2);//5
            test.push_back('a');//test: 101a
            test [nextIndex] = 'f';//test: 101f
            number = stoi(test, nullptr, 16);//4,127
        ```
2. `stol(string, * index = 0, base = 10)`: convert string to `long int`
3. `stoul(string, * index = 0, base = 10)`: convert string to `unsigned long int`
4. `stoll(string, * index = 0, base = 10)`: convert string to `long long`
5. `stoull(string, * index = 0, base = 10)`: convert string to `unsigned long long`
6. `stof(string, * index = 0)`: convert string to `float`
7. `stod(string, * index = 0)`: convert string to `double`
8. `stold(string, * index = 0)`: convert string to `long double`

#### convert to string
1. `to_string()`: convert a numerical value to string
    * you cannot directly covert numbers other than decimal

### methods

1. constructor
    1. `string()`: create an empty string
    2. `string(string)`: copy from other string
    3. `string(string, position, length)`: copy a substring from other string [position, position + length)
    4. `string(char *)`: copy from a C-style string
    5. `string(char *, position, length)`: copy a substring from a C-style string position, position, length)
    6. `string(frequency, char)`: create a string with frequency copies of the character
    7. `string(beginIterator, endIterator)`: copy elements in [container.beginIterator, endIterator)

2. iterators
    * similar to `vector`

3. capacities
    * like vector
        1. `size()`: number of characters
        2. `max_size()`: max possible number of characters
        4. `capacity()`: current located capacity
        5. `empty()`: is empty
        6. `reserve(num)`: preallocate space
        7. `shrink_to_fit()`: release unused space
    * dislike vector
        1. `length()`: same as `size()`, provide for C-style compatibility
        2. `clear()`: clear the string

4. access an element
    1. `[]`: access a character (no boundary checking)
    2. `at(pos)`: safe access with boundary checking
    3. `front()`: first character
    4. `back()`: last character

5. modifiers
    1. `assign(string)`: copy from a string
    2. `assign(string, position, length)`: copy from a string [position, position + length)
    3. `assign(char *)`: copy from a C-style string
    4. `assign(char *, length)`: copy from a C-style string [0, length)
    5. `assign(value, char)`: fill with num chars
    6. `assign(startIterator, endIterator)`: copy [start, end)
    7. `push_back(char)`: add char to end
    8. `pop_back()`: remove last
    9. `insert(position, string)`: add string at position
    10. `insert(insertPosition, string, copyPosition, length)`: add string [copyPosition, length) at insertPosition
    11. `insert(position, char)`: add char at position
    12. `insert(position, char, frequency)`: add frequency chars at position
    13. `insert(iterator, char)`: add char at iterator
    14. `insert(iterator, valueStartIterator, valueEndIterator)`: add [start, end) at iterator
    15. `erase(position, length)`: erase at [position, position + length)
    16. `erase(iterator)`: erase at iterator
    17. `erase(startIterator, endIterator)`: erase [start, end)
    18. `swap(string)`: swap with other string
    19. `+= string`: append from a string
    20. `+= char *`: append from a C-style string
    21. `+= char`: append from a char
    22. `append(string)`: append from a string
    23. `append(string, position, length)`: append from a string [position, position + length)
    24. `append(char *)`: append from a C-style string
    25. `append(char *, length)`: append from a C-style string [0, length)
    26. `append(frequency, char)`: append frequency chars
    27. `append(startIterator, endIterator)`: append from [start, end)
    28. `replace(position, length, string)`: replace with string at [position, position + length)
    29. `replace(position, length, string, copyPosition, copyLength)`: replace with string [copyPosition, copyPosition + copyLength) at [position, position + length)
    30. `replace(position, length, char *)`: replace with a C-style string at [position, position + length)
    31. `replace(position, length, char *, copyLength)`: replace with a C-style string [0, length) at [position, position + length)
    32. `replace(position, length, frequency, char)`: replace with frequency chars at [position, position + length)
    33. `replace(startIterator, endIterator, string)`: replace with string at [start, end)
    34. `replace(startIterator, endIterator, string, position, length)`: replace with string [position, position + length) at [start, end)
    35. `replace(startIterator, endIterator, char *)`: replace with a C-style string at [start, end)
    36. `replace(startIterator, endIterator, char *, length)`: replace with a C-style string [0, length) at [start, end)
    37. `replace(startIterator, endIterator, frequency, char)`: replace with frequency chars at [start, end)
    38. `replace(startIterator, endIterator, copyStartIterator, copyEndIterator)`: replace with [copyStart, copyEnd) at [start, end)

6. string operations
    1. `c_str()`: return a `const char *` C-style string
    2. `data()`: like `c_str()` (guarantee null-termination since `C++11`)
    3. `substr(position, length)`: return a substring [position, position + length)
    4. `find(string, position = 0)`: find the first occurrence of string begin at position
    5. `find(char *, position = 0)`: find the first occurrence of C-style string begin at position
    6. `find(char *, position, length)`: find the first occurrence of C-style string [0, length) begin at position
    7. `find(char, position = 0)`: find the first occurrence of char begin at position
    8. `rfind()`: like `find` but find the last occurrence
    9. `find_first_of()`: like `find` but find the first occurrence that marches any of the given string or C-style string
    10. `find_last_of()`: like `find_first_of` but the last occurrence
    11. `find_first_not_of()`: like `find_first_of()` but not match
    12. `find_last_not_of()`: like `find_last_of()` but not match
    13. `copy(char *, length, position = 0)`: copy [position, position + length) to char *
    14. `compare(string)`: compare the string with the string parameter
    15. `compare(position, length, string)`: compare the string [position, position + length) with the string parameter
    16. `compare(position, length, string, copyPosition, copyLength)`: compare the string [position + position + length) with the string parameter [copyPosition, copyPosition + copyLength)
    17. `compare(char *)`: compare the string with the C-style string
    18. `compare(position, length, char *)`: compare the string [position, position + length) with the C-style string
    19. `compare(position, length, char *, copyLength)`: compare the string [position, position + length) with the C-style string [0, length)
    20. compare value:
        * `0`: equal
        * `> 0`: first unmatched character is greater, or first string is longer
        * `< 0`: first unmatched character is lower, or first string is shorter

7. constant
    * `npos`: a special value (`size_t` equal to `-1`) used to represent `not found`