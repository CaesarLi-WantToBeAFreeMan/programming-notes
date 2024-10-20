### Date: October 20, 2024
### Title: Lesson08: Transitions and Transformations and Animations
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### `opacity`
* Specifies the opacity or transparency of an element.
* It's often used together with the `:hover` selector to change the opacity on mouse-over.
* The value is [0.0, 1.0].
##### `cursor`
* Specifies the mouse cursor to be displayed when pointing over an element.
* It has thirty-seven values:
    1. `alias`
        * Indicates an alias of something is to be created.
    2. `all-scroll`
        * Indicates that something can be scrolled in any direction.
    3. `auto`       ***DEFAULT***
        * The browser sets a cursor.
    4. `cell`
        * Indicates that a cell (or set of cells) may be selected.
    5. `col-resize`
        * Indicates that the column can be resized horizontally.
    6. `context-menu`
        * Indicates that a context-menu is available.
    7. `copy`
        * Indicates something is to be selected.
    8. `crosshair`
        * It as a crosshair.
    9. `default`
        * Default cursor.
    10. `e-resize`
        * `e` for east.
        * Indicates that an edge of a box is to be moved right.
    11. `ew-resize`
        * `e` for east, `w` for west.
        * Indicates a bidirectional resize cursor.
    12. `grab`
        * Indicates that something can be grabbed.
    13. `grabbing`
        * Indicates that something can be grabbed.
    14. `help`
        * Indicates that help is available.
    15. `move`
        * Indicates something is to be moved.
    16. `n-resize`
        * `n` for north.
        * Indicates that an edge of a box is to be moved up.
    17. `ne-resize`
        * `n` for north, `e` for east.
        * Indicates that an edge of a box is to be moved up and right.
    18. `nesw-resize`
        * `n` for north, `e` for east, `s` for south, `w` for west.
        * Indicates a bidirectional resize cursor.
    19. `ns-resize`
        * `n` for north, `s` for south.
        * Indicates a bidirectional resize cursor.
    20. `nw-resize`
        * `n` for north, `w` for west.
        * Indicates that an edge of a box is to be moved up and left.
    21. `nwse-resize`
        * `n` for north, `w` for west, `s` for south, `e` for east.
        * Indicates a bidirectional cursor. 
    22. `no-drop`
        * Indicates that the dragged item connot be dropped here.
    23. `none`
        * No cursor is rendered for the element.
    24. `not-allowed`
        * Indicates that the requested action will not be executed.
    25. `pointer`
        * The cursor is a pointer and indicates a link.
    26. `progress`
        * Indicates that the program is busy (in progress).
    27. `row-resize`
        * Indicates that a row can be resized vertically.
    28. `s-resize`
        * `s` for south.
        * Indicates an edge of a box is to be moved down.
    29. `se-resize`
        * `s` for south, `e` for east.
        * Indicates an edge of a box is to be moved down and right.
    30. `sw-resize`
        * `s` for south, `w` for west.
        * Indicates an edge of a box is to be moved down and left.
    31. `text`
        * Indicates text that may be selected.
    32. `URL(URL)`
        * A comma separated list of URLs to custom cursors.
        * Always specify a generic cursor at the end of the list, in case none of the URL-defined cursors can be used.
    33. `vertical-text`
        * Indicates vertical-text that may be selected.
    34. `w-resize`
        * `w` for west.
        * Indicates an edge of a box is to be moved left.
    35. `wait`
        * Indicates that program is busy.
    36. `zoom-in`
        * Indicates that something can be zoomed in.
    37. `zoom-out`
        * Indicates that something can be zoomed out.
##### `transition-property`
* Specifies the name of the CSS property the transition effect is for (the transition effect will start when the specified CSS property changes.)
* A transition effect could typically occur when a user hover over an element.
* It has three values:
    1. `none`
        * No property will get transition effect.
    2. `all`        ***DEFAULT***
        * All properties will get transition effect.
    3. name
        * Defines a comma separated list of CSS property names the transition effect is for.
##### `transition-duration`
* Specifies how many seconds(s) or milliseconds(ms) a transition effect takes to complete.
* **Default time is `0s` menas no transition effect.**
##### `transition-timing-function`
* Specifies the speed curve of the transition effect.
* It has nine values:
    1. `ease`       ***DEFAULT***
        * Specifies a transition effect with a slow start, then fast, then end slowly.
        * `cubic-bezier(0.25, 0.1, 0.25, 1)`.
    2. `linear`
        * Specifies a transition effect with the same speed from start to end.
        * `cubic-bezier(0, 0, 1, 1)`.
    3. `ease-in`
        * Specifies a transition effect with a slow start.
        * `cubic-bezier(0.42, 0, 1, 1)`.
    4. `ease-out`
        * Specifies a transition effect with a slow end.
        * `cubic-bezier(0, 0, 0.58, 1)`.
    5. `ease-in-out`
        * Specifies a transition effect with a slow start and end.
        * `cubic-bezier(0.42, 0, 0.58, 1)`.
    6. `step-start`
        * Equivalent to `steps(1, start)`.
    7. `step-end`
        * Equivalent to `steps(1, end)`.
    8. `steps(int, start || end)`
        * Specifies a stepping function.
        * The first parameter specifies the number of intervals in the function, and the number must be a positive number (> 0).
        * The second parameter, which is optional, is either the value `start` or `end`, and specifies the point at which the change of values occur within the interval.
        * If you aren't specify the second parameter, this will be `end`.
    9. `cubic-bezier(num, num, num, num)`
        * Defines your own values in the `cubic-bezier()` function.
        * Possible values are numeric values [0, 1].
##### `transition-delay`
* Specifies when the transition effect will start.
* Its value defines in seconds(s) or milliseconds(ms).
##### `transition`
* It's a shorthan property of `transition-property`, `transition-duration`, `transition-timing-function` and `transition-delay` properties.
* syntax:   `transition: property duration timing-function delay;`.
##### 2D transformations
* CSS transforms allow you to move, rotate, scale and skew elements.
* In 2D transformations,, you can use `translate()`, `rotate()`, `scaleX()`, `scaleY()`, `scale()`, `skewX()`, `skewY()`, `skew()` and `matrix()` methods in `transform` property.
    * methods:
        1. `translate(x-axis, y-axis)`
            * Moves an element from its current position.
            * `x-axis` means move the element some pixels to the right; `y-axis` means move the element some pixels to the bottom.
            * example:  `transform: translate(30px, 50px);`
                * The element will move 30 pixels to the right and 50 pixels to the bottom.
        2. `rorate(degree)`
            * Rotates an element clockwise (positive number) or counter-clockwise (negative number) to a given degree.
            * example:
            ```
                #shape-1{
                    transform: rotate(30deg);
                }
                #shape-2{
                    transform: rotate(-30deg);
                }
            ```
            * The `shape-1` rotated 30 degrees clockwise and the `shape-2` rotated 30 degrees counter-clockwise.
        3. `scaleX(widthTimes)`
            * Increases (positive integer) or decreases ((0.0, 1.0)) the width of an element.
            * example:
            ```
                #shape-1{
                    transform: scaleX(3);
                }
                #shape-2{
                    transform: scaleX(0.3);
                }
            ```
            * Increased the `shape-1` element to be three times of its original width, and decreased the `shape-2` element to be one third of its original width.
        4. `scaleY(heightTimes)`
            * Increases (positive integer) or decreases ((0.0, 1.0)) the width of an element.
            * example:
            ```
                #shape-1{
                    transform: scaleY(2);
                }
                #shape-2{
                    transform: scaleY(0.5);
                }
            ```
            Increased the `shape-1` element to be two times of its original height, and decreased the `shape-2` element to be half of its original height.
        5. `scale(widthTimes, heightTimes)`
            * It's shorthand function for `scaleX()` and `scaleY()` functions.
        6. `skewX(degree)`
            * Skews an element along the X-axis by the given angle.
            * If you pass a positive degree, the element will skew to left; otherwise to right.
            * example:
            ```
                #shape-1{
                    transform: skewX(30deg);
                }
                #shape-2{
                    transform: skewY(-30deg);
                }
            ```
            * Skews the `shape-1` element 30 degrees to the left, and skews the `shape-2` element 30 degrees to the right.
        7. `skewY(degree)`
            * Skews an element along the Y-axis by the given angle.
            * If you pass a positive degree, the element will skew to bottom; otherwise to top.
            * example:
            ```
                #shape-1{
                    transform: skewY(30deg);
                }
                #shape-2{
                    transform: skewY(-30deg);
                }
            ```
            * Skews the `shape-1` element 30 degrees to the bottom, and skews the `shape-2` element 30 degrees to the top.
        8. `skew(X-axis, Y-axis)`
            * It's a shorthand function for `skewX()` and `skewY()` functions.
        9. `matrix(scaleX, skewY, skewX, scaleY, translateX, translateY)`
            * It combines all the 2D transformation methods expect `rotate()` into one.
##### 3D transformations
* CSS only supports `rotate()` methods in 3D trandformations, or just add `rotateZ()` method for 3D transformations.
* `rotateZ()` method likes `rotate()X` and `rotateY()` methods but rotates an element around its Z-axis.
##### `transform-origin`
* Allows you to change the position of transformed elements.
* You can change X-axis and Y-axis in 2D transformations, and also Z-axis in 3D transmations.
* This property must used together with `transform` property.
* syntax:   `transform-origin: X-axis Y-axis Z-axis;`.
* **Default value is `50% 50% 0;`**.
##### `transform-style`
* Specifies how nested elements are rendered in 3D space.
* This property must be used together with `transform` property.
* It has two values:
    1. `flat`       ***DEFAULT***
        * Specifies that child elements **WILL NOT PRESERVE** its 3D position.
    2. `preserve-3d`
        * Specifies that child elements **WILL PRESERVE** its 3D position.
##### animations
* Lets an element gradually change from one style to another.
* You can change as many CSS properties you want, as many times you want.
* To use CSS animation, you must first specify some `@keyframes` for the animation.
* `@keyframes` hold what styles the element will have at certain times.
###### `@keyframes`
* When you specify CSS styles inside the `@keyframes` rule, the animation will gradually change from the current style to the new style at certain times.
* examples:
    1.  ```
            @keyframe changeColor{
                from{
                    background-color: white;
                }
                to{
                    background-color: dark-gray;
                }
            }
        ```
        * When you add `animation-name: changeColor;` and `animation-duration: 1s;`, the shape has an animation lasts 1 second from white to dark-gray;
    2.  ```
            @keyframe changeColor{
                0%{
                    background-color: white;
                }
                25%{
                    background-color: red;
                }
                50%{
                    background-color: green;
                }
                75%{
                    background-color: blue;
                }
                100%{
                    background-color: black;
                }
            }
        ```
        * When you add `animation-name: changeColor;` and `animation-duration: 1s;`, the shape has an animation lasts 1 second from white to red to green to blue to black.
##### `animation-name`
* Specifies a name for the `@keyframe` animation.
* It has two values:
    1. `none`       ***DEFAULT**
    2. name
##### `animation-duration`
* Defines how long an animation should take to complete one cycle.
##### `animation-timing-function`
* Likes `transition-timing-function` property.
##### `animation-delay`
* Likes `transition-delay` property.
##### `animation-iteration-count`
* Specifies the number of times an animation should be played.
* **Default number is `1`**.
* It has two values:
    1. number
    2. `infinite`
        * Specifies that the animation should be played infinite times, in other words, for ever.
##### `animation-direction`
* Defines whether an animation should be played forward, backward or in alternate cycles.
* It has four values:
    1. `normal`     ***DEFAULT***
        * The animation is played as normal (forwards).
    2. `reverse`
        * The animation is played in reverse direction (backwards).
    3. `alternate`
        * The animation is played forwards first, then backwards.
        * In other words, it played from begin to end, then from end to begin.
    4. `alternate-reverse`
        * The animation is played backwards first, then forwards.
        * In other words, it played from end to begin, then from begin to end.
##### `animation-fill-mode`
* Specifies a style for the element when the animation isn't playing (before it starts, after it ends, or both).
* It has four values:
    1. `none`       ***DEFAULT***
        * Animation will not apply any styles to the element before or after it's executing.
    2. `forwards`
        * The element will retain the style values that is set by the last keyframe (depends on `animation-direction` and `animation-iteration-count` properties).
    3. `backwards`
        * The element will get the style values that is set by the first keyframe (depends on `animation-direction` and `animation-iteration-count` properties).
    4. `both`
        * The animation will follow the rules for both forwards and backwards, extending the animation properties in both directions.
##### `animation-play-state`
* Specifies whether the animation is runing or paused.
* Using this property in `JavaScript` to pause an animation in the middle of a cycle.
* It has two values:
    1. `paused`
        * Specifies that the animation is paused.
    2. `running`        ***DEFAULT***
        * Specifies that the animation is running.