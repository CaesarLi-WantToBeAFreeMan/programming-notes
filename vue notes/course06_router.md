# Title: Course06: Router
# Author: Caesar James LEE
# Date: January 15, 2025
## what's router
* It's used to navigate the Vue applicaiton, and it **happens on the client side without full page reload**, which results in a faster user experience
* It's a way to nevigate, **similar to how we have used dynamic components**
* With routing we can **use the URL address** to direct someone to a specific place
## dynamic component
* It can be used to **flip through pages within your page**, like tabs in your browser, with the use of `is` attribute
* `<component>` tag represents the active component
* `is` attribute is tied to a value with `v-bind`, and we change the value to the name of the component we want to have active
* syntax:
    * `App.vue`
        ```html
            <p>you can select below buttons to view a specific component</p>
            <button @click = "activeComponent = 'hello'">hello</button>
            <button @click = "activeComponent = 'world'">world</button>
            <component :is = "activeComponent"></component>
        ```
        ```javascript
            import Hello from "./components/Hello.vue";
            import World from "./components/World.vue";
            export default{
                name: "App",
                components:{
                    Hello,
                    World
                },
                data(){
                    return{
                        activeComponent: ""
                    };
                }
            };
        ```
    * `Hello.vue`
        ```html
            <h1>This is Hello component</h1>
            <p>
                hello
                <br>
                hello
                <br>
                hello
            </p>
        ```
    * `World.vue`
        ```html
            <h1>This is World component</h1>
            <p>
                world
                <br>
                world
                <br>
                world
            </p>
        ```
`<KeepAlive>`
* These changes you make in one component is forgotten when you switch components
* Because the dynamic components are unmounted, the browser will mount it when you switch then reload it
* `<KeepAlive>` will keep the component mounted
* All components inside the `<KeepAlive>` will be kept alive by default
* We can add `include` or `exclude` or `max` attribute to limit components
* syntax:
    * `App.vue`
    ```html
        <p>you can select below buttons to view a specific component</p>
        <button @click = "activeComponent = 'hello'">hello</button>
        <button @click = "activeComponent = 'world'">world</button>
        <KeepAlive include = "World">
            <component :is = "activeComponent"></component>
        </KeepAlive>
    ```
    ```javascript
        import Hello from "../components/Hello.vue";
        import World from "../components/World.vue";
        export default{
            name: "Home",
            components:{
                Hello,
                World
            },
            data(){
                return{
                    activeComponent: ""
                };
            }
        };
    ```
    * `Hello.vue`
        ```html
            <p>please increase/decrease the number</p>
            <button @click = "number++">increase</button>
            <br>
            <button @click = "number--">decrease</button>
            <p>number: {{number}}</p>
        ```
        ```javascript
            export default({
                name: "Hello",
                data(){
                    return{
                        number: 0
                    };
                }
            });
        ```
    * `World.vue`
        ```html
            <p>your name: {{name}}</p>
            <label for = "name">enter your name</label>
            <input v-model = "name" id = "name" placeholder = "caesar">
        ```
        ```javascript
            export default{
                name: "World",
                data(){
                    return{
                        name: ""
                    };
                }
            };
        ```
## differences between dynamic components and routers
1. perpose
   * `dynamic component` conditionally renders components in the same view
   * `router` manages navigation bwteen different views/pages
2. url management
    * `dynamic component` connot change the url
    * `router` changes the url using history management
3. navigation
    * `dynamic component` doesn't affect browser history
    * `router` affects browser history
## create a navigator
1. go to `router/index.js`, and change it
    * syntax
        ```javascript
            import Home from "../views/Home.vue";
            const routes = [
                {
                    path: "/home",
                    name: "home",
                    component: Home
                },
                {
                    path: "/link1",
                    name: "link1",
                    component: () => import("../views/Link1.vue")//import Link1 only when a user sends a request to visit the route
                }
                //...
            ];
            const router = createRouter({
                history: createWebHistory(process.env.BASE_URL),//call the browser's history API to managenavigation without reloading the page
                routes
            });
            export default router;
        ```
2. go to `App.vue`, and change it
    * `<router-link>` links `<a>` tag
    * `to` likes `href` attribute, specifies the path to which the link should navigate
    * `<router-view/>` is a placeholder where the matched component of the current route will be rendered
    * syntax
        ```html
            <router-link to = "/home">home</router-link>
            <router-link to = "/link1">link1</router-link>
            <router-view/>
        ```
3. 