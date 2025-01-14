<template>
    <form>
        <fieldset>
            <legend>Registration</legend>
    
            <label for = "username">Username: </label>
            <input id = "username" maxlength = "30" minlength = "5" name = "username" 
                    required placeholder = "CaesarLEE">
            <br>
    
            <label for = "password">Password: </label>
            <input type = "password" id="password" maxlength="30" minlength="9"
                    name = "password" required placeholder = "password">
            <br>
    
            <label for="description">Description: </label>
            <textarea id="description" rows="3" cols="30" maxlength="70" wrap="soft" 
                        required placeholder = "please write something to describe you"></textarea>
        </fieldset>

        <fieldset>
            <legend>Personal Information</legend>
    
            <label for = "firstName">First Name: </label>
            <input id = "firstName" name="firstName" required placeholder = "Caesar">
            <br>

            <label fo r= "lastName" title = "your first name">Last Name: </label>
            <input id = "lastName" name = "lastName" required placeholder = "LEE" title = "your first name">
            <br>

            <label for = "ageId">Age: </label>
            <input type = "range" value = "64" min = "0" max = "120" id = "ageId"
                    name = "age" oninput = "ageShower.value = this.value" required>
            <output id = "ageShower">64</output>
            <br>
    
            <label for = "email">Email: </label>
            <input type = "email" name = "email" required placeholder = "caesarlee@uknow.com">
            <br>

            <label for = "telephone">Telephone: </label>
            <input type = "tel" name = "telephone" required placeholder = "+1 (123) 456-7890">
            <br>
    
            <label for = "gender">Gender: </label>
            <label for = "male">Male</label>
            <input type = "radio" id = "male" name = "gender" value = "male">
            <label for = "female">Female</label>
            <input type = "radio" id = "female" name = "gender" value = "female">
            <label for = "other">Other</label>
            <input type = "radio" id = "other" name = "gender" value = "other" checked>
            <br>

            <label for = "birthplace">Birthplace: </label>
            <select name = "birthplace" required>
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
    </form>
</template>

<script>
    export default{
        name: "App",
        components:{
        }
    };
</script>

<style>
    #app{
        background-color: black;
        color: white;
        font-size: 20px;
    }
</style>
