# Title: 02 Head

# Author: Caesar James LEE(CJL)

## `<title></title>` element

* A **non-self-closing** element
* Set the title of the document
* Must contain **text-only** content
* Display in the browser's title bar or in the page tab
* Very import for `SEO` (Search Engine Optimization), since search engines use it to rank pages in results
* ***NOTES***
    1. This element is **required** in every HTML document
    2. Only one `<title>` tag allowed per page
    3. Search Engines typically show **50-60** characters of the title, so keep it concise
* Example
    ```html
        <title>02 Head</title>
    ```

## `<meta>` element

* A **self-closing** tag
* Not related to `Meta Platforms, Inc` 😄️
* Provide metadata such as character encoding, author, description, keywords, and viewport settings

### 1. Character Encoding
* Specifies the document's character set as `UTF-8` – a universal standard for global characters
```html
    <meta charset = "UTF-8">
```

### 2. Keywords
* Help search engines understand what your page is about
```html
    <meta name = "keywords" content = "Caesar, HTML, programming, note, web">
```

### 3. Author
* Define the page's author
```html
    <meta name = "author" content = "Caesar James LEE">
```

### 4. Description
* Give a brief summary of your page, often shown in search engine results
```html
    <meta name = "description" content = "Caesar's HTML note 02 Head"
```

### 5. Viewport Settings
* Optimize your site for mobile devices
* Set the layout width to the device width
* Set initial zoom to 100%
* `viewport` is the visible area of a webpage on the user's screen
* **Crucial** for responsive design
```html
    <meta name = "viewport" content = "width = device-with, initial scale = 1.0">
```

### 6. Force `Microsoft Edge` in `IE`
* Instruct `Microsoft Internet Explorer` to use the `Microsoft Edge` rendering engine
```html
    <meta http-equiv = "X-UA-Compatible" content = "IE=edge">
```

### 7. Auto Refresh
* Reload the page every 30 seconds
```html
    <meta http-equiv = "refresh" content = "30">
```

## `<base>` Element

* A **self-closing** tag
* Set a **base URL** for all relative links in the page
* Useful for linking images, stylesheets, and scripts
* Example
```html
    <!--set base directory-->
    <base href = "images/02/">
```

## `<link>` Elements

* A **self-closing** tag
* Defines the relationship between the current page and external resources
* Commonly used to:
    1. link external stylesheets - **watch in CSS note**
    2. add a favicon (the small icon in the browser tab)
* Note
    * `.ico` format is **widely supported**, but `.png`, `.svg`, and others also work
* [a free web tool to create a favicon](https://www.favicon.cc/)

### Link To a favicon
* Example
```html
    <base href = "images/02/">
    <!--HTML logo-->
    <link rel = "icon" type = "image/png" href = "HTMLIcon.png">
```

* Favicon File Format Support Table

| Browser/Type      | ICO           | PNG       | GIF       | JPEG          | SVG           |
| :---------------: | :-----------: | :-------: | :-------: | :-----------: | :-----------: |
| File Type         | image/x-icon  | image/png | image/gif | image/jpeg    | image/svg+xml |
| Google Chrome     | ✅           | ✅        | ✅       | ✅            | ✅           |
| Mozilla Firefox   | ✅           | ✅        | ✅       | ✅            | ✅           |
| Microsoft Edge    | ✅           | ✅        | ✅       | ✅            | ✅           |
| Opera             | ✅           | ✅        | ✅       | ✅            | ✅           |
| Apple Safari      | ✅           | ✅        | ✅       | ✅            | ✅           |