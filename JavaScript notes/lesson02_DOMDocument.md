### Date: October 22, 2024
### Title: Lesson02:  DOM Document
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: From Beginner to Senior
### Website:  [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI chatGPT

##### DOM document
* the `document` object represents your web page.
* If you want to access any element in an `HTML` page, you always start with accessing the `document` object.
##### finding an `HTML` element.
1. `document.getElementById(idName);`
    * finds an element by element id.
    * example:
        * `HTML`:
            `<p id = "paragraph">test</p>`
        * `JavaScript`:
            `const paragraph = document.getElementById("paragraph");`
2. `document.getElementByTagName(tagName);`
    * finds an element by tag name.
    * example:
        * `HTML`:
            `<p>test</p>`
        * `JavaScript`:
            `const paragraph = document.getElementByTagName("p");`
3. `document.getElementByClassName(className);`
    * finds an element by class name.
    * example:
        * `HTML`:
            `<p class = "paragraph">test</p>`
        * `JavaScript`:
            `const paragraph = document.getElementByClassName("paragraph");`
##### changing an `HTML` element
1. `element.innerHTML = value;`
    * changes an inner content of an `HTML` element.
    * example:
        * `HTML`:
            `<p id = "paragraph"></p>`
        * `JavaScript`:
            `document.getElementById(paragraph).innerHTML = "test text";`
2. `element.attribute = value;`
    * changes the attribute value of an `HTML` element.
    * example:
        * `HTML`:
            `<p id = "paragraph">test</p>`
        * `JavaScript`:
            `document.getElementById("paragraph").id = "paragraphId";`
3. `element.setAttribute(attributeName, attributeValue);`
    * changes the attribute value of an `HTML` element.
    * It likes `element.attribute = value;`.
4. `element.style.property = value;`
    * changes the property value of an `HTML` element.
    * example:
        * `HTML`:
            `<p id = "para">test</p>`
        * `JavaScript`:
            ```
                const para = document.getElementById("para");
                para.style.color = "white";
                para.style.fontSize = "30px";
                para.style.fontFamily = "Arial";
                para.style.textAlign = "center";
            ```
##### creating an `HTML` element
1. `document.createElement(tagName);`
    * Creates an `HTML` element.
2. `document.appendChild(childElement);`
    * Adds an `HTML` element.
* example:
    ```
    ...
        <body id = "body">
        </body>
    
        <script>
            const newParagraph = document.createElement("p");
            newParagraph.innerHTML = "This element was made by JavaScript";
            document.getElementById("body").appendChild(newParagraph);
        </script>
    ...
    ```

##### deleting or replacing an `HTML` element
1. `document.removeChild(parentElement);`
    * Removes an `HTML` element.
    * example:
        ```
        ...
            <body id = "body">
                <p id = "removeMe">This paragraph will be removed</p>
            </body>
    
            <script>
    	        document.getElementById("body").removeChild(document.getElementById("removeMe"));
            </script>
        ...
        ```
2. `document.replaceChild(oldElement, newElement);`
    * Replaces an `HTML` element.
    * example:
        ```
        ...
            <body id = "body">
                <p id = "replaceMe">This paragraph will be replaced</p>
            </body>
    
            <script>
    	        const newElement = document.createElement("p");
                newElement.innerHTML = "This is a new paragraph";
                document.getElementById("body").replaceChild(newElement, document.getElementById("replaceMe"));
            </script>
        ...
        ```
##### other finding `HTML` object functions
1. `document.anchors`
    * Returns all `<a></a>` elements that have a `name` attribute.
2. `document.body`
    * Returns the `<body></body>` element.
3. `document.cookie`
    * Returns the document's cookie (we'll talk about it later).
4. `document.doctype`
    * Returns the document's `doctype`
    * For `<!DOCTYPE html>`, it'll return `html`.
5. `document.documentElement`
    * Returns the `<html></html>` element.
6. `document.documentURI`
    * Returns the URI of the document.
7. `document.domain`
    * Returns the domain name of the document server.
8. `document.embeds`
    * Returns all `<embed></embed>` elements.
9.  `document.forms`
    * Returns all `<form></form>` elements.
10. `document.head`
    * Returns the `<head></head>` element.
11. `document.images`
    * Returns all `<img></img>` element.
12. `document.inputEncoding`
    * Returns the document's encoding (`charset` or character set).
13. `document.links`
    * Returns all `<area></area>` and `<a></a>` elements that have a `href` attribute.
14. `document.scripts`
    * Returns all `<script></script>` elements.
15. `document.title`
    * Returns the `<title></title>` element.
16. `document.URL`
    * Returns the complete URL of the document.
