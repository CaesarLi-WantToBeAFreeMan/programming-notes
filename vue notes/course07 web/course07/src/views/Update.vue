<template>
    <h1 class = "title">Update Website</h1>
    <form v-if = "employees.length > 0">
        <fieldset>
            <legend class = "title">Reassign an employee</legend>
            <div id = "id-container">
                <label for = "id">ID: </label>
                <select name = "id" v-model = "id">
                    <option v-for = "employee in employees" :key = "employee.id"
                            :value = "employee.id">{{employee.id}}</option>
                </select>
            </div>
            <div class = "pink-grid" id = "property-container">
                <div class = "label-input-container">
                    <label for = "name">name: </label>
                    <input id = "name" maxlength = "30" v-model = "employee.name"
                            placeholder = "please select an employee" required>
                </div>

                <div class="label-input-container">
                    <label for = "age">age: </label>
                    <input type = "number" id = "age" v-model = "employee.age"
                            placeholder = "please select an employee" required>
                </div>

                <div class = "label-input-container">
                    <label for = "skill">skill: </label>
                    <input id = "skill" maxlength = "50" v-model = "employee.skill"
                            placeholder = "please select an employee" required>
                </div>

                <div class="label-input-container">
                    <label for = "position">position: </label>
                    <input id = "position" maxlength = "50" v-model = "employee.position"
                            placeholder = "please select an employee" required>
                </div>
            </div>
            <div id = "submit-container">
                <button @click.prevent = "update" title = "submit the form">submit</button>
            </div>
        </fieldset>
    </form>
</template>

<script>
    export default{
        name: "Update",
        data(){
            return{
                employees: [],
                id: null,
                employee: {}
            };
        },
        mounted(){
            fetch("http://localhost:3000/employees").then(response => response.json())
                                                    .then(data => this.employees = data)
                                                    .catch(error => alert(error));
        },
        watch:{
            id(newID){
                let employee = this.employees.find(person => person.id === newID)
                if(employee)
                    this.employee = {...employee};
            }
        },
        methods:{
            update(){
                if(this.employee.name === ""){
                    alert("please enter this employee's name");
                    return;
                }
                if(this.employee.age === null){
                    alert("please enter this employee's age");
                    return;
                }
                if(this.employee.age < 18){
                    alert("are you kinding me");
                    return;
                }else if(this.employee.age > 60){
                    alert("the person should be retired");
                    return;
                }
                if(this.employee.skill === ""){
                    alert("please enter this employee's skill");
                    return;
                }
                if(this.employee.position === ""){
                    alert("please enter this employee's position");
                    return;
                }
                fetch(`http://localhost:3000/employees/${this.employee.id}`, {
                    method: "PATCH",
                    headers: {"Content-Type": "application/json"},
                    body: JSON.stringify(this.employee)
                }).then(response => {response.json();})
                    .then(() => {
                                console.log(this.employee);
                                alert("this employee information has been updated");
                                window.location.reload();
                                })
                    .catch(error => {
                                    alert(error);
                                    console.log(error);
                                    alert("failed to update this employee information");
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

    #id-container{
        display: flex;
        flex-direction: row;
        column-gap: 30px;
        justify-content: center;
        align-content: center;
        justify-items: left;
        align-items: center;
        margin-bottom: 20px;
    }
    
    select{
        background-color: black;
        color: cyan;
        font-size: 30px;
        width: 3em;
        box-shadow: orange 2px 3px, orange -2px -3px;
        border: 1px solid white;
        padding: 5px 10px;
        border-radius: 50px;
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