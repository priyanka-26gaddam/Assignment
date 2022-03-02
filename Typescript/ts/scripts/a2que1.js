var fib = function (previousNo, currentNo) {
    var foo = previousNo + currentNo;
    return {
        current: foo,
        next: function () {
            return fib(currentNo, foo);
        }
    };
};
var generator = fib(2, 3);
console.log(generator.current);
var result = generator.next();
console.log(result.current);
//# sourceMappingURL=a2que1.js.map