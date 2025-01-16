<template>
    <nav>
        <router-link to = "/home">Home</router-link> |
        <router-link :to = "{name: 'about'}">About</router-link> |
        <router-link :to = "{name: 'figure'}">Figure</router-link>
    </nav>
    <div id = "button-container">
        <button @click = "this.$router.go(-1)">back</button>
        <button @click = "this.$router.push({name: 'home'})">go home</button>
        <button @click = "this.$router.go(1)">forward</button>
    </div>
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
        font-size: 21px;
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
        border-radius: 30px;
    }

    #button-container{
        display: grid;
        grid-template-columns: repeat(3, 150px);
        grid-template-rows: 1fr;
        column-gap: 10px;
        justify-content: baseline;
        align-content: center;
        justify-items: left;
        align-items: center;
        padding: 5px 10px;
    }

    button{
        background: navy;
        color: cyan;
        opacity: 0.7;
        font-size: 20px;
        padding: 5px 10px;
        border-radius: 50px;
        width: 7em;
    }

    button:hover{
        cursor: pointer;
        opacity: 1.0;
        transition: opacity 0.5s ease;
    }
</style>