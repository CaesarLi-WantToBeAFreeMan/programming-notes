### Date: October 22, 2024
### Title: Lesson04:  Functions
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: From Beginner to Senior
### Website:  [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI chatGPT

##### differences between `JavaScript` and both `C++`'s functions or `Java`'s methods
* Replacing `return type` to `function`
* Don't type types of parameters.
* exmaple:
    ```
    //num1 and num2 can be int, double, float, string, bool, etc.
    function sum(num1, num2){
        return num1 + num2;
    }
    ```
##### anonymous functions
* It means a function without a name.
* example:
```
const sum = function(num1, num2){
    return num1 + num2;
};
alert(sum(1, 2));
```
##### spread operator or rest parameter (`...`)
* The Spread Operator or Rest Parameter (`...`) allows you to expend elements of an iterable (e.g. array, string, object, etc.) into individual elements.
* For functions, it can collect all parameters into a collection, then use it.
* example:
```
function sum(...numbers){
    let sum = 0;
    for(let num of numbers)
        sum += num;
    return sum;
}
alert(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1));
```
##### default value
* It likes `C++`.
* example:
```
function something(num1, num2 = 12){
    return num1 + num2;
}
```
##### `arguments` object
* `JavaScript` functions have a built-in obeject called the `arguments` object.
* The `arguments` object contains an array of arguments used when thw function was invoked.
* example:
```
function max(){
    //like int max = - (INT_MAX + 1) in C++
    //but you need include <climits>
    let max = -Infinity;
    for(let num of arguments)
        if(num > max)
            max = num;
    return max;
}
```
##### `this`
* Likes `C++`.
* If you wanna invoke a method within an object using `this` keyword, you must use `call()` or `apply()` or `bind()` method.
##### `call()`
* It's a predefined `JavaScript` method.
* syntax: `objectName.method.call(instanceName);`
* example:
```
//creating an object
const student = {
    //creating a method called fullName
    fullName: function(){
        return this.firstName + " " + this.lastName;
    },
    fullNameWithASymbol: function(symbol){
        return this.firstName + symbol + this.lastName;
    }
};

//creating a instance called caesar
const caesar = {
    firstName: "Caesar",
    lastName: "LEE"
};

//invoking fullName of caesar
alert(student.fullName.call(caesar));
alert(student.fullNameWithASymbol.call(caesar, "+"));
```
##### `apply()`
* It's similar to the `call` method.
* syntax:   `objectName.method.apply(instanceName);`
* example:
```
//creating an object
const student = {
    //creating a method called fullName
    fullName: function(){
        return this.firstName + " " + this.lastName;
    },
    fullNameWithASymbol: function(symbol){
        return this.firstName + symbol + this.lastName;
    }
};

//creating a instance called caesar
const caesar = {
    firstName: "Caesar",
    lastName: "LEE"
};

//invoking fullName of caesar
alert(student.fullName.apply(caesar));
alert(student.fullNameWithASymbol.apply(caesar, ["+"]));
```
##### `bind()`
* An object can borrow a method from another object.
* In other words, you need create a variable to hold it, and it doesn't execute immediately. it'll execute when you invoked the new variable.
* example:
```
//creating an object
const student = {
    //creating a method called fullName
    fullName: function(){
        return this.firstName + " " + this.lastName;
    },
    fullNameWithASymbol: function(symbol){
        return this.firstName + symbol + this.lastName;
    }
};

//creating a instance called caesar
const caesar = {
    firstName: "Caesar",
    lastName: "LEE"
};

//declare two new variable to hold the method
const   fullNameVariable = student.fullName.bind(caesar),
	    fullNameWithASymbolVariable = student.fullNameWithASymbol.bind(caesar, "+");

//invoking fullName of caesar
alert(fullNameVariable(caesar));
alert(fullNameWithASymbolVariable());
```
##### differences with `call`, `apply()`, `bind()`
* `call()` takes arguments separatedly.
* `apply()` takes arguments as an array.
* `bind()` returns a new function and doesn't execute immediately.
##### closure
* Allows a child function can access variables from its lexical scope (or parent function) even after that scope has exited.
* Essentially, a closure is formed when an inner function retains access to the outer function's variables.
* When a function is created in `JavaScript`, it retains a reference to its lexical scope, means it can access variables from its outer function even after the outer function has finished executing.
* example:
```
function outerFunction(){
    //private variable
    let outerVariable = "Hello, This is an outer variable.";
    function innerFunction(){
        //accessing the private variable
        alert(outerVariable);
    }
    //calling innerFunction immediately
    return innerFunction();
}
const closureFunction = outerFunction();
closureFunction();
```
* pros
    1. Encapsulation:
        * You can create private variable that can't be accessed from outer the closure.
    2. Sate Maintenance:
        * It can be used to maintain state in asynchronous operations or callbacks.
    3. Dynamic Scope:
        * Allows functions to have a dynamic scope, where they can capture the state from its environment.
    4. Memory Management:
        * It can hold onto memory for variables that might otherwise be cleaned up. This is important in certain scenarios but can lead to momery leaks if not handled properly.
##### lambda expression or arrow functions
* syntax:
    ```
    const functionName () => statement;                 //no parameter and one statement
    const functionName () => {statement};               //no parameter and multiple statements
    const functionName parameter => statement;          //one parameter and one statement
    const functionName parameter => {statements};       //one parameter and one statement
    const functionName (parameters) => statement;       //multiple parameters and one statement
    const functionName (parameters) => {statements};    //multiple parameters and multiple statements
    ```