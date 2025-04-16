# Title: Difference Array Technique

# Author: Caesar James LEE

## explanation

* A technique used to efficiently updates over a range
* Modify only boundaries of the range
* Use prefix sum to restore final values
* Useful for frequent range updates

## time complexity

* 1D difference
    * Range update: $O(1)$
    * Restore: $O(n)$
    * Total: $O(n)$
* 2D difference
    * Range update: $O(1)$
    * Restore: $O(n \times m)$
    * Total: $O(n \times m)$

## space complexity

* 1D difference
    * $O(n)$
* 2D difference
    * $O(n \times m)$

## code

* general template:
    * 1D prefix sum
        * range update:
            * [l,r]
            ```cpp
                int num = 10;
                vector <int> numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                             difference(num + 2);
                for(int l, r; query; query--){
                    cin >> l >> r;
                    difference [l] += value;
                    difference [r + 1] -= value;
                }
            ```
        * restore:
            ```cpp
                for(int i = 1; i <= num; i++)
                    difference [i] += difference [i - 1];
            ```
    * 2D prefix sum
        * range update:
            * (x1, y1) - (x2, y2)
            ```cpp
                int row = 3, column = 4;
                vector <vector <int>> numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
                                      difference(row + 2, vector <int>(column + 2));
                for(int x1, y1, x2, y2; query; query--){
                    cin >> x1 >> y1 >> x2 >> y2;
                    difference [x1] [y1] += value;
                    difference [x2 + 1] [y1] -= value;
                    difference [x1] [y2 + 1] -= value;
                    difference [x2 + 1] [y2 + 1] += value;
                }
            ```
        * restore:
            * [1, row]
                [1, column]
            ```cpp
                for(int r = 1; r <= row; r++)
                    for(int c = 1; c <= column; c++)
                        difference [r] [c] += difference [r - 1] [c] + difference [r] [c - 1] -
                                              difference [r - 1] [c - 1];
            ```

## 1D prefix sum example: [l, r]++

### simple
* size: 5
* 3 update ranges, `1-based` index:
    1. [1, 5]
    2. [2, 3]
    3. [3, 5]
* result: `1 2 3 2 2`

### code

```cpp
    int num = 5, query = 3;
    std::vector <int> difference(num + 2);
    for(int l, r; query; query--){
        std::cin >> l >> r;
        difference [l]++;
        difference [r + 1]--;
    }
    for(int i = 1; i <= num; i++){
        difference [i] += difference [i - 1];
        std::cout << difference[i] << '\n';
    }
```

## 2D prefix sum example: (x1, y1) - (x2, y2)++

### simple
* size: 3 * 4
* 3 update ranges, `1-based index`
    1. (1, 1) - (3, 3)
    2. (2, 3) - (3, 4)
    3. (1, 1) - (3, 1)
* result:
    ```
        2   1   1   0
        2   1   2   1
        2   1   2   1
    ```

### code
```cpp
    int row = 3, column = 4, query = 3;
    std::vector <std::vector <int>> prefix(row + 2, std::vector <int>(column + 2));
    for(int x1, y1, x2, y2; query; query--){
        std::cin >> x1 >> y1 >> x2 >> y2;
        difference [x1] [y1]++;
        difference [x2 + 1] [y1]--;
        difference [x1] [y2 + 1]--;
        difference [x2 + 1] [y2 + 1]++;
    }
    for(int r = 1; r <= row; r++){
        for(int c = 1; c <= column; c++){
            difference [r] [c] += difference [r - 1] [c] + difference [r] [c - 1] -
                                  difference [r - 1] [c - 1];
            std::cout << difference [r] [c] << ' ';
        }
        std::cout << std::endl;
    }
```