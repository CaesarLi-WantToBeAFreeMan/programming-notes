# week #3: Structural Testing And Code Coverage

# Platform: Edx

# Course Name: DelftX ST1x Automated Software Testing: Unit Testing, Coverage Criteria and Design for Testability

# Author: Caesar James LEE

## Unknown Keywords

| English           | Pronunciation     | Chinese Meaning            |
| :---------------: | :---------------: | :------------------------: |
| adequacy          | ˈædǝkwǝsɪ         | 適當；恰當；足夠            |
| interpret         | ɪnˈtɝprɪt         | 解釋；理解；口譯            |
| accurate          | ˈækjǝrɪt          | 準確的；精確的              |
| through           | θru               | 直達的；貫穿的；完成的       |
| detect            | dɪˈtɛkt           | 發現；查出                  |
| smell             | smɛl              | 氣味；香味；臭味；嗅覺       |
| vulnerability     | ˌvʌlnǝrǝˈbɪlǝtɪ   | 脆弱性；弱點                |
| oval              | ˈovḷ              | 卵形的；橢圓形的            |
| routine           | ruˈtin            | 日常工作；固定劇目          |
| rhombus           | ˈrɑmbǝs           | 菱形                       |
| hexagon           | ˈhɛksǝˌɡǝn        | 六角形                     |
| trapezoid         | ˈtræpǝˌzɒɪd       | 梯形                       |
| asymmetric        | ˌæsɪˈmɛtrɪk       | 不對稱的                   |
| parallelogram     | ˌpærǝˈlɛlǝˌɡræm   | 平行四邊形                 |

## structural testing

* Use the internal structure of a program to design test cases

## code coverage

* how much of the code is executed by your tests

1. `line coverage`
    * test whether each line of code has been executed at least once
2. `function/method coverage`
    * test whether each function or method has been called at least once
3. `statement coverage`
    * test whether every individual statement has been executed at least once
    * tip: ***a statement may take up multiple lines***
4. `decision coverage` aka `branch coverage`
    * test whether all possible result (`true` or `false`) of each decision point has been evaluated
5. `condition coverage`
    * test whether every boolean sub-expression has been evaluated both `true` and `false` at least once
6. `decision/condition coverage`
    * combine `decision coverage` and `condition coverage`
7. `modified condition/decision coverage`
    * test whether each individual condition within a decision independently affect the result
8. `multiple condition coverage`
    * test all possible combinations of boolean conditions in a decision

### run test cases with code coverage

* we just need to click `Run 'className' with Coverage` button in `JetBrains InTelliJ IDEA`

### code coverage tools

1. `C/C++`
    * `gcov`
        * features
            1. work with `GCC`
            2. reports statement-level coverage
        * open source (license)
            * ✅ (GNU GPL)
        * IDE
            1. CLI tool (with `Microsoft Visual Studio Code`, `Eclipse CDT`)
        * platform
            1. `Linux`
            2. `Microsoft Windows` (via `WSL`, `MinGW`)
            3. `Apple macOS`
    * `Icov` (frontend for `gcov`)
        * features
            1. generate HTML reports from `gcov`
            2. filter and combine results
        * open source
            * ✅
        * IDE
            1. CLI
        * platform
            1. `Linux`
            2. `Apple macOS`
    * `BullseyeCoverage`
        * features
            1. support `branch coverage`, `condition coverage` and `statement coverage`
            2. commercial product with detailed GUI
        * open source
            * ❌
        * IDE
            1. `Microsoft Visual Studio`
            2. `Eclipse`
        * platform
            1. `Linux`
            2. `Microsoft Windows`
    
2. `Java`
    * `JaCoCo` (`Java Code Coverage`)
        * features
            1. support `line coverage`, `branch coverage` and `instruction coverage`
            2. generate HTML, XML and CSV reports
            3. can be integrated with `Maven`, `Gradle` and `Ant`
        * open source (license)
            * ✅ (EPL)
        * IDE
            1. `JetBrains IntelliJ IDEA`
            2. `Eclipse`
        * platform
            1. `Linux`
            2. `Microsoft Windows`
            3. `Apple macOS`
    * `Cobertura`
        * features
            1. support `line coverage` and `branch coverage`
            2. generate HTML and XML reports
            3. can be integrated with `Maven` and `Ant`
        * open source (license)
            * ✅ (EPL)
        * IDE
            1. `JetBrains IntelliJ IDEA` via plugins
            2. `Eclipse`
        * platform
            1. `Linux`
            2. `Microsoft Windows`
            3. `Apple macOS`

3. `Python`
    * `Coverage.py`
        * features
            1. support `line coverage` and `branch coverage`
            2. generate HTML ,XML and terminal reports
            3. can be integrated with `pytest` and `unittest`
        * open source (license)
            * ✅ (Apache 2.0)
        * IDE
            1. `JetBrains PyCharm`
            2. `Microsoft Visual Studio Code`
        * platform
            1. `Linux`
            2. `Microsoft Windows`
            3. `Apple macOS`

4. `JavaScript/TypeScript`
    * `Istanbul` (nyc CLI)
        * features
            1. support `statement coverage`, `branch coverage`, `function coverage` and `line coverage`
            2. generate HTML , Icov, text reports
            3. word with `Mocha`, `Jest` and `AVA`
        * open source
            * ✅
        * IDE
            1. `Microsoft Visual Studio Code`
            2. `JetBrains WebStorm`
        * platform
            1. `Linux`
            2. `Microsoft Windows`
            3. `Apple macOS`
    * `Jest` (build-in `Istanbul`)
        * features
            1. build-in `code coverage`
            2. easy setup with `react`/`node`
        * open source
            * ✅
        * IDE
            1. `Microsoft Visual Studio Code`
            2. `JetBrains WebStorm`
        * platform
            1. `Linux`
            2. `Microsoft Windows`
            3. `Apple macOS`

5. universal
    * `Codecov`
        * features
            1. aggregate report from many languages
            2. `GitHub`/`Gitlab`/`Bitbucket` integration
            3. visualized diffs and PR (`pull request`)s
        * open source
            * ❌ service
        * IDE
            1. browser-integrated
        * platform
            1. browsers
    * `SonarQube`
        * features
            1. code quality analysis + coverage
            2. detect bugs, code smells and vulnerabilities
        * open source
            * ✅ community version
        * IDE
            1. `JetBrains IntelliJ IDEA`
            2. `Eclipse`
            3. `Microsoft Visual Studio Code` (via plugin)
        * platform
            1. `Linux`
            2. `Microsoft Windows`
            3. `Apple macOS`
            4. browsers

## program flowchart

* a visual diagram that shows the logical flow of a program or process
* use standard symbols to describe the sequence of operations
* help people understand how the program works, detects logic errors, or documents a system
* basic flowchart symbols

| symbol                | name          | meaning                                       |
| :-------------------: | :-----------: | :-------------------------------------------: |
| oval                  | terminator    | start/end of a process or program             |
| rectangle             | process       | a task, action, or operation                  |
| diamond               | decision      | a condition or branch                         |
| parallelogram         | input/output  | represent data input or output from a process |
| line with arrowhead   | flowline      | show the flow direction between shapes        |

### flowchart tools

1. `draw.io` (`diagrams.net`)
    * features
        1. easy drag-and-drop
        2. cloud save (`Google Drive`, `Microsoft OneDrive`)
        3. collaboration
        4. templates
    * type
        * web-based and desktop
    * open source (license)
        * ✅ (Apache 2.0)
    * platforms
        1. `Linux`
        2. `Microsoft Windows`
        3. `Apple macOS`
        4. browser
    * IDE support
        1. `Microsoft Visual Studio Code` (via plugin)
        2. `Atlassian Jira`
        3. `Atlassian Confluence`
2. `Lucidchart`
    * features
        1. real-time collaboration
        2. team sharing
        3. professional templates
        4. enterprise features
    * type
        * web-based
    * open source
        * ❌
    * platforms
        1. browsers
    * IDE support
        1. `Microsoft Office`
        2. `Google Workspace`
3. `Microsoft Visio`
    * features
        1. advanced diagramming
        2. data-linked diagrams
        3. business modeling
    * type
        * desktop & web-based
    * open source
        * ❌ (paid)
    * platforms
        1. `Microsoft Windows`
        2.  browsers
    * IDE support
        1. `Microsoft Office`
4. `Mermaid`
    * features
        1. create flowcharts, sequence diagram and Gantt charts using code
        2. perfect for devs
    * type
        * text-based diagram as code
    * open source (license)
        * ✅ (MIT)
    * platforms
        * **any**
    * IDE support
        1. `Microsoft Visual Studio Code` (vis plugin)
        2. GitHub markdown
        3. `Obsidian`
5. `yEd Graph Editor`
    * features
        1. auto-layout
        2. import/export diagrams
        3. good for flowcharts and graphs
    * type
        * desktop
    * open source
        * ❌
    * platforms
        * **any**
    * IDE support
        * **none**
6. `PlantUML`
    * features
        1. generate XML and flowcharts from plain text
        2. version-controlled diagrams
    * type
        * text-based diagram generator
    * open source (license)
        * ✅ (GPL, MIT, etc)
    * platforms
        * **any**
    * IDE support
        1. `JetBrans IntelliJ IDEA`
        2. `Eclipse`
        3. `Microsoft Visual Studio Code`
7. `Creately`
    * features
        1. visual collaboration
        2. templates
        3. team diagrams
    * type
        * web-based & desktop
    * open source
        * ❌
    * platforms
        1. `Microsoft Windows`
        2. `Apple macOS`
        3. browsers
    * IDE support
        1. `Google Drive`
        2. `Slack`
8. `Whimsical`
    * features
        1. beautiful flowcharts
        2. mind maps
        3. fast & minimal UI
    * type
        * web-based
    * open source
        * ❌
    * platforms
        1. browsers
    * IDE support
        * **none**
9. `Gliffy`
    * features
        1. simple drag-and-drop diagram tool
        2. `Atlassian` integration
    * type
        * web-based
    * open source
        * ❌
    * platforms
        1. browser
    * IDE support
        1. `Atlassian Jira`
        2. `Atlassian Confluence`
10. `Zen Flowchart`
    * features
        1. Ultra-simple UI for fast, clean flowchart
    * type
        * web-based
    * open source
        * ❌
    * platforms
        1. browsers
    * IDE support
        * **none**

## basic `mermaid` syntax for flowchart

1. direction
`flowchart TD`
* define the direction of the flowchart
* direction table

| code  | meaning       |
| :---: | :-----------: |
| `TD`  | top-down      |
| `BT`  | bottom-top    |
| `LR`  | left-right    |
| `RL`  | right-left    |

2. define a node
`A[name]`
`A["name"]`
* define a rectangle node named `A`, and its value is `name`

3. flow line
`A --> B`
* define a flow between `A` and `B` nodes
`A[node A] --> B[node B]`
* define node `A` and `B`, and a flow between `A` and `B`
* arrow table

| code          | meaning               |
| :-----------: | :-------------------: |
| `-->`         | normal flow           |
| `--text-->`   | add condition/message |
| `-->\|text\|`   | add condition/message |
| `-.->`        | optional/alternative  |
| `==>`         | emphasized flow       |

4. shape
* shape list

| code              | shape                 |
| :---------------: | :-------------------: |
| `[a]`             | rectangle             |
| `(a)`             | rounded rectangle     |
| `((a))`           | circle                |
| `([a])`           | stadium               |
| `[[a]]`           | subroutine            |
| `{a}`             | rhombus               |
| `{{a}}`           | hexagon               |
| `[/a/]`           | trapezoid             |
| `[\a\]`           | inverted trapezoid    |
| `>a]` || `[a<`    | asymmetric            |

* `mermaid` doesn't support parallelogram, so we have to use rectangle for general I/O

* example
    * code
    ```java
        public String grade(int score){
            if(score < 0 || score > 100)
                return "invalid";
            else if(score < 60)
                return "F";
            else if(score < 65)
                return "D-";
            else if(score < 70)
                return "D";
            else if(score < 75)
                return "C-";
            else if(score < 80)
                return "C";
            else if(score < 85)
                return "B";
            else if(score < 90)
                return "B+";
            else if(score < 95)
                return "A";
            return "A+";
        }
    ```
    * mermaid flowchart
    ```mermaid
        flowchart TD
        start([start]) --> condition{"score < 0 || score > 100"}
        condition -- yes --> returnInvalid["return 'invalid'"] --> End
        condition -- no --> condition1{"score < 60"}
        condition1 -- yes --> returnF["return 'F'"] --> End
        condition1 -- no --> condition2{"score < 65"}
        condition2 -- yes --> returnDMinus["return 'D-'"] --> End
        condition2 -- no --> condition3{"score < 70"}
        condition3 -- yes --> returnD["return 'D'"] --> End
        condition3 -- no --> condition4{"score < 75"}
        condition4 -- yes --> returnCMinus["return 'C-'"] --> End
        condition4 -- no --> condition5{"score < 80"}
        condition5 -- yes --> returnC["return 'C'"] --> End
        condition5 -- no --> condition6{"score < 85"}
        condition6 -- yes --> returnB["return 'B'"] --> End
        condition6 -- no --> condition7{"score < 90"}
        condition7 -- yes --> returnBPlus["return 'B+'"] --> End
        condition7 -- no --> condition8{"score < 95"}
        condition8 -- yes --> returnA["return 'A'"] --> End
        condition8 -- no --> returnAPlus["return 'A+'"] --> End
        End([end])
    ```