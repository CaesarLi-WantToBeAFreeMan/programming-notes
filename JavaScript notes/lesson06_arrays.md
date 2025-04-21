### Date: October 22, 2024
### Title: Lesson06:  Arrays
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: From Beginner to Senior
### Website:  [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI chatGPT

##### array
* An array is a special variable, which can hold more than one value.
* An array can hold many values under a single name, and you can access the values by referring to an index number.
* syntax likes `C++`, but use `[]` rather than `{}`:
    * `const arrayName = [value1, value2...];
* You can store **different types** into an array:
    * example:
    ```
    const test = [12, 2, 3, "caesar", 2.4, true];
    for(let value of test)
        alert(value);
    ```
##### using `Array` keyword
* You can use `Array` keyword to create an array:
    * `const testArray = new Array("some", "thing", "here");`
* For simplicity, readibility, and execution speed, use the array literal mothod (the first way).
##### creating a 2D array
* 2D array means an array of arrays.
* there's two simple ways to create a 2D array
    1. `manually creating`
        * It's **the simplest** way.
    ```
    const test = [
        ["Hello", "I'm"],
        [18, "year-"],
        ["old", "boy"]
    ];
    ```
    2. `using loop`
    ```
    //you can't name a variable staring with a number
    const array2D = [];

    for(let row = 0; row < 3; row++){
        //creating a new row
        array2D [row] = [];
        for(let column = 0; column < 3; column++)
            //creting a new column
            array2D [row] [column] = row * column + 3;
    }
    ```
##### Array methods
1. `length`
    * Returns the length or size of an array.
2. `toString()`
    * Converts an array of a string of (comma separated) array values.
    * Or just type the name.
    * example:
    ```
    const   test = ["a", "b", "c", "d", "e"],
            //result: a,b,c,d,e
            result = test.toString();       //or result = test
    ```
3. `at(position)`
    * Returns an indexed element from an array.
    * Returns the same as `[]` when you pass a positive number.
    * When you pass a negative number, `[-1]` doesn't mean the last one element, but `at(-1)` does.
4. `join(separator)`
    * Returns all values into a string likes `toString()` method, but you can specify a separator.
    * example:
    ```
    const person = ["caesar", "james", "lee"];
    //output: caesar + james + lee
    alert(person.join(" + "));
    ```
5. `pop()`
    * Removes the last element from an array.
    * Likes `pop_back` method of `vector` in `C++`.
6. `shift()`
    * Removes the first array element and shifts all other elements to a lower index.
    * The return value is `shifted out`.
7. `push(element)`
    * Adds a new element to an array at the end.
    * Likes `push_back` method of `vector` in `C++`.
8. `unshift(element)`
    * Adds a new element to an array at the beginning and unshifts older elements.
    * Returns the new array `length`.
9.  `delete arrayName [position]`
    * Just delete the value but not remove the element.
    * Resets the value to `undefined`.
10. `concat(...exsitingArrayName)`
    * Creates a new array by concatenating (merging) exsiting arrays.
    * Doesn't change the existing array.
    * Always returns a new array.
    * takes any number of array arguments because of (`...`).
    * example:
    ```
    const person = ["caesar", "james", "lee"];
    const cheer = ["is", "a", "good", "boy"];
    const result = person.concat(cheer);
    alert(result.join(" + "));
    ```
11. `copyWithin(pastePosition, copyPosition)`
    * Copies array elements to another position in an array.
    * Overwrites the existing values.
    * Doesn't add items to the array.
    * Doesn't change the length of the array.
    * example:
    ```
    const person = ["caesar", "james", "lee"];
    //copy all elements starting from [0] and paste them starting from [1]
    person.copyWithin(1, 0);
    //output: caesar + caesar + james
    alert(person.join(" + "));
    ```
12. `flat(depth)`
    * Creates a new array with sub-array elements concatenated to a specified depth.
    * In other words, it splits an array of specified depth into individual values and then concatencates it into a new array.
    * The default depth is `1`.
    * example:
    ```
    const test = [
      	[
        	[1, 2], [3, 4]
        ],
        [
            [
        	    [5, 6], [7, 8]
            ],
            [9, 10]
        ]
    ];

    //result:
    /*
    position: value
        [0]: 1
        [1]: 2
        [2]: 3
        [3]: 4
        [4]: [5, 6]
        [5]: [7, 8]
        [6]: 9
        [7]: 10
    */
    const result = test.flat(2);
    console.log(result);
    ```
13. `splice(addPosition, removeNumber, ...addElement)`
    * Used to add some elements and / or remove some elements.
    * It'll return an array to hold all elements what you wanna remove.
    * example:
    ```
    //position		0	    1       2
    //value         apple   banana  orange
    const test = ["apple", "banana", "orange"];
    test.splice(1, 0, "cherry", "pineapple");
    //position      0       1       2           3(original [1])         4(original [2])
    //value         apple   cherry  pineapple   banana                  orange
    alert(`now test is [${test}]`);

    //test
    //position      0       1       2           3           4
    //value         apple   cherry  pineapple   coconut     orange

    //removed
    //position      0
    //value         banane
    const removed = test.splice(3, 1, "coconut");
    alert(`now test is [${test}]`);
    alert(`the removed element is [${removed}]`);

    //test
    //position      0       1       2           3
    //value         apple   cherry  pineapple   coconut
    test.splice(4, 1);
    alert(`now test is [${test}]`);
    ```
14. `toSpliced()`
    * It's a new version of `splice()` method.
    * It'll keep the old array, and return a new array.
    * example:
    ```
    const   test = ["apple", "banana", "orange"],
            result = test.toSpliced(1, 0, "cherry", "pineapple");
    //test: ["apple", "banana", "orange"]
    alert(`now test is [${test}]`);
    //result: ["apple", "cherry", "pineapple", "banana", "orange"]
    alert(`now result is [${result}]`);

    const result1 = result.toSpliced(3, 1, "coconut");
    //result: ["apple", "cherry", "pineapple", "banana", "orange"]
    alert(`now result1 is [${result1}]`);
    //result1:  ["apple", "cherry", "pineapple", "coconut", "orange"]
    alert(`the removed element is [${removed}]`);

    const result2 = result.toSpliced(4, 1);
    //result: ["apple", "cherry", "pineapple", "banana", "orange"]
    alert(`now result is [${result}]`);
    //result2:  ["apple", "cherry", "pineapple", "banana", "orange"]
    alert(`now result2 is [${result2}]`);
    ```
15. `slice(startPosition, endPosition)`
    * Slices out a piece of an array into a new array.
    * In other words, it just returns a new array [startPosition, length - 1] or [startPosition, endPosition).
    * example:
    ```
    //test
    //position      0   1   2   3   4   5   6   7   8
    //value         1   2   3   4   5   6   7   8   9
    const   test = [1, 2, 3, 4, 5, 6, 7, 8, 9],

    //result
    //position      0   1   2   3   4   5
    //value         4   5   6   7   8   9
            result = test.slice(3),

    //result1
    //position      0   1
    //value         4   5
            result1 = test.slice(3, 5);

    alert(result);
    alert(result1);
    ```
##### search methods
1. `indexOf(value, startPosition)`
    * Searchs an array for an element value and returns its position.
    * value is required, startPosition is optional.
    * If returns `-1` means not found.
2. `lastIndexOf(value)`
    * Likes `indexOf(value, startPosition)`, but search form from the end.
3. `includes(value)`
    * Allows us to check if an element is present in an array.
    * It returns a boolean whether the array contains the value.
    * It can check `NaN`, `null`, `undefined`.
4. `find(function)`
    * Returns the value of the first array element that passes a test function.
    * You must pass three arguments to the test function: `value`, `index` and `Array`.
    * It'll return `undefined` if not found.
    * example:
    ```
    const test = [1, 5, 9, NaN, null, 18, undefined, 21];
    function isAdult(value, index, array){
        return value >= 18 ? true : false;
    }
    //output: 18
    alert(test.find(isAdult));
    ```
5. `findIndex(function)`
    * Likes `find(function)`, but returns an index of the value.
    * It'll return `-1` if not found.
6. `findLast(function)`
    * Likes `find(function)`, but there're two key differences:
        1. Finds for the value from end to start.
        2. You just need pass only one argument: `value`.
7. `findLastIndex(function)`
    * Likes `findIndex(function)`, but there're two key differences:
        1. Finds for the value from end to start.
        2. You just need pass only one argument: `value`.
##### alphabetic sort methods
1. `sort(function)`
    * Sorts an array alphabetically (from A to Z, then from a to z).
2. `reverse(function)`
    * Reverses the elements in an array.
3. `toSorted(function)`
    * As a safe way to sort an array without altering the original array.
    * In other words, it creates a new array and keeps the original array unchanged.
4. `toReversed(function)`
    * Creates a new array to hold the reverses array.
##### numeric sort methods
* Whether they are integers or floating point numbers, **you cannot use the `sort` method to sort numbers** because `JavaScript` treats them as strings.
* To fix this, you need pass a custom function to `sort` method:
    1. ascending order
    ```
    const numbers = [12, 3, 6, 89, 65, 30, 1, 0, -6, 35];
    //when you use first - second, JavaScript treats both first and second parameters as numbers
    //then sort method will sort the result (firstNumber - secondNumber)
    numbers.sort((first, second) => first - second);
    alert(numbers);
    ```
    2. descending order
    ```
    const numbers = [12, 3, 6, 89, 65, 30, 1, 0, -6, 35];
    numbers.sort((first, second) => second - first);
    alert(numbers);
    ```
* You can use `toSorted()` method if you wanna keep the original array for some reasons.
##### iteration
1. `forEach(function)`
    * example:
    ```
    const test = ["I", "am", "Caesar", "James", "LEE"];
    let result = "";
    test.forEach(value => result += value + " ");
    alert(result);
    ```
2. `map(function)`
    * Creates a new array by performing a function on each array element.
    * Doesn't execute the function for array elements without `value`.
    * Doesn't change the original array.
    * example:
    ```
    const   numbers = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024],
            result = numbers.map(value => value * 2);
    alert(result);
    ```
3. `flatMap(function)`
    * First maps all elements of an array and then creates a new array by flattening the array.
    * In other words, it adds the result before the original element.
    * example:
    ```
    const   numbers = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024],
            result = numbers.flatMap(value => [value, value * 2]);
    alert(`result: ${result}`);
    ```
4. `filter(function)`
    * Creates a new array with array elements that pass a `true`.
    * example:
    ```
    const   ages = [3, 7, 14, 89, 39, 30, 20, 7, 90, 50, 35, 27, 47, 87, 1],
            adults = ages.filter(value => value >= 18);
    alert(adults);
    ```
5. `reduce(function)`
    * Runs a function on each array element to produce (reduce it to) a single value.
    * Doesn't reduce the original array.
    * Works **from left to right** in the array.
    * example:
    ```
    const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
    let sum = numbers.reduce((total, value) => total += value),
        //you can specify an initial number
        sum1 = numbers.reduce((total, value) => total += value, 100);
    alert(sum);
    alert(sum1);
    ```
6. `reduceRight(function)`
    * Likes `reduce(function)`, but works **from right to left**.
7. `every(function)`
    * Checks if all array values pass a `true` via the function.
    * Returns `true` if all values pass a `true`.
    * example:
    ```
    const   ages = [3, 6, 9, 12, 15, 18, 21, 24, 27, 30],
            adults = ages.every(value => value >= 18);
    alert(adults);
    ```
8. `some(function)`
    * Checks if some (at least one) array values pass a `true` via the function.
    * example:
    ```
    const   ages = [3, 6, 9, 12, 15, 18, 21, 24, 27, 30],
            adults = ages.some(value => value >= 18);
    alert(adults);
    ```
9. `from(object)`
    * Returns an `Array` object with a length property or any iterable object.
    * example:
    ```
    const result = Array.from("Hello World!");
    //result: "H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d", "!"
    alert(result);
    ```
10. `keys()`
    * Returns an `Array Iterator` object with the keys of an array.
    * example:
    ```
    const food = ["spaghetti", "steak", "pizza", "chips", "burgers"];
    for(let dish of food.keys())
    //through 0 to 4
    alert(dish);
    ```
11. `values()`
    * Likes `keys()`, but returns values.
12. `entries()`
    * Likes `keys()`, but returns `[key, value]` pairs.
13. `with(position, value)`
    * As a safe way to update elements in an array without altering the original array.
    ```
    const   food = ["spaghetti", "steak", "pizza", "chips", "burger"],
            now = food.with(3, "fried chicken");
    alert(now);
    ```
14. 