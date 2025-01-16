<template>
    <div class = "home">
        <h1>Hello Caesar</h1>
    </div>
    <br>
    <hr>
    <br>
    <p>you can select below buttons to view a specific component</p>
    <button @click = "activeComponent = 'hello'">hello</button>
    <button @click = "activeComponent = 'world'">world</button>
    <p>which one figure do you favor</p>
    <KeepAlive include = "World">
        <component :is = "activeComponent"></component>
    </KeepAlive>
</template>

<script>
    import Hello from "../components/Hello.vue";
    import World from "../components/World.vue";
    export default{
        name: "Home",
        components:{
            Hello,
            World
        },
        data(){
            return{
                activeComponent: ""
            };
        }
    };
</script>