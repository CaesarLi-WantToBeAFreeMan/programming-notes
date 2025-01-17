# Title: Course07: Fetching data
# Author: Caesar James LEE
# Date: January 17, 2025
## json server
* It's a json file contains data as a database resource
* It's particular useful for front-end developers who need to prototype or develop applications without a real backend
* You can perform CRUD (Create, Read, Update, Delete) operations on the data
* You **can create a relational database** althought json server is specifically designed to mimic a non-relational database, but **doesn't support some relational features like `foreign keys`, `joins`, or complex `queries`**
* Steps
    1. Create a folder `data` or other name in your vue project, and create a file `db.json` or other name into your created folder
    2. Insert data into the json file, like
        ```json
            {
                "employees": [
                    {
                        "id": 0, 
                        "name": "Caesar James LEE",
                        "age": 18,
                        "skill": "programming",
                        "position": "junior developer"
                    },
                    {
                        "id": 1,
                        "name": "Taylor SWIFT",
                        "age": 35,
                        "skill": "singing & dancing",
                        "position": "professional singer"
                    },
                    {
                        "id": 2,
                        "name": "James JACKSON",
                        "age": 20,
                        "skill": "designing",
                        "position": "UI designer"
                    }
                ]
            }
        ```
    3. Install `json server` locally and write the dependency to `package.json`
        * locally
        ```bash
            npm install json-server
        ```
    4. use the `data/db.json`
        ```bash
            json-server --watch data/db.json
        ```
    5. fetch data
        * You **cannot declare `employee` to `null`**, you shoulde declare to an empty array, and then json-server will fill it
        ```javascript
            export dafault{
                data(){
                    return{
                        employees: []
                    };
                },
                mounted(){
                    fetch("http://localhost:3000/employees").then(response => response.json())//parse json response
                                                            .then(data => this.employees = data)//assign the data to the employees array
                                                            .catch(error => alert(error));//catch errors
                }
            };
        ```
## CRUD of json-server
1. create
    ```javascript
        fetch("http://localhost:3000/employees", {
                    method: "POST",
                    headers: {"Content-Type": "application/json"},
                    body: JSON.stringify({
                                            //property: this.newProperty
                                            })
                }).then(response => response.json())
                    .then(data => {
                                    //a feedback for data
                                    })
                    .catch(error => {
                                    //catch error
                                    });
    ```
2. read
    * It's fetch data
3. update
4. delete