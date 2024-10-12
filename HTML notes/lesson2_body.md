### Date: October 8, 2024
### Title: Lesson02: Body
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### `<body></body>`
Defines the document's body. It contains all the contents of the HTML document.
##### `<h1></h1>`, `<h2></h2>`, `<h3></h3>`, `<h4></h4>`, `<h5></h5>`, `<h6></h6>`
These are used to define HTML headings.
##### `<p></p>`
Defines a paragraph.
##### `<pre></pre>`
Defines preformatted text.
##### `<audio></audio>`
Embeds sound content in a document.

It has five attributes:
1. controls
   
   Specifies that audio controls should be displayed.
2. autoplay
   
   Specifies that the audio will start playing as soon as it is ready.
3. loop

    Specifies that the audio will start over again, every time it is finished.
4. muted

    Specifies that the audio output should be muted.
5. src

    Specifies that the URL of the audio file.
    
    **HIGHLY RECOMMENDED**

    We should add one or more `<source>` inside `<audio>` tag in case some sources cann't be played.

    example:
    ```
    <audio controls muted loop>
        <source src = "sound.wav" type = "audio/wav">
        <source src = "sound.ogg" type = "audio/ogg">
        <source src = "sound.mp3" type = "audio/mpeg">
    </audio>
    ```
##### `<video></video>`
Embeds video in a document.

It has eight attributes:
1. controls
2. autoplay
3. loop
4. muted
5. src

    Those like `<audio></audio>`
6. poster

    Specifies an image to be shown while the video is downloading, or until the user hits the play button.


    You need give a URL.
7. width

    Specifies the width of the video player.
    
    You need specify a number pixel(s).
8. height

    Specifies the height of the video player.

    You need specify a number pixel(s).

    **HIGHLY RECOMMENDED**

    We should add one or more `<source>` inside `<video>` tag in case some sources cann't be played.

    example:
    ```
    <video controls loop muted width = "1920" height = "1080" poster = "locationOfAnImage">
        <source src = "video.webp" type = "video/webp">
        <source src = "video.ogg" type = "video/ogg">
        <source src = "video.mp4" type = "video/mp4">
        your browser doesn't support the video tag
    </video>
    ```

    **HIGHLY RECOMMENDED**

    ***Google Chrome has banned autoplay with sound since April of 2018.***
##### `<img>`
Embeds an image in an HTML page.

It had six attributes:
1. alt

    Specifies an alternate text for an image.
2. height

    Specifies the height of an image.
3. width

    Specifies the width of an image.
4. loading

    Specifies whether a browser should load an image immediately or to defer loading of images until some conditions are met.
5. sizes

    Specifies image sizes for different page layout.
6. src

    Specifies the path to the image.

    **HIGHLY RECOMMENDED**

    We should add one or more `<source>` inside `<ima>` tag in case some sources cann't be played.
    example:
    ```
    <img width = "500" height = "500" alt = "cover image"
        source src = "cover.png" type = "image/png"
        source src = "cover.svg" type = "image/svg+xml"
        source src = "cover.webp" type = "image/webp"
        source src = "cover.jpg" type = "image/jpeg">
    ```