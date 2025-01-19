# Title: Course08: Composition API
# Author: Caesar James LEE
# Date: January 18, 2025
## Composition API
* It's introduced in vue3
* It's an alternative way of **writing Vue applications of the `Options API`**
* Groups logic together in a `setup` function instead of separating them into `data`, `methods`, etc
* Easily create reusable logic
* It's an ideal way in **large or more reusable logic project**
* `setup` function will run before any of the life cycle hooks
* syntax
    ```javascript
        export default{
            name: "name",
            setup(){
                //statements
            }
        }
    ```
## use variables
* We need to **return an object that holds some variables** what we declared within the `setup` method
* These variables **aren't reactive**, but variables declared in `data(){return{}}` are reactive
* syntax
    ```javascript
        export default{
            setup(){
                let firstName = "Caesar", lastName = "LEE", age = 18;
                return{
                    fullName: firstName + " " + lastName,
                    age
                };
            }
        };
    ```
## use functions
* We need to **return an object that holds some functions** like `use variables`
* syntax
    ```javascript
        export default{
            setup(){
                const showAlert = message => alert(message);
                return{
                    showAlert
                };
            }
        }
    ```
## refs
* We talked about this one in `course03`
* But we cannot use it like in `options API`
* It's typically used for **primitive data types** (`numbers`, `strings` and `booleans`) and elements
* Steps
    1. Ands `import {ref} from "vue"` before `export` statement to use `ref`
    2. Adds `ref = "name"` at the end of an HTML tag
    3. We should create a variable to hold the tag
    4. `refVariable.value` is a way to access or update the reactive value, and vue will automatically updates the DOM and other any reactive parts when you update the `refVariable.value`
    5. You can add a class via `refVariable.value.classList.add("className")`
    6. You can change the content via `refVariable.value.textContent = "content"`
    7. You can use `refVariable = ref(value)` to create a reactive variable
* syntax
    ```html
        <p ref = "target">This is a paragraph</p>
        <p>reactive number: {{refNumber}}</p>
        <button @click = "changeRed">change color to red</button>
        <button @click = "changeContent('this change was changed by ref')">change content</button>
        <button @click = "resetContent">reset content</button>
        <button @click = "removeRed">reset color</button>

        <button @click = "increaseNumber">increase number</button>
        <button @click = "decreaseNumber">decrease number</button>
        <button @click = "resetNumber">reset number</button>
    ```
    ```javascript
        import {ref} from "vue";
        export default{
            setup(){
                const target = ref(null),
                        changeRed = () => target.value.classList.add("red-color"),
                        changeContent = content => target.value.textContent = content,
                        resetContent = () => target.value.textContent = "This is a paragraph",
                        removeRed = () => target.value.classList.remove("red-color"),
                        refNumber = ref(0),
                        increaseNumber = () => refNumber.value++,
                        decreaseNumber = () => refNumber.value--,
                        resetNumber = () => refNumber.value = 0;
                return{
                    target,
                    changeRed,
                    changeContent,
                    resetContent,
                    removeRed,
                    refNumber,
                    increaseNumber,
                    decreaseNumber,
                    resetNumber
                };
            }
        };
    ```
## reactive
* It's another way to create reactive data
* It's used for creating **complex data types** (e.g. `objects`, `arrays`)
* **You cannot create a reactive primitive data by `reactive`**
* You **don't need access value by typing `.value` property**
* syntax
    ```html
        <p>first name: {{person.firstName}}</p>
        <p>last name: {{person.lastName}}</p>
        <p>gender: {{person.gender}}</p>
        <p>age: {{person.age}}</p>
        <label for = "first-name">first name:</label>
        <input id = "first-name" v-model = "person.firstName" placeholder = "Caesar" maxlength = "12">
        <label for = "last-name">last name:</label>
        <input id = "last-name" v-model = "person.lastName" placeholder = "LEE" maxlength = "12">
        <label for = "gender">gender: </label>
        <input id = "gender" v-model = "person.gender" placeholder = "male" maxlength = "12">
        <label for = "age">age:</label>
        <input type = "number" id = "age" v-model = "person.age" placeholder = 18 min = "0" max = "120">
    ```
    ```javascript
        import {reactive} from "vue";
        export default{
            setup(){
                const person = reactive({firstName: "", lastName: "", gender: "", age: null});
                return{
                    person
                };
            }
        };
    ```
## computed
* We can use `computed` property as well, but we need to import it
* syntax
    ```html
        <label for = "search-bar">search bar:</label>
        <input id = "search-bar" type = "search" v-model = "searchingString" placeholder = "type to search">
        <h1>all employee names</h1>
        <p v-if = "matchingString.length === 0">Sorry, no result</p>
        <p v-else v-for = "employee in matchingString" :key = "employee">{{employee.firstName + " " + employee.lastName}}</p>
    ```
    ```javascript
        import {ref, reactive, computed} from "vue";
        export default{
            setup(){
                const searchingString = ref(""),
                        employees = reactive([
                            {firstName: "Caesar", lastName: "LEE"},
                            {firstName: "John", lastName: "JACKSON"},
                            {firstName: "Eva", lastName: "EDISON"},
                            {firstName: "Lisa", lastName: "SMITH"},
                        ]),
                        matchingString = computed(() => {
                            return employees.filter(employee =>
                                employee.firstName.toLowerCase().includes(searchingString.value.toLowerCase()) ||
                                employee.lastName.toLowerCase().includes(searchingString.value.toLowerCase())
                            )
                        });
                return{
                    searchingString,
                    employees,
                    matchingString,
                };
            }
        };
    ```
## `watch`
* It likes in `Options API`
* You need import it from vue
* syntax
    ```html
        <label for = "username">username:</label>
        <input id = "username" v-model = "username" placeholder = "please type your username">
        <p>{{message}}</p>
    ```
    ```javascript
        import {ref, watch} from "vue";
        export default{
            setup(){
                const username = ref(""),
                        message = ref("please type your username");
                watch(username, (newValue, oldValue) => message.value = `from ${oldValue} to ${newValue}`);
                return{
                    username,
                    message
                };
            }
        };
    ```
## watchEffect
* You need import it from vue
* It's introduced in vue3
* It's executed once during the initial `setup` method
* Automatically tracks **all reactive dependencies** instead of a specific one like `watch`
* You cannot access the old value
* syntax
    ```html
        <p>{{watchEffectMessage}}</p>
    ```
    ```javascript
        import {ref, watchEffect} from "vue";
        export default{
            setup(){
                const watchEffectMessage = ref(""),
                        changedNumber = ref(-1);
                watchEffect(() => {
                    //some ref or reactive variables
                    watchEffectMessage.value = `${++changedNumber.value} changed`;
                });
                return{
                    watchEffectMessage,
                    changedNumber
                };
            }
        };
    ```
## stop watch or watchEffect
* We need declare a variable to hold the watch or watchEffect method, and call it
* syntax
    ```html
        <label for = "username">username:</label>
        <input id = "username" v-model = "username" placeholder = "please type your username">
        <p>{{watchMessage}}</p>
        <button @click = "stopWatch">stop watch method</button>
        <p>{{watchEffectMessage}}</p>
        <button @click = "stopWatchEffect">stop watch effect method</button>
    ```
    ```javascript
        import {ref, watch, watchEffect} from "vue";
        export default{
            setup(){
                const username = ref(""),
                        watchMessage = ref(""),
                        watchUsername = watch(username, (newValue, oldValue) => watchMessage.value = `from ${oldValue} to ${newValue}`),
                        watchEffectMessage = ref(""),
                        changedNumber = ref(-1),
                        watchEffectChange = watchEffect(() => {
                            username.value;
                            watchEffectMessage.value = `${++changedNumber.value} changed`;
                        }),
                        stopWatch = () => watchUsername(),
                        stopWatchEffect = () => watchEffectChange();
                return{
                    username,
                    watchMessage,
                    watchEffectMessage,
                    changedNumber,
                    stopWatch,
                    stopWatchEffect
                };
            }
        };
    ```
## props
* Likes in `opations API`, but need to `return`
* syntax
    * parent component
        ```html
            <ChildComponent :articles = "articles"/>
        ```
        ```javascript
            import {ref} from "vue";
            import ChildComponent from "../components/ChildComponent.vue";
            export default{
                components:{
                    ChildComponent
                },
                setup(){
                    const articles = ref([
                                {"title": "title1", "paragraph": "paragraph1"},
                                {"title": "title2", "paragraph": "paragraph2"}
                            ]);
                    return{
                        aricles
                    };
                }
            };
        ```
    * child component
        ```html
            <div v-for = "article in modifiedArticles" :key = "article.title">
                <h1>{{article.title}}</h1>
                <p>{{article.paragraph}}</p>
            </div>
        ```
        ```javascript
            import {computed} from "vue";
            export default{
                props: {articles: Array},
                setup(props){
                    const modifiedArticles = computed(() => {
                        return props.articles.map(article => ({
                            title: article.title + "TITLE",
                            paragraph: article.paragraph + "PARAGRAPH"
                        }));
                    });
                    return {modifiedArticles};
                }
            };
        ```
## lifecycle hooks
* We need to add a prefix `on`, and import it from `vue`
* syntax
    ```javascript
        import {onBeforeMount, onMounted, onBeforeUpdate, onUpdated, onBeforeUnmounted, onUnmounted, onActivated, onDeactivated} from "vue";
        export default{
            setup(){
                onBeforeMount(() => console.log("This is before mount moment"));
            }
        }
    ```
## async component
* It's a way to define components that are loaded lazily (asynchronously), in other words, only when they're needed
* By default, `about` view is a lazy-loading example
* syntax
    ```javascript
        components:{
            ComponentName: () => import("path")
        }
    ```
* You can pass an options object to `defineAsyncComponent` to handle loading, error states, and timeout for the async component
* syntax
    ```javascript
        import {defineAsyncComponent} from "vue";
        import LoadingComponent from "path";
        import ErrorComponent from "path";
        const AsyncComponent = defineAsyncComponent({
            loader: () => import("path"),//loading a component from the path
            loadingComponent: LoadingComponent,//a pre-loaded component to display while loading
            errorComponent: ErrorComponent,//a pre-loaded component to display if loading fails
            delay: number,//delay before showing the loading component (unit: millisecond)
            timeout: 3000,//time before showing an error component (unit: millisecond)
            suspensible: true//wait for async component to load rendering the template
        });
        export default{
            components: {AsyncComponent}
        };
    ```
* We can set a `timeout` to delay the import of the loader component
* syntax
    ```javascript
        components:{
            ChildComponent: defineAsyncComponent({
                loader: () => new Promise(resolve => {
                    setTimeout(() => {
                        resolve(import("../components/ChildComponent.vue"));
                    }, 10000);
                }),
                loadingComponent: LoadingComponent,
                errorComponent: ErrorComponent,
                delay: 300,
                timeout: 7000
            })
        },
    ```
## fetch data
* syntax
    ```javascript
        const articles = ref([]),//to hold data
                error = ref(null),//to hold error
                load = async () => {//to hold async method
                    try{
                        let response = await fetch("http://localhost:3000/articles");//hold connect object
                        if(!response.ok)//if cannot content to db.json
                            throw Error("cannot get data");//throw an error
                        articles.value = await response.json();//assign value of article to data
                    }catch(e){//catch error
                        error.value = e.message;
                        alert(error.value);
                    }
                };
        load();
    ```
## reusable files
* create a file to hold a function, and export it
* syntax
    * `getData.js`
        ```javascript
            import {ref} from "vue";
            const getData = () => {
                const articles = ref([]),
                        error = ref(null),
                        load = async () => {
                            try{
                                let response = await fetch("http://localhost:3000/articles");
                                if(!response.ok)
                                    throw Error("cannot get data");
                                articles.value = await response.json();
                            }catch(e){
                                error.value = e.message;
                                alert(error.value);
                            }
                        };
                return {articles, error, load};
            };
            export default getData;
        ```
    * a component
        ```javascript
            import getData from "../functions/getData.js";
            export default{
                setup(){
                    const {articles, error, load} = getData();
                    load();
                    return{
                        articles,
                        error
                    };
                }
            };
        ```