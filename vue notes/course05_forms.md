# Title: Course05: Forms
# Author: Caesar James LEE
# Date: January 14, 2025
## connect data
* use `v-model` to connect data
  ## 1. text
    * syntax:
        ```html
            <label for = "name">name</label>
            <input id = "name" v-model = "name">
        ```
  ## 2. password
    * syntax
        ```html
            <label for = "password">password</label>
            <input id = "password" type = "password" v-model = "password">
        ```
  ## 3. text area
    * syntax
        ```html
            <label for = "textarea">text area</label>
            <textarea id = "textarea" rows = "3" cols = "30" v-model = "textarea">
        ```
  ## 4. digital slider controler
    * syntax
        ```html
            <label for = "age">age</label>
            <input id = "age" type = "range" min = "0" max = "12" value = "3"
                    v-model = "age">
        ```
  ## 5. email
    * syntax
        ```html
            <label for = "email">email</label>
            <input id = "email" type = "email" v-model = "email">
        ```
  ## 6. telephone
    * syntax
        ```html
            <label for = "telephone">telephone</label>
            <input id = "telephone" type = "tel" v-model = "telephone">
        ```
  ## 7. checkbox
      * syntax
        ```html
            <label for = "checkbox">checkbox</label>
            <input id = "checkbox" type = "checkbox" v-model = "checkbox">
        ```
  ## 8. radio
    * syntax
        ```html
            <label for = "name">name</label>
            <input id = "name" type = "radio" value = "name" name = "groupName"
                    v-model = "name">
        ```
  ## 9. drop-down list
    * syntax
        ```html
            <label for = "list">drop-down list</label>
            <select id = "list" v-model = "name">
                <optgroup label = "something">
                    <option value = "something">something</option>
                </optgroup>
            </select>
        ```