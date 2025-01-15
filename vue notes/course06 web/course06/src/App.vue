<template>
    <nav>
        <router-link to = "/home">Home</router-link> |
        <router-link to = "/about">About</router-link>
    </nav>
    <router-view/>
</template>

<script></script>

<style>
    #app{
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        background-color: black;
        color: white;
    }
    
    nav{
        padding: 30px;
    }
    
    nav a{
        font-weight: bold;
        color: #2c3e50;
    }
    
    nav a.router-link-exact-active{
        color: #42b983;
    }
</style>