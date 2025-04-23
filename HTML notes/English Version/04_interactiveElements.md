# Title: 04 Interactive Elements

# Author: Caesar James LEE(CJL)

## `<a></a>` - Anchor Element (Hyperlink)

* A **non-self-closing** tag
* Used to define hyperlinks, which allow users to navigate to other pages or resources
* By default, links will appear as follows in all browsers:
    1. An unvisited link is underlined and blue
    2. A visited link is underlined and purple
    3. An active link is underlined and red
* Common local attributes:
    1. `href` – Defines the target URL or document
        * Example
        ```html
            <a href = "https://www.google.com/">visit Google</a> <!--a web URL-->
            <a href = "#topic-1">go to topic 1</a> <!--go to a specific id in the document-->
            <a href = "example.pdf"></a> <!--go to a specific file-->
        ```
    2. `target` – Specifies where to open the linked url or document
        * Values
            1. `_blank`
                * Open in a new window or tab
            2. `_parent`
                * Open in the parent frame
            3. `_self`
                * Open in the same frame (`default`)
            4. `_top`
                * Open in the full body of the window
            5. `frameName`
                * Open in the `frameName` iframe
        * Example
            * Please visit [mainFrame](../Examples/04_mainFrame.html)
    3. `download` - Downloads the document
        * Download the same document
            * Example
            ```html
                <a href = "PDFs/04/example.pdf" download>download example pdf</a>
            ```
        * Download different document
            * Not Support for `Google Chrome` and `Mozilla Firefox`
            * Example
            ```html
                <a href = "https://www.google.com/" download = "PDFs/04/example.pdf">download different document</a>
            ```

## `<button></button>` - Clickable Button

* A **non-self-closing** tag
* Used to create a clickable button on a webpage
* Doesn't do anything by itself — it needs JavaScript to perform actions
* We'll talk more about its attributes in the `form` section

## `<details></details>` -  Expandable Content Container

* A **non-self-closing** tag
* Specify additional details that the user can open and close on demand
* Used to create an interactive widget that the user can 

## `<summary></summary>` - Label for a `<details></details>` Element

* A **non-self-closing** tag