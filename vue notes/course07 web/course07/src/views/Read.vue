<template>
    <h1 class = "title">Read Website</h1>
    <h2 v-if = "employees.length == 0">There're no one employees</h2>
    <div v-else id = "employee-container" class = "pink-grid" v-for = "(employee, index) in employees" :key = "index">
        <h1 id = "employee-name" class = "title">{{employees [index].name}}</h1>
        <div id = "information-container" class = "pink-grid">
            <p class = "employee-information">id: {{employees [index].id}}</p>
            <p class = "employee-information">age: {{employees [index].age}}</p>
            <p class = "employee-information">skill: {{employees [index].skill}}</p>
            <p class = "employee-information">position: {{employees [index].position}}</p>
        </div>
    </div>
    <h2 id = "employee-size">You have {{employees.length}} employee(s)</h2>
</template>

<script>
    export default{
        name: "Employess",
        data(){
            return{
                employees: []
            };
        },
        mounted(){
            fetch("http://localhost:3000/employees").then(response => response.json())
                                                    .then(data => {this.employees = data; console.log(`this.employees:\t ${this.employees}`);})
                                                    .catch(error => alert(error));
        }
    }
</script>

<style scoped>
    h2{
        font-family: "Trebuchet MS", "Lucida Sans Unicode", "Lucida Grande", "Lucida Sans", Arial, sans-serif;
        font-size: 50px;
        font-weight: 900;
        text-decoration: 10px solid red line-through;
        text-align: center;
        color: red;
    }

    #employee-container{
        color: black;
        grid-template-columns: 1fr;
        grid-template-rows: repeat(2, 1fr);
        row-gap: 10px;
        border-radius: 50px;
    }

    #employee-name{
        font-family: "Times New Roman", Times, serif;
    }

    #information-container{
        grid-template-columns: repeat(4, auto);
        grid-template-rows: 1fr;
        column-gap: 15px;
    }

    .employee-information{
        font-family: "Courier New", Courier, monospace;
        font-size: 25px;
        font-weight: bold;
        margin: 5px 10px;
        padding: 5px 10px;
        border: 1px solid cyan;
        color: cyan;
        border-radius: 50px;
    }

    #employee-size{
        font-family: Arial, Helvetica, sans-serif;
        font-weight: 900;
        font-size: 30px;
        color: orange;
        text-decoration: none;
    }
</style>