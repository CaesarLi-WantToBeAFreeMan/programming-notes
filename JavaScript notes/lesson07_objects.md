### Date: October 22, 2024
### Title: Lesson07:  Objects
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: From Beginner to Senior
### Website:  [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI chatGPT

##### creating an object
* It has six different ways:
    1. object literal
    2. `new`
    3. object constructor
    4. `Object.assign()`
    5. `Object.create()`
    6. `Object.fromEntries()`
##### Object Literal or Object Initializer
* An Object Literal is a list of property `name: value` inside the curly braces (`{}`).
* example:
```
//creating an object call caesar
const caesar = {
    //adding firstName property
    firstName: "Caesar",
    //adding middleName property
    middleName: "James",
    //adding lastName property
    lastName: "LEE",
    //ading age property
    age: 18
}
alert(`hi ${caesar.age}-year-old ${caesar.firstName} ${caesar.middleName} ${caesar.lastName}!`);
```
##### `new`
* `new` keyword is used to create an empty object.
* For readability, simplicity and execution speed, **use the `object literal` method rather than `new` keyword.**
* example:
```
//creating an empty object named "caesar"
const caesar = new Object();
        
//adding a property named firstName
caesar.firstName = "Caesar";
//adding a property named middleName
caesar.middleName =  "James";
//adding a property named lastName
caesar.lastName = "LEE";
//adding a property named age
caesar.age = 18;
            
alert(`hi ${caesar.age}-year-old ${caesar.firstName} ${caesar.middleName} ${caesar.lastName}!`);
```
##### object constructor
* If we need to create many object of the same type, we'll use an object construction function.
* Then we can use constructors as both `C++` and `Java`.
* example:
```
function Student(firstName, middleName, lastName, age){
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
}
```
##### `Object.assign(target, source)`
* Copies properties from a `source` objects to a `target` object.
* example:
```
//creating two objects
const student = {
    firstName: null,
    middleName: null,
    lastName: "LEE",
    age: 18
};
const student1 = {firstName: "Caesar", middleName: "James"};
//copying all property values from student1 to student
Object.assign(student, student1);
alert(`hello ${student.age}-year-old ${student.firstName} ${student.middleName} ${student.lastName}!`);
```
##### `Object.create(object)`
* Creates an object from an existing object.
* example:
```
//creating an object
const student = {
    firstName: null,
    middleName: null,
    lastName: null,
    age: null
};
//copying all properties from student to caesar
const caesar = Object.create(student);
//modifying all property values
caesar.firstName = "Caesar";
caesar.middleName = "James";
caesar.lastName = "LEE";
caesar.age = 18;
alert(`hello ${caesar.age}-year-old ${caesar.firstName} ${caesar.middleName} ${caesar.lastName}!`);
```
##### `Object.fromEntries(array || 2D array)`
* Creats an object from a list of `[property, value]` pairs.
* example:
```
const student = [
    ["firstName", "Caesar"],
    ["middleName", "James"],
    ["lastName", "LEE"],
    ["age", 18]
];
const caesar = Object.fromEntries(student);
alert(`hello ${caesar.age}-year-old ${caesar.firstName} ${caesar.middleName} ${caesar.lastName}!`);
```
##### prototypes
* All `JavaScript` objects inherit properties and methods from a `prototype`.
* The `Object.prototype` is on the top of the prototype inheritance chain.
* `JavaScript` allows you to add new properties to the object constructor with `prototype`.
* example:
```
function Student(firstName, lastName, age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
}
Student.prototype.middleName = "James";
const caesar = new Student("Caesar", "LEE", 18);
alert(`Hello ${caesar.age}-year-old ${caesar.firstName} ${caesar.middleName} ${caesar.lastName}`);
```
##### `Object` methods
* `Object` methods can be grouped into three types:
    1. General Methods
    2. Property Management Methods
    3. Object Protection Methods
##### general methods
1. `Object.assign(target, source)`
2. `Object.create(object)`
3. `Object.entries(object)`
    * Returns an array of the `[key, value]` pairs of an object.
    * example:
    ```
    const caesar = {
        firstName: "Caesar",
        middleName: "James",
        lastName: "LEE",
        age: 18
    };
    alert(Object.entries(caesar));
    ```
4. `Object.fromEntries()`
5. `Object.keys(object)`
    * Returns an array of the `keys` of an object.
    * The `Object.keys(object)` method doesn't change the original object.
    * example:
    ```
    const caesar = {
        firstName: "Caesar",
        middleName: "James",
        lastName: "LEE",
        age: 18
    };
    for(let key of Object.keys(caesar))
    	alert(key);
    ```
6. `Object.values(object)`
    * Returns an array of the `property` values of an object.
    * The `Object.values(object)` method doesn't change the original object.
    * example:
    ```
    const caesar = {
        firstName: "Caesar",
        middleName: "James",
        lastName: "LEE",
        age: 18
    };
    for(let value of Object.values(caesar))
    	alert(value);
    ```
7. `Object.groupBy(object, callback)`
    * Groups elements of an object according to string values returned from a callback function.
    * Doesn't change the original object.
    * example:
    ```
    const persons = [
        //arrays
        {name: "caesar", age: 18},
        {name: "james", age: 20},
        {name: "john", age: 5},
        {name: "lily", age: 3},
        {name: "mary", age: 39}
	];
		
    //group the object into two types: adult or child
	function groupRule({age}){
        return age >= 18 ? "adult" : "child";
    }
        
    //creating a variable to hold the result
    const result = Object.groupBy(persons, groupRule);
        
    alert("adults");
    for(let value of result.adult.values())
        alert(value.name + "\t" + value.age);
    
    alert("children");
    for(let value of result.child.values())
        alert(value.name + "\t" + value.age);
    ```
##### management methods
1. `Object.defineProperty(object, property, descriptor)`
    * Adding or changing an object property.
2. `Object.defineProperties(object, descriptor)`
    * Adding or changing object properties.
3. `Object.getOwnPropertyDescriptor(object, property)`
    * Accessing a property.
4. `Object.getOwnPropertyDescriptors(object)`
    * Accessing properties.
5. `Object.getOwnPropertyNames(object)`
    * Returns all properties as an array.
6. `Object.getPrototypeOf(object)`
    * Accessing the prototype.