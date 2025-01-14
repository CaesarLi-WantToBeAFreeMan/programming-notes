# Title: Course02: Basic
# Author: Caesar James LEE
# Date: January 9, 2025

## using vue ways
* using `vue` directly from a CDN (Content Delivery Network) via a `script` tag:
```html
    <!--using Vue.js version 3-->
    <script src = "https://unpkg.com/vue@3/dist/vue.global.js"></script>
    <!--using Vue the lastest version-->
    <script src = "https://unpkg.com/vue@next"></script>
```
## creating a new applicaiton
* we need to use `createApp()` function
* example:
```javascript
    //create an app instance
    const app = Vue.createApp({
        //root component options
    });
```
* Every app requires a `root component` that can contain other components as its children
* You can think of the `root component` as the `main function`, in where all functions must be invoked
## something what we can embed into `createApp`
1. `template` field
    * `template` means `HTML` on `SFC` (Single File Component), which combines a part of HTML `<template>`, a part of CSS `<style>` and a part of JavaScript `<script>` into a single file as a component
    * We can give it some elements, and these elements are children for `root component`
    * example:
        ```javascript
            //create a child HTML element
            const app = Vue.createApp({
                template: "<p>I'm a child element for root component</p>"
            });
        ```
2. `return` method
    * You need embed variables within HTML elements and around `text interpolation` `{{}}`
    * You can change the varible value via `vue`
    * In fact, the `innerHTML` of the element is a variable, and you can modify the variable value via `vue`, so that the text of the element changed
    * But remember, the variable what you created is a local variable within the `app`.
    * example:
        ```html
            <!--declaration of properties of vue instance-->
            <body>
                <div id = "app">
                    <p>{{variable1}}</p>
                    <p>{{variable2}}</p>
                    <p>{{vairable3}}</p>
                    <p>{{variable4}}</p>
                    <p>{{variable5}}</p>
                </div>
            </body>
        ```
        ```javascript
            const app = Vue.createApp({
                data(){
                    return{
                        variable1: "one1",
                        variable2: "two2",
                        variable3: "three3",
                        variable4: "four4",
                        variable5: "five5"
                    };
                }
            })
        ```
3. `computed` properties
    * It's used to do something automatically when a dependency changes
    * `computed` property operates when a data changed, while `method` operates when an event happens
    * `computed properties` are used the same way we use data properties, but they are dynamic
    * example:
        ```html
            <!--show a message when a user change a variable value by clicking a button-->
            <div>
                <p>Do you like Tesla Cybertruck</p>
                <button @click = "isLikeTeslaCybertruck = !isLikeTeslaCybertruck">{{LikeOrHateTeslaCyberTruckButton}}</button>
                <p>{{LikeOrHateTeslaCyberTruckMessage}}</p>
            </div>
        ```
        ```javascript
            const app = Vue.createApp({
                data(){
                    return{
                        isLikeTeslaCybertruck: true
                    };
                },
                computed:{
                    LikeOrHateTeslaCyberTruckButton(){
                        return this.isLikeTeslaCybertruck ? "hate" : "like";
                    },
                    LikeOrHateTeslaCyberTruckMessage(){
                        return this.isLikeTeslaCybertruck ? "you like tesla cybertruck" : "you hate tesla cybertruck";
                    }
                }
            });
        ```
## `mount(container)` method
* An application instance won't render anything until its `mount()` method is called
* the `container` argument can either be an actual DOM element or a selector string
* You can think of the `createApp()` as an `initial function`, you must invoke it within the `main function`
* Then, all changes of DOM will be controlled by `vue`
* example:
```javascript
    //invoke the app instance
    const app = Vue.createApp({
        //some codes
    });
    app.mount("#app");
```
## directive
* `directive` is a special token that apply reactive behavior to elements in the DOM
* `Vue` has nine directives:
    1. `v-bind` (`:`)
        * Binds an attribute to a data property
    2. `v-model`
        * Creates a two-way binding between an input element and the corresponding data property
    3. `v-if` || `v-else-if` || `v-else`
        * Renders an element conditionally
    4. `v-for`
        * Renders a list of elements
    5. `v-on` (`@`)
        * Connects an event to an action
    6. `v-show`
        * Toggles an element's visibility conditionaly
    7. `v-text`
        * Updates an element's text content
    8.  `v-memo`
        * Holds back rendering of an element until a change is detected in one or more specified properties
    9. `v-once`
        * Renders an element only once
    10. `v-slot`
        * Directs content to a named slot
    11. `v-cloak`
        * Hides an un-compiled template until it is ready
    12. `v-pre`
        * Skips compilation of an element and its content
    13. `v-html`
        * Outputs HTML code in the template
## `v-bind` directive
* The `v-bind` directive lets us bind an HTML attribute to data in the `Vue` instance
* This makes it easy to change the attribute (ie `style`, `class`, etc) value dynamically
* The shorthand for `v-bind` is simply `:`
* syntax:
```html
    <!--increase or decrease the font size-->
    <div id = "app">
        <p :style = {fontSize: size + 'px'}>test text</p>
        <button @click = "increaseFont">increase font size</button>
        <button @click = "decreaseFont">decrease font size</button>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                font: 21
            };
        },
        methods:{
            increaseFont(){
                this.font++;
            },
            decreaseFont(){
                if(this.font > 1)
                    this.size--;
            }
        }
    });
    app.mount("#app");
```
## `v-model` directive
* `v-model` creates a link between the input element `value` attribute and a `data` value in the `Vue` instance
* When you change the input, the data updates and when the data changes, the input updates as well (`two-way binding`)
* The `v-model` two-way binding functionality could actually be achieved with a combination of `:value` and `@input`
    1. `:value` to update the input element from the `Vue` instance data
    2. `@input` to update the `Vue` instance data from the input
* syntax:
```html
    <!--show text you typed-->
    <div id = "app">
        <input type = "text" v-model = "text">
        <p>you typed: {{text}}</p>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                text: "please type something"
            };
        }
    });
    app.mount("#app");
```
## `v-if` || `v-else-if` || `v-else` directive
* With `v-if` you just write the if-statement directly in the HTML element you want to create conditionally
* `Conditional rendering` in `Vue` is done by using the `v-if`, `v-else-if` and `v-else` directives
* `Conditional rendering` is when an HTML element is created only if a condition is true
* syntax:
```html
    <!--show your attitude about apples-->
    <div id = "app">
        <p>do you like apples</p>
        <button @click = "degree = 'like'">like</button>
        <button @click = "degree = 'so so'">so so</button>
        <button @click = "degree = 'hate'">hate</button>
        <p v-if = "degree == 'like'">you like apples</p>
        <p v-else-if = "degree == 'so so'">you don't mind apples</p>
        <p v-else-if = "degree == 'hate'">you hate apples</p>
        <p v-else>please select a button</p>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                degree: "none"
            };
        }
    });
    app.mount("#app");
```
## `v-for` directive
* With `v-for` directive, you can create a lot of HTML elements from an array
* The elements created with `v-for` will automatically update when the array changes
* `List rendering` is done by using the `v-for` directive, so that serveral HTML elements are created with a `for-loop`
* syntax:
```html
    <!--show friuts Caesar knew-->
    <div id = "#app">
        <p>caesar's known fruits</p>
        <ul>
            <li v-for = "fruit in fruits">{{fruit}}</li>
            <li v-for = "(fruit, index) in fruits">{{index}}->{{fruit}}</li>
        </ul>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                fruits:[
                    "apples",
                    "bananas",
                    "oranges",
                    "grapes",
                    "pineapples",
                    "coconuts",
                    "blueberries",
                    "strawberries",
                    "mangos",
                    "lemons",
                    "pears",
                    "watermelons",
                    "peaches",
                    "cherries"
                ]
            };
        }
    });
    app.mount("#app");
```
## `v-on` directive
* It's used to tell browser which event to listen to (`click`, `keydown`, `mouseover`, etc), and what to do when that event occurs
* The shorthand for `v-on` is simply `@`
* Some common HTML events:

    ***MOUSE EVENTS***

    1. `onclick` (`@click`)
        * An element is clicked
    2. `ondblclick` (`@dblclick`)
        * An element is double-clicked
    3. `oncontextmenu` (`@contextmenu`)
        * An element is right-clicked
    4. `onmousedown` (`@mousedown`)
        * The mouse button is pressed over an element
    5. `onmouseup` (`@mouseup`)
        * The mouse button is released over an element
    6. `onmouseenter` (`@mouseenter`)
        * The mouse moves into an element
    7. `onmouseover` (`@mouseover`)
        * The mouse moves onto an element
    8.  `onmouseout` || `onmouseleave` (`@mouseout` || `@mouseleave`)
        * The mouse moves out of an element
    9. `onwheel`
        * The mouse wheel rolls over an element

    ***KEYBOARD EVENTS***

    10. `onkeydown` || `onkeypress` (`@keydown` || `@keypress`)
        * A keyboard key is pressed
    11. `onkeyup`
        * A keyboard key is released

    ***TOUCH EVENTS***

    12. `ontouchstart` (`@touchstart`)
        * A finger is placed on a touch screen
    13. `ontouchend` (`@touchend`)
        * A finger is removed from a touch screen
    14. `ontouchmove` (`@touchmove`)
        * A finger is dragged across the screen
    15. `ontouchcancel` (`@touchcancel`)
        * A touch is interrupted

    ***FOCUS EVENTS***

    16. `onfocus` (`@focus`)
        * An element gets focus
    17. `onblur` (`@blur`)
        * An element loses focus
    18. `onfocusin` (`@focusin`)
        * An element is about to get focus
    19. `onfocusout` (`@focusout`)
        * An element is about to lose focus

    ***DRAG EVENTS***

    20. `ondragstart` (`@dragstart`)
        * A user starts to drag an element
    21. `ondragend` (`@dragend`)
        * A user has finished dragging an element
    22. `ondragenter` (`@dragenter`)
        * A dragged element enters the drop target
    23. `ondragover` (`@dragover`)
        * A dragged element is over the drop target
    24. `ondragleave` (`@dragleave`)
        * A dragged element leaves the drop target
    25. `ondrag` (`@drag`)
        * An element is being dragged
    26. `ondrop` (`@drop`)
        * A dragged element is dropped on the target

    ***CLIPBOARD EVENTS***

    27. `oncut` (`@cut`)
        * A user cuts the content of an element
    28. `oncopy` (`@copy`)
        * A user copies the content of an element
    29. `onpaste` (`@paste`)
        * A user pastes content into an element
* syntax:
    1. using a small amount of code
        ```html
            <!--increase or decrease the number-->
            <div id = "app">
                <h1>number: {{number}}</h1>
                <button v-on:click = "number++">increase(+)</button>
                <button @click = "number--">decrease(-)</button>
            </div>
        ```
        ```javascript
            const app = Vue.createApp({
                data(){
                    return{
                        number: 100
                    };
                }
            });
            app.mount("#app");
        ```
    2. using a large amount of code
        ```html
            <!--change the title-->
            <div id = "app">
                <h1>title: {{title}}</h1>
                <p>please click the change title button</p>
                <button @click = "changeTitle('Vue')">change title</button>
            </div>
        ```
        ```javascript
            const app = Vue.createApp({
                data(){
                    return{
                        title: "initial title"
                    };
                },
                methods:{
                    changeTitle(title){
                        this.title = "Hello " + title;
                    }
                }
            });
            app.mount("#app");
        ```
    ### event modifiers
    * It's used to define how to react on an event in more detail
    * Modifies how events trigger the running of methods and help us handle events in a more efficient and straightforward way
    * modifiers
        1. `@click`
            1. `once`
                * The element click event should only fire one time after the page loads
            2.  `left`
                * Clicks the left mouse key
            3.  `middle`
                * Clicks the wheel
            4.  `right`
                * Clicks the right mouse key
            5. `ctrl`
                * Clicks while presses control key
            6. `alt`
                * Clicks while presses alt key
            7. `shift`
                * Clicks while presses shift key
            8. `meta`
                * Clicks while presses windows (for Windows OS) or command (for MacOS) key
            9. `prevent`
                * Prevents the default behavior of the event
                * `@click.right.prevent`, the browser won't show the context menu
            10. `self`
                * Only triggers the event handler only if the event is triggered on itself
                * Means if you clicked its child element rather than itself, the event won't be triggered
        2. `@dblclick`
            * Likes `click` but you need click doubly
        3. `@keydown`
            * A key is pressing
            * You can combinate s single key `@keydown.a` or a multiple key like `@keydown.ctrl.a`
        4. `@keypress`
            * Likes `keydown` but a key is pressed
        5. `@keyup`
            * Likes `keydown` but a key is released
## `v-show` directive
* `v-show` directive hides an element when the condition is `false` by setting the CSS `display` property to `none`
* syntax:
```html
    <!--show/hide the text-->
    <div id = "app">
        <p>please toggle the button to show/hide the text</p>
        button @click = "toggleButton">{{toggleMessage}}</button>
        <p v-show = "toggleStatus">something</p>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                toggleStatus: true,
                toggleMessage: "hide"
            };
        },
        methods:{
            toggleButton{
                this.toggleStatus = !this.toggleStatus;
                this.toggleMessage = this.toggleStatus ? "hide" : "show";
            }
        }
    });
    app.mount("#app");
```
## `v-text` directive
* It's used to update the text in an element
* syntax:
```html
    <!--change content to hello caesar-->
    <div id = "app">
        <p v-text = "text"></p>
        <button @click = "text = 'hello caesar'">change content</button>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                text: "please click the button to change content"
            };
        }
    });
    app.mount("#app");
```
## `v-memo` directive
* talk later
## `v-once` directive
* It's used to only render an element once
* By only rendering an element once, the performance can be enhanced
* When an element has the `v-once` directive, all its child elements also becomes static after the first render
* syntax
```html
    <!--showing a constant & a dynamic letters-->
    <div id = "app">
        <p v-once>letter: {{letter}}</p>
        <p>letter: {{letter}}</p>
        <button @click = "nextLetter">next letter</button>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                letter: 'a'
            };
        },
        methods:{
            nextLetter(){
                if(this.letter < 'z')
                    this.letter = String.fromCharCode(this.letter.charCodeAt(0)) + 1);
                else
                    this.letter = 'a';
            }
        }
    });
    app.mount("#app");
```
## `v-slot` directive
* talk later
## `v-cloak` directive
* It's used to hide content until compilation is finished
    * `compilation` is the process of converting high-level source code into machine-readable code that computer can execute directly
    * This is typically done by a program called a `compiler`
* Typically, `v-cloak` prevents the user from seeing flickering of pre-compiled content including curly braces (`{}`) during the loading of the page, like `{{variableName}}`, etc
    * `flickering` refers to a visual issue where elements on a webpage appear to flash or jump inconsistently
    * It typically occurs due to frequent or unnecessary updates to the DOM or CSS styles, or because of slow rendering performance
* `v-cloak` directive only works for Vue code that compiles in the browser, so **it's not useful when working with `SFC (*.vue)` files**
* syntax:
```html
    <!--change styles when the page isn't compiled yet-->
    <div id = "app">
        <p id = "hello-caesar" v-cloak>{{helloCaesar}}</p>
    </div>
```
```css
    [v-cloak]{
        color: orange;
        font-weight: bolder;
        text-decoration: line-through;
        font-size: 12px;
    }

    #hello-caesar{
        color: white;
        font-weight: thin;
        text-decoration: none;
        font-size: 30px;
    }
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                helloCaesar: "Hello Caesar James LEE"
            };
        }
    });
    app.mount("#app");
```
## `v-pre` directive
* Skips compilation for this element, and all of its child elements
* It can be used to display raw `Vue` code, like curly braces `{{}}`
* syntax
```html
    <!--show differences between v-pre and no v-pre-->
    <div id = "app">
        <p v-pre>my age: {{age}}<br>v-pre version</p>
        <p>my age: {{age}}<br>no v-pre version</p>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                age: 18
            };
        }
    });
    app.mount("#app");
```
## `v-html` directive
* It's used to insert HTML tags and text into an element
* If you try to putput HTML tags using text interpolation, the result will be just a text string
* syntax:
```html
    <div id = "app">
        <div class = "html-containers">{{htmlContent}}</div>
        <div v-html = "htmlContent" class = "html-container"></div>
    </div>
```
```javascript
    const app = Vue.createApp({
        data(){
            return{
                htmlContent: `
                    <div>
                        <ul>
                            <li>first item</li>
                            <li>second item</li>
                            <li>third item</li>
                        </ul>
                    </div>
                `
            };
        }
    });
    app.mount("#app");
```