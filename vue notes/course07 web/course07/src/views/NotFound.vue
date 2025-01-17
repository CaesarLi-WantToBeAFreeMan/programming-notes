<template>
    <h1 class = "title">404 Error</h1>
    <h1 class = "title">Not Found Page</h1>
    <h1 id = "suggestion">please type a correct path or back <router-link :to = "{name: 'home'}">home</router-link></h1>
</template>

<script>
    export default{
        name: "NotFound"
    };
</script>

<style scoped>
    h1{
        color: red;
    }

    #suggestion{
        font-size: 50px;
        text-align: center;
    }
</style>