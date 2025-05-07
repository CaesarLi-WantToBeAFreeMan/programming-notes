# week #4: Testability And Mock Object

# Platform: Edx

# Course Name: DelftX ST1x Automated Software Testing: Unit Testing, Coverage Criteria and Design for Testability

# Author: Caesar James LEE

## Unknown Keywords

| English           | Pronunciation     | Chinese Meaning            |
| :---------------: | :---------------: | :------------------------: |
| flaky             | ˈflеkɪ            | 薄片的；成層狀的；不穩定的   |
| mock              | mɑk               | 假的；模擬的                |
| invoice           | ˈɪnvɒɪs           | 開……的發票；將……列入清單     |


## Unknown phrase

| English               | Pronunciation     | Chinese Meaning            |
| :-------------------: | :---------------: | :------------------------: |
| so on and so forth    | so ɑn ænd so forθ | 等等                       |

## test levels

1. `unit testing`:
    * test a single and isolated unit like a function, method, class, etc
    * isolated from an external systems (e.g., databases, networks)
    * advantages
        1. very fast
        2. easy to control using parameters or mocks
        3. easy to write and maintain
    * disadvantages
        1. less real
        2. some bugs cannot be reproduced at this level
2. `system testing`
    * test the complete system as a whole (end-to-end)
    * mimic real user workflows in a production-like environment
    * advantages
        1. very realistic
        2. capture the user perspective
    * disadvantages
        1. slow
        2. hard to write
        3. flaky
3. `integration testing`
    * test the interaction between multiple components or units
    * ensures that units work together correctly
    * often include external dependencies like databases, APIs, or file systems
    * advantages
        1. more realistic than `unit testing`
        2. detect bugs in the interfaces or communication between parts
    * disadvantages
        1. slower than `unit testing`
        2. more complex to write and maintain
        3. may require set up real or fake environment

```mermaid
    graph TD;
    subgraph left [testing level]
        direction TB;
        unit([unit testing<br>🟩]);
        integration([integration testing<br>🟨]);
        system([system testing<br>🟧]);
        manual([manual testing<br>🟥]);
    end;

    subgraph right [properties]
        direction TB;
        unitDescription[[cheap<br>fast<br>simple<br>frequent]];
        box[ ]:::invisible;
        box[ ]:::invisible;
        manualDescription[[expensive<br>slow<br>complex<br>rare]];
    end;

    unit --> unitDescription;
    manual --> manualDescription;

    style box opacity:0;
```