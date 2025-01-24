# Title: Course 04: Connect Database
# Date: January 23, 2025
# Author: Caesar James LEE
## `application.properties`
* A configuration file to externalize configuration settings
* This file typically located in `src/main/resources` directory
* format: `key = value`
* common used cases & settings
    * server
        1. `server.port`
            * Server HTTP port
            * Default value: `8080`
        2. `server.address`
            * Network address to which the server should bind
        3. `server.error.path`
            * Path of the error controller
            * Default value: `/error`
        4. `server.servlet.encoding.charset`
            * Charset of HTTP requests and responses
            * Default value: `UTF-8`
        5. `server.servlet.context-path`
            * Context path of the application.
    * database
        1. `spring.datasource.url`
            * JDBC URL of the database
        2. `spring.datasource.username`
            * Login username of the database
        3. `spring.datasource.password`
            * Login password of the database
        4. `spring.datasource.driver-class-name`
            * Fully qualified name of the JDBC driver
    * application
        1. `spring.application.admin.enabled`
            * Whether to enable admin features for the application
            * Default value: `false`
        2. `spring.application.group`
            * Application group
        3. `spring.application.name`
            * Application name
        4. `spring.application.version`
            * Application version
* And you can also use `yml` format for `application.yml`, but you need to delete `application.properties`
* format:
    ```yml
        parentKey:
            childKey: value
    ```