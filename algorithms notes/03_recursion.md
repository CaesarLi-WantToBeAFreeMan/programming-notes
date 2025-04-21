# Title: Recursion Algorithm

# Author: Caesar James LEE

## explanation

* A method where a function calls itself to solve a problem
* Useful when a problem can be divided into smaller subproblems of the same type
* **Must have a base case to stop the recursion**, or it'll run infinitely

## time complexity

* Depends on the specific problem

## space complexity

* Also depends on the problem

## code

* No general template, depends on what you're simulating

:# example: calculate factorial

### rules

* $$n! = n \times (n - 1) \times (n - 2) \times \dots \times 1$$
* base case: $0! = 1$

### simple
* given number: `5`
* output result: `120`

### code

* traditional function
```cpp
    long long factorial(long long n){
        return !n ? 1LL : n * factorial(n - 1);
    }

    int main(){
        int n;
        std::cin >> n;
        std::cout << factorial(n) << std::endl;
        return 0;
    }
```

* lambda function
```cpp
    auto factorial = [](long long n, auto & itself) -> long long{
        return n == 0 ? 1LL : n * itself(n - 1, itself);
    };
    int n;
    std::cin >> n;
    std::cout << factorial(n, factorial) << std::endl;
```