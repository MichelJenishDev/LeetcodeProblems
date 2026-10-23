/**
 * @return {Function}
 */
var createHelloWorld = function() {
    const grt ="Hello World";
    return function(...args) {
        return grt;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello Wo
**/
