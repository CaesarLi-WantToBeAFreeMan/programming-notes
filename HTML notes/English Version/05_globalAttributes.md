# Title: 05 Global Attributes

# Author: Caesar James LEE(CJL)

## Global Attributes

* Can be applied to any HTML element
* Used to control behavior, accessibility, styling, and JavaScript interactions

## `id` Unique Identifier

* Specify a unique identifier for an HTML element
* Must be **unique** within the entire HTML document
* Commonly used with CSS (for styling), JavaScript (for interaction), and anchor links
* One of the **most important** global attributes
* Example
```html
    <p id = "topic-1">topic 1</p>
    <a href = "#topic-1">go to topic 1</a>
    <div id = "container">
        <!-- content styled with CSS or manipulated with JavaScript -->
    </div>
```

## `class` - Class Name(s)

* Specify one or more class names for an element
* Used in CSS and JavaScript for styling and behavior
* Another **essential** global attribute
* Typically used to target elements in CSS
* Example
```html
    <p class = "descriptions highlights">content</p>
```

## `accesskey` - Keyboard Shortcut

* Define a shortcut key (usually a single letter or number) to quickly access or focus an element
* To prevent **conflicts**, browsers require modifier keys
* Browser shortcut table

| Browser           | Shortcut Key Combination      |
| :---------------: | :---------------------------: |
| Google Chrome     | `alt` + accesskey             |
| Microsoft Edge    | `alt` + accesskey             |
| Apple Safari      | `alt` + accesskey             |
| Opera (v15+)      | `alt` + accesskey             |
| Opera (pre-v15)   | `shift` + `esc` + accesskey   |
| Mozilla Firefox   | `alt` + `shift` + accesskey   |

* Note: **It's generally not recommended to use accesskey**
    1. Not all keys are available across international keyboard layouts
    2. May conflict with browser or OS shortcuts
* Example
```html
    <a href = "https://www.google.com/" target = "_blank" accesskey = "g">visit Google</a>
```

## `contenteditable` - Editable Content

* Indicate whether the content inside an element is editable by the user
* Values
    1. `true`
    2. `false` (`default`)
* Example
```html
    <p contenteditable = "true">you can edit this paragraph</p>
    <p>this one is not editable</p>
```

## `hidden` - Hide an Element

* Prevent the element from being displayed on the page
* Example
```html
    <p>visible text</p>
    <p hidden>hidden text</p>
```

## `style` - Inline CSS

* Apply inline CSS styles directly to an element
* Note: Prefer **external** or **internal** CSS for larger projects
* **Watch CSS notes**
* Example
```html
    <div style = "background-color: black;">
        <p style = "font-size: 30px; color: red; font-weight: lighter; text-align: center;">styled text</p>
    </div>
```

## `title` - Tooltip Text

* Set the tooltip text that appears when the user hovers over the element
* Example
```html
    <a href = "https://www.google.com/" target = "_blank" title = "visit Google">visit Google</a>
```

## `language` - Language Hint

* Specify the language of the content inside the element using an ISO language code
* ISO code Table

| Language                              | ISO Code  |
| :-----------------------------------: | :-------: |
| Abkhazian	                            | ab        |
| Afar	                                | aa        |
| Afrikaans	                            | af        |
| Akan	                                | ak        |
| Albanian	                            | sq        |
| Amharic	                            | am        |
| Arabic	                            | ar        |
| Aragonese	                            | an        |
| Armenian	                            | hy        |
| Assamese	                            | as        |
| Avaric	                            | av        |
| Avestan	                            | ae        |
| Aymara	                            | ay        |
| Azerbaijani	                        | az        |
| Bambara	                            | bm        |
| Bashkir	                            | ba        |
| Basque	                            | eu        |
| Belarusian	                        | be        |
| Bengali (Bangla)                      | bn        |
| Bihari	                            | bh        |
| Bislama	                            | bi        |
| Bosnian	                            | bs        |
| Breton	                            | br        |
| Bulgarian	                            | bg        |
| Burmese	                            | my        |
| Catalan	                            | ca        |
| Chamorro	                            | ch        |
| Chechen	                            | ce        |
| Chichewa, Chewa, Nyanja               | ny        |
| Chinese	                            | zh        |
| Chinese (Simplified)                  | zh-Hans   |
| Chinese (Traditional)                 | zh-Hant   |
| Chuvash	                            | cv        |
| Cornish	                            | kw        |
| Corsican	                            | co        |
| Cree	                                | cr        |
| Croatian	                            | hr        |
| Czech	                                | cs        |
| Danish	                            | da        |
| Divehi, Dhivehi, Maldivian            | dv        |
| Dutch	                                | nl        |
| Dzongkha	                            | dz        |
| English	                            | en        |
| Esperanto	                            | eo        |
| Estonian	                            | et        |
| Ewe	                                | ee        |
| Faroese	                            | fo        |
| Fijian	                            | fj        |
| Finnish	                            | fi        |
| French	                            | fr        |
| Fula, Fulah, Pulaar, Pular            | ff        |
| Galician	                            | gl        |
| Gaelic (Scottish)                     | gd        |
| Gaelic (Manx)                         | gv        |
| Georgian	                            | ka        |
| German	                            | de        |
| Greek	                                | el        |
| Greenlandic	                        | kl        |
| Guarani	                            | gn        |
| Gujarati	                            | gu        |
| Haitian Creole	                    | ht        |
| Hausa	                                | ha        |
| Hebrew	                            | he        |
| Herero	                            | hz        |
| Hindi	                                | hi        |
| Hiri Motu                             | ho        |
| Hungarian	                            | hu        |
| Icelandic	                            | is        |
| Ido	                                | io        |
| Igbo	                                | ig        |
| Indonesian	                        | id, in    |
| Interlingua	                        | ia        |
| Interlingue	                        | ie        |
| Inuktitut	                            | iu        |
| Inupiak	                            | ik        |
| Irish	                                | ga        |
| Italian	                            | it        |
| Japanese	                            | ja        |
| Javanese	                            | jv        |
| Kalaallisut, Greenlandic              | kl        |
| Kannada	                            | kn        |
| Kanuri	                            | kr        |
| Kashmiri	                            | ks        |
| Kazakh	                            | kk        |
| Khmer	                                | km        |
| Kikuyu	                            | ki        |
| Kinyarwanda (Rwanda)                  | rw        |
| Kirundi	                            | rn        |
| Kyrgyz	                            | ky        |
| Komi	                                | kv        |
| Kongo	                                | kg        |
| Korean	                            | ko        |
| Kurdish	                            | ku        |
| Kwanyama	                            | kj        |
| Lao	                                | lo        |
| Latin	                                | la        |
| Latvian (Lettish)	                    | lv        |
| Limburgish (Limburger)	            | li        |
| Lingala	                            | ln        |
| Lithuanian	                        | lt        |
| Luga-Katanga	                        | lu        |
| Luganda, Ganda	                    | lg        |
| Luxembourgish	                        | lb        |
| Manx	                                | gv        |
| Macedonian	                        | mk        |
| Malagasy	                            | mg        |
| Malay	                                | ms        |
| Malayalam	                            | ml        |
| Maltese	                            | mt        |
| Maori	                                | mi        |
| Marathi	                            | mr        |
| Marshallese	                        | mh        |
| Moldavian	                            | mo        |
| Mongolian	                            | mn        |
| Nauru	                                | na        |
| Navajo	                            | nv        |
| Ndonga	                            | ng        |
| Northern Ndebele                      | nd        |
| Nepali	                            | ne        |
| Norwegian	                            | no        |
| Norwegian bokmål	                    | nb        |
| Norwegian nynorsk	                    | nn        |
| Nuosu	                                | ii        |
| Occitan	                            | oc        |
| Ojibwe	                            | oj        |
| Old Church Slavonic, Old Bulgarian    | cu        |
| Oriya	                                | or        |
| Oromo (Afaan Oromo)	                | om        |
| Ossetian	                            | os        |
| Pāli	                                | pi        |
| Pashto, Pushto	                    | ps        |
| Persian (Farsi)	                    | fa        |
| Polish	                            | pl        |
| Portuguese	                        | pt        |
| Punjabi (Eastern)	                    | pa        |
| Quechua	                            | qu        |
| Romansh	                            | rm        |
| Romanian	                            | ro        |
| Russian	                            | ru        |
| Sami	                                | se        |
| Samoan	                            | sm        |
| Sango	                                | sg        |
| Sanskrit	                            | sa        |
| Serbian	                            | sr        |
| Serbo-Croatian	                    | sh        |
| Sesotho	                            | st        |
| Setswana	                            | tn        |
| Shona	                                | sn        |
| Sichuan Yi                            | ii        |
| Sindhi	                            | sd        |
| Sinhalese	                            | si        |
| Siswati	                            | ss        |
| Slovak	                            | sk        |
| Slovenian	                            | sl        |
| Somali	                            | so        |
| Southern Ndebele	                    | nr        |
| Spanish	                            | es        |
| Sundanese	                            | su        |
| Swahili (Kiswahili)	                | sw        |
| Swati	                                | ss        |
| Swedish	                            | sv        |
| Tagalog	                            | tl        |
| Tahitian	                            | ty        |
| Tajik	                                | tg        |
| Tamil	                                | ta        |
| Tatar	                                | tt        |
| Telugu	                            | te        |
| Thai	                                | th        |
| Tibetan	                            | bo        |
| Tigrinya	                            | ti        |
| Tonga	                                | to        |
| Tsonga	                            | ts        |
| Turkish	                            | tr        |
| Turkmen	                            | tk        |
| Twi	                                | tw        |
| Uyghur	                            | ug        |
| Ukrainian	                            | uk        |
| Urdu	                                | ur        |
| Uzbek	                                | uz        |
| Venda	                                | ve        |
| Vietnamese	                        | vi        |
| Volapük	                            | vo        |
| Wallon	                            | wa        |
| Welsh	                                | cy        |
| Wolof	                                | wo        |
| Western Frisian	                    | fy        |
| Xhosa	                                | xh        |
| Yiddish	                            | yi, ji    |
| Yoruba	                            | yo        |
| Zhuang, Chuang	                    | za        |
| Zulu	                                | zu        |

* Example
```html
    <p lang = "en">Hello</p>
    <p lang = "zh-hant">你好</p>
```

## `draggable` - Make an Element Draggable

* Specify whether an element can be dragged
* By default, images and links are draggable
* Note: **To implement full drag-and-drop functionality, you'll need JavaScript**
* Demo: [05_globalAttributes.html](../Examples/05_globalAttributes.html)
* Example
```html
    <p id = "draggable-paragraph" draggable = "true" ondragstart = "drag(event)">draggable text</p>
    <p ondragstart = "drag(event)">another not draggable text</p>
```

## `inert` - Disable All Interactions

* Disable user interaction and focus for the element and all its children
* Content remain visible but is completely non-functional (e.g., can't click, type, etc)
* Ignored by screen readers and other accessibility tools
* Example
```html
    <div inert>
        <p>you can still see me</p>
        <button>you cannot click me</p>
    </div>
```

## `dir` - Set Text Direction

* Control the direction of text within the element
* Values
    1. `ltr` (`default`)
        * Left to right
    2. `rtl`
        * Right to left
    3. `auto`
        * Browser automatically determines the direction based on content
* Example
```html
    <p lang = "en" dir = "rtl">hello</p>
    <p lang = "zh-hant" dir = "rtl">你好</p>
```

## `spellcheck` - Enable or Disable Spell Checking

* Activate browser spell checking on certain elements
* Works on:
    1. `<input>` (except `type = "password"`)
    2. `<textarea>`
    3. Any element with `contenteditable = "true"`
* Example
```html
    <p lang = "en" spellcheck = "true">dont sho a mstak sugestion</p>
    <p lang = "en" contenteditable = "true" spellcheck = "true">sho a mstak sugestion</p>
```

## `enterkeyhint`- Virtual Keyboard "Enter" Key Label

* Useful for **mobile devices**
* Control the label on the "Enter" key in the virtual keyboard
* Values
    1. `done`
    2. `enter` (`default`)
    3. `go`
    4. `next`
    5. `previous`
    6. `search`
    7. `send`
* Example
```html
    <p contenteditable = "true">default enter</p>
    <p contenteditable = "true" enterkeyhint = "done">visual keyboard enter key becomes done</p>
    <p contenteditable = "true" enterkeyhint = "go">visual keyboard enter key becomes go</p>
    <p contenteditable = "true" enterkeyhint = "next">visual keyboard enter key becomes next</p>
    <p contenteditable = "true" enterkeyhint = "previous">visual keyboard enter key becomes previous</p>
    <p contenteditable = "true" enterkeyhint = "search">visual keyboard enter key becomes search</p>
    <p contenteditable = "true" enterkeyhint = "send">visual keyboard enter key becomes send</p>
```

## `inputmode` - Virtual Keyboard Type Hint

* Suggest the type of virtual keyboard to show on touchscreen devices
* Great for improving mobile **usability**
* Values
    1. `decimal`
    2. `email`
    3. `none`
        * No virtual keyboard should appear
    4. `numeric`
    5. `search`
    6. `tel`
    7. `text` (`default`)
    8. `url`
* Example
```html
    <p contenteditable = "true" inputmode = "decimal">decimal keyboard</p>
    <p contenteditable = "true" inputmode = "email">email keyboard</p>
    <p contenteditable = "true" inputmode = "none">no keyboard</p>
    <p contenteditable = "true" inputmode = "numeric">numeric keyboard</p>
    <p contenteditable = "true" inputmode = "search">search keyboard</p>
    <p contenteditable = "true" inputmode = "tel">tel keyboard</p>
    <p contenteditable = "true" inputmode = "url">url keyboard</p>
```

## `popover` – Built-in Popover Behavior

* Make an element behave like a floating popover
* No JavaScript required to open/close it
* Not supported in `Mozilla Firefox`
* Use `popovertarget` to reference the id of the popover
* Example
```html
    <p popover id = "popover-text">a popover text</p>
    <button popovertarget = "popover-text">toggle popover text</p>
```

## `tabindex` - Set Tab Order

* Control the keyboard tab order of focusable elements
* Start from 1 (lowest number gets focus first)
* Not often used unless you need precise control
```html
    <h2>top 6 search engine in March 2025</h2>
    <p><a href = "https://www.google.com/" target = "_blank" tabindex = "1">Google</a>: 89.74%, USA</p>
    <p><a href = "https://www.bing.com/" target = "_blank" tabindex = "2">bing</a>: 4.00%, USA</p>
    <p><a href = "https://yandex.com/" target = "_blank" tabindex = "5">YANDEX</a>: 2.49%, Russia</p>
    <p><a href = "https://www.yahoo.com/" target = "_blank" tabindex = "3">Yahoo!</a>: 1.33%, USA</p>
    <p><a href = "https://duckduckgo.com/" target = "_blank" tabindex = "4">DuckDuckGo</a>0.79%, USA</p>
    <p><a href = "https://www.baidu.com/" target = "_blank" tabindex = "6">Baidu</a>: 0.62%, China</p>
```

## `data-*` - Store Custom Data 

* Allow you to store extra information directly in HTML elements
* Data is private to the page/app and not saved after refresh
* Very flexible for temporary or per-page data
* Example
```html
    <p id = "user" data-username = "caesar">Caesar</p>
    <script>
        const user = document.querySelector("#user");
        console.log(`username:\t${user.dataset.username}`);
        //press F12 or right click inspect to open dev tools → Console to see the result
    </script>
```