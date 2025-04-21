# Title: Prefix Sum Technique

# Author: Caesar James LEE

## explanation

* A technique to preprocess an array so that range sum queries can be answered in constant line
* Uses an auxiliary array where each element stores the cumulative sum up to that index
* Useful in range sum problems, subarray problems and optimization tasks

## time complexity

* 1D prefix sum
    * Preprocessing: $O(n)$
    * Each query: $O(1)$
    * Total: $O(n)$
* 2D prefix sum
    * Preprocessing: $O(n \times m)$
    * Each query: $O(1)$
    * Total: $O(n \times m)$

## space complexity

* 1D prefix sum
    * $O(n)$
* 2D prefix sum
    * $O(n \times m)$

## code

* general template:
    * 1D prefix sum
        * preprocessing:
            * [0, num)
            ```cpp
                int num = 10;
                vector <int> numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                             prefix(num + 1);
                for(int i = 0; i < num; i++)
                    prefix [i + 1] = prefix [i] + numbers [i];
            ```
        * querying:
            * [l, r]
            ```cpp
                prefix [r] - prefix [l - 1]
            ```
    * 2D prefix sum
        * preprocessing:
            * [1, row]
                [1, column]
            ```cpp
                int row = 3, column = 4;
                vector <vector <int>> numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
                                      prefix(row + 1, vector <int>(column + 1));
                for(int r = 1; r <= row; r++)
                    for(int c = 1; c <= column; c++)
                        prefix [r] [c] = numbers [r - 1] [c - 1] + prefix [r - 1] [c] +
                                         prefix [r] [c - 1] - prefix [r - 1] [c - 1];
            ```
        * querying:
            * (x1, y1) - (x2, y2)
            ```cpp
                prefix [x2] [y2] - prefix [x1 - 1] [y2] -
                prefix [x2] [y1 - 1] + prefix [x1 - 1] [y1 - 1];
            ```


## 1D prefix sum example: [l, r] range sum

### simple
* given vector: `{0, 1, 2, 3, 4, 5}`
* given range: [2, 4], `1-based` index
* result: $1 + 2 + 3 = 6$

### code

```cpp
    int num = 6;
    std::vector <int> numbers = {0, 1, 2, 3, 4, 5},
                      prefix(num + 1);
    for(int i = 0; i < num; i++)
        prefix [i + 1] = numbers [i] + prefix [i];
    std::cout << prefix [4] - prefix [2 - 1] << std::endl;
```

## 2D prefix sum example: (x1, y1) - (x2, y2) range sum

### simple
* given matrix:
    ```
        0   1   2   3
        4   5   6   7
        8   9   10  11
    ```
* given range: (1, 2) - (3, 4), `1-based` index
* result: $1 + 2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 = 54$

### code
```cpp
    int row = 3, column = 4;
    std::vector <std::vector <int>> matrix = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}},
                                    prefix(row + 1, std::vector <int>(column + 1));
    for(int r = 1; r <= row; r++)
        for(int c = 1; c <= column; c++)
            prefix [r] [c] = matrix [r - 1] [c - 1] + prefix [r - 1] [c] +
                             prefix [r] [c - 1] - prefix [r - 1] [c - 1];
    std::cout << prefix [3] [4] - prefix [1 - 1] [4] -
                 prefix [3] [2 - 1] + prefix [1 - 1] [2 - 1] << std::endl;
```