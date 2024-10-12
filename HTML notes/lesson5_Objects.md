### Date: October 9, 2024
### Title: Lesson05: Objects
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### `<button></button>`
Defines a clickable button.

It has seven attributes:
1. `autofocus`
   * Specifies that a button should automatically get focus when the page loads.
2. `disabled`
    * Specifies that a button should be disabled.
3. `name`
    * Specifies a name for the button.
4. `type`
    * Specifies the type of button.
    * It has three types:
        1. button
        2. reset
        3. submi
5. `value`
    * Specifies the initial name for the button.
6. `popovertarget`
    * Specifies a which popover element to invoke.
    * You need to give an ID.
7. `popovertargetaction`
    * Specifies what happens to the popover element when the button is clicked.
    * It has three values:
        1. hide
        2. show
        3. taggle
##### `<table></table>`
Defines an HTML table.
##### `<caption></caption>`
Defines a table caption.
##### `<tr></tr>`
Defines a row in an HTML table.
##### `<th></th>`
Defines a header cell in an HTML table.
##### `<td></td>`
Defines a standard data cell in an HTML table.
##### `<colgroup></colgroup>`
Specifies a group of one or more columns in a table for formatting.
#####  `<col>`
Specifies column properties for each column within a `<colgroup>` element.
##### `<thead></thead>`
Groups header content in an HTML table.
##### `<tbody></tbody>`
Groups the body content in an HTML table.
##### `<tfoot><tfoot>`
Groups footer content in an HTML table.

example:
```
<table>
    <thead>
        <colgroup>
            <col span = "2" style = "background-color: lightgray;">
            <col style = "backgroud-color: black;">
            <col style = "background-color: pink;">
        </colgroup>
    	<caption>Caesar's Friends</caption>
        <tr>
        	<th>first name</th>
            <th>last name</th>
            <th>gender</th>
            <th>hobby</th>
        </tr>
    </thead>
    <tbody>
    	<tr>
        	<td>Taylor</td>
            <td>Swift</td>
            <td>female</td>
            <td>singing</td>
        </tr>
    </tbody>
    <tfoot>
      	<tr>
        	<td>Caesar</td>
            <td>Lee's</td>
            <td>friend(s)</td>
            <td>1</td>
        </tr>
    </tfoot>
</table>
```
##### `<ul></ul>`
Defines an unordered list (bulleted) list.

Using the `<ul>` tag together with the `<li>` tag to create unordered lists.
##### `<li></li>`
Defines a list item.

example:
```
<ul>
    <li>Caesar</li>
    <li>James</li>
    <li>LEE</li>
</ul>
```
##### `<menu></menu>`
Defines an unordered list of content.

`<menu>` tag is an alternative to the `<ul>` tag and browser will treat these two lists equally.
##### `<ol></ol>`
Defines an ordered list.

example:
```
<ol>
    <li>first</li>
    <li>second</li>
    <li>third</li>
</ol>
```
##### `<dl></dl>`
Defines a description list.
##### `<dt></dt>`
Defines a term or name in a description list.
##### `<dd></dd>`
It's ued to describe a term or name in a description list.

example
```
<dl>
    <dt>Caesar</dt>
        <dd>my first name</dd>
    <dt>James</dt>
        <dd>my middle name and inherited from my father</dd>
    <dt>LEE</dt>
        <dd>my last name</dd>
```
##### `<form></form>`
Creates an HTML form for user input.

It has eight attributes:
1. `accept-charset`
    * Specifies the character encoding that are to be used for the form submission.
    *  You need give a character set name e.g. `UTF-8`.
2. `action`
    * Specifies where to send the form-data when a form is submitted.
    * You need give a URL.
3. `autocomplete`
    * Specifies whether a form should have autocommplete on or off.
    * You need give `on` or `off`.
4. `method`
    * Specifies the HTTP method to use when sending form-data.
    * It has two values:
        1. get
        2. post
5. `name`
    * Specifies the name of a form.
7. `rel`
    * Specifiess the relationship between a linked resource and the current document.
    * It has eight values:
        1. external
        2. help
        3. license
        4. next
        5. nofollow
        6. noopener
        7. noreferrer
        8. opener
        9. prev
        10. search
8. `target`
    * Specifes where to display the response that is received after submiting the form.
    * It has fore values:
        1. _blank
        2. _self
        3. _parent
        4. _top
##### `<input>`
Specifies an input field where the user can enter data.

`<input>` element is the most important form elemengt.

`<input>` element can be displayed in serveral ways, depending on the `type` attribute.

It has twenty-two ways:
1. `<input type = "button">`
2. `<input type = "checkbox>`
3. `<input type = "color">`
4. `<input type = "date">`
5. `<input type = "datetime-local">`
6. `<input type = "email">`
7. `<input type = "file">`
8. `<input type = "hidden">`
9. `<input type = "image">`
10. `<input type = "month">`
11. `<input type = "number>`
12. `<input type = "password">`
13. `<input type = "radio">`
14. `<input type = "range">`
15. `<input type = "reset">`
16. `<input type = "search">`
17. `<input type = "submit">`
18. `<input type = "tel">`
19. `<input type = "text">` **(default)**
20. `<input type = "time">`
21. `<input type = "url">`
22. `<input type = "week">`

It has twenty-two attributes:
1. `accept`
    * Specified a filter what file types the user can pick form the field input dialog box.
    * **`type = "file"` ONLY**
2. `alt`
    * Specifies an alternate text for images.
    * **`type = "image"` ONLY**
3. `autocomplete`
    * Specifies whether an `<input>` element should have autocomplete enabled.
    * It has two values: `on` and `off`.
4. `autofocus`
    * Specifies that an `<input>` element should automatically get focus when the page loads.
5. `checked`
    * Specifies that an `<input>` element should be preselected when the page loads.
    * **FOR `type = "checkbox"` AND `type = "radio"`**
6. `disabled`
    * Specifies that an `<input>` should be disabled.
7. `height`
    * Specifies the heigh of an `<input>` element.
    * **ONLY `type = "image"`**
8. `width`
    * Specifies the width od an `<input>` element.
    * **ONLY `type = "image"`**
9. `list`
    * Refers to a `<details>` element that contains predefined options for an `<input>` element.
10. `max`
    * Specifies the maximum value for an `<input>` element.
    * You need to give a number or a date.
11. `min`
    * Specifies a minimum value for an `<input>` element.
    * You need to give a number or a date.
12. `maxlength`
    * Specifies the maximum number of a character allowed in an `<input>` element.
13. `minlength`
    * Specifies the minimum number of a character required in an `<input>` element.
14. `multiple`
    * Specifies that a user can enter more than one value in an `<input>` element.
15. `name`
    * Specifies the name of an `<input>` element.
16. `popovertarget`
    * Specifies which popover element to invoke.
    * **ONLY `type = "button"`**
17. `popovertargetaction`
    * Specifies what happens to the popover element when you click the button.
    * It has three values:
        1. hide
        2. show
        3. taggle
18. `readonly`
    * Specifies that an `<input>` element field is read-only.
19. `required`
    * Specifies that an `<input>` field must be filled out before submitting the form.
20. `size`
    * Specifies the width, in characters, of an `<input>` element.
21. `src`
    * Specifies the URL of the image to use as a submit button.
    * **ONLY `type = "src"`**
22. `value`
    * Specifies the value of an `<input>` element.
##### `<label></label>`
Defines a label for twenty-one elements:
1. `<input type = "checkbox">`
2. `<input type = "color">`
3. `<input type = "date">`
4. `<input type = "datetime-local">`
5. `<input type = "email">`
6. `<input type = "file">`
7. `<input type = "month">`
8. `<input type = "number">`
9. `<input type = "password">`
10. `<input type = "radio">`
11. `<input type = "range">`
12. `<input type = "search">`
13. `<input type = "tel">`
14. `<input type = "text">`
15. `<input type = "time">`
16. `<input type = "url">`
17. `<input type = "week">`
18. `<meter>`
19. `<progress>`
20. `<select>`
21. `<textarea>`
##### `<textarea></textarea>`
Defines a multi-line text input control.

It is often used in a form, to collect user input likes comments or reviews.

It has nine attributes:
1. `autofocus`
    * Specifies that a text area should automatically get focus when the page loads.
2. `rows`
    * Specifies the visible number of lines in a text area.
3. `cols`
    * Specifies the visible width of a text area.
4. `disabled`
    * Specifies that a text area should be disabled.
5. `maxlength`
    * Specifies the maximum number of characters allowed in the text area.
6. `name`
    * Specifies a name for a text area.
7. `readonly`
    * Specifies that a text area should be read-only.
8. `required`
    * Specifies that a text area is required or must be filled out.
9. `wrap`
    * Specifies how the text in a text area is to be wrapped when submitted in a form.
    * It has two values: `hard` and `soft`
##### `<select></select>`
It's used to create a drop-down list.

`<option>` tag inside the `<select>` element define the available options in the drop down list.

It has seven attributes.
1. `autofocus`
    * Specifies that the drop-down list should automatically get focus when the page loads.
2. `disabled`
    * Specifies that the drop-down list should be disabled.
3. `multiple`
    * Specifies that multiple options can be selected at once.
4. `name`
    * Defines a name for the drop-down list.
5. `required`
    * Specifies that the user is required to select a value before submitting the form.
6. `size`
    * Defines the number of visible options in a drop-down list.
##### `<option></option>`
Defines an option in a select list.

It has four attributes:
1. `disabled`
    * Specifies that an option should be disabled.
2. `label`
    * Specifies a shorter label for an option.
3. `selected`
    * Specifies that an option should be pre-selected when the page loads.
4. `value`
    * Specifies the value to be sent to a server.
##### `<optgroup></optgroup>`
It is used to group related options in a `<select>` element.

It has two attributed:
1. `disabled`
    * Specifies that an option group should be disabled.
2. `label`
    * Specifies a label for an option-group.
##### `<fieldset></fieldset>`
It's used to group related elements in a form.

Draws a box around the related elements.

`<legend>` tag is used to define a caption for the `<fieldset>` element.

It has two attributes:
1. `disabled`
    * Specifies that a group of related form elements should be disabled.
2. `name`
    * Specifies a name for the `<fieldset>` element.
##### `<legend></legend>`
Defines a caption for the `<filedest>` element.
##### `<output></output>`
It's used to represent the result of a calculation.

It has two attributes:
1. `for`
    * Specifies the relationship between the result of the calculation, and the element used in the calculation.
2. `name`
    * Specifies a name for `<output>` element.

example:
```
<form accept-charset = "UTF-8" action = "something.com/data" method = "post"
	    name = "basicForm" target = "_blank">
 	<fieldset>
    	<legend>Personal Information</legend>

        <label for = "firstName">First Name: </label>
        <input id = "firstName" name="firstName" required>
        <br>

        <label fo r= "lastName">Last Name: </label>
        <input id = "lastName" name = "lastName" required>
        <br>

        <label for = "ageId">Age: </label>
        <input type = "range" value = "18" min = "1" max = "100" id = "ageId"
        		name = "age" oninput = "ageShower.value = this.value" required>
        <output id = "ageShower">18</output>
        <br>

        <label for = "email">Email: </label>
        <input type = "email" name = "email" required>
        <br>

        <label for = "telephone">Telephone: </label>
        <input type = "tel" name = "telephone" required>
        <br>

        <label for = "gender">Gender: </label>
        <label for = "male">Male</label>
        <input type = "radio" id = "male" name = "gender" value = "male">
        <label for = "female">Female</label>
        <input type = "radio" id = "female" name = "gender" value = "female">
        <label for = "other">Other</label>
        <input type = "radio" id = "other" name = "gender" value = "other" checked>
        <br>

        <label for = "citizen">Citizen: </label>
        <select name = "citizen" required>
        	<optgroup label = "Asia">
            	<option value = "taiwanese">Taiwanese</option>
                <option value = "chinese">Chinese</option>
                <option value = "indian">Indian</option>
                <option value = "otherAsian">Other Asian</option>
             </optgroup>
             <optgroup label = "America">
             	<option value = "american">American</option>
                <option value = "canadian">Canadian</option>
                <option value = "otherAmerican">Other American</option>
             </optgroup>
             <optgroup label = "Other">
             	<option value = "otherCitizen">Other Citizen</option>
             </optgroup>
        </select>
        <br>
    </fieldset>

    <br>
    <hr>
    <br>

    <fieldset>
    	<legend>Registration</legend>

        <label for = "username">Username: </label>
        <input id = "username" maxlength = "30" minlength = "5" name = "username" 
                required>
        <br>

        <label for = "password">Password: </label>
        <input type = "password" id="password" maxlength="30" minlength="9"
                name = "password" required>
        <br>

        <label for="description">Description: </label>
        <textarea id="description" rows="3" cols="30" maxlength="70" wrap="soft" 
                    required></textarea>
    </fieldset>
</form>
```
##### `<progress></progress>`
Represents the completion progress of a task.

Always add the `<label>` tag for best accessibility practices.
It has two attributes:
1. `max`
    * Specifies how much work the task reqiures in total.
    * **Default value is 1**
2. `value`
    * Specifies how much of the task has been completed.

example:
```
<label for = "progress">progress bar</label>
<progress id = "progress" value = "3" max = "100"> 3 % </progress>
```
##### `<canvas></canvas>`
It's used to draw graphics, on the fly, via scripting (usually JavaScript).

It's transparent, and is only a container for graphics, you must use a script to actually draw the graphics.

Any text inside the `<canvas>` will be displayed in browser with JavaScript disabled and in broswers that don't support `<canvas>`.

It has two attributes:
1. `width`
    * Specifies the width of the `<canvas>`.
    * Default value is 300.
2. `height`
    * Specifies the height of the `<canvas>`.
    * Default value is 150.