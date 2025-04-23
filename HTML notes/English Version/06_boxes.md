# Title: 06 Boxes

# Author: Caesar James LEE(CJL)

## Box Types
* There are three types of boxes
    1. `block`
    2. `inline`
    3. `inline-block`
* Define how elements behave in the layout
* Every element is rendered as a rectangular box in the browser

## `block`

* Always start on a new line - browsers usually add space (`margin`, **watch CSS note**) above and below
* Take up the full width of its parent container by default
* Elements
    * text
        1. `<h1></h1>` to `<h6></h6>`
        2. `<p></p>`
        3. `<pre></pre>`
        4. `<hr>`
        5. `<figcaption></figcaption>`
        6. `<noscript></noscript>`
        7. `<blockquote></blockquote>`
        8. `<details></details>`
        9. `<summary></summary>`

    * containers
        1. `<header></header>`
        2. `<nav></nav>`
        3. `<main></main>`
        4. `<div></div>`
        5. `<article></article>`
        6. `<section></section>`
        7. `<aside></aside>`
        8. `<fieldset></fieldset>`
        9. `<figure></figure>`
        10. `<footer></footer>`
        11. `<address></address>`

    * lists
        1. `<ul></ul>`
        2. `<ol></ol>`
        3. `<li></li>`
        4. `<dl></dl>`
        5. `<dt></dt>`
        6. `<dd></dd>`

    * tables
        1. `<table></table>`
        2. `<caption></caption>`
        3. `<colgroup></colgroup>`

    * forms
        1. `<form></form>`

    * media
        1. `<video></video>`
        2. `<canvas></canvas>`
        3. `<audio></audio>`

## `inline`

* Doesn't start on a new line
* Only take up as much width as content needs
* Elements
    * text
        1. `<a></a>`
        2. `<strong></strong>`
        3. `<b></b>`
        4. `<em></em>`
        5. `<i></i>`
        6. `<ins></ins>`
        7. `<u></u>`
        8. `<mark></mark>`
        9. `<del></del>`
        10. `<s></s>`
        11. `<small></small>`
        12. `<sup></sup>`
        13. `<sub></sub>`
        14. `<abbr></abbr>`
        15. `<cite></cite>`
        16. `<dfn></dfn>`
        17. `<q></q>`
        18. `<bdi></bdi>`
        19. `<bdo></bdo>`
        20. `<code></code>`
        21. `<kbd></kbd>`
        22. `<samp></samp>`
        23. `<span></span>`
        24. `<time></time>`
        25. `<var></var>`
        26. `<ruby></ruby>`
        27. `<rp></rp>`
        28. `<rt></rt>`
        29. `<br>`
        30. `<wbr>`

    * forms
        1. `<label>`
        2. `<output></output>`
        
    * Other
        1. `<progress></progress>`
        2. `<meter></meter>`
        3. `<script></script>`

## `inline-block`

* Behave like an inline element, but you can set `width`, `height`, `padding`, and `margin`
* Elements
    * forms (often look like `inline` but behave more like `inline-block`)
        1. `<input>`
        2. `<textarea></textarea>`
        3. `<select></select>`
    
    * media
        1. `<img>`
    
    * other
        1. `<button></button>`
        2. `<iframe></iframe>`

## `block` vs `inline` vs `inline-block`

| feature                           | `block`           | `inline`                   | `inline-block`                       |
| :-------------------------------: | :---------------: | :------------------------: | :----------------------------------: |
| Start on a new line               | ✅                | ❌                         | ❌                                 |
| Take full width                   | ✅                | ❌ (content width)         | ❌ (content width)                 |
| Can set `width` and `height`      | ✅                | ❌                         | ✅                                 |
| Allow `padding` and `margin`      | ✅                | ❌ (only `left`, `right`)  | ✅                                 |
| Participate in text flow          | ❌                | ✅                         | ✅                                 |
| Stack behavior                    | Stack vertically  | Flow inline with text       | Flow inline but behave like `block` |
| Can contain `block` elements      | ✅                | ❌                         | ❌                                 |
| Can contain `inline` elements     | ✅                | ✅                         | ✅                                 |

## `<div>` - Generic Block Container

* Generic `block` container with **no semantic meaning**
* Used to group and structure content
* Commonly used for **layout**

## `<span>` - Generic Inline Container

* Generic **inline** container with **no specific meaning**
* Used to wrap parts of text for styling or scripting
* Common for highlighting or styling parts of text

## `<header>` - Intro Section

* Represent **introductory content** or a group of **navigational links**
* Cannot be inside `<footer>`, `<address>` or another `<header>`

## `<nav>` - Navigation

* Used for **major blocks** of navigation links
* Represent site or page navigation

## `<main>` - Main Content

* Contain the central content of a document
* Should not include **repeated** elements like **sidebars**, **headers**, **footers**, etc
* Only one `<main>` per document
* Cannot be inside `<header>`, `<footer>`, `<article>`, `<aside>`, or `<nav>`

## `<section>` - Document Section

* Define a thematic grouping of content
* Often used to divide up `<main>` or `<article>`

## `<article>` - Self-contained Content

* Represent **independent**, **reusable** content like **blog posts** or **news articles**
* Can be syndicated
* No visual difference in browser rendering

## `<aside>` - Sidebar Content

* Contain content related to the **surrounding content**
* Typically used for **sidebars**, **pull quotes**, **ads**, or **extra info**

## `<address>` - Contact Information

* Used for contact info of the document or article author/owner
* Usually rendered in *italic*

## `<figure>` - Media Figure

* Group **self-contained** media content like **images**, **diagrams**, or **code snippets**
* Can be paired with `<figcaption>`

## `<figcaption>` - Figure Caption

* Provide a caption for a `<figure>`
* Can be placed at the **start** or **end** of the `<figure>`

## `<footer>` - Footer Section

* Represent a footer for its nearest section or the whole page
* Typically contains **copyright**, **contact**, or **site info**
* You can have multiple `<footer>` elements per page