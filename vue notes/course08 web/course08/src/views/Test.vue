<template>
    <div id = "body">
        <h1 class = "titles">These are variables</h1>
        <p class = "texts">name: {{fullName}}</p>
        <p class = "texts">age: {{age}}</p>
        <button class = "buttons" @click = "showAlert('Hello World')">hello world</button>

        <hr>

        <h1 class = "titles">Using ref</h1>
        <p class = "texts" ref = "target">This is a paragraph</p>
        <p class = "texts">reactive number: {{refNumber}}</p>
        <div id = "button-container">
            <button class = "buttons" @click = "changeRed">change color to red</button>
            <button class = "buttons" @click = "changeContent('this change was changed by ref')">change content</button>
            <button class = "buttons" @click = "resetContent">reset content</button>
            <button class = "buttons" @click = "removeRed">reset color</button>
            <p class = "texts red-color">|</p>
            <button class = "buttons" @click = "increaseNumber">increase number</button>
            <button class = "buttons" @click = "decreaseNumber">decrease number</button>
            <button class = "buttons" @click = "resetNumber">reset number</button>
        </div>

        <hr>

        <h1 class = "titles">Using reactive</h1>
        <p class = "texts">reactive person information</p>
        <div id = "information-container">
            <p class = "texts">first name: {{person.firstName}}</p>
            <p class = "texts">last name: {{person.lastName}}</p>
            <p class = "texts">gender: {{person.gender}}</p>
            <p class = "texts">age: {{person.age}}</p>
        </div>
        <form id = "person-form">
            <div class = "label-input-containers">
                <label for = "first-name" class = "texts">first name:</label>
                <input id = "first-name" v-model = "person.firstName" placeholder = "Caesar" maxlength = "12">
            </div>

            <div class = "label-input-containers">
                <label for = "last-name" class = "texts">last name:</label>
                <input id = "last-name" v-model = "person.lastName" placeholder = "LEE" maxlength = "12">
            </div>

            <div class = "label-input-containers">
                <label for = "gender" class = "texts">gender: </label>
                <input id = "gender" v-model = "person.gender" placeholder = "non-binary" maxlength = "12">
            </div>

            <div class = "label-input-containers">
                <label for = "age" class = "texts">age:</label>
                <input type = "number" id = "age" v-model = "person.age" placeholder = 18 min = "0" max = "120">
            </div>
        </form>

        <hr>

        <h1 class = "titles">Using computed</h1>
        <div class = "label-input-containers width-20">
            <label for = "search-bar" class = "texts">search bar:</label>
            <input id = "search-bar" type = "search" v-model = "searchingString" placeholder = "type to search">
        </div>
        <h1 class = "titles">all employee names</h1>
        <p v-if = "matchingString.length === 0" class = "texts red-color">Sorry, no result</p>
        <p v-else class = "texts" v-for = "employee in matchingString" :key = "employee">{{employee.firstName + " " + employee.lastName}}</p>
        
        <hr>

        <h1 class = "titles">Using watch</h1>
        <div class = "label-input-containers width-20">
            <label for = "username" class = "texts">username:</label>
            <input id = "username" v-model = "username" placeholder = "please type your username">
        </div>
        <p class = "texts">{{watchMessage}}</p>
        <button class = "buttons" @click = "stopWatch">stop watch method</button>

        <hr>

        <h1 class = "titles">Using watchEffect</h1>
        <p class = "texts">{{watchEffectMessage}}</p>
        <button class = "buttons" @click = "stopWatchEffect">stop watch effect method</button>

        <hr>

        <h1 class = "titles">Using props</h1>
        <p class = "texts">pass {title: "title1", paragraph: "paragraph1"}, {title: "title2", paragraph: "paragraph2"}</p>
        <ChildComponent :articles = "articles"/>
    </div>
</template>

<script>
    import {ref, reactive, computed, watch, watchEffect, defineAsyncComponent} from "vue";
    import LoadingComponent from "../components/LoadingComponent.vue";
    import ErrorComponent from "../components/ErrorComponent.vue";
    import getData from "../functions/getData.js";
    export default{
        name: "Test",
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
        setup(){
            let firstName = "Caesar", lastName = "LEE", age = 18;
            const showAlert = message => alert(message),
                    target = ref(null),
                    changeRed = () => target.value.classList.add("red-color"),
                    changeContent = content => target.value.textContent = content,
                    resetContent = () => target.value.textContent = "This is a paragraph",
                    removeRed = () => target.value.classList.remove("red-color"),
                    refNumber = ref(0),
                    increaseNumber = () => refNumber.value++,
                    decreaseNumber = () => refNumber.value--,
                    resetNumber = () => refNumber.value = 0,
                    person = reactive({firstName: "", lastName: "", gender: "", age: null}),
                    searchingString = ref(""),
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
                    }),
                    username = ref(""),
                    watchMessage = ref("please type your username"),
                    watchUsername = watch(username, (newValue, oldValue) => watchMessage.value = `from ${oldValue} to ${newValue}`),
                    watchEffectMessage = ref("something had changed"),
                    changedNumber = ref(-1),
                    watchEffectChange = watchEffect(() => {
                       refNumber.value;
                       person.firstName;
                       person.lastName;
                       person.gender;
                       person.age;
                       searchingString.value;
                       username.value;
                       watchEffectMessage.value = `${++changedNumber.value} changed`;
                    }),
                    stopWatch = () => watchUsername(),
                    stopWatchEffect = () => watchEffectChange(),
                    {articles, error, load} = getData();
            load();
            return{
                fullName: firstName + " " + lastName,
                age,
                showAlert,
                target,
                changeRed,
                changeContent,
                resetContent,
                removeRed,
                refNumber,
                increaseNumber,
                decreaseNumber,
                resetNumber,
                person,
                searchingString,
                employees,
                matchingString,
                username,
                watchMessage,
                watchEffectMessage,
                changedNumber,
                stopWatch,
                stopWatchEffect,
                articles,
                error
            };
        }
    };
</script>

<style scoped>
    #body{
        background-color: black;
        color: white;
        padding: 10px 20px;
        border: 1px solid red;
        border-radius: 50px;
        text-align: center;
        margin: 10px 20px;
        padding: 5px 10px;
    }
    
    #information-container{
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        grid-template-rows: repeat(2, auto);
        gap: 10px 20px;
        justify-content: space-around;
        align-content: space-between;
        justify-items: center;
        align-items: center;
        margin: 10px auto;
        padding: 5px 10px;
    }

    #button-container{
        display: flex;
        flex-direction: row;
        justify-content: space-around;
        align-content: center;
        justify-items: center;
        align-items: center;
        margin: 10px auto;
        padding: 5px 10px;
        border: 1px solid orange;
        border-radius: 50px;
    }

    #button-container p{
        margin: 5px 10px;
    }

    #person-form{
        display: flex;
        flex-direction: row;
        gap: 10px 20px;
        justify-content: space-around;
        align-content: center;
        justify-items: center;
        align-content: center;
    }
</style>