# Title: Enumeration Algorithm

# Author: Caesar James LEE

## explanation

* Also called `Brute-force Search`
* A fundamental problem-solving method in algorithm design
* Goes through all possible candidates/states/paths/values and checks which ones satisfy the given condition

## time complexity

* Depends on the specific problem

## space complexity

* Also depends on the problem

## code

* No general template, depends on what you're enumerating

## example: find all possible subsets

### simple
* set: `{1, 2, 3}`
* subsets: `{}`, `{1}`,`{2}`,`{1, 2}`,`{3}`,`{1, 3}`,`{2, 3}`,`{1, 2, 3}`,

### idea

* The `i-th` bit in `mask` represents whether to include `set [i]`

| mask (binary) | subset    |
| :-----------: | :-------: |
| 000           | {}        |
| 001           | {1}       |
| 010           | {2}       |
| 011           | {1, 2}    |
| 100           | {3}       |
| 101           | {1, 3}    |
| 110           | {2, 3}    |
| 111           | {1, 2, 3} |

### code

```cpp
    std::vector <int> set = {1, 2, 3};
    for(int mask = 0; mask < (1 << simple.size()); mask++){
        bool isFirst = true;
        for(int i = 0; i < simple.size(); i++)
            if(mask & (1 << i)){
                if(!isFirst)
                    std::cout << ", ";
                std::cout << set [i];
                isFirst = false;
            }
        std::cout << "}\n";
    }
```