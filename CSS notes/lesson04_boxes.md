### Date: October 14, 2024
### Title: Lesson04: Boxes
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### box model
* It's used when taking about design and layout.
* It consists `content`, `padding`, `border` and `margin`.
* ![box model](images/box%20model.png)
* box models:
    1. `content`
        * The `content` of box, where text and images appear.
    2. `padding`
        * Clears an area around the `content`.
        * The `padding` is transparent.
    3. `border`
        * A `border` that goes around the `padding` and `content`.
    4. `margin`
        * Clears an area outside the border.
        * The `margin` is transparent.
##### width
* Sets width of content area.
* It has three values:
1. `auto`       ***DEFAULT***
    * The browser calculates the width.
2. length
3. percentage
##### height
* Sets the height of content area.
* It has three values:
1. `auto`       ***DEFAULT***
    * The browser calculates the height.
2. length
3. percentage
##### `content`
* It's used with the `::bofore` and `::after` pseudo-elements, to insert generated content.
* It has ten values:
1. `normal`
    * Sets the content, if specified, to normal, which default is `none`.
2. `none`
    * Sets the content, if specified, to nothing.
3. `counter`
    * Sets the content as a counter.
4. `attr(attribute)`
    * Sets the content as one of the selector's attribute.
5. `string`
    * Sets the content to the text you specify.
6. `open-quote`
    * Sets the content to be an opening quote.
7. `no-open-quote`
    * Removes the opening quote from the content, if specified.
8. `close-quote`
    * Sets the content to be a closing quote.
9. `no-open-quote`
    * Removes the closing quote from the content, if specified.
10. `url(url)`
    * Sets the content to be some kind of media, like an `image`, a `sound`, a `video`, etc.
* example:
```
<!DOCTYPE html>
<html>
    <head>
        <style>
            p::before { 
                content: "starting quote:-)";
                color: cyan;
                background-color: orange;
            }

            p::after { 
                content: url("https://cdn.britannica.com/62/4562-050-A3B1915F/Flag-Taiwan.jpg");
            }
        </style>
    </head>

    <body>
        <p>Test</p>
    </body>
</html>
```
##### `padding-top`
* Sets the top padding of an element.
* **Negative values are not allowed**
* It has two values:
    1. length
        * **Default value is `0`**
    2. percentege
##### `padding-right`
* Sets the right padding of an element.
* It has two values like `padding-top`.
##### `padding-bottom`
* Sets the bottom padding of an element.
* It has two values like `padding-bottom`.
##### `padding-left`
* Sets the left padding of an element.
* It has two values like `padding-left`.
##### `padding`
* It's a shorthand property for `padding-top`, `padding-right`, `padding-bottom` and `padding-left`.
* example:      `padding: top right bottom left;`
                `padding: top&bottom right&left;`
                `padding: top&right&bottom&left`
##### `border-top-style`
* Sets the style of an element's top border.
* It has ten values:
    1. `dotted`
        * Defines a dotted border.
    2. `dashed`
        * Defines a dashed border.
    3. `solid`
        * Defines a solid border.
    4. `double`
        * Defines a double border.
    5. `groove`
        * Defines a 3D grooved border.
        * The effect depends on the `border-color` value.
    6. `ridge`
        * Defines a 3D ridged border.
        * The effect depends on the `border-color` value.
    7. `inset`
        * Defines a 3D inset border.
        * The effect depends on the `border-color` value.
    8. `outset`
        * Defines a 3D outset border.
        * The effect depends on the `border-color` value.
    9. `none`
        * Defines no border.
    10. `hidden`
        * Defiens a hidden border.
##### `border-right-style`
* Sets the style of an element's right border.
* It has the same ten values like `border-top-style`.
##### `border-bottom-style`
* Sets the style of an element's bottom border.
* It has the same ten values like `border-top-style`.
##### `border-left-style`
* Sets the style of an element's bottom border.
* It has the same ten values like `border-left-style.
##### `border-style`
* Specifies what kind of border to display.
* It has the same ten values like   border-top-style`.
* syntax:   `border-style: top right bottom left;`
            `border-style: top&bottom right&left;`
            `border-style: top&right&bottom&left;`
##### `border-top-width`
* Sets the width of an element's top border.
* It has four values:
    1. `medium`     ***DEFAULT***
        * Specifies a medium top border.
    2. `thin`
        * Specifies a thin top border.
    3. `thick`
        * Specifies a thick top border.
    4. length
##### `border-right-width`
* Sets the width of an element's right border.
* It has the same four values like `border-top-width`.
##### `border-bottom-width`
* Sets the width of an element's bottom border.
* It has the same four values like `border-top-width`.
##### `border-left-width`
* Sets the width of an element's left border.
* It has the same four values like `border-top-width`.
##### `border-width`
* Specifies the width of the four borders.
* It has the same four values like `border-top-width`.
* syntax:   `border-width: top right bottom left;`
            `border-width: top&bottom left&right;`
            `border-width: top&bottom&left&right;`
##### `border-top-color`
* Sets the color of an element's top border.
##### `border-right-color`
* Sets the color of an element's right border.
* It has the same six values like `border-top-color`.
##### `border-bottom-color`
* Sets the color of an element's bottom border.
* It has the same six values like `border-top-color`.
##### `border-color`
* Sets the color of the four borders.
* It has the same six values like `border-top-color`.
* syntax:   `border-color: top right bottom left;`
            `border-color: top&bottom right&left;`
            `border-color: top&right&bottom&left;`
##### `border-top`
* It's a shorthand property for `border-top-width`, `border-top-style` (required) and `border-top-color`.
* syntax:       `border-top: width style color;`.
##### `border-right`
* It's a shorthand property for `border-right-width`, `border-right-style` (required) and `border-top-color`.
* syntax:       `border-right: width style color;`.
##### `border-bottom`
* It's a shorthand property for `border-bottom-width`, `border-bottom-style` (required) and `border-top-color`.
* syntax:       `border-bottom: width style color;`.
##### `border-left`
* It's a shorthand property for `border-left-width`, `border-left-style` (required) and `border-left-color`.
* syntax:       `border-left: width style color;`.
##### `border`
* It's a shorthand property for `border-width`, `border-style` (required), `border-color`.
* syntax:       `border: width style color;`.
##### `border-top-left-radius`
* Defines the radius of the top-left corner.
* It has two values:
    1. length
    2. percentage
##### `border-top-right-radius`
* Defines the radius of the top-right corner.
* It has the same two values like `border-top-left-radius`.
##### `border-botton-left-radius`
* Defines the radius of the bottom-left corner.
* It has the same two values like `border-top-left-radius`.
##### `border-bottom-right-radius`
* Defines the radius of the bottom-right corner.
* It has the same two values like `border-top-left-radius`.
##### `border-radius`
* It's a shorthand property for `border-top-left-radius`, `border-top-right-radius`, `border-bottom-left-radius` and `border-bottom-right-radius`.
##### `margin-top`
* Sets the top margin of an element.
* It has three values:
    1. length
    2. percenteage
    3. `auto`
        * The browser calculates the top margin.
##### `margin-right`
* Sets the right margin of an element.
* It has the same three values like `margin-top`.
##### `margin-bottom`
* Sets the bottom margin of an element.
* It has the same three values like `margin-top`.
##### `margin-left`
* Sets the left margin of an element.
* It has the same three values like `margin-top`.
##### `margin`
* It's a shorthand property for `margin-top`, `margin-right`, `margin-bottom` and `margin-left`.
* It has the same three values like `margin-top`.