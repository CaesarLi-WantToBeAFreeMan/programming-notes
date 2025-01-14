# Title: Course04: lifecycle hooks
# Author: Caesar James LEE
# Date: January 14, 2025
## what's lifecycle hooks
* `hook` is a curved device used to catch or hold things
* lifecycle diagram
![lifecycle diagram](./markdown%20images/lifecircle.png)
1. `setup` hook
    * It's the earliest called hook
2. `beforeCreate` hook
    * Calls when the instance is initialized and `props` are resolved
    * Then `props` will be defined as reactive properties, and the state (`data()`, `computed`, ...) will be set up
3. `created` hook
   * Calls after the instance has finished processing all state-related options
   * After the hook called, `data`, `computed`, `mothods` and `watchers` have been set up
   * the `mount` phase has not been started, and the `$el` property will not be available yet
4. `beforeMount` hook
    * Calls before the component is to be mounted
    * After the hook called, the component has been finished setting up, but no DOM nodes have been created yet
5. `mounted` hook
    * Calls after the component has been mounted
    * A component is considered mounted after all of its child components has been mounted **but async components**
6. `beforeUpdate` hook
    * Calls before the component is about to update its DOM tree due to a reactive state change
    * You can access the DOM state before updates the DOM
7. `updated` hook
    * Calss after the component has been updated its DOM tree due to a reactive state change
8. `beforeUnmount` hook
    * Calls before a component instance is to be unmounted
    * When the hook is called, the component instance is still fully functional, in other word, you can use the component instance
9.  `unmounted` hook
    * Calls after a component instance has been unmounted
    * A component is considered unmounted after all of its child components have been unmounted and all of its reactive effects (render effect and `computed`, `watchers`) have been stopped
* We can pass a function into a hook to change something, like:
    ```javascript
        beforeChange: () =>{
            console.log("this is before change hook era");
        }
    ```