<template>
    <h1>This is Hello component</h1>
    <p>
        hello
        <br>
        hello
        <br>
        hello
    </p>
    <p>please increase/decrease the number</p>
    <button @click = "number++">increase</button>
    <br>
    <button @click = "number--">decrease</button>
    <p>number: {{number}}</p>
</template>

<script>
    export default({
        name: "Hello",
        data(){
            return{
                number: 0
            };
        }
    });
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