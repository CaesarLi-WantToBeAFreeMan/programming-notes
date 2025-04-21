### Date: October 22, 2024
### Title: Lesson02:  Output and Variables
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: From Beginner to Senior
### Website:  [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI chatGPT

##### output
* In `JavaScript`, it has four different ways to output
    1. `innerHTML`
        * We need access an `HTML` element with the code `document.getElementById(id)` first.
        * Changing the content with the code `element.innerHTML = value` second.
        * It's a common way to display data in `HTML`.
        * example:
        ```
        ...
            <body>
                <p id = "paragraph">Hi</p>
            </body>
            <script>
    	        const para= document.getElementById("paragraph");
                //overwirte original content
                para.innerHTML = "This paragraph is used to";
                //append text at the end
                para.innerHTML += " display something...";
            </script>
        ...
        ```
    2. `document.write()`
        * For testing purposes, it's convenient to use `document.write()`.
        * Using it after an `HTML` document is loaded, will **DELETE ALL EXISTING HTML**.
        * ***It should only be used for testing.***
        * example:
        ```
        ...
            <body>
                <p>Hi</p>
                <button onclick = "document.write(5 + 6)">click me</button>
            </body>
        ...
        ```
    3. `window.alert()`
        * You can skip `window`, because `window` is a global scope object.
        * You can use an alert box to display data.
        * example:
        ```
        ...
            <body>
            </body>
            <script>
                alert("Hello World!");
            </script>
        ```
    4. `console.log()`
        * For debugging purposes, you can use the `console.log()` method in browser to display data.
        * example:  `console.log("Hello World!");`
##### variable types
* In `JavaScript`, it has four different variable types:
    1. ` `(automatically)
        * If you don't declare what's the variable type, `JavaScript` will define it to be an `automatic` type.
        * It's considered good programming practice to always declare variables before use.
        * Varibles created without declaration keyword (`var`, `let`, `const`) are **always global**, even if they are created inside a function.
    2. `var`
        * The `var` keyword was used in all `JavaScript` code from `1995` to `2015`.
        * The `var` keyword should only be used in code written for old browsers.
        * Only use `var` if you **MUST SUPPORT OLD BROWSERS**.
    3. `let`
        * The `let` keyword was added to `JavaScript` in 2015.
        * Only use `let` if you can't use `const`.
    4. `const`
        * The `const` keyword was added to `JavaScript` in 2015.
        * Always use `const` if the value should not be changed.
        * Always use `const` if the type should not be changed(e.g. `Arrays` and `Obejcts`).
* In other words, if you don't change the value or the type, use `const`, otherwise, use `let`.