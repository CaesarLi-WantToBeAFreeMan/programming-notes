<template>
    <div id = "body">
        <h1 class = "titles">please wait for a while to load your selected component</h1>
        <div id = "progress-bar">
            <div id = "floating-bar"></div>
        </div>
    </div>
</template>

<script>
    export default{
        name: "LoadingComponent"
    };
</script>

<style scoped>
    #body{
        background-color: black;
    }
    
    #progress-bar{
        width: 80%;
        height: 30px;
        background-color: orange;
        border-radius: 50px;
        position: relative;
        overflow: hidden;
        margin: 10px auto;
        padding: 0 10px;
    }

    #floating-bar{
        width: 30%;
        height: 100%;
        background-color: cyan;
        border-radius: 50px;
        animation: float 3s ease-in-out infinite;
        margin: 0 auto;
    }

    @keyframes float{
        0%{
            transform: translateX(-100%);
        }
        50%{
            transform: translateX(100%);
        }
        100%{
            transform: translateX(-100%);
        }
    }
</style>