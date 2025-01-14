# Title: Course01: Introduction
# Date: January 9, 2025
# Author: Caesar James LEE

## what's `Vue`
1. Front-end, `JavaScript` / `TypeScript` framework
2. It's used to create dynamic & data driven websites (SPA)
    * data-driven website: a website that dynamically generates content from a database based on user interactions, inputs, or requests
    * in other words, the website will pull information from a database, and the website content is generated in real time.
3. It can also be used to create stand-along widgets
    * standalone widget: small, self-contained applications or components that can function independently, without needing to rely on a larger applicaiton or system to operate.
    * in other words, a standalong widget like a widget on a mobile phone that can work independently, easy to use and fast to solve sticky problems
    * likes a search bar, a contact form or any other kind of interactive component
4. It makes easy for developers to interact with the user interaction via `DOM` (document object model)
## vue websites
1. `Vue` is used to create a whole website with multiple pages & components
2. These websites are normally called `Single Page Applications` (SPA)
3. All routing is done in the browser & not on the server
## how non-vue websites work
* visit web
    1. Browser sends a request to the backend server when you visit a website
    2. The backend server handled the request and sends back the html page to the browser
* click a link
    1. The browser will send a fresh request to the server when you clicked a link
    2. The server will send back a new html page to the browser
## how vue websites work
* visit web
    1. Browser sends an initial request to the server
    2. The server will send back a bare-bones HTML doc rather than ab entire HTML page
    3. A bare-bones HTML doc includes Vue JavaScript bundles and some visible elements sometimes
* click links
    * The vue bundles rather than the backend server to handle those behaviors
## Single Page Application (SPA)
1. Only a single HTML page sent initial request to the browser
2. Vue intercepts subsequent requests and handles changes in the browser by swapping what components are shown on the page
3. Results in a much faster and smoother website experience
