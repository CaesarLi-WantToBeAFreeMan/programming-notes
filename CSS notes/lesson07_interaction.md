### Date: October 16, 2024
### Title: Lesson07: Interaction
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### responsive web design
* Makes your web page look good on all devices.
* Uses only HTML and CSS.
* isn't a program or JavaScript.
* Web pages can be viewed using many different devices: desktops, tablets, and phones.
* Your web page should look look, and easy to use, regardless of the device.
* Web pages should not leave out information to fit smaller devices, but rather adapt its content to fit any device.
* It's called `responsive web design` when you use CSS and HTML to resize, hide, shrink, enlarge, or move the content to make it look good on any screen.
##### viewport
* It's the user's visible area of a web page.
* The viewport varies with the device, and will be smaller on a mobile phone than a computer screen.
* Before tablets and mobile phones, web pages were designed only for computer screens, and it was common for web pages to have a static design and a fixed size.
* Then, when we started surfing the internet using tablets and mobile phones, fixed size web pages were too large to fit the viewport.
* To fix this, browsers on those devices scaled down the entire web page to fit the screen. This wasn't perfect but a quick fix.
##### `<meta name = "viewport" content = "width=device-width, initial-scale=1.0">`
* This gives the browser instructions on how to control the page's dimensions and scaling.
* `width=device-width` sets the width of the page to follow the screen-width of the device.
* `initial-scale=1.0` sets the initial zoom level when the page is first loaded by the browser.
##### size content to the viewport rules
1. DO NOT USE LARGE FIXED WIDTH ELEMENTS
    * For example, if an image is displayed at a width wider than the viewport it can cause the viewport to scroll horizontally.
    * Remember to adjust this content to fit within the width of the viewport.
2. DO NOT LET THE CONTENT RELY ON A PARTICULAR VIEWPORT WIDTH TO READER WELL.
    * Since screen dimensions and width in CSS pixels vary widely between devices, content should not rely on a particular viewport width to render well.
3. USE CSS MEDIA QUERIES TO APPLY DIFFERENT STYLING FOR SMALL AND LARGE SCREENS
    * Setting large absolute CSS widths for page elements will cause the element to be too wide for the viewport on a small device.
    * Instead, consider useing relative width values, such as `width: 100%`.
    * Also, be careful of using large absolute positioning values.
    * It may cause the element to fall outside the viewport on small devices.
##### grid-view
* Many web pages are based on a grid-view, which means that the page is divided into columns.
* Using a grid-view is very useful when designing a web pages and makes it easier to place elements on the page.
* A responsive grid-view often has 12 columns, and has a total width of `100%`, and will shrink and expand as you resize the browser window.
##### building a responsive grid-view steps:
1. Ensuring that all HTML elements have the `box-sizing: border-box` property. This makes sure that the padding and border are included in the total width and height of the elements.
2. Setting the `width` of each element. Each column has `8.33% width` (100% / 12 = 8.33%).
    * The following are the width values for different columns:
        1. `.column1{   width: 8.33%;}`
        2. `.column2{   width: 16.66%;}`
        3. `.column3{   width: 25%;}`
        4. `.column4{   width: 33.33%;}`
        5. `.column5{   width: 41.66%;}`
        6. `.column6{   width: 50%;}`
        7. `.column7{   width: 58.33%;}`
        8. `.column8{   width: 66.66%;}`
        9. `.column9{   width: 75%;}`
        10. `.column10{ width: 83.33%;}`
        11. `.column11{ width: 91.66%;}`
        12. `.column12{ width: 100%;}`
3. Setting the `padding`, `border` and `margin` of each element.
4. To prevent columns inside a row are all floating to the left and other elements will be placed as if the columns don't exist, we'll add `clear: both` to clear the flow.
##### media query
* Media query is a CSS technique introduced in `CSS3`.
* It uses the `@media` rule to include a block of CSS properties only if a certain codition is true.
##### `breakpoint`
* we can add a breakpoint where certain parts of the design will behace differently on each side of the breakpoint.
* example:
    ```
    ...
	    <head>
		    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		    <style>
			    *{
				    box-sizing: border-box;
				    background-color: black;
				    color: white;
          	    }

                [class *= "col-"]{
          	        float: left;
         	        padding: 15px;
                }

                #header{
                    background-color: purple;
                    padding: 12px;
                    margin-bottom: 12px;
                }

                #title{
	                font-family: "Times New Roman";
                    font-size: 50px;
                    padding: 12px;
                    text-align: center;
                    background-color: purple;
                    color: orange;
                }

                #navigator ul{
                    list-style-type: none;
                    margin: 0;
                    padding: 0;
                }

                #navigator li{
                    padding: 12px;
                    margin-bottom: 7px;
                    background-color: navy;
                    color: color;
                    font-family: Verdana, Arial;
                    text-align: center;
                }

                #navigator li:hover{
	                cursor: pointer;
                    background-color: cyan;
                    color: red;
                    transition-duration: 0.5s;
                }

                /*for mobile phones*/
                [class *= "col-"]{
                    width: 100%;
                }

                /*for desktops, laptops and tablets*/
                @media only screen and (min-width: 768px){
                    .col-1{
                        width: 8.33%;
                    }
                
                    .col-2{
                        width: 16.66%;
                    }
                
                    .col-3{
                        width: 25%;
                    }
                
                    .col-4{
                        width: 33.33%;
                    }
                
                    .col-5{
                        width: 41.66%;
                    }
                
                    .col-6{
                        width: 50%;
                    }
                
                    .col-7{
                        width: 58.33%;
                    }
                
                    .col-8{
                        width: 66.66%;
                    }
                
                    .col-9{
                        width: 75%;
                    }
                
                    .col-10{
                        width: 83.33%;
                    }
                
                    .col-11{
                        width: 91.66%;
                    }
                
                    .col-12{
                        width: 100%;
                    }
                }
            </style>
        </head>

        <body>
            <header id = "header">
                <h1 id = "title">Test</h1>
            </header>

            <nav id = "navigator">
                <ul>
    	            <li>Navigation1</li>
    	            <li>Navigation2</li>
    	            <li>Navigation3</li>
    	            <li>Navigation4</li>
                </ul>
            </nav>
        </body>
    ...
    ```
##### always design for mobile first
* `Mobile First` means designing for mobile before designing for desktop or any other device. This will make the page display faster on small devices.
##### typical device breakpoint
1. extra small device (phones, 600px and down)
    * `@media only screen and (max-width: 600px)`
2. small device (portrait tablets and large phones, 600px and up)
    * `@media only screen and (min-width: 600px)`
3. medium device (landscape tablets, 768px and up)
    * `@media only screen and (min-width: 768px)`
4. large device (laptops and desktops, 992px and up)
    * `@media only screen and (min-width: 992px)`
5. extra large device (large laptops and desktops, 1200px and up)
    * `@media only screen and (min-width: 1200px)`
##### orientation
* Media query can also be used to change layout of a paper depending on the orientation of the browser.
* `@media only screen and (orientation: landscape || portrait)`
##### responsive images
* If you set `width: 100%; height: auto;`, the image will be responsive and scale up and down.
* the image can be scaled up to be larger than its original size, we'll be to used the `max-width` property instead:
    `max-width: 100%; height: auto;`
##### responsive background image
* There's three different ways to resize and scale.
    1. `background-size: contain;`
        * The background image will scale, and try to fit the content area.
        * However, the image will **keep its aspect ratio** (the proportinal relationship between the image's width and height)
    2. `background-size: 100% 100%;`
        * The background image will stretch to cover the whole content area.
    3. `background-size: cover;`
        * The background image will scale to cover the entire content area.
        * Notice that the `cover` value keeps the aspect ratio, and **some part of the background image may be clipped**.
##### different images for different devices
* A large image can be perfect for a big computer screen, but useless on a small device.
* To reduce load, or for any other reasons, you can use media queries to display different images on different devices.
* example:
    ```
    /*for smaller screen devices*/
    body{
        background-image: url("images/smallBackgroundImage.png");
    }

    /*for bigger than 400px screen devices*/
    @media only screen and (min-width: 400px){
        body{
            background-image: url("images/bigBackgroundImage.png");
        }
    }
    ```
* And you can use `min-device-width`, instead of `min-width`, which checks the device width, instead of the browser width. Then the image will not change when you resize the browser window.
##### `<picture></picture>`
* `<picture></picture>` element gives web developers more flexibility in specifying image resources.
* example:
    ```
    <picture>
        <source srcset = "images/smallImage.png" media = "(max-width: 400px)">
        <source srcset = "images/image.png">
        <!--if your browser doesn't support picture element-->
        <img src = "images/image.png" alt = "a image about image">
    </picture>
    ```
##### responsive videos
* It's like photos.
* You can use `width: 100%; height: auto;`, `max-width: 100%; height: auto;` as well.
##### free responsive web design frameworks
1. [W3.CSS](https://www.w3schools.com/w3css/default.asp)
    * `W3.CSS` is made by `W3Schools`.
    * It's a quality alternative to `Bootstrap`.
    * It's smaller, faster and easier to use.
    * It's a modern responsive, mobile first CSS framework.
    * It provides equality for all browsers: `Google Chrome`, `Mozilla Firefox`, `Microsoft Edge`, `Microsoft Internet Explorer`, `Apple Safari` and `Opera`.
    * It Provides equality for all devices: Desktops, Laptops, Tablets and Mobiles.
    * It's standard CSS only (No jQuery or JavaScript library).
2. [Bootstrap](https://www.w3schools.com/bootstrap/bootstrap_ver.asp)
    * It's made by Mark Otto and Jacob Thornton (employees from Twitter (or X now)).
    * It's the world's most famous free CSS framework.