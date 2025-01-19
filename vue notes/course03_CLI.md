# Title: Course03: CLI
# Author: Caesar James LEE
# Date: January 13, 2025
## what's `CLI`
* `Vue CLI` (Command Line Interface) is a powerfull tool that helps developers set up and manage Vue.js projects with ease.
* It provides a set of tools and features for quickly building Vue.js applications, including project scaffolding, which refers to the process of automatically generating the basic structure and essential files needed for a software project, plugin management, and various development tool
## how to install CLI
1. install `node.js`
    * go to `node.js` [official web](https://nodejs.org) to download it and install it
2. use your terminal, and type `node -v` to check your node version to verify that your node.js is installed
3. type `npm install -g @vue/cli` to install vue cli globally
## how to use CLI
1. `cd directory` to go to a directory where you want to build a project
2. `vue create projectName` to create a vue project named `projectName`
3. opations meaning:
    1. `Babel`
        * It's a javascript compiler that comverts modern javascript (ES6 or beyond) into backward-compatible versions
    2. `TypeScript`
        * TypeScript is a superset of JavaScript that adds static typing to the language
        * It's better for error checking, autocompletion, and more robust development
    3. `Progressive Web App (PWA) Support`
        * It's a type of web application that can be installed on a user's device and works offline or with low network connectivity
        * It enables features to make your app behave like a native mobile app, including offline support, caching and installation on mobile devices
    4. `Router`
        * It's the official routing library for managing multiple pages or views in your app, allowing you to navigate between different components and URLs
    5. `Vuex`
        * It's the state management library for managing the global state of your applicaiton in a centralized store, and makes it easier to manage data that needs to be shared scross multiple components
    6. `CSS Pre-processors`
        * They're tools that extend CSS with additional features like varibales, nesting, and mixins (you can think of a template that can reusable)
    7. `Linter/Formatter`
        * It's a tool that analyze your code to identify potential errors or code style violations
        * In other words, it's a formatter
    8. `Unit Testing`
        * Involves testing individual components or functions of your application to ensure they work as expected in isolation
    9. `E2E Testing`
        * `E2E` means `end-to-end`
        * Involves testing the entire application workflow, simulating real user behavior to ensure that everything works as expected from the user's perspective
        * In other words, it tests user interactions
## structures of a CLI project
1. `node_modules`
    * All project dependencies
2.  `public`
    * Public assets (static files, images, etc)
    1. `favicon.ico`
        * Favicon of the application
    2. `index.html`
        * Main HTML file
3.  `src`
    * Source files of your application
    1. `assets`
        * static resources, like images, fonts, etc
    2. `components`
        * Reusable Vue components
    3. `App.vue`
        * Root component of your application
    4. `main.js`
        * Initializes the Vue app
4.  `.browserslistrc`
    * The scope of configuration for target browsers
5.  `.gitignore`
    * Git ignore file
    * Files to be excluded from version control
6.  `babel.config.js`
    * Babel configuration file
    * Transpiles ES6 code
7.  `jsconfig.json`
    * Configurations of the specified compiler
8.  `package-lock.json`
    * Logs recourse and version of installed npm
9.  `package.json`
    * Configurations of npm
10. `README.md`
    * Project documentation file
11. `vue.config.js`
    * Vue CLI configuration file
## `import` statement
* syntax:
    ```javascript
        import {something} from `fileName`;
    ```
* import something from a file named fileName
* `something` can be a function, a variable, an object, etc
## `export` statement
* syntax:
    1. named exports
        * Exports multiple values (such as functions or variables)
        ```javascript
            export {variable1, variable2, variable3};
            export const variableName = value;
            export functionName(parameters) => {
                //statements
            };
        ```
    2. default exports
        * A module can have **only one** default export
        * It's used to export a single entity, sunch as a function, an object or a class, a container, etc
        ```javascript
            export default variable;
            export default functionName(parameters) => {
                //statements
            };
        ```
    3. export everything as a single object
        ```javascript
            export * from "moduleName";
        ```
## createApp(objectName).mount("id-name")
* `createApp(objectName)` is used to create a Vue application instance
* `mount("id-name")` is used to attach the Vue application to a specific DOM element by its if
## structures of a Vue file (`*.vue`)
* There's threee sections:
    1. `<template>`
        * means HTML section
    2. `<script>`
        * means JavaScript section
    3. `<style>`
        * means CSS section
## run a CLI project
1. Goes the directory where you built the project
2. Types `npm run serve` into your terminal
3. Copies the URL and pastes into a browser
## scoped CSS styles
* Adds `scoped` attribute to limit CSS to this component **only**
* syntax:
    ```css
        <style scoped>
            /*styles*/
        </style>
    ```
## global CSS styles
1. Adds `global.css` within `assets` folder
2. Adds `import "./assets/global.css"` in `main.js` file
## root component
* We should add a root component into `export` statement
* syntax:
```javascript
    <script>
        import ComponentName from "path";
        export default{
            name: "componentName",
            components: {/*components*/};
            data(){
                return{
                    //variables
                };
            },
            methods:{
                //methods
            },
            computed:{
                //computed properties
            },
            watch:{
                //watch properties
            }
        }
    <script>
```
## `ref` attribute
* It's used to mark elements in `<template>`, so that they can be accessed from the `$refs` objects inside `<script>`
* It likes `getElementById()` or `querySelector()` in plain JavaScript
* You need type `$refs.referenceName` to access the element
* If HTML elements created with `v-for` have the `ref` attribute, the resulting DOM elements will be added to the `refs` object as an array
  * example:
    ```html
        <div id = "app">
            <ul>
                <li v-for = "value in values" ref = "liElement"></li>
            </ul>
            <button @click = "showSecondValue">click me to show second value</button>
            <p>{{message}}</p>
        </div>
    ```
    ```javascript
        const app = createApp({
            data(){
                return{
                    values: [
                        0,
                        1,
                        2
                    ],
                    message: ""
                };
            },
            methods:{
                showSecondValue(){
                    this.message = this.$refs.liElement [1].innerHTML;
                }
            }
        });
        app.mount("#app");
    ```
## import an image
* In a single component, we need import an image as a recourse for `<img>`
* syntax:
```html
    <h1>Some animal icons</h1>
    <div id = "image-container">
    <img :src = "url [index]" id = "image-viewer" alt = "a kind of animals icon">
    <div id = "button-container">
      <button @click = "indexChanger(-1)">previous</button>
      <button @click = "indexChanger(1)">next</button>
    </div>
  </div>
```
```javascript
    import dog from "../assets/animalIcons/dog.png";
    import cat from "../assets/animalIcons/cat.png";
    import tiger from "../assets/animalIcons/tiger.png";
    import lion from "../assets/animalIcons/lion.png";
    export default{
        data(){
            return{
                index: 0,
                url: [
                    dog,
                    cat,
                    tiger,
                    lion
                ]
            };
        },
        methods:{
            indexChanger(number){
                if(this.index + number < 0)
                    this.index = 3;
                else if(this.index + number > 3)
                    this.index = 0;
                else
                    this.index += number;
            }
        }
    }
```
```css
    h1{
        font-family: "Courier New", Courier, monospace;
        font-size: 50px;
        color: cyan;
        font-weight: bolder;
        text-decoration: 3px dotted cyan underline;
    }
    button{
        padding: 5px 10px;
        border: 1px solid orange;
        border-radius: 20px;
        text-align: center;
        font-family: Arial, Helvetica, sans-serif;
        font-size: 18px;
        background-color: navy;
        color: cyan;
        margin: 10px 30px;
    }
    #image-container{
        display: grid;
        grid-template-rows: repeat(2, auto);
        row-gap: 10px;
        margin: 10px auto;
        justify-content: center;
        align-content: center;
    }
    #image-viewer{
        width: 50%;
        border: 1px solid wheat;
        border-radius: 50px;
        margin: auto;
        padding: 5px;
    }
    #button-container{
        display: flex;
        justify-content: center;
        align-content: center;
    }
```
## multiple components
1. You need to write multiple vue files
2. In `App.vue`, you need import all of components what you want to utilize
3. Registering all of them within `compoents`
4. Using them into `<template>`
* syntax:
```html
    <Header/>
    <Navigator/>
    <SideBar/>
    <Article/>
    <Footer/>
```
```javascript
    import Header from "Header.vue";
    import Navigator from "Navigator.vue";
    import SideBar from "SideBar.vue";
    import Article from "Article.vue";
    import Footer from "Footer.vue";
    export default{
        name: "App",
        components:{
            Header,
            Navigator,
            SideBar
            Article,
            Footer
        }
    }
```
## `props` property
* It's used to pass date to a component
* It has two types:
    ### 1. ***just for read***
    1. We need add a `variableName` or in data property
    2. We need add `:variable-name = "variableName"` in your component template tag
    3. We need add `props: ["variableName"]` in your child component script tag
    * syntax:
        ```html
            <!--parent component <template>-->
            <ChildName :variable-name = "variableName"/>
        ```
        ```javascript
            //parent component <script>
            export default{
                name: "ParentName",
                compoents:{
                    ChildName
                },
                data(){
                    return{
                        variable: "value"
                    };
                }
            };
        ```
        ```javascript
            //child component <script>
            export default{
                name: "ChildName",
                props: ["variableName"]
            };
        ```
    ### 2. ***for read and write***
    1. Adds a `variableName` in your data property
    2. Adds an `updateVariable(variable){
        this.variable = variable;
    }` in your method property
    3. Adds `:variable-name = "variableName" @update-variable = "updateVariable"` in your parent component `<template>`
    4. Adds `props:{
        number:{
            type: String || Number || Boolean || Array || Object || Date || Function || Symbol || null || undefined,
            required: true,
            §default: aDefaultValue,
            §validator: funcationName
        }
    }` in your child component `<script>`
       * `§` means this is optional
       * `type` specifies a type of the passed variable
       * `required` specifies whether you're required to pass the variable
       * `default` specifies a default value
       * `validator` is a check function that checks whether the passed value is valid
    5. Adds `this.$emit("update-variable", this.variableName)` to your child component `<script>` where should be changed
    * syntax:
    ```html
        <!--parent component <template-->
        <ComponentName :number= "number" @update-number = "updateNumber"/>
    ```
    ```javascript
        //parent component <script>
        export default{
            name: "ParentComponent",
            components:{
                ChildComponent
            },
            data(){
                return{
                    number: 12
                };
            },
            methods:{
                updateNumber(number){
                    this.number = number;
                }
            }
        };
    ```
    ```html
        <!--child component <template>-->
        <p>number: {{number}}</p>
        <button @click = "changeNumber(1)">increase(+)</button>
        <button @click = "changeNumber(-1)">decrease(-)</button>
    ```
    ```javascript
        //child component <script>
        export default{
            name: "ChildComponent",
            props:{
                number:{
                    type: Number,
                    required: true,
                    default: 0
                }
            },
            methods:{
                changeNumber(number){
                    this.$emit("update-number", this.number + number");
                }
            }
        };
    ```
## slots
* They're a powerful feature that allow us for more flexible and reusable components
* It's used to send content from the parent into the `<template>` of a child compoenent
* You can think of this likes a variable represents a block of multiple elements, **but you cannot add any attribute within it**
* **You can add styles on `<slot>`'s parent element**
* syntax
    ```html
        <!--parent component <template>-->
        <Printer>
            <h1>{{message1}}</h1>
            <br>
            <h1>{{message2}}</h1>
        </Printer>
    ```
    ```javascript
        //parent component <script>
        export default {
            name: "App",
            components:{
                Printer,
            },
            data(){
                return{
                    message1: "Hello World!!!",
                    message2: "And also Vue"
                };
            }
        };
    ```
    ```html
        <!--child component <template>-->
        <!--this <div> is used to beautify <slot>-->
        <div id = "printer-container">
            <slot></slot>
        </div>
    ```
    ```javascript
        //child component <script>
        export default{
            name: "Printer"
        };
    ```
    ```css
        /*child component <style>*/
        #printer-container{
            padding: 10px 30px;
            background-color: forestgreen;
            margin: 10px auto;
            font-size: 50px;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
            font-weight: bolder;
            text-decoration: 12px dashed cyan line-through;
            color: wheat;
            text-align: center;
        }
    ```
## `v-slot`
* It's used to refer to named slots
* Named slots allow for more control over where the content is placed within the child component's template
* Named slots can be used to create more flexible and reusable components
* syntax:
    ```html
        <!--parent component <template>-->
        <Printer>
            <template v-slot:hello>
                <h1>Hello World!!!</h1>
                <br>
                <h1>And Also Vue</h1>
            </template>
        </Printer>
    ```
    ```javascript
        //parent component <script>
        import Printer from "./components/Printer.vue";
        export default {
            name: "App",
            components:{
                Printer
            },
        };
    ```
    ```html
        <!--child component <script>-->
        <template>
            <div>
                <!--if there's no a slot named hello, it will show default slot-->
                <slot name = "hello">default slot</slot>
            </div>
        </template>
    ```
    ```javascript
        //child component <script>
        export default{
            name: "Printer"
        }
    ```
## `<Teleport>`
* It's used to move the content to a different place in the DOM structure
* You can use `v-bind` directive to control the destination
* syntax
    ```html
        <h1 id = "title">This is Caesar's first Vue Application</h1>
        <p id = "introduction">test component area</p>
        <hr>

        <div id = "number-container">
            <p>This is number container</p>
        </div>

        <Teleport :to = "place">
            <p>number: {{number}}</p>
            <button @click = "changeNumber(1)">increase(+)</button>
            <button @click = "changeNumber(-1)">decrease(-)</button>
        </Teleport>

        <button @click = "changePlace('#title')">move to title</button>
        <button @click = "changePlace('#introduction')">move to introduction</button>
        <button @click = "changePlace('#image-container')">move to image-container</button>
        <button @click = "changePlace('#button-container')">move to button-container</button>
        <button @click = "changePlace('#number-container')">move to number-container</button>
        <hr>
    
        <h1>Some animal icons</h1>
        <div id = "image-container">
            <img :src = "url [index]" id = "image-viewer" alt = "a kind of animals icon">
            <div id = "button-container">
                <button @click = "changeIndex(-1)">previous</button>
                <button @click = "changeIndex(1)">next</button>
            </div>
        </div>
    ```
    ```javascript
        import dog from "../assets/animalIcons/dog.png";
        import cat from "../assets/animalIcons/cat.png";
        import tiger from "../assets/animalIcons/tiger.png";
        import lion from "../assets/animalIcons/lion.png";
        export default{
            name: "HelloWorld",
            props:{
                number:{
                    type: Number,
                    required: true
                }
            },
            data(){
                return{
                    index: 0,
                    url: [dog, cat, tiger, lion],
                    place: "#number-container"
                };
            },
            methods:{
                changeNumber(number){
                    this.$emit("update-number", this.number + number);
                },
                changeIndex(number){
                    this.index = (this.index + number + 4) % 4;
                },
                changePlace(place){
                    this.place = place;
                }
            }
        };
    ```