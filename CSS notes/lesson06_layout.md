### Date: October 15, 2024
### Title: Lesson06: Layout
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### `display`
* It's used to specify how an element is shown on a web page.
* Every HTML element has a default display value, depending on what type of element it is. The default display value for most elements is `block` and `inline`.
* Some examples of displaying type on HTML:
    1. `block`
        * This element will occupy the whole line.
        * You can specify `width` and `height` value.
        1. `<div></div>`
        2. `<h1></h1>`
        3. `<h2></h2>`
        4. `<h3></h3>`
        5. `<h4></h4>`
        6. `<h5></h5>`
        7. `<h6></h6>`
        8. `<p></p>`
        9. `<form></form>`
        10. containers (e.g. `<header></header>`, `<main></main>`, `<footer></footer>`, `<aside></aside>`...)
    2. `inline`
        * This element will only occupy the space required by the text.
        * You can't specify `width` and `height` value.
        1. `<span></span>`
        2. `<a></a>`
        3. `<img>`
* It has twenty values:
    1. `inline`     ***COMMON***
        * Displays an element as an inline element.
        * It's useful for **text**
    2. `block`      ***COMMON***
        * Displays an element as a block element.
        * It's useful for **sections** in a webpage.
    3. `contents`
        * Makes the container disappear, making the child elements children of the element the next level up in the DOM (talk in JavaScript).
    4. `flex`       ***COMMON***
        * Displays an element as a block-level flex container (talk later).
    5. `grid`       ***COMMON***
        * Displays an element as a block-level grid container (talk later).
    6. `inline-block`       ***COMMON***
        * Displays an element as an inline-block container.
        * The element itself is formatted as an inline element, but you can apply `height` and `width` values.
    7. `inline-flex`
        * Displays an element as an inline-level flex container.
    8. `inline-grid`
        * Displays an element as an inline-level grid container.
    9. `inline-table`
        * The element is displayed as an inline-level table.
    10. `list-item`
        * Let the element bahave like a `<li></li>` element.
    11. `run-in`
        * Displays an element as either block or inline, depending on context.
    12. `table`
        * Let the element behave like a `<table></table>` element.
        * It's useful for **two-dimension** table data.
    13. `table-caption`
        * Let the element behave like a `<caption><caption>` element.
    14. `table-column-group`
        * Let the element behave like a `<colgroup></colgroup>` element.
    15. `table-header-group`
        * Let the element behave like a `<thead></thead>` element.
    16. `table-footer-group`
        * Let the element behave like a `<tfoot></tfoot>` element.
    13. `table-cell`
        * Let the element behave like a `<td></td>` element.
    14. `table-row`
        * Let the element behave like a `<tr></tr>` element.
    15. `table-column`
        * Let the element behave like a `<col></col>` element.
    16. `none`
        * The element is **completely removed**.
##### `float`
* It's a basic layout.
* Specifes how an element should float.
* It's used for positioning and formatting content.
* e.g. let an image float left to the text in a container.
* It has three values:
    1. `left`
        * The element floats to the left of its container.
    2. `right`
        * The element floats to the right of its container.
    3. `none`       ***DEFAULT***
        * The element doesn't float (will be displayed just where it occurs in the text)
* example:
    ```
    ...
        <style>
            body{
	            background-color: black;
                color: white;
            }
            img{
                float: left;
                width: 50px;
                height: 50px;
                margin: 1px 10px 3px 5px;
            }
        </style>
    ...
    <body>
        <img src = "photo.jpg" alt = "photo">
        <p>This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.This is a test text.</p>
    </body>
    ```
##### `clear`
* We want the next element below rather than neither left nor right using the property.
* Specifies what should happen with the element that is next to a floating element.
* It has four values:
    1. `none`       ***DEFAULT***
        * The element isn't pushed below left or right floated element.
    2. `left`
        * The element is pushed below left floated elements.
    3. `right`
        * The element is pushed below right floated elements.
    4. `both`
        * The element is pushed below both left and right floated elements.
##### `box-sizing`
* Allows us to include the padding and border in an element's total width and height.
* actual width = width + padding + border
* actual height = height + padding + border
* It has two values:
    1. `content-box`        ***DEFAULT***
        * The `width` and `height` property includes only the content.
        * **border and padding aren't included.**
    2. `border-box`
        * The `width` and `height` property includes content, padding and border.
##### flex
* Making it easier to design flexible response layout structure without using `float` or `position`.
* To use a flex layout, you need do two steps:
    1. creating a container to hold some elements.
    2. adding `display: flex` property to the container.
![flexbox axis](images/flexbox%20axis.png)
##### `flex-direction`
* Defines in which direction the container wants to stack the flex items.
* It has four values:
    1. `row`        ***DEFAULT***
        * The flexible items are displayed horizontally, as a row.
    2. `row-reverse`
        * Same as `row`, but in reverse order.
    3. `column`
        * The flexible items are displayed vertically, as a column.
    4. `column-reverse`
        * Same as `column`, but in rever order.
##### `flex-wrap`
* Specifes whether the flexible items should wrap or not.
* It has three values:
    1. `nowrap`     ***DEFAULT***
        * Specifies that the flexible items will not wrap.
    2. `wrap`
        * Specifies that the flexible items will wrap if necessary.
    3. `wrap-reverse`
        * Specifies that the flexible items will wrap, if necessary, in reverse order.
##### `flex-flow`
* It's a shorthand property for `flex-direction` and `flex-wrap`.
* syntax:   `flex-flow: direction wrap;`.
##### `justify-content`
* Aligns the flexible container's items when the items don't use all available space on the `main-axis` (horizontally).
* It can also be used on `grid` container to align grid items in the inline direction.
* It has six values:
    1. `flex-start`     ***DEFAULT***
        * Items are positioned at the begining of the container.
    2. `flex-end`
        * Items are positioned at the end of the container.
    3. `center`
        * Items are positioned in the center of the container.
    4. `space-between`
        * Items will have space between them.
    5. `space-around`
        * Items will have space before, between and after them.
    6. `space-evenly`
        * Items will have equal space around them.
##### `align-content`
* Specifies hoe flex lines are distributed along the `cross axis` in a flexbox container.
* It can also be used on a `grid` container to align grid items in the block direction.
* It has seven values:
    1. `stretch`        ***DEFAULT***   
        * Lines stretch to take up the remaining space.
    2. `center`
        * Lines are packed toward the center of flex container.
    3. `flex-start`
        * Lines are packed toward the start of flex container.
    4. `flex-end`
        * Lines are packed toward the end of flex container.
    5. `space-between`
        * Lines are evenly distributed in the flex container.
    6. `space-around`
        * Lines are evenly distributed in the flex container, with half-size spaces on either end.
    7. `space-evenly`
        * Lines are evenly distributed in the flex container, with equal space around them.
##### `align-items`
* Specifies the default alignment for items inside a flexbox or grid container.
    * In a flexbox container, the flexbox items are aligned on the `cross axis`, which is vertical by default (opposite of `flex-direction`).
    * In a grid container, the grid items are aligned in the block direction.
* For pages in English, block direction is **downward** and inline direction is `left to right`.
* It has eight values:
    1. `normal`     ***DEFAULT***
        * Behaves like `stretch` for flexbox and grid items, or `start` for grid items witha defined block size.
    2. `stretch`
        * Items are stretched to fit the container.
    3. `center`
        * Items are positioned at the center of the container.
    4. `flex-start`
        * Items are positioned at the begining of the container.
    5. `flex-end`
        * Items are positioned at the end of the container.
    6. `start`
        * Items are positioned at the begining of their individual grid cells, in the block direction.
    7. `end`
        * Items are positioned at the end of their individual grid cells, in the block direction.
    8. `baseline`
        * Items are positioned at the baseline of the container.
##### `order`
* Specifies the order of a flexible item relative to the rest of the flexible items inside the same container.
* It has the only value:
    1. number
        * Specifies the order of the flexible item.
        * Default value is **0**.
##### `flex-grow`
* Specifies how much the item will grow relative to the rest of the flexible items inside the same conatainer.
* It has the only one value:
    1. number
        * Specifying how much the item will grow relative to the rest of the flexible items.
        * the higher the number, the larger the item.
        * Default value is **0**.
##### `flex-shrink`
* Specifies how the item will shrink relative to the rest of the flexible items side the same container.
* It has the only one value:
    1. number
        * Specifying how much the item will shrink relative to the rest of the flexible items.
        * the higher the number, the smaller the item.
        * Default value is **1**.
##### `flex-basis`
* Specifies the initial length of a flexible item.
* It has two values:
    1. length
        * Specifying the initial length of the flexible item(s).
    2. `auto`       ***DEFAULT***
        * The length is equal to the length of the flexible item.
        * If the item has no length specified, the length will be according to its content.
##### `flex`
* It's a shorthand property for `flex-grow`, `flex-shrink` and `flex-basis` properties.
* syntax:   `flex: grow shrink basis;`.
##### `align-self`
* Specifies the alignment in the block direction for the selected item inside a flexbox or grid container.
* It has six values:
    1. `auto`
        * The element inherits its parent container's `align-items` property, or `stretch` if it has no parent container.
    2. `stretch`
        * The element is positioned to fit the container.
    3. `center`
        * The element is positioned at the center of the container.
    4. `flex-start`
        * The element is positioned at the begining of the container.
    5. `flex-end`
        * The element is positioned at the end of the container.
    6. `baseline`
        * The element is positioned at the baseline of the container.
##### grid
* Offers a grid-based layout system, which rows and columns, which makes it easier to design web pages without `float` and `position`.
* To use grid layout, you need do two steps:
    1. Creates a container to hold elements.
    2. use `display: grid` or `display: inline-grid` properties.
##### `grid-template-columns`
* Defines the number of columns in your grid layout, and it can define the width of each column.
* It has five values:
    1. `none`       ***DEFAULT***
        * Columns are created if needed.
    2. `auto`
        * The size of columns is determined by the size of the container and on the size of the content of the items in the column.
    3. `max-content`
        * Sets the size of each column to depend on the largest item in the grid.
    4. `min-content`
        * Sets the size of each column to depend on the smallest item in the grid.
    5. length
        * Sets the size of columns, by using a legal length unit.
* **You can specify the same value multiple times using the `repeat()` function.**
##### `grid-template-rows`
* It likes `grid-template-columns`, but defines the number of the rows and specifies the height of each row.
* example:  creating a grid container with 3 rows and 5 columns.
    ```
    ...
        <style>
	        body{
    	        background-color: black;
                color: white;
            }
            #container{
    	        display: grid;
                grid-template-columns: repeat(5, auto);
                grid-template-rows: repeat(3, 70px);
            }
            .cell{
    	        font-family: Arial;
                font-size: 30px;
                border: 1px solid cyan;
                text-align: center;
                line-height: 70px;
            }
        </style>
    ...
    <body>
	    <div id = "container">
    	    <div class = "cell">1</div>
            <div class = "cell">2</div>
            <div class = "cell">3</div>
            <div class = "cell">4</div>
            <div class = "cell">5</div>
            <div class = "cell">6</div>
            <div class = "cell">7</div>
            <div class = "cell">8</div>
            <div class = "cell">9</div>
            <div class = "cell">10</div>
            <div class = "cell">11</div>
            <div class = "cell">12</div>
            <div class = "cell">13</div>
            <div class = "cell">14</div>
            <div class = "cell">15</div>
        </div>
    </body>
    ...
    ```
##### `justify-content` and `align-content`
* They're like flex.
##### `grid-column-start`
* Defines on which column-line the item will start.
* It has three values:
    1. `auto`       ***DEFAULT***
        * the item will be placed following the flow.
    2. `span number`
        * Specifies the number of columns the item will span.
        * In other words, specify how many columns the first column occupies.
    3. `number`
        * Specifies on which column to start the display of the item.
##### `grid-column-end`
* Deines how many columns an item will span, or on which column-line the item will end.
* It has the same three values like `grid-column-end`.
##### `grid-column`
* It's a shorthand property for `grid-column-start` and `grid-column-end` properties.
* syntax:   `grid-column: start / end;`
* example: start on column #0 (the first) and end on column #2 (the third) of a grid container with 2 rows and 4 columns.
    ```
    ...
        <style>
	        body{
    	        background-color: black;
                color: white;
            }
            #container{
    	        display: grid;
                grid-template-columns: repeat(4, auto);
                grid-template-rows: repeat(2, auto);
            }
            .cell{
    	        font-family: Arial;
                font-size: 30px;
                font-weight: bold;
                border: 3px dotted cyan;
                text-align: center;
            }
            #first{
    	        grid-column: 1 / 3;
            }
        </style>
    ...
    <body>
        <div id = "container">
            <div class = "cell" id = "first">1</div>
            <div class = "cell">2</div>
            <div class = "cell">3</div>  
            <div class = "cell">4</div>
            <div class = "cell">5</div>
            <div class = "cell">6</div>
            <div class = "cell">7</div>
        </div>
    </body>
    ...
    ```
##### `grid-row-start`, `gird-row-end` and `grid-row`
* They're like `grid-column-start`, `grid-column-end` and `grid-column`, but define rows.
##### `grid-area`
* It's a shorthand property for `gird-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`.
* syntax: `grid-area: row-start / column-start / row-end / column-end;`.
##### `grid-template-areas`
* Specifies areas within the grid layout.
* **You can name grid items by the `grid-area` property, and then reference to the name in the `grid-template-areas` property.**
* example: createing a gird container like this:
    ```
    box1 box1 box2
    box3 box4 box4
    box5 box5 box5
    ```
    
    ```
    ...
        <style>
            body{
                background-color: black;
                color: white;
            }
            #container{
                display: grid;
                grid-template-areas: 
                    "box1 box1 box2"
                    "box3 box4 box4"
                    "box5 box5 box5";
                    grid-template-columns: repeat(3, auto);
                grid-template-rows: repeat(3, 50px); /* Corrected repeat */
                gap: 10px;
            }
            .box{
        	    font-family: Arial;
                font-size: 39px;
                line-height: 50px;
                text-align: center;
                border: 3px double cyan;
            }
            #box1{
        	    grid-area: box1;
                background-color: red;
            }
            #box2{
        	    grid-area: box2;
                background-color: blue;
            }
            #box3{
        	    grid-area: box3;
                background-color: green;
            }
            #box4{
        	    grid-area: box4;
                background-color: yellow;
            }
            #box5{
        	    grid-area: box5;
                background-color: orange;
            }
        </style>
    ...
    <body>
        <div id="container">
            <div class="box" id="box1">box1</div>
            <div class="box" id="box2">box2</div>
            <div class="box" id="box3">box3</div>
            <div class="box" id="box4">box4</div>
            <div class="box" id="box5">box5</div>
        </div>
    </body>
    ...
    ```
##### `row-gap`
* Specifies the gap between the rows in a flexbox or grid layout.
* It has two values:
    1. length
    2. `normal`     ***DEFAULT***
        * Specifies a normal gap between the rows.
##### `column-gap`
* It likes `row-gap` but between the columns.
##### `gap`
* It's a shorthand property for `row-gap` and `column-gap` properties.
* syntax:   `gap: row column;`