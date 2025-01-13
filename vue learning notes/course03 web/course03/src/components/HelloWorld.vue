<template>
  <h1>This is Caesar's first Vue Application</h1>
  <p>test component area</p>
  <hr>
  <p>number: {{number}}</p>
  <button @click = "changeNumber(1)">increase(+)</button>
  <button @click = "changeNumber(-1)">decrease(-)</button>
  <hr>
  <h1>Some animal icons</h1>
  <div id = "image-container">
    <img :src = "url [index]" id = "image-viewer" alt = "a kind of animals icon">
    <div id = "button-container">
      <button @click = "indexChanger(-1)">previous</button>
      <button @click = "indexChanger(1)">next</button>
    </div>
  </div>
</template>

<script>
  import dog from "../assets/animalIcons/dog.png";
  import cat from "../assets/animalIcons/cat.png";
  import tiger from "../assets/animalIcons/tiger.png";
  import lion from "../assets/animalIcons/lion.png";
  export default{
    name: "HelloWorld",
    props:{
      number:{
        type: Number,
        required: true
      }
    },
    data(){
      return{
        index: 0,
        url: [
          dog,
          cat,
          tiger,
          lion
        ]
      };
    },
    methods:{
      changeNumber(number){
        this.$emit("update-number", this.number + number);
      },
      indexChanger(number){
        if(this.index + number < 0)
          this.index = 3;
        else if(this.index + number > 3)
          this.index = 0;
        else
          this.index += number;
      }
    }
  };
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1{
    font-family: "Courier New", Courier, monospace;
    font-size: 50px;
    color: cyan;
    font-weight: bolder;
    text-decoration: 3px dotted cyan underline;
  }
  p{
    font-family: "Times New Roman", Times, serif;
    font-size: 30px;
    color: cyan;
    font-weight: lighter;
  }
  button{
    padding: 5px 10px;
    border: 1px solid orange;
    border-radius: 20px;
    text-align: center;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 18px;
    background-color: navy;
    color: cyan;
    margin: 10px 30px;
  }
  #image-container{
    display: grid;
    grid-template-rows: repeat(2, auto);
    row-gap: 10px;
    margin: 10px auto;
    justify-content: center;
    align-content: center;
  }
  #image-viewer{
    width: 50%;
    border: 1px solid wheat;
    border-radius: 50px;
    margin: auto;
    padding: 5px;
  }
  #button-container{
    display: flex;
    justify-content: center;
    align-content: center;
  }
</style>