### Date: October 13, 2024
### Title: Lesson03: Text & Font
### Author: Caesar James LEE
### Book: HTML5+CSS3+JavaScript: from beginer to senior
### Website: [W3Schools](https://www.w3schools.com)
### AI Assistant: CloseAI ChatGPT

##### `color`
* Setting the color of the text.
* The value can be a name. e.g. `black`
* The value can be a hexadecimal color. e.g. `#000000`
* The value can be a RGB color. e.g. `rgb(0, 0, 0)`
* The value can be a RGBA color. e.g. `rgba(0, 0, 0, 1)`
##### `text-align`
* Setting the horizontal alignment of a text.
* It has four values:
    1. `left`
        * Setting text direction from left to right.
        * A default value if `direction: ltr;`.
    2. `center`
        * Centering text.
    3. `right`
        * Setting text direction from right to left.
        * A default value if `direction: rtl;`.
    4. `justify`
        * Each line is stretched so that every line has equal width.
        * And the left and right margins are straight.
##### `text-align-last`
* Specifies how to align the last line of a text.
* It has the same four values as `text-align`.
##### `direction`
* Specifies the text direction or writting direction within a block-level element.
* Using this property with the `unicode-bidi` property to set or return whether the text should be overridden to support multiple languages in the same document.
* It has four values:
    1. `ltr`    ***DEFAULT***
        * Text direction goes from left to right.
    2. `rtl`
        * Text direction goes from right to left.
    3. `initial`        ***(I'll ignore it in the following notes)***
        * Sets this property to its default value (`ltr`).
    4. `inherit`        ***(I'll ignore it in the following notes)***
        * Inherit this property from its parent element.
##### `unicode-bidi`
* It has six values:
    1. `normal` ***DEFAULT***
        * Doesn't open an additional level of embeding.
    2. `embed`
        * For inline element, this value opens an additional level of embeding.
        * Or you can think of it adds a CSS property: `display: block;`.
    3. `bidi-override`
        * For inline elements, this creates an override, which means reverse the text. For example, `text` will be `txet`.
        * For block elements, this creates an override for inline-level descendants not within another block element.
    4. `isolate`
        * The element is isolated (孤立) from its siblings.
    5. `isolate-override`
        * `isolate` + `override`
    6. `paintext`
        * Changing `direction` property to `ltr` if the value of `direction` isn't `ltr`.
##### `vertical-align`
* Sets the vertical alignment of an element.
* It has ten values:
    1. `baseline`       ***DEFAULT***
        * The element is aligned with the baseline of the parent.
    2. `length`
        * Raises or lower an element by the specified length.
        * Negative values are allowed.
    3. `%`
        * Raises or lower an element by a percent of the `line-height` property.
        * Negative values are allowed.
    4. `sub`
        * The element is aligned with the subscript baseline of the parent.
    5. `super`
        * The element is aligned with the superscript baseline of the parent.
    6. `top`
        * The element is aligned with the top of the tallest element on the line.
    7. `text-top`
        * The element is aligned with the top of the parent element's font.
    8. `middle`
        * The element is placed in the middle of the parent element.
    9. `bottom`
        * The element is aligned with the lowest element on the line.
    10. `text-bottom`
        * The element is aligned with the bottom of the parent element's font.
##### `text-decoration-line`
* Sets the kind of text decoration.
* You can also combine more than one value, like `underline overline`, `underline line-through`, `overline line-through` and `underline overline line-through`.
* It has six values:
    1. `none`   ***DEFAULT***
        * Specifies no line for the `text-decoration-line`.
    2. `underline`
        * Specifies that a line will be displayed under the text.
    3. `overline`
        * Specifies that a line will be displayed over the text.
    4. `line-through`
        * Specifies that a line will be displayed through the text.
    5. `initial`
    6. `inherit`
##### `text-decoration-color`
* Sets the color of the decoration line.
* The values are the same as `color`.
##### `text-decoration-style`
* Sets the style of the text decoration.
* It has five values:
1. `solid`      ***DEFAULT***
    * The line will be displayed as a single line.
2. `double`
    * The line will be displayed as a double line.
3. `dotted`
    * The line will be displayed as a dotted line.
4. `dashed`
    * The line will be displayed as a dashed line.
5. `wavy`
    * The line will be displayed as wavy line.
##### `text-decoration-thickness`
* Specifies the thickness of the decoration line.
* It has four values:
    1. `auto`       ***DEFAULT***
        * the browser chooses the thickness of the decoration line.
    2. `form-font`
        * If a font file contains information about a preferred thickness, use that value.
        * If not, behave as `auto`.
    3. length
        * Specifies a particular length number.
    4. percentage
        * Specifies a particular percentage.
##### `text-decoration`
* It's a shorthand property for `text-decoration-line` (required), `text-decoration-color`, `text-decoration-style` and `text-decoration-thickness`.
* syntax: `text-decoration: line color style thickness;`
##### `white-space`
* Specifies how whitw-space inside an element is handled.
* It has five values:
    1. `normal`     ***DEFAULT***
        * Sequences of whitespace will collapse into a single whitespace.
        * In other words, it just shows a single whitespace, regardless how many whitespaces you added.
        * Text will wrap when necessary.
    2. `nowrap`
        * Sequences of whitespace will collapse into a single whitespace.
        * Text will never wrap to the next line.
        * The text continues on the same line until a `<br>` tag is encountered.
    3. `pre`
        * Whitespace is preserved by the browser.
        * It likes `<pre></pre>` element in HTML.
    4. `pre-line`
        * Swquences of whitespace will collapse into a single whitespace.
        * Text will wrap when necessary, and on line break.
    5. `pre-wrap`
        * Text is preversed by the browser.
        * Text will wrap when necessary, and on line break.
##### `word-break`
* Specifies how words should break when reaching the end of a line.
* It has four values:
    1. `normal`     ***DEFAULT***
        * Uses default line break rules.
    2. `break-all`
        * To prevent overflow, word may be broken at any character.
    3. `keep-all`
        * Word breaks should not be used for Chinese or Japanese or Korean (CJK) text.
        * Non-CJK text behavior is the same as value `normal`.
    4. `break-word`
        * Deprecated.
        * To prevent overflow, word may be broken at arbitary points.
##### `word-spacing`
* Increases or decreases the white space between words.
* You can use negative number, **BUT DON'T USE**.
* It has two values:
    1. `normal`
        * Defines normal space words (`0.25em`).
    2. length
##### `word-wrap`
* Allows long words to be able to be broken and wrap onto the next line.
* It has two values:
    1. `normal`     ***DEFAULT***
        * Break words only at allowed points.
    2. `break-word`
        * Allows unbreakable words to be broken.
##### `writting-mode`
* Specifies whether lines of text are laid out horizontally or vertically.
* It has three values:
    1. `horizontal-tb`      ***DEFAULT***
        * `t` for top, `b` for bottom.
        * Lets the content flow horizontally from left ti right, vertically from top to bottom.
    2. `vertical-rl`
        * `r` for right, `l` for left.
        * Lets the content flow vertically from top to bottom, horizontally from right to left.
    3. `vertical-lr`
        * `l` for left, `r` for right.
        * Lets the content flow vertically from top to bottom, horizontally from left to right.
##### font family
* `Serif`
    * Has a small stroke at the edges of each letter.
    * Creates a sense of formality and elegance.
* `Sans-serif`
    * Has clean lines (no small strokes attached).
    * Creates a modern and minimalistic look.
* `Monospace`
    * All the letters have the same fixed width.
    * Creates a mechanical look.
* `Cursive`
    * Imitates human handwriting.
* `Fantasy`
    * Decorative or playful fonts.
* examples:
    1. `Serif`
        * `Times New Roman`
        * `Georgia`
        * `Garamond`
    2. `Sans-serif`
        * `Arial`
        * `Verdana`
        * `Helvetica`
    3. `Monospace`
        * `Courier New`
        * `Lucida Console`
        * `Monaco`
    4. `Cursive`
        * `Brush Script MT`
        * `Lucida Handwriting`
    5. `Fantasy`
        * `Copperplate`
        * `papyrus`
##### web safe fonts
1. Arial (sans-serif)
2. Verdana (sans-serif)
3. Tahoma (sans-serif)
4. Trebuchet MS (sans-serif)
5. Time New Roman (seirf)
6. Georgia (serif)
7. Garamond (serif)
8. Courier New (Monospace)
9. Brush Script MT (cursive)
##### `font-family`
* Specifies the font for an element.
* syntax: `font-family: name` or `font-family: "full name"`.
##### `font-style`
* Speciies italic text
* It has three values:
    1. `normal`     ***DEFAULT***
        * The browser displays as a normal font style.
    2. `italic`
        * The browser displays as an italic font style.
    3. `oblique`
        * The broswer displays as an oblique font style.
##### `font-variant`
* Specifies whether or not a text should be displayed in a small-caps font.
* It has two values:
    1. `normal`     ***DEFAULT***
        * The browser will displays as a normal font.
    2. `small-caps`
        * The browser will displays as a small-caps font.
##### `font-variant-caps`
* Controls the usage of alternate glyphs for capital letters.
* It has eight values:
    1. `unset`      ***DEFAULT***
        * Displays the original text format.
    2. `normal`
        * Deactivates the use of alternate glyphs.
    3. `small-caps`
        * Displays small capitals.
    4. `all-small-caps`
        * Displays small capitals for both upper and lowercase letters.
    5. `petite-caps`
        * Displays petite capitals.
    6. `all-petite-caps`
        * Displays petite capitals for both upper and lowercase letters.
    7. `unicase`
        * Displays a mix of small capitals for uppercase letters with normal lowercase letters.
    8. `titling-caps`
        * Displays titling capitals.
##### `font-weight`
* Sets how thick or thin characters in text should be displayed.
* It has five values:
    1. `normal`     ***DEFAULT***
        * Defines normal characters.
    2. `bold`
        * Defines thick characters.
    3. `bolder`
        * Defines thicker characters.
    4. `lighter`
        * Defines lighter characters.
    5. length
        * Defines form thin to thick characters.
        * `400` is the same as `normal`.
        * `700` is the same as `bold`.
        * Its values include `100`, `200`, `300`, `400`, `500`, `600`, `700`, `800` and `900`.
##### `font-size`
* Sets the size of a font.
* It has eleven values:
    1. `xx-samll`
        * Sets the `font-size` to an `xx-small` size.
    2. `x-small`
        * Sets the `font-size` to an `extra small` size.
    3. `small`
        * Sets the `font-size` to a `small` size.
    4. `medium`     ***DEFAULT***
        * Sets the `font-size` to a `medium` size.
    5. `large`
        * Sets the `font-size` to a `large` size.
    6. `x-large`
        * Sets the `font-size` to an `extra large` size.
    7. `xx-large`
        * Sets the `font-size` to an `xx-large` size.
    8. `smaller`
        * Sets the `font-size` to a `smaller` size than the parent element.
    9. `larger`
        * Sets the  `font-size` to a `larger` size than the parent element.
    10. length
        * Sets the `font-size` to fixed size in `px`, `cm`, `em`, etc.
        * Example:  `12px`, `3cm`, `1em`.
    11. percentage
        * Sets the `font-size` to a percent of the parent element's font size.
##### `line-height`
* Specifies the height of a line.
* It has four values:
    1. `normal`     ***DEFAULT***
        * A normal line height.
    2. number
        * A number that will be multiplied with the current `font-size` to set the line height.
    3. length
        * A fixed line height in `px`, `pt`, `cm`, `em`, etc.
    4. percentage
        * A line height in percent of the current line height.
##### `font`
* A shorthand property for `font-style`, `font-varient`, `font-weight`, `font-size`/`line-height`, `font-family`.
* Example:  `font: italic small-caps bolder 39px/50px Arial;`
##### select a font from Google Fonts
```
<DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Sixtyfour+Convergence&display=swap" rel="stylesheet">
        <style>
            body{
                background-color: black;
                color: white;
                font-family: "Sixtyfour Convergence";
            }
        </style>
    </head>
    
    <body>
        <h1>Test</h1>
    </body>
</html>
```
##### `overflow`
* Specifies what should happen if content overflows an element's box.
* Specifies whether to clip content or to add scrollbars when an element's content is too big to fit in a specified area.
* only works for `block` elements with a specified height.
* It has five values:
    1. `visible`        ***DEFAULT***
        * The overflow is not clipped.
        * It readers outside the element's box.
    2. `hidden`
        * The overflow is clipped, and the rest of the content will be invisible.
        * Content can be scrolled programmatically (e.g. by setting `scrollLeft` or `scrollTo()`).
    3. `clip`
        * The overflow is clipped, and the rest of the content will be invisible.
        * Forbids scrolling, including programmatically scrolling.
    4. `scroll`
        * The overflow is clipped, but a scroll-bar is added to see the rest of the content.
    5. `auto`
        * If overflow is clipped, a scroll-bar should be added to see the rest of the content.
##### `overflow-anchor`
* Makes it easy to turn off scroll anchoring.
* In other words, it bans user scroll down to see the rest of the content before the page loaded.
* It has two values:
    1. `auto`       ***DEFAULT***
        * Scroll anchoring is enable.
    2. `none`
        * Scroll anchoring is disable.
##### `overflow-wrap`
* Specifies whether or not the browser can break lines with long words, if they overflow the container.
* It has three values:
    1. `normal`     ***DEFAULT***
        * Long words will not break, even if they overflow the container.
    2. `anywhere`
        * Long words will break if they overflow the container.
    3. `break-word`
        * Long words will break if they overflow the container.