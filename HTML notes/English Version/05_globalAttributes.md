# Title: 05 Global Attributes

# Author: Caesar James LEE(CJL)

## Global Attributes

* Can be used on any HTML element
* Help you control behavior, accessibility, styling, and JavaScript interaction

## `accesskey` - Shortcut Key

* Define a keyboard shortcut (a single character, e.g. a letter or a digit) for focusing or activating an element
* To avoid **conflict** with other other key standards in the browser, browsers ask you press other key(s) together
* Browser shortcut table

| Browser           | shortcut key(s)               |
| :---------------: | :---------------------------: |
| Google Chrome     | `alt` + accesskey             |
| Microsoft Edge    | `alt` + accesskey             |
| Apple Safari      | `alt` + accesskey             |
| Opera 15+         | `alt` + accesskey             |
| Opera prior       | `shift` + `esc` + accesskey   |
| Mozilla Firefox   | `alt` + `shift` + accesskey   |

* Advised not to use `accesskey`, because
    1. It's difficult to adapt accesskeys to all international languages like Chinese
    2. The `accesskey` value may not present on all keyboards
* Example
```html
    <a href = "https://www.google.com/" target = "_blank" accesskey = "g">visit Google</a>
```