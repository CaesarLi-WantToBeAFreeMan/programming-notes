<template>
    <nav>
        <router-link :to = "{name: 'home'}">Home</router-link>
        <router-link :to = "{name: 'create'}">Create</router-link>
        <router-link :to = "{name: 'read'}">Read</router-link>
        <router-link :to = "{name: 'update'}">Update</router-link>
        <router-link :to = "{name: 'delete'}">Delete</router-link>
    </nav>
    <router-view/>
</template>

<style>
    #app{
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
    }

    nav{
        margin: 0 auto;
        background-color: orange;
        padding: 5px 10px;
        display: grid;
        grid-template-rows: 1fr;
        grid-template-columns: repeat(5, 1fr);
        column-gap: 10px;
        border-radius: 30px;
    }

    nav a{
        font-weight: bold;
        font-size: 30px;
        color: white;
        padding: 5px 10px;
        text-decoration: none;
        text-align: center;
        opacity: 0.7;
    }

    nav a:hover{
        color: cyan;
        background-color: wheat;
        border-radius: 50px;
        opacity: 1.0;
        transition: 0.5 ease;
    }

    nav a.router-link-exact-active{
        color: cyan;
        background-color: pink;
        border-radius: 30px;
        opacity: 1.0;
    }
</style>