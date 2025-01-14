<template>
    <Header :name = "name"/>
    <br>
    <img id = "logo" alt = "Vue logo" src = "./assets/Code Slave Wallpaper.png">
    <br>
    <HelloWorld :number = "number" @update-number = "updateNumber"/>
    <br>
    <Printer>
        <template v-slot:hello>
            <h1>Hello World!!!</h1>
            <br>
            <h1>And Also Vue</h1>
        </template>
    </Printer>
    <br>
    <Footer :number = "number"/>
</template>

<script>
    import Header from "./components/Header.vue";
    import HelloWorld from "./components/HelloWorld.vue";
    import Printer from "./components/Printer.vue";
    import Footer from "./components/Footer.vue";
    export default {
        name: "App",
        components:{
            Header,
            HelloWorld,
            Printer,
            Footer
        },
        data(){
            return{
                number: 12,
                name: "Caesar"
            };
        },
        methods:{
          updateNumber(number){
            this.number = number;
          }
        }
    };
</script>

<style>
    #app{
        background-color: black;
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: white;
        margin: 50px;
    }

    #logo{
        width: 70%;
        border: 1px solid orange;
        border-radius: 50px;
    }
</style>