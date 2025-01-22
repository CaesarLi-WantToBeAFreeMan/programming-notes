# Title: Course 01: Introduction & Installation
# Date: Janurary 20, 2025
# Author: Caesar James LEE
## requirements
### 1. JDK
* 17+
* `java --version` to check version
### 2. Java Build Tools
#### `Maven`
* A powerful build automation tool primarily used for java projects
* **Simplies the process of building, managing dependencies, and managng the lifecycle of a project**
* It's used to **automate the build process**, **manage project dependencies**, **standardize project structure**, and **manage the roject lifecycle (from compilation to deployment)**
* Uses `pom.xml` (Project Object Model) to to define project dependencies, build configuration, plugins, and anothers
* Installation
    * `Windows`
        1. [download](https://maven.apache.org/download.cgi) **binary zip archive**
        2. Extract it to a directory (named `mavenPath`)
        3. `Windows + I` -> `System` -> `About` -> `Advanced system settings`
        4. `Environment Variables` -> `System Variables` -> `New` -> {`name`: `MAVEN_HOME`, `value`: `mavenPath/apache-maven-version`}, `version` means your version of maven
        5. `System Variables` -> `Path` -> `Edit` -> `New` -> `%MAVEN_HOME%/bin`
    * `MacOS`
        1. open `terminal`
        2. type `brew install maven`
    * `Linux`
        1. open `terminal`
        2. type `sodu apt update`
        3. type `sodu apt install maven`
* Verification
    1. open `cmd` or `powershell` on `windows`, or `terminal` on `MacOS` or `Linux`
    2. type `mvn -version`
#### `Gradle`
* An other build automation tool primarily used for java as well, although it can also be used with other programming languages
* Uses `build.gradel` to configure
* Instalation
    * `Windows`
        1. [download](https://gradle.org/releases/) the lastest version **binary-only**
        2. Extract it to a directory (named `gradlePath`)
        3. `System Variables` -> `New` -> {`name`: `GRADLE_HOME`, `value`: `gradlePath/gradle-version`}
        4. `System Variables` -> `Path` -> `Edit` -> `New` -> `%GRADLE_HOME%\bin`
    * `MacOS`
        1. open `terminal`
        2. type `brew install gradle`
    * `Linux`
        1. open `terminal`
        2. type `sodu apt update; sodu apt install gradle`
    * Verification
        1. open `cmd` or `powershell` on `windows`, or `terminal` on `MacOS` or `Linux`
        2. type `gradle -v`
* Differences
    * | Features              | `Maven`                      | `Gradle`                               |
    * | :-------------------- | :--------------------------: | :------------------------------------: |
    * | Configuration         | `pom.xml`                    | `build.gradle`                         |
    * | Build Performance     | Slower for large projects    | Faster for large projects              |
    * | Flexibility           | Less                         | More                                   |
    * | Multi-project Build   | Support, but less efficient  | Excellent                              |
    * | Learning Curve        | Easier for beginners         | Steeper learning curve                 |
    * | IDE Integration       | IntelliJ IDEA, Eclipse       | IntelliJ IDEA, Eclipse, Android Studio |
    * | Use Cases             | Enterprise-grade, large      | Modern, Android, microservices         |
### 3. IDE / Text Editor
* `IntelliJ IDEA`
* needs [`Spring Tools`](https://spring.io/tools)
    * `Eclipse`
    * `Microsoft Visual Studio Code`
### 4. API Testing Tool
* These tools are commonly used for making HTTP requests and testing APIs
* These're useful especially when building REST APIs or microservices
#### `Postman`
* A GUI-based tool nad that's used for testing RESTful APIs
* Easily send HTTP requests (`GET` for reading, `POST` for creating, `PUT` for creating or updating completely, `PATCH` for updating partly, `DELETE` for deleting, etc) to web servers and view responses
* You can verify API works as expected before integrating it with a front-end applications or other services
* Installation
    * `Windows`
        1. [download](https://www.postman.com/downloads/)
        2. click the `setup.exe` to run and use
    * `MacOS`
        1. open `terminal`
        2. type `brew install --cask postman`
    * `Linux`
        1. open `terminal`
        2. type `sudo apt update; sudo apt install postman`
#### `HTTP Client` (IntelliJ)
* Generally referring to libraries or tools and that's used to send HTTP requests
* A build-in HTTP Client class `java.net.http.httpClient` starting from `Java 11`, which helps to make HTTP requests programmatically from Java
* You can use it if you installed JDK 11+
#### `cURL (client URL) / HTTPie`
* cURL is a command-line tool for making HTTP requests to a server, which supports many protocols such as HTTP, FTP, etc
* cURL is a useful tool for quick testing and interaction with Spring Boot API directly from the command line
* HTTPie likes cURL but that is designed to be more user-friendly
* Installatopn of `cURL`
    * `Windows`
        1. [download](https://curl.se/download.html) **`.zip` file**
        2. Extract it to a directory (named `curlPath`)
        3. `System Variables` -> `Path` -> `New` -> `curlPath\bin`
    * `MacOS`
        * pre-installed, but if not type `brew install curl` on `terminal`
    * `Linux`
        1. open `terminal`
        2. type `sodu apt update; sodu install curl`
* Verification of `cURL`
    1. open `cmd` or `powershell` on `Windows`, `terminal` on `MacOS` and `Linux`
    2. type `curl --version`
* Installation of `HTTPie`
    * `Windows`
        1. open `cmd` or `Powershell`
        2. type `choco install httpie` via `Chocolatey` or `pip install httpie` via `Python pip`
    * `MacOS`
        1. open `terminal`
        2. type `brew install httpie`
    * `Linux`
        1. open `terminal`
        2. type `sudo apt update; sudo apt install httpie`
* Verification of `HTTPie`
    1. open `cmd` or `Powershell` on `Windows`, `terminal` on `MacOS` or `Linux`
    2. type `http --version`
### 5.  Docker Desktop
* An easy-to-use application for running and managing `Docker containers` on your local machine
* Provides an interface for interacting with Dockers and allows developers to easily build, share and run containerized application
* Packages applications and its dependencies into a **single, portable unit** that can be run consistently across various environments
* Simplifies environment setup, isolates environments mean you can run multiple versions or different application, helps in developing microservices, which means an architectural pattern of dividing a large project into separate and different sub-projects
* Installation
    * `Windows`
        1. [download](https://www.docker.com/products/docker-desktop/)
        2. Enables `WSL2 (Windows Subsystem for Linux 2)` during the installation
        3. Enables `Hyper-V` during the installation
    * `MacOS`
        1. [download](https://www.docker.com/products/docker-desktop/)
    * `Linux`
        1. open `terminal`
        2. type these code to install `Docker`
            ```bash
                sudo apt update; sudo apt install apt-transport-https ca-certificates curl software-properties-common
            ```
        3. type these code to install `Docker Rspository`
            ```bash
                curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
                sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

            ```
        4. type these code to install `Docker Engine`
            ```bash
                sudo apt update; sudo apt install docker-ce

            ```
        5. type these code to start Docker
            ```bash
                sudo systemctl start docker; sudo systemctl enable docker

            ```
* Verification
    1. open `cmd` or `Powershell` on `Windows`, or `terminal` on `MacOS` and `Linux`
    2. type `docker --version`