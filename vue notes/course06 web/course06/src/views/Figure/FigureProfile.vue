<template>
    <div id = "body">
        <h1>Welcome to figure profile page</h1>
        <h2>Figure Profile</h2>
        <br>
        <hr>
        <br>
        <div id = "profile-container">
            <p>name: {{this.figures [id].name}}</p>
            <p>skill: {{this.figures [id].skill}}</p>
            <p>age: {{this.figures [id].age}}</p>
            <p>position: {{this.figures [id].position}}</p>
        </div>
    </div>
</template>

<script>
    export default{
        name: "Figure",
        props: ["id"],
        data(){
            return{
                figures: [
                    {name: "Caesar", skill: "programming", age: 18, position: "junior developer"},
                    {name: "Lily", skill: "singing", age: 20, position: "singer"},
                    {name: "James", skill: "dancing", age: 15, position: "dancer"}
                ]
            };
        }
    };
</script>

<style scoped>
    #body{
        border: 1px solid white;
        border-radius: 50px;
        padding: 10px 30px;
        text-align: center;
    }

    h1,
    h2{
        color: cyan;
        border: 1px solid orange;
        border-radius: 20px;
        text-align: center;
        font-weight: 900;
        text-decoration: 3px dashed cyan underline;
    }

    h1{
        font-size: 50px;
    }

    h2{
        font-size: 30px;
    }

    #profile-container{
        display: grid;
        grid-template-rows: repeat(2, 1fr);
        grid-template-columns: repeat(2, 1fr);
        gap: 20px;
        justify-content: center;
        align-content: center;
        justify-items: left;
        align-items: center;
    }

    p{
        color: orange;
        font-size: 20px;
    }
</style>