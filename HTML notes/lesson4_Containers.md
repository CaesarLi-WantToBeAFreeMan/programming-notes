### Date: October 8, 2024
### Title: Lesson04: Containers
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### `<header></header>`
Represents a container for introductory content or a set of navigational links.
##### `<main></main>`
Specifie the main content of a document.
##### `<footer></footer>`
Designs a footer for a document or section.
##### `<article></article>`
Specifies independent, self-contained content.

An article should make sense on its own and it should be possible to distribute it independently from the rest of the site.

Potential sources for the `<article>` element.
1. forum (a situation or meeting in which people can talk about a problem or matter especially of public interest) post
2. Blog post
3. News story
##### `<aside></aside>`
Designs some content aside from the connent it is placed in.

The aside content should be indirectly related to the surrounding content.

The `<aside>` content is often placed as a sidebar in a document.
##### `<section></section>`
Defines a section in a document.
##### `<details></details>`
Specifies additional details that the user can open and close on demand(requirement).

Often used to create an interactive widget that the user can open and close.

By default, the widget is closed. When open, it expends, and display content within.

Any sort of content can be put inside the `<details>` tag.

***HIGHLY RECOMMENDED***

`<summary></summary>` is used in conjunction with (combined with) `<details>` to specify a visible heading for the details.

example:
```
<details>
    <summary>Caesar's Favorite Singers & Grounps</summary>
    <ul>
        <li>Namewee Huang</li>
        <li>(G)I-DLE</li>
        <li>Taylor Swift</li>
        <li>Olivia Rogrigo</li>
        <li>AESPA</li>
        <li>TWICE</li>
    </ul>
</details>
```
##### `<address></address>`
Defines the contact information for the author/owner of a document or an article.

The contact information can be an email address, URL, physical address, phone number, social media handle, etc.

The text in the `<address>` element usually renders in italic, and browsers will add a link break before and after the `<address>` element.
##### `<template></template>`
A container to hold some HTML content hidden from the user when the page loads.