<template>
  <Header :name = "name"/>
  <br>
  <img id = "logo" alt = "Vue logo" src = "./assets/Code Slave Wallpaper.png">
  <br>
  <HelloWorld :number = "number" @update-number = "updateNumber"/>
  <br>
  <Footer :number = "number"/>
</template>

<script>
  import HelloWorld from "./components/HelloWorld.vue";
  import Header from "./components/Header.vue";
  import Footer from "./components/Footer.vue";
  export default {
    name: "App",
    components:{
      HelloWorld,
      Header,
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