<template>
    <h1>Welcome to visit figure website</h1>
    <p>please select a button to watch his/her/their profile</p>
    <nav>
        <router-link
            v-for = "(figure, index) in figures"
            :key = "index"
            :to = "{name: 'figureProfile', params: {id: index}}">
            <h2>{{figure.name}}</h2>
        </router-link>
    </nav>
</template>

<script>
    export default {
        name: "Figure",
        data(){
            return{
                figures: [
                    {name: "Caesar", skill: "programming", age: 18, position: "junior developer"},
                    {name: "Lily", skill: "singing", age: 20, position: "singer"},
                    {name: "James", skill: "dancing", age: 15, position: "dancer"}
                ]
            };
        }
    };
</script>

<style scoped>
    body{
        background-color: black;
        color: white;
    }
    
    h1,
    p{
        font-weight: 900;
        color: cyan;
        text-decoration: 1px dashed cyan underline;
    }

    h1{
        font-size: 50px;
    }
    
    p{
        font-size: 30px;
    }
    
    nav{
        width: 80%;
        margin: 10px auto;
        padding: 5px 10px;
        background-color: forestgreen;
        border: 1px solid white;
        border-radius: 10px;
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        column-gap: 10px;
        justify-content: center;
        align-content: center;
        justify-items: left;
        align-items: start;
    }

    a{
        display: inline-block;
        color: cyan;
        font-size: 20px;
        background-color: orange;
        border-radius: 30px;
        text-decoration: none;
        width: 6em;
        padding: 5px 10px;
    }
</style>