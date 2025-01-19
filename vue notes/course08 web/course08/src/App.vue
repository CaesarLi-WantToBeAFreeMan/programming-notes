<template>
    <nav>
        <router-link :to = "{name: 'home'}">Home</router-link> |
        <router-link :to = "{name: 'test'}">Test</router-link>
    </nav>
    <router-view/>
</template>

<style scoped>
    #app{
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: white2c3e50;
    }
    
    nav{
        padding: 30px;
        font-size: 30px;
    }

    nav a{
        font-weight: bold;
        color: white;
        padding: 5px 10px;
        text-decoration: none;
    }

    nav a.router-link-exact-active{
        color: cyan;
        background-color: orange;
        border-radius: 50px;
    }
</style>
