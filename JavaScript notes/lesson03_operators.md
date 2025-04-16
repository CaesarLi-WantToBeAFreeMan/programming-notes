### Date: October 22, 2024
### Title: Lesson03:  Operators
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: From Beginner to Senior
### Website:  [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI chatGPT

##### operator types
* In `JavaScript`, it has eight types:
    1. `Arithmetic Operators`
    2. `Assignment Operators`
    3. `Comparison Operators`
    4. `Logical Operators`
    5. `Bitwise Operators`
    6. `Ternary Operators`
    7. `Type Operators`
##### arithmetic operators
1. `+`
    * Addition
2. `-`
    * Subtraction
3. `*`
    * Multiplication
4. `**`
    * Exponentiation
5. `/`
    * Division
6. `%`
    * Modulus
7. `++`
    * Increment
8. `--`
    * Decrement
* These are like both `C++` and `Java`, expect No.4.
* No.4 `**` likes `Python`.
##### assignment operators
1. `=`
    * Assign
2. `+=`
    * Add and assign
3. `-=`
    * Subtract and assign
4. `*=`
    * Multiply and assign
5. `/=`
    * Devide and assign
6. `%=`
    * Modulus and assign
7. `**=`
    * Exponent and assign
* These are like both `C++` and `Java` except No.7.
* No.7 `**=` likes `Python`.
##### comparison operators
1. `==`
    * equal to
    * example:
        `5 == "5"` returns `true`.
2. `===`
    * equal both **value** and **type**
    * example:
        `5 === "5"` returns `false`.
    * Because `5` is an integer, but `"5"` is a string.
3. `!=`
    * not equal
4. `!==`
    * not equal **value** or **type**
5. `>`
    * greater than
6. `<`
    * less than
7. `>=`
    * greater than or equal to
8. `<=`
    * less then or equal to
9. `??`
    * Nullish Coalescing operator
    * Returns the first argument if it is not `nullish` (`null` or `undefined`), otherwise returns the second argument.
    * example:
    ```
        let first = null,
            second = "text",
            //result is "text"
            result = first ?? second;
        
        let otherFirst = 8964;
            otherSecond = "text",
            //otherResult is 8964
            otherResult = otherFirst ?? otherSecond;
    ```
10. `?.`
    * Optional Chaining operator
    * Returns `undefined` if an object is `undefined` or `null`.
    * example:
    ```
    const student = {firstName = "Caesar", middleName = "James", lastName = "LEE", age = 18, id = 8964, major = "CS"};
    //result is `undefined`, because, `student.score` doesn't exist
    let result = student ?. score;
    ```
##### logical operators
1. `&&`
    * logical AND
2. `||`
    * logical OR
3. `!`
    * logical NOT
##### bitwise operators
1. `&`
    * bitwise AND
2. `|`
    * bitwise OR
3. `~`
    * bitwise NOT
4. `^`
    * bitwise XOR
5. `<<`
    * left shift
6. `>>`
    * right shift
7. `>>>`
    * unsigned right shift
* ***`JsvaScript` uses 32-bit signed numbers.***
##### ternary operators
1. `?:`
    * ternary operator
##### type operators
1. `typeof(variable)`
    * Returns the type of a variable.
2. `instanceof(object)`
    * Returns `true` if an object is an instance of an object type.