<template>
    <form>
        <fieldset class = "form-containers">
            <legend>Registration</legend>
    
            <label for = "username">Username: </label>
            <input id = "username" maxlength = "30" minlength = "5" name = "username" 
                    required placeholder = "CaesarLEE" v-model = "username">
            <br>
    
            <label for = "password">Password: </label>
            <input type = "password" id = "password" maxlength = "30" minlength = "9"
                    name = "password" required placeholder = "password" v-model = "password">
            <br>
    
            <label for = "description">Description: </label>
            <textarea id = "description" rows = "3" cols = "30" maxlength = "70" wrap = "soft" 
                        required placeholder = "please write something to describe you"
                        v-model = "description"></textarea>
        </fieldset>

        <fieldset class = "form-containers">
            <legend>Personal Information</legend>
    
            <label for = "firstName">First Name: </label>
            <input id = "firstName" name = "firstName" required placeholder = "Caesar"
                    v-model = "firstName">
            <br>

            <label for = "lastName" title = "your first name">Last Name: </label>
            <input id = "lastName" name = "lastName" required placeholder = "LEE"
                    v-model = "lastName">
            <br>

            <label for = "ageId">Age: </label>
            <input type = "range" value = "64" min = "0" max = "120" id = "ageId"
                    name = "age" oninput = "ageShower.value = this.value" required v-model = "age">
            <output id = "ageShower">64</output>
            <br>
    
            <label for = "email">Email: </label>
            <input type = "email" name = "email" required placeholder = "caesarlee@uknow.com"
                    v-model = "email">
            <br>

            <label for = "telephone">Telephone: </label>
            <input type = "tel" name = "telephone" required placeholder = "+1 (123) 456-7890"
                    v-model = "telephone">
            <br>
    
            <div id = "gender-container">
                <div id = "gender-container">
                    <label for = "gender">Gender: </label>
                </div>
                <div id = "gender-option-container">
                    <div class = "gender-option">
                        <label for = "male">Male</label>
                        <input type = "radio" id = "male" name = "gender" value = "male"
                                v-model = "gender">
                    </div>
                    <div class = "gender-option">
                        <label for = "female">Female</label>
                        <input type = "radio" id = "female" name = "gender" value = "female"
                                v-model = "gender">
                    </div>
                    <div class = "gender-option">
                        <label for = "other">Other</label>
                        <input type = "radio" id = "other" name = "gender" value = "other"
                                checked v-model = "gender">
                    </div>
                </div>
            </div>
            <br>

            <label for = "birthplace">Birthplace: </label>
            <select name = "birthplace" required v-model = "birthplace">
                <optgroup label = "inhabited">
                    <option value = "asia">Asia</option>
                    <option value = "europe">Europe</option>
                    <option value = "africa">Africa</option>
                    <option value = "northAmerica">North America</option>
                    <option value = "southAmerica">South America</option>
                    <option value = "australia">Australia</option>
                </optgroup>
                <optgroup label = "uninhabited">
                    <option value = "antarctica" selected>Antarctica</option>
                </optgroup>
            </select>
            <br>
        </fieldset>

        <input type = "submit" name = "submit" value = "submit" id = "submit"
                @click.prevent = "submit">
        
        <p v-if = "showMessage">
            Hello {{username}}
            <br>
            you can enter our web
        </p>
    </form>
</template>

<script>
    export default{
        name: "App",
        data(){
            return{
                username: "",
                password: "",
                description: "",
                firstName: "",
                lastName: "",
                age: null,
                email: "",
                telephone: null,
                gender: "",
                birthplace: "antarctica",
                showMessage: false
            };
        },
        methods:{
            checkEmpty(value){
                return value == "" || value == null;
            },
            checkTelephoneNumber(value){
                if(value.trim() === "")
                    return false;
                if(!/^(?:\+1\s?)?(\(?\d{3}\)?)[-.\s]?\d{3}[-.\s]?\d{4}$/.test(value))
                    return false;
                return true;
            },
            checkEmail(value){
                return /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/.test(value);
            },
            submit(){
                if(this.checkEmpty(this.username)){
                    alert("please enter your username");
                    return;
                }
                if(this.checkEmpty(this.password)){
                    alert("please enter your password");
                    return;
                }
                if(this.checkEmpty(this.description)){
                    alert("please enter your description");
                    return;
                }
                if(this.checkEmpty(this.firstName)){
                    alert("please enter your first name");
                    return;
                }
                if(this.checkEmpty(this.lastName)){
                    alert("please enter your last name");
                    return;
                }
                if(this.checkEmpty(this.age)){
                    alert("please enter your age");
                    return;
                }
                if(this.checkEmpty(this.email)){
                    alert("please enter your email");
                    return;
                }
                if(!this.checkEmail(this.email)){
                    alert("please enter a correct email");
                    return;
                }
                if(this.checkEmpty(this.telephone)){
                    alert("please enter your telephone");
                    return;
                }
                if(!this.checkTelephoneNumber(this.telephone)){
                    alert("please enter a number");
                    return;
                }
                if(this.checkEmpty(this.gender)){
                    alert("please enter your gender");
                    return;
                }
                if(this.checkEmpty(this.birthplace)){
                    alert("please enter your birthplace");
                    return;
                }
                if(this.birthplace == "antarctica"){
                    alert("I am very sure you could not be born there");
                    return;
                }
                this.showMessage = true;
            }
        }
    };
</script>

<style>
    form{
        display: grid;
        grid-template-columns: 1fr;
        justify-content: center;
        align-content: center;
        justify-items: center;
        align-items: center;
    }

    .form-containers{
        background-color: navy;
        border: 1px dashed orange;
        border-radius: 50px;
        margin: 10px auto 30px auto;
        padding: 30px 50px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-content: center;
        width: 80%;
        text-align: center;
        color: cyan;
        font-size: 30px;
    }

    input,
    textarea,
    select{
        border: 1px solid cyan;
        border-radius: 30px;
        padding: 10px;
    }

    input,
    textarea,
    select,
    option{
        background-color: black;
        color: cyan;
        font-family: Arial, Helvetica, sans-serif;
        font-size: 18px;
        font-weight: 100;
    }

    optgroup{
        color: orange;
        font-family: "Times New Roman", Times, serif;
        font-size: 30px;
        font-weight: 900;
    }

    input::placeholder,
    textarea::placeholder{
        color: white;
    }
    
    #gender-container{
        display: grid;
        grid-template-columns: 1fr 5fr;
        column-gap: 10px;
        justify-content: center;
        align-content: center;
        justify-items: flex-start;
        align-items: center;
    }
    
    #gender-option-container{
        display: grid;
        grid-template-columns: repeat(3, auto);
        column-gap: 20px;
        justify-content: space-around;
        align-content: center;
        justify-items: left;
        align-items: center;
    }

    .gender-option{
        display: grid;
        grid-template-columns: 3fr 1fr;
        column-gap: 10px;
        justify-content: space-between;
        align-content: center;
        justify-items: left;
        align-items: center;
    }

    #submit{
        margin-bottom: 50px;
    }

    #submit:hover{
        cursor: pointer;
        background-color: wheat;
        color: red;
        transition: 1s ease;
    }
</style>