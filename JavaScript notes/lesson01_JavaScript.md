### Date: October 22, 2024
### Title: Lesson01:  JavaScript
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: From Beginner to Senior
### Website:  [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI chatGPT

##### basic information about JavaScript
* JavaScript is the world's most popular programming language.
* JavaScript is the programming language of the Web.
* JavaScript is easy to learn.
##### relationship between `HTML`, `CSS` and `JavaScript`
* `HTML` to define the content of web pages.
* `CSS` to specify the layout of web pages.
* `JavaScript` to program the behavior of web pages.
##### JavaScript and Java
* There're different languages, both in concept and design.
  * `JavaScript` was invented by `Brendan Eich` in 1995, and became an `ECMA` standard in 1997.
  * `ECMA-262` is the official name of the standard.
  * `ECMAScript` is the official name of the language.
---
* `Java` is an `Object Oriented Programming (OOP)` language.
* It's created in 1995, and owned by `Oracle`.
* More than `3 billion` devices run `Java`.
##### how to run
* We've two ways to run `JavaScript` in an `HTML` document.
    1. `<script></script>` element
        * In `HTML`, `JavaScript` code is inserted between `<script>` and `</script>` tags.
        * `JavaScript` can be placed in the `<body></body>` element, or in the `<head></head>` element, or in both.
        * Placing `<script></script>` element at the bottom of the `<body></body>` elemnt improves the display speed, because `<script></script>` element interpretation slows down the display.
    2. external JavaScript
        * `JavaScript` can also be placed in external files with the code: `<script src = "path/name.js"></script>`.
        * Advantages:
            1. Separates `HTML` and code.
            2. Makes `HTML` and `JavaScript` easier to read and maintain.
            3. Cached `JavaScript` files can speed up page loads.
##### comments
* It likes C++ and Java
* `//a single line comment`
* ```
    /*
        a
        multiple
        line
        comment
    */
    ```