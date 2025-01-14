<template>
    <div id = "footer-container">
        <h1>This is a footer</h1>
        <img src = "../assets/logo.png" id = "image">
    </div>
    <h1>number: {{number}}</h1>
</template>

<script>
    export default{
        name: "Header",
        props: ["number"]
    };
</script>

<style scoped>
    #footer-container{
        padding: 10px 30px;
        background-color: pink;
        color: cyan;
        display: flex;
        justify-content: space-between;
        align-content: center;
        justify-items: center;
        align-items: center;
    }

    h1{
        font-family: "Courier New", Courier, monospace;
        font-size: 50px;
        color: cyan;
        font-weight: bolder;
        text-decoration: 3px dotted cyan underline;
    }

    #image{
        height: 100%;
        border: 1px solid orange;
        border-radius: 50px;
    }
</style>