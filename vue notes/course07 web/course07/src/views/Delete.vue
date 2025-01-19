<template>
    <h1 class = "title">Delete Website</h1>
    <form v-if = "employees.length > 0">
        <fieldset>
            <legend class = "title">Lay an employee off</legend>
            <div id = "id-container">
                <label for = "id">ID: </label>
                <select id = "id" v-model = "id">
                    <option v-for = "employee in employees" :key = "employee.id"
                            :value = "employee.id">{{employee.id}}</option>
                </select>
            </div>
            <p id = "employee-name">name: {{name}}</p>
            <div id = "submit-container">
                <button @click.prevent = "layoff" title = "submit the form">submit</button>
            </div>
        </fieldset>
    </form>
</template>

<script>
    export default{
        name: "Delete",
        data(){
            return{
                employees: [],
                id: null,
                name: ""
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
                    this.name = employee.name;
            }
        },
       methods:{
            layoff(){
                if(this.id !== null){
                    fetch(`http://localhost:3000/employees/${this.id}`, {
                        method: "DELETE"
                    }).then(response => response.json())
                        .then(() => {
                            alert("this employee has been fired");
                            window.location.reload();
                        })
                        .catch(error => {
                            alert(error);
                            alert("failed to lay this employee off");
                        });
                }else
                    alert("please select an employee");
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
    
    label{
        font-family: Arial, Helvetica, sans-serif;
        font-size: 30px;
        color: cyan;
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

    #employee-name{
        font-family: Georgia, "Times New Roman", Times, serif;
        font-size: 50px;
        color: cyan;
        text-align: center;
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