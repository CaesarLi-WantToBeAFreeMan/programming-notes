### Date: October 12, 2024
### Title: Lesson02: Basic
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### syntax
```
#title      {color:         red;}
   |           |             |
selector   property         value
```
The selector points the HTML element you want to style.

The declaration block contains one or more declarations separated by semicolons.

Each declaration includes a CSS property name and a value, separated by colon.

Multiple CSS declarations are separated by semicolons, and declaration blocks are surrounded by curly braces.
##### `selectors`
CSS has five selectors:
1. `simple selector`
    * Selecting elements based on name, id, class.
    * example
        1. `name`:
            ```
            h1{...}
            ```
        2. `id`:
            ```
            #title{...}
            ```
        3. `class`:
            ```
            .text{...}
            ```
2. `combinator selector`
    * Selecting elements based on a specific relationship between them.
    * It has four different combinators:
        1. ` ` Descendant combinator
            * Selecting elements inside and inside the inside element.
            * example:
                ```
                ...
                    <style>
                        body p{
                            color: orange;
                        }
                    </style>
                ...
                <body>
                    <!--it was styled-->
                    <p>text</p>
                    <div>
                        <!--it was styled as well-->
                        <p>text1</p>
                    </div>
                </body>
                ```
        2. `>` Child combinator
            * Selecting elements inside, but cann't style inside the inside element.
            * example:
            ```
            ...
                <style>
                    body>p{
                        color: orange;
                    }
                </style>
            ...
            <body>
                <!--it was styled-->
                <p>text</p>
                <div>
                    <!--it was not styled-->
                    <p>text1</p>
                </div>
            </body>
            ```
        3. `+` Next sibling combinator
            * Selecting an element that is directly after another element.
            * example:
            ```
            ...
                <style>
                    div+p{
                        color: orange;
                    }
                </style>
            ...
            <body>
                <!--it was not styled-->
                <p>text</p>
                <div>
                    <!--it was not styled-->
                    <p>text1</p>
                </div>
                <!--it was styled-->
                <p>text2</p>
                <!--it was not styled-->
                <p>text3</p>
            </body>
            ```
        4. `~` Subsequent-sibling combinator
            * Selecting all elements at the same level.
            * emaple:
            ```
            ...
                <style>
                    div-p{
                        color: orange;
                    }
                </style>
            ...
            <body>
                <!--it was not styled-->
                <p>text</p>
                <div>
                    <!--it was not styled-->
                    <p>text1</p>
                </div>
                <!--it was styled-->
                <p>text2</p>
                <span>
                    <!--it was not styled-->
                    <p>text3</p>
                </span>
                <!--it was styled-->
                <p>text4</p>
            </body>
            ```
3. `pseudo-class selector`
    * It has four ways:
        1. `link`
            * unvisited link
            * ***ONLY `<a></a>`***
        2. `visited`
            * visited link
            * ***ONLY `<a></a>`***
        3. `hover`
            * mouse over
        4. `active`
            * selected
    * example:
    ```
    ...
        <style>
            div{
                background-color: cyan;
                color: brown;
            }
            div:hover{
                background-color: pink;
                color: forestgreen;
            }
            div:active{
            	background-color: orange;
                color: navy;
            }
        </style>
    ...
    <body>
        <div>
            Please hover over or click
        </div>
    </body>
    ...
    ```
4. `pseudo-element selector`
    * It has six ways:
        1. `first-letter`
            * Selecting the first letter.
        2. `first-line`
            * Selecting the first line.
        3. `before`
            * Inserting some content before the content of an element.
        4. `after`
            * Inserting some content after the content of an element.
        5. `marker`
            * Selecting markers of list items.
        6. `selection`
            * Selecting the portion of an element that is selected by a user.
    * example:
    ```
    ...
        <style>
            ::selection{
            	color: navy;
                background-color: forestgreen;
            }
            div p::first-letter{
            	font-size: 50px;
                color: red;
            }
            div p::first-line{
            	font-size: 39px;
                color: blue;
            }
            .unordered-list::marker{
             	font-size: 39px;
                color: orange;
                font-weight: bolder;
            }
          	div::before{
            	content: "start";
                color: red;
            }
            div::after{
             	content: "end";
                color: blue;
            }
        </style>
    ...
    <body>
    	<div>
        	<p>This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph. This is a test paragraph.</p>
    	</div>
        <ul>
        	<li class="unordered-list">test</li>
            <li class="unordered-list">test</li>
        </ul>
    </body>
    ...
    ```
5. `attribute selector`
    * It has seven ways:
        1. `attribute`
            * Selecting elements with a specified attribute.
        2. `attribute = "value"`
            * Selecting elements with a specifies attribute and value.
        3. `attribute ~= "value"`
            * Selecting elements with an attribute value containing a specified word.
        4. `attribute |= "value"`
            * Slecting elements with the attribute, whose value can be exactly the specified value, or the specified value followed by a pyphen (-).
        5. `attribute ^= "value"`
            * Selecting elements with the attribute, whose value starts with the specified value.
        6. `attribute $= "value"`
            * Selecting elements with the attribute, whose value ends with the specified value.
        7. `attribute *= "value"`
            * Selecting elements whose attribute value contains a specified value (can be a part of a word).
    * example:
    ```
    ...
    <style>
        	body{
                background-color: black;
                color: white;
                font-size: 21px;
                font-weight: "100";
                font-family: Verdana;
                text-align: left;
                text-decoration: none;
            }
            div[id]{
             	background-color: navy;
            }
            div[id = "container1"]{
             	color: yellow;
            }
            div[id ~= "container"]{
             	font-weight: bolder;
            }
            div[id |= "contain"]{
             	font-family: Luminari;
            }
            div[id ^= "con"]{
             	text-align: center;
            }
            div[id $= "ner"]{
             	text-decoration: underline;
            }
            div[id *= "container"]{
             	font-size: 30px;
            }
        </style>
    ...
    <body>
        <!--
            background-color: navy;
            font-weight: bolder;
            text-align: center;
            text-decoration: underline;
            font-size: 30px;
        -->
        <div id = "container">test 1</div>
        <!--
            background-color: navy;
            color: yellow;
            text-align: center;
            font-size: 30px;
        -->
        <div id = "container1">test 2</div>
        <!--
            background-color: navy;
            font-family: Luminari;
            text-align: center;
        -->
        <div id = "contain-er2">test 3</div>
        <!--
            background-color: navy;
            text-align: center;
            font-size: 30px;
        -->
        <div id = "container3">test 4</div>
        <!--
            background-color: navy;
            text-align: center;
        -->
        <div id = "con-tain-er4">test 5</div>
        <!--
            background-color: navy;
            text-align: center;
            font-size: 30px;
        -->
        <div id = "container5">test 6</div>
        <!--
            background-color: navy;
            text-align: center;
            font-size: 30px;
        -->
        <div id = "container6">test 7</div>
    </body>
    ...
    ```
##### comments
`/*a single line comment*/`
```
/*
    a
    multi-line
    comment
*/
```
##### priority of selectors
* from the highest to the lowest:
    1. `!important`
        * example:
        ```
        ...
            <style>
                p{
                    color: cyan !important;
                }
                p{
                    color: blue;
                }
            </style>
        ...
        <body>
            <!--color: cyan;-->
            <p>text</p>
        </body>
        ...
        ```
    2. inline style (1000)
    3. ID selectors (0100)
    4. class, pseudo-class and attribute selectors (0010)
    5. element and pseudo-element selectors (0001)
    6. if two or more rules have the same specificity, the last rule defined will take precedence.
##### units of length
* It has two gourps:
    1. Absolute Lengths
        1. `cm`
            * centimeters
        2. `mm`
            * millimeters
        3. `in`
            * inches
            * `1in` = `96px` = `72pt` = `6pc` = `2.54cm`
        4. `px`
            * pixels
            * `1px` = `1/96ch` = `0.026 458 333cm`
            * It's relative to viewing device.
            * For low-dpi device, `1px` is one device pixel (dot) of the display.
            * For printers and high resolution screens `1px` implies multiple device pixels.
        5. `pt`
            * points
            * `1pt` = `1/72in` = `0.035 277 777cm`
        6. `pc`
            * picas
            * `1pc` = `12pt` = `1/6in` = `0.423 333 333cm`
    2. Relative Lengths
        1. `em`
            * Relative to the `font-size` of the element.
            * `2em` means 2 times the size of the current font.
        2. `ex`
            * Relative to the x-height of the current font.
            * rarely used
        3. `ch`
            * Relative to the width of the zero ("0")
        4. `rem`
            * Relative to the `font-size` of the root element.
        5. `vw`
            * Relative to 1% of the width of the viewport.
            * viewport means the browser window size.
        6. `vh`
            * Relative to 1% of the height of the viewport.
        7. `vmin`
            * Relative to 1% of viewport's smaller dimension.
        8. `vmax`
            * Relative to 1% of viewport's larger dimension.
        9. percentage
            * Relative to the parent element.
##### select color ways
* Colors can be specified in different ways:
  1. color name
    * CSS supports 140 standard color names.
    * [color sheet](https://www.w3schools.com/cssref/css_colors.php)
  2. RGB value
    * An RGB color is specified with `rgb(RED, GREEN, BLUE)`;
    * Each parameter defines the intensity of the color as an integer [0, 255]
    * So you can pick 16,581,375 colors totally.
  3. RGBA value
  4. hexadecimal value
    * A hexadecimal color is specified with `#RRGGBB`
    * `RR` (red), GG (green) and BB (blue) are hexadecimal integers [00, FF].
    * In fact, it is RGB but in hexadecimal format.
  5.  `currentcolor`
    * Refers to the value of the color property of an element.