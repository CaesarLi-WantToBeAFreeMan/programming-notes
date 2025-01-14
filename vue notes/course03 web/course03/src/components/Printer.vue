<template>
    <div id = "printer-container">
        <slot name = "hello">default slot</slot>
    </div>
</template>

<script>
    export default{
        name: "Printer"
    };
</script>

<style scoped>
    #printer-container{
        padding: 10px 30px;
        background-color: forestgreen;
        margin: 10px auto;
        font-size: 50px;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        font-weight: bolder;
        text-decoration: 12px dashed cyan line-through;
        color: wheat;
        text-align: center;
    }
</style>