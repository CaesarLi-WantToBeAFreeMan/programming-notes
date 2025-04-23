# 標題：02 Head

# 作者：李克獨（CJL）

## `<title></title>` 標籤

* **非自關閉** 的標籤  
* 用來設定網頁的標題  
* 內容只能是 **純文字**  
* 顯示在瀏覽器的標題列或分頁上  
* 對於 `SEO`（搜尋引擎最佳化）非常重要，搜尋引擎會依據它來判斷頁面排序  
* ***注意事項***
    1. 這個標籤是每個 HTML 文件 **必備的**
    2. 一份 HTML 檔只能有一個 `<title>` 標籤
    3. 搜尋引擎通常只顯示 **50 到 60 個字元** 的標題，所以建議保持簡短
* 範例
    ```html
        <title>02 Head</title>
    ```

## `<meta>` 標籤

* **自關閉** 的標籤
* 跟 `Meta Platforms, Inc`（臉書母公司）沒關係 😄️  
* 用來設定頁面資訊，例如字元編碼、作者、描述、關鍵字、視窗設定等

### 1. 字元編碼（Character Encoding）
* 指定 HTML 檔案的字元集，常用 `UTF-8`，能支援全球多種語言的編碼  
```html
    <meta charset = "UTF-8">
```

### 2. 關鍵字（Keywords）
* 提供關鍵字給搜尋引擎用來理解你頁面的內容
```html
    <meta name = "keywords" content = "Caesar, HTML, programming, note, web">
```

### 3.  作者（Author）
* 指定這個頁面的作者
```html
    <meta name = "author" content = "Caesar James LEE">
```

### 4. 描述（Description）
* 提供一段簡短的頁面描述，搜尋結果中會顯示這段文字
```html
    <meta name = "description" content = "Caesar's HTML note 02 Head"
```

### 5. 視窗設定（Viewport）
* 針對行動裝置最佳化您的網站
* 讓網頁在手機或平板上顯示得更好
* 把版面寬度設定為裝置寬度，初始縮放比例為 100%
* `viewport` 是指使用者裝置螢幕上可看到的網頁區域
* **最重要** 的行動裝置設定
```html
    <meta name = "viewport" content = "width = device-with, initial scale = 1.0">
```

### 6. 強制使用 `Microsoft Edge` 引擎（在 `IE` 中）
* 在 `Microsoft Internet Explorer` 開啟時，強制使用較新的 `Microsoft Edge` 排版引擎
```html
    <meta http-equiv = "X-UA-Compatible" content = "IE=edge">
```

### 7. 自動重新整理頁面（Auto Refresh）
* 每 30 秒重新載入一次頁面
```html
    <meta http-equiv = "refresh" content = "30">
```

## <base> 標籤
* **自關閉** 的標籤
* 指定所有相對路徑的 **基礎網址**（base URL）
* 對於引用圖片、樣式表、或 JavaScript 很有幫助
* 範例
```html
    <!--set base directory-->
    <base href = "images/02/">
```

## <link> 標籤
* **自關閉** 的標籤
* 定義目前文件和外部資源的關係
* 常用來：
    1. 連結外部樣式表（**詳見 CSS 筆記**）
    2. 加入 favicon（網頁分頁上那個小圖示）
* 注意事項
    * `.ico` 格式支援最廣，不過 `.png`、`.svg` 等也能用
* [這是一個免費的 favicon 製作網站](https://www.favicon.cc/)

### 連接 favicon
* 範例
```html
    <base href = "images/02/">
    <!--HTML logo-->
    <link rel = "icon" type = "image/png" href = "HTMLIcon.png">
```

* Favicon 格式支援表格

| 瀏覽器/類型        | ICO           | PNG       | GIF       | JPEG          | SVG           |
| :---------------: | :-----------: | :-------: | :-------: | :-----------: | :-----------: |
| 檔案類型           | image/x-icon  | image/png | image/gif | image/jpeg    | image/svg+xml |
| Google Chrome     | ✅           | ✅        | ✅       | ✅            | ✅           |
| Mozilla Firefox   | ✅           | ✅        | ✅       | ✅            | ✅           |
| Microsoft Edge    | ✅           | ✅        | ✅       | ✅            | ✅           |
| Opera             | ✅           | ✅        | ✅       | ✅            | ✅           |
| Apple Safari      | ✅           | ✅        | ✅       | ✅            | ✅           |