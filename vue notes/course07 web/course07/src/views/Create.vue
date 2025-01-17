<template>
    <h1 class = "title">Create Website</h1>
    <form>
        <fieldset>
            <legend class = "title">Hire an employee</legend>
            <div class = "pink-grid" id = "property-container">
                <div class = "label-inpu-container">
                    <label for = "name">name: </label>
                    <input id = "name" maxlength = "30" placeholder = "employee name" required v-model = "newName">
                </div>

                <div class = "label-inpu-container">
                    <label for = "age">age: </label>
                    <input type = "number" id = "age" placeholder = "employee age" required v-model = "newAge">
                </div>
                
                <div class = "label-inpu-container">
                    <label for = "skill">skill: </label>
                    <input id = "skill" maxlength = "50" placeholder = "employee skill" required v-model = "newSkill">
                </div>

                <div class = "label-inpu-container">
                    <label for = "position">position: </label>
                    <input id = "position" maxlength = "50" placeholder = "employee position" required v-model = "newPosition">
                </div>
            </div>
            <div id = "submit-container">
                <button @click.prevent = "create" title = "submit the form">submit</button>
            </div>
        </fieldset>
    </form>
</template>

<script>
    export default{
        name: "Create",
        data(){
            return{
                newID: null,
                newName: "",
                newAge: null,
                newSkill: "",
                newPosition: ""
            };
        },
        mounted(){
            fetch("http://localhost:3000/employees").then(response => response.json())
                                                    .then(data => {
                                                        if(data.length > 0)
                                                            this.newID = data [data.length - 1].id + 1;
                                                    })
                                                    .catch(error => alert(error));
        },
        methods:{
            create(){
                if(this.newName === ""){
                    alert("please enter this employee's name");
                    return;
                }
                if(this.newAge === null){
                    alert("please enter this employee's age");
                    return;
                }
                if(this.newAge < 18){
                    alert("we cannot hire a child or hasn't born yet");
                    return;
                }else if(this.newAge > 60){
                    alert("we cannot hire a person who should be retired");
                    return;
                }
                if(this.newSkill === ""){
                    alert("please enter this employee's skill");
                    return;
                }
                if(this.newPosition === ""){
                    alert("please enter this employee's position");
                    return;
                }
                fetch("http://localhost:3000/employees", {
                    method: "POST",
                    headers: {"Content-Type": "application/json"},
                    body: JSON.stringify({
                                            id: this.newID,
                                            name: this.newName,
                                            age: this.newAge,
                                            skill: this.newSkill,
                                            position: this.newPosition
                                        })
                }).then(response => response.json())
                    .then(() => {
                                alert("this employee information has been created");
                                window.location.reload();
                                })
                    .catch(error => {
                                    alert(error);
                                    alert("failed to create this employee information");
                                    });
            }
        }
    };
</script>

<style scoped>
    legend{
        font-family: "Times New Roman", Times, serif;
    }

    fieldset{
        border: 1px solid white;
        border-radius: 50px;
        margin: 5px auto;
        padding: 5px 10px;
    }

    #property-container{
        grid-template-rows: repeat(2, 1fr);
        grid-template-columns: repeat(2, 1fr);
        gap: 10px;
        justify-content: space-around;
        justify-items: left;
        margin: 5px auto;
        width: 95%;
        padding: 10px 30px;
        border-radius: 50px;
    }

    .label-input-container{
        display: grid;
        grid-template-rows: auto;
        grid-template-columns: 1fr 4fr;
        column-gap: 20px;
        justify-content: space-between;
        justify-items: left;
        align-content: center;
        align-items: center;
    }

    label{
        font-family: Arial, Helvetica, sans-serif;
        font-size: 30px;
        color: cyan;
    }

    input{
        font-family: Arial, Helvetica, sans-serif;
        font-size: 21px;
        font-weight: 500;
        width: 350px;
        background-color: black;
        color: white;
        box-shadow: cyan 1px 2px, cyan -1px -2px;
        border: 1px solid white;
        padding: 1px 2px;
    }

    input::placeholder{
        color: gray;
    }

    #submit-container{
        display: flex;
        justify-content: center;
    }

    button{
        margin: 10px auto;
        font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande", "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
        font-size: 25px;
        width: 6em;
        padding: 5px 10px;
        text-align: center;
        background-color: orange;
        color: cyan;
        border: 1px solid white;
        border-radius: 50px;
        opacity: 0.7;
    }

    button:hover{
        opacity: 1.0;
        cursor: pointer;
        transition: opacity 0.5 ease-in;
    }
</style>