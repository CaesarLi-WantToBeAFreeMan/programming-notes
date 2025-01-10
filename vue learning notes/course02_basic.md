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
            const app = Vue.createApp({
                template: "<p>I'm a child element for root component</p>"
            });
        ```
2. `return` method
    * You need embed variables within HTML elements and around `{{}}`
    * You can change the varible value via `vue`
    * In fact, the `innerHTML` of the element is a variable, and you can modify the variable value via `vue`, so that the text of the element changed
    * But remember, the variable what you created is a local variable within the `app`.
    * example:
        ```html
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
                    }
                }
            })
        ```
## `mount(container)` method
* An application instance won't render anything until its `mount()` method is called
* the `container` argument can either be an actual DOM element or a selector string
* You can think of the `createApp()` as an `initial function`, you must invoke it within the `main function`
* Then, all changes of DOM will be controlled by `vue`
* example:
```javascript
    const app = Vue.createApp({
        //some codes
    });
    app.mount("#app");
```