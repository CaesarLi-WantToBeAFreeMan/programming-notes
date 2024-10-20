### Date: October 12, 2024
### Title: Lesson01: Link CSS
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### inline CSS 
* This method involves adding CSS styles directly to individual HTML elements using the `style` attribute.

example:
    `<h1 style = "color: cyan">This Is A Title</h1>`
##### internal CSS
* This method uses a `<style>` element within the `<head>` section of the HTML document to define style for the entire page.
* It's useful for styling a single page without creating a separate CSS file, but can become cumbersome for larger projects.

example:
```
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-color: black;
                color: white;
            }
            #title{
                text-size: 50px;
                font-weight: bolder;
                font-family: Arial;
            }
        </style>
    </head>

    <body>
        <h1 id = "title">This is a title</h1>
    </body>
</html>
```
##### external CSS
This method involves linking to an external CSS file using the `<link>` tag in the `<head>` section of the HTML document.

It's ideal for larger projects with multiple pages, as it promotes separation of content and presentation, making maintainance easier.
