# Title: 03 Text

# Author: Caesar James LEE(CJL)

## `<h1></h1>` To `<h6></h6>` - Headings

* **non-self-closing** tags
* Used to define headings in HTML
* There are 6 levels for headings
    * `<h1>` is the most important
    * `<h6>` is the least important
* ***Notes***
    * Only use one use `<h1>` per page for accessibility and SEO
    * Don't skip heading levels
* Example
```html
    <h1>heading #1</h1>

    <h2>heading #2</h2>
    <h2>heading #2</h2>
    
    <h3>heading #3</h3>
    <h3>heading #3</h3>

    <h4>heading #4</h4>
    <h4>heading #4</h4>

    <h5>heading #5</h5>
    <h5>heading #5</h5>

    <h6>heading #6</h6>
    <h6>heading #6</h6>
```

## `<p></p>` - Paragraph

* A **non-self-closing** tag
* Define a paragraph
* Browsers automatically add space before and after paragraphs
* Example
```html
    <p>lorem100</p>
```

## `<pre></pre>` - Preformatted Text

* A **non-self-closing** tag
* Keep whitespace and line breaks as-is
* Useful for displaying code or text with specific formatting
* Example
```html
    <pre>
        lorem
        100
    </pre
```

## `<br>` - Line Break

* A **self-closing** tag
* Create a line break inside text
* Example
```html
    <p>
        line#1<br>
        line#2<br>
        line#3
    </p>
```

## `<wbr>` - Word Break Opportunity

* A **self-closing** tag
* Suggests a location in text where the browser may break a long word and wrap it to the next line
* Example
```html
    <p>
        verylonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglonglongword<wbr>hi
    </p>
```

## `<hr>` - Horizontal Rule

* A **self-closing** tag
* Create a horizontal line to separate sections
* Example
```html
    <p>
        topic#1
        <hr>
        topic#2
    </p>
```

## `<strong></strong>` - Strong Importance

* A **non-self-closing** tag
* Indicate important text (usually **bold**)
* Example
```html
    <p>
        <strong>important</strong>
        information
    </p>
```

## `<b></b>` - Bold Text (No Emphasis)

* A **non-self-closing** tag
* Style text as **bold** without semantic importance
* Example
```html
    <p>
        <b>bold</b>
        text
    </p>
```

## `<em></em>` - Emphasized Text

* A **non-self-closing** tag
* Add emphasis (typically *italic*)
* Example
```html
    <p>
        <em>emphasized</em>
        information
    </p>
```

## `<i></i>` - Italic (No Emphasis)

* A **non-self-closing** tag
* Style text as *italic* for visual appearance only
* Example
```html
    <p>
        <i>italic</i>
        text
    </p>
```

## `<mark></mark>` - Highlighted Text

* A **non-self-closing** tag
* Highlight text with a yellow background
* Example
```html
    <p>
        <mark>highlighted</mark>
        text
    </p>
```

## `<small></small>` - Smaller Text

* A **non-self-closing** tag
* Make text appear smaller
* Example
```html
    <p>
        price: $1
        <small>99</small>
    </p>
```

## `<q></q>` - Inline Quotation

* A **non-self-closing** tag
* Wrap text in quotation marks automatically
* Example
```html
    <p>
        And God said,
        <q>Let there be light,</q>
        and there was light
    </p>
```

## `<blockquote></blockquote>` - Block Quote

* A **non-self-closing** tag
* Display a long quote, usually indented
* Example
```html
    <p>
        Genesis 1:3<br>
        <blockquote>
            And God said,
            <q>Let there be light,</q>
            and there was light
        </blockquote>
    </p>
```

## `<cite></cite>` - Citing Sources

* A **non-self-closing** tag
* Used for the title of a work (italicized by default)
* Example
```html
    <p>
        <cite>Genesis 1:3</cite>
        <blockquote>
            And God said,
            <q>Let there be light,</q>
            and there was light
        </blockquote>
    </p>
```

## `<sup></sup>` - Superscript

* A **non-self-closing** tag
* Raise text up (like exponents)
* Example
```html
    <p>
        square: x<sup>2</sup> = x * x
    </p>
```

## `<sub></sub>` - Subscript

* A **non-self-closing** tag
* Lower text down (like in chemical formulas)
* Example
```html
    <p>
        water: H<sub>2</sub>O
    </p>
```

## `<abbr></abbr>` - Abbreviation

* A **non-self-closing** tag
* Show full meaning on hover using the `title` attribute
* Example
```html
    <p>
        The <abbr title = "United States of America">USA</abbr> declared its independence on July 4, 1776.
    </p>
```

## `<dfn></dfn>` - Definition Term

* A **non-self-closing** tag
* Used to mark the term being defined in a sentence or paragraph
* Typically italicized by default in most browsers
* Help screen readers and semantic tools understand that this is a definition
* Example
```html
    <p>
        <dfn>USA</dfn> is a country located in North America
    </p>
```

## `<del></del>` - Deleted Text

* A **non-self-closing** tag
* Indicate text that was removed (often shown with a strike-through)
* Example
```html
    <p>
        <del>deleted</del> text
    </p>
```

## `<s></s>` - Strikethrough Text (No Semantic Meaning)

* A **non-self-closing** tag
* Render text with a strikethrough line (like a horizontal line through it)
* Used to indicate inaccurate or no longer relevant content, but without semantic emphasis
* Example
```html
    <p>
        <s>strikethrough</s> text
    </p>
```

## `<ins></ins>` - Inserted Text

* A **non-self-closing** tag
* Indicate newly added text (often underlined)
* Example
```html
    <p>
        <ins>inserted</ins> text
    </p>
```

## `<u></u>` - Underlined Text (No Semantic Meaning)

* A **non-self-closing** tag
* Render text with an underline
* Don't carry any semantic meaning
* Example
```html
    <p>
        <u>underlined</u> text
    </p>
```

## `<code></code>` - Inline Code

* A **non-self-closing** tag
* Display code in monospace font
* Example
```html
    <p>
        <code>
            <h1>Hello World</h1>
        </code>
    </p>
```

## `<kbd></kbd>` - Keyboard Input

* A **non-self-closing** tag
* Represent keyboard input
* Example
```html
    <p>
        <kdb>Ctrl + V<kdb> is used to paste (Windows)
    </p>
```

## `<samp></samp>` - Sample Output

* A **non-self-closing** tag
* Display computer output
* Example
```html
    <p>
        1 + 1 = <samp>2</samp>
    </p>
```

## `<var></var>` - Variable

* A **non-self-closing** tag
* Represent variables in math or programming
* Example
```html
    <p>
        <var>x</var> = 1/2
    </p>
```

## `<ruby></ruby>` - Ruby Annotation

* A **non-self-closing** tag
* Used for pronunciation or annotation

## `<rt></rt>` - Ruby Text

* A **non-self-closing** tag
* Provide the pronunciation or meaning

## `<rp></rp>` - Ruby Parentheses

* A **non-self-closing** ta  g
* Show in browsers that don’t support ruby
* Example
    ```html
        <ruby>
            臺
            <rp>(</rp>
            <rt>ㄊㄞˊ</rt>
            <rp>)</rp>
        </ruby>
        <ruby>
            灣
            <rp>(</rp>
            <rt>ㄨㄢ</rt>
            <rp>)</rp>
        </ruby>
        <ruby>
            Taiwan
            <rp>(</rp>
            <rt>tɑɪˈwɑn</rt>
            <rp>)</rp>
        </ruby>
    ```

## `<bdi></bdi>` - Bidirectional Isolation

* A **non-self-closing** tag
* Used to isolate part of the text that may have a different text direction
* Helps avoid layout issues when mixing left-to-right (LTR, e.g. Chinese, English, etc) and right-to-left (RTL, e.g. Arabic, Hebrew, etc) languages
* The browser auto-detects the direction of the content inside `<bdi></dbi>`
* Not supported for `Appal Safari`
* Example
```html
    <p>username: <bdi>Caesar</bdi> 18 years old</p> <!--LTR English-->
    <p>username: <bdi>克獨</bdi> 18 years old</p> <!--LTR Chinese-->
    <p>username: <bdi>أحمد</bdi> 18 years old</p> <!--RTL Arabic-->
    <p>username: <bdi>דניאל</bdi> 18 years old</p> <!--RTL Hebrew-->
```

## `<bdo></bdo>` - Bidirectional Override

* A **non-self-closing** tag
* Used to force a specific text direction, overriding the browser’s default or natural direction
* You must use the `dir` attribute with a value of:
    1. `ltr` left to right
    2. `rtl` right to left
* Example
```html
    <p>Normal: 1234 السلام</p>
    <p>Forced LTR: <bdo dir = "ltr">1234 السلام</bdo></p>
    <p>Forced RTL: <bdo dir = "rtl">1234 السلام</bdo></p>
```

## `<!---->` - Comment

* A **non-self-closing** tag
* Anything between `<!--` and `-->` will be treated as a comment and won't be shown on the webpage
* Example
```html
    <!--single line comment-->
    <!--
        multi-line
        comment
    -->
```