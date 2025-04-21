# Title: Divide and Conquer Algorithm

# Author: Caesar James LEE

## explanation

* A strategy that divides a problem into smaller subproblems, conquers them recursively, and combines the result
* Often used in sorting, searching and other recursive algorithms
* **Must have a base case to stop the recursion**

## time complexity

* Depends on the specific problem
* Often `O(nlogn)` for balanced divide and conquer problems like `merge sort`

## space complexity

* Also depends on the problem

## code

* No general fixed template
* structure usually follows:
```cpp
    ReturnType solution(parameters){
        if(baseCaseCondition)
            return baseCaseResult;
        auto left = solution(leftParameters),
             right = solution(rightParameters);
        return merge(left, right);
    }
```

## example: merge sort in ascending order

### idea

* divide array into halves
* sort each half recursively
* merge the sorted halves

### simple
* given vector: `{9, 5, -1, 0, -7, 6, 3, -9, 0}`
* sorted vector: `{-9, -7, -1, 0, 0, 3, 5, 6, 9}`

### code

* traditional function
```cpp
    void mergeSort(std::vector <int> & v, int left, int right){
        if(right - left <= 1)
            return;
        int middle = (left + right) >> 1;
        mergeSort(v, left, middle);
        mergeSort(v, middle, right);
        std::vector <int> sorted;
        int l = left, r = middle;
        while(l < middle && r < right)
            sorted.push_back(v [l] < v [r] ? v [l++] : v [r++]);
        while(l < middle)
            sorted.push_back(v [l++]);
        while(r < right)
            sorted.push_back(v [r++]);
        for(int index = 0; index < sorted.size(); index++)
            v [left + index] = sorted [index];
    }

    int main(){
        std::vector <int> v = {9, 5, -1, 0, -7, 6, 3, -9, 0};
        mergeSort(v, 0, v.size());
        for(auto x : v)
            std::cout << x << ' ';
        std::cout << std::endl;
    }
```

* lambda function
```cpp
    std::vector <int> v = {9, 5, -1, 0, -7, 6, 3, -9, 0};
    auto mergeSort = [&](int left, int right, auto & itself){
        if(right - left <= 1)
            return;
        int middle = (left + right) >> 1;
        itself(left, middle, itself);
        itself(middle, right, itself);
        std::vector <int> sorted;
        int l = left, r = middle;
        while(l < middle && r < right)
            sorted.push_back(v [l] < v [r] ? v [l++] : v [r++]);
        while(l < middle)
            sorted.push_back(v [l++]);
        while(r < right)
            sorted.push_back(v [r++]);
        for(int index = 0; index < sorted.size(); index++)
            v [left + index] = sorted [index];
    };
    mergeSort(0, v.size(), mergeSort);
    for(auto x : v)
        std::cout << x << ' ';
    std::cout << std::endl;
```