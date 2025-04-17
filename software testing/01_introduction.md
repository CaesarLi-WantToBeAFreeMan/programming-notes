# week #0: Introduction

# Platform: Edx

# Course Name: DelftX ST1x Automated Software Testing: Unit Testing, Coverage Criteria and Design for Testability

# Author: Caesar James LEE

## Unknown Keywords

| English           | Pronunciation | Chinese Meaning   |
| :---------------: | :-----------: | :---------------: |
| flaky             | ˈflеkɪ        | 古裡古怪的         |
| pledge            | plɛdʒ         | 保證；抵押         |
| plagiarism        | ˈplеdʒǝˌrɪzǝm | 抄襲              |
| thereby           | ðɛrˈbaɪ       | 因此              |
| comply            | kǝmˈplaɪ      | 順從              |
| intensional       | ɪnˈtɛnʃǝnḷ    | 故意的            |
| constitute        | ˈkɑnstǝˌtjut  | 構成              |
| transgression     | trænsˈɡrɛʃǝn  | 罪過              |
| negligence        | ˈnɛɡlɪdʒǝns   | 粗心              |
| pedagogical       | ˌpɛdǝˈɡɑdʒɪkl | 教育學的          |
| collaborate       | kǝˈlæbǝˌrеt   | 合作              |
| hesitate          | ˈhɛzǝˌtеt     | 猶豫              |
| chaotic           | kеˈɑtɪk       | 混亂的            |
| whim              | hwɪm          | 突然的念頭        |
| annotation        | ˌænoˈtеʃǝn    | 註解              |
| assert            | ǝˈsɝt         | 斷言；主張擁有    |
| authentication    | ɒˌθɛntɪˈkеʃǝn | 證實             |

## Git & GitHub

### GitHub
* the most popular social network for developers
* enables developers from all over the world to share code

### Git
* also a very popular tool among developers
* enables developers to version their code in a professional way

### Fork
* to prevent somebody else from changing, adding, deleting or performing other operations on our own repository, we can use the `fork` feature
* `fork` creates an exact copy of a repository in our own GitHub account for our personal use or development
* steps
    1. go to a repository
    2. at the top-right corner, click on `fork` button
    3. choose your account

### Clone
* we will make a local copy(`clone`) of the online repository to change our local version and later push these changes to the online repository
* steps
    1. go to a repository
    2. click on the green `Code` button
    3. copy the URL
    4. open your terminal
    5. type `cd directory` to navigate to a directory where you want to save the project
    6. type `git clone URL`, where `URL` is the link you pasted, to clone the project

### Push to GitHub
* we will push our changes to the online GitHub repository
* steps
    1. type `cd directory` to navigate to the directory where your project is saved
    2. type `git add .` to store all the changes in the directory for commit
    3. type `git commit -m "massage"` to commit these changes, and the `message` should describe what changes you made
    4. type `git push origin [branch]` to push our changes to the online repository
        * `branch` is optional and refers to the specific branch you want to push to
        * by default, Git pushes to the branch you're currently working on
    5. if this is your first time using Git on your machine, you'll need to enter your GitHub username and password (or personal access token for newer GitHub authentication)

### Testing Project
* [GitHub](https://github.com/SERG-Delft/mooc-software-testing)

### First Test
* We have these two source codes:
* `GettingStarted.java`:
```java
    //package ...
    public class GettingStarted{
        public int addFive(int number){
            return number + 5;
        }
    }
```
* `GettingStartedTest.java`
```java
    //package ...
    import org.junit.jupiter.api.Assertions;//import Assertions method
    import org.junit.jupiter.api.Test;//import @Test annotation

    public class GettingStartedTest{
        @Test//indicates that the following method is a JUnit test
        public void addFiveTo20{
            int result = new GettingStarted().addFive(20);//get the return value of addFive(20) method
            Assertions.assertEquals(25, result);//we assert that our result is equal to 25
            //if the result is not equal to 25, we expect this test to fail
        }
    }
```
* `org.opentest4j.AssertionsFailedError`
* if the test (e.g. `Assertions.assertEquals(24, result)`) to fail, JetBrains IntelliJ Idea will give us the error
```
org.opentest4j.AssertionFailedError: 
Expected :24
Actual   :25
```

### Run All Assertions In A Folder
* steps
    1. right click the `gettingstarted` folder
    2. left click the `Run 'Tests in 'tudeflt.gettingstarted''`
* and then, at the bottom of JetBrans IntelliJ Idea, we can see which tests succeeded and failed