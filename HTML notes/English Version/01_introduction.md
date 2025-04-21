# Title: 01 Introduction

# Author: Caesar James LEE(CJL)

## What's `HTML`

* `HyperText Markup Language` is the standard markup language for document designed to be displayed in a web browser
* Defines the content and structure of web content
* Describes the structure of a web page semantically and originally include multiple cues for its appearance

## `HTML`'s History

1. 1989 - **Idea of the Web**
    * `Tim Berners-Lee` (at CERN) proposed a system to share documents using hypertext
2. 1991 - **`HTML 1.0`**
    * First version of HTML was created by Tim Berners-Lee
    * Very basic: headings, paragraphs, lists, and links
3. 1995 - **`HTML 2.0`**
    * Standardized by the `IETF` (`Internet Engineering Task Force`)
    * Included basic form elements and better structure
4. 1997 - **`HTML 3.2`**
    * Published by the `W3C` (`World Wide Web Consortium`)
    * Added tables, scripting (like `JavaScript`), and styles (via `<style>`)
5. 1999 - **`HTML 4.01`**
    * Widely adopted
    * Introduced three types: `Strict`, `Transitional`, and `Frameset`
    * Improved structure, added `CSS` support
6. 2008 - **`HTML5` Draft Starts**
    * `W3C` and `WHATWG` (`Web Hypertext Application Technology Working Group) started working on a modern, multimedia-friendly HTML
7. 2014 - **`HTML5` Officially Released**
    * Major update: audio, video, canvas, SVG, local storage, semantic tags (`<article>`, `<section>`, etc.)
    * Made HTML more powerful for apps and rich content

## Basic Concepts

### 1. Elements
* The complete structure that defines content and behavior on a webpage
* Defines by a start tag, a content, and an end tag, or a self-closing tag
* Example:
    ```html
        <!--an element that defined by a start tag, a content, and an end tag-->
        <h1>heading</h1>
        <!--an element that defined by a self-closing tag-->
        <hr>
        <!--an element that defines by a self-closing tag, and a content-->
        <img src = "example.png" alt = "example image" title = "example image">
    ```

### 2. Tags
* The "markup" part of HTML – they tell the browser what kind of element you're creating
* These are two different types:
    1. non-self-closing tags
        * start tag
            * open the element
            * example
                ```html
                    <div>
                ```
        * end tag
            * close the element
            * example
                ```html
                    </div>
                ```
    2. self-closing tags
        * open and close the element
        * example
            ```html
                <!--HTML5 style-->
                <hr>
                <!--older style-->
                <hr />
            ```
* Example
    * non-self-closing
    ```
        <div>an example container</div> --- element
          |           |             |
          |           |             |
          |           |             |
        start tag   content     close tag
    ```
    * self-closing
    ```
        <hr> --- element
         |
         |
         |
        self-closing tag
    ```

### 3. Attributes
* Used inside a start tag or self-closing tag to define properties or behavior of that element
* They are always written:
    ```html
        name = "value"
    ```
* Example
    ```html
        <a href = "https://www.google.com" target = "_blank" title = "go to Google">
            visit Google
        </a>
    ```
    ```
        <a href = "https://www.google.com" target = "_blank" title = "go to Google"> --- element
         |                                   |          |
         |                                   |          |
         |                                   |          |
        start tag                          name       value
            visit Google --- content
        </a> --- close tag
    ```

## The First HTML Page

* HTML code
```html
    <!DOCTYPE html>
    <html>
        <head>
            <title>The First HTML Page</title>
        </head>
        <body>
            <h1>Hello World!</h1>
        </body>
    </html>
```
* Explanation
    1. `<!DOCTYPE html>`
        * Declare this is an `HTML5` document
    2. `<html></html>`
        * A root element of the document
    3. `<head></head>`
        * Contains `meta information` (information about information), and **which won't display on the page**
        * Usually, we can specific a title, a favicon, an author, a description, a data set, etc about the document
    4. `<title>The First HTML Page</title>`
        * Specific the title of this document is `The First HTML Page`
    5. `<body></body>`
        * Contains visible page content
    6. `<h1>Hello World!</h1>`
        * Display a biggest heading on the page