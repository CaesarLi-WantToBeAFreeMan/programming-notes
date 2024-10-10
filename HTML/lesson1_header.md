### Date: October 8, 2024
### Title: Lesson01: Header
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### `<!DOCTYPE html>`
This command tells browser that this website is an HTML5 document.

All HTML documents must start with a `<!DOCTYPE>` declaration.

##### `<html></html>`
This element represents the root of an HTML document.

Usually, We need to add lang attribute into the tag.

e.g.

`html lang = "en"></html>`

tells the browser this is an English website.

##### `<head></head>`
This element is a container for metadata (data about data) and others.

Usually, it contains these:
* `<title></title>` tag

    tells browser what's the title of the website.
* `<style></style>` tag

    defines an inline CSS code block.
* `<link>` tag

    provides a link for the website.

    Here are some examples:
    1. link to an external CSS file:
        * `<link rel = "stylesheet" href = "locationOfACSSFile">`
    2. link to an icon:
        * `<link rel = "icon" href = "locationOfAnIconFile" type = "image/typeOfTheIcon">`
* `<meta></meta>` tag

    Defines metadata about the HTML document.

    Here are some examples:
    1. set character set to UTF-8:
        * `<meta charset = "UTF-8">`
    2. add a description about the website:
        * `<meta name = "description" content = "text">`
    3. add some keywords about the website:
        * `<meta name = "keywords" content = "keyword, keyword1...">`
    4. add an author about the website:
        * `<meta name = "author" content = "authorName">`
    5. set website width to the device's width and initial scale percentage to 100%:
        * `<meta name = "viewport" content = "width=device-width, initial-scale=1.0">`
* `<base></base>` tag

    specifies the base URL and target for all relative URLs in a document.

    example:
    1. set www.home.com as root, and set all links will open in a new tab:
        * `<base href = "https://www.home.com" target = "_blank">`

    **ALL VALUES OF `target` ATTRIBUTE:**
    1. `_blank`:
        opens in a new tab.
    2. `_self`:  
        opens in this website.
    3. `_parent`:
        opens in the immediate parent frame of the current frame.
    4. `_top`:
        opens in the topmost frame.
* `<script></script>` tag

    Adds an inline JavaScript code block or link to an external JavaScript file.

    example:
    1. link to an external JavaScript file:
        * `<script src = "locationOfTheExternalFile"></script>`

        **NOTICE**

            Usually, we place the `<script></script>` tag at the end of <body></body> element.
            
            Because, we want browser load something within <body></body> element first, then execute something within the tag.
* `<noscript></noscript>` tag

    Defines an alternate content to be displayed to users that have disabled script in their browser or have a browser that doesn't support script.

    example:
    *   ```
        <script src = "location"></script> <noscript>Sorry, your browser doesn't support script or you disabled script</noscript>
        ```

##### `<!--comment--->`
This tag is used to add a single-line or multi-line comment.

##### What's Elements, Tags and Attributes
* elements

    A basic unit that defines the structure and content of a webpage.
    
    Each HTML elements typically include a start tag, content, an end tag (although some are sekf-closing).

    example:
    ```
    <title>This is a title example</title>
       |            |                |
    start tag    content           end tag

    <meta charset = "UTF-8">
            |
       self-closing tag
* tags

    Defines the start and end of an element. Tags are enclosed in angle brackets (<>).
    
    Tags are what the browser reads to identify and display each HTML element.
    
    * start tag:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`<name>`
    * end tag:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`</name>`
    * self-closing tag:&nbsp;&nbsp;&nbsp;`<name>`
* attributes

    Provides additional information about an element, usually modifying its default behavior or appearance.
    
    Attributes are always specified in the opening tag and consist of a name and a value pair.

    example:
    ```
    <link rel = "stylesheet" href = "location">
           |        |         |         |
         name     value     name      value
    ```
##### properties 
* case non-sensitive

    `<HTML>`, `<html>`, `<HtMl>` all OK.
* ingore extra spaces

    HTML ignores extra spaces in all elements except `<pre></pre>` element.