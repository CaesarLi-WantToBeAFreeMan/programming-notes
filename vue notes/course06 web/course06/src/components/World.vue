<template>
    <h1>This is World component</h1>
    <p>
        world
        <br>
        world
        <br>
        world
    </p>
    <p>your name: {{name}}</p>
    <label for = "name">enter your name</label>
    <input v-model = "name" id = "name" placeholder = "caesar">
</template>

<script>
    export default{
        name: "World",
        data(){
            return{
                name: ""
            };
        }
    };
</script>

<style scoped>
    body{
        background-color: black;
        color: cyan;
        text-align: center;
    }

    h1{
        font-size: 50px;
        border: 1px solid orange;
        border-radius: 50px;
    }
    p{
        font-size: 30px;
    }
</style>