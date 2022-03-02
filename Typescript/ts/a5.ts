//a
function add(a = 6, b = 7)
{
    console.log(a+b);
}
let func = add();
console.log(func);

//b
function userFriends(username = "Priyanka", friends = ["priya","jillu"])
{
    console.log("Name is: "+username+" And his friends are: "+friends);
}
let func1 = userFriends();
console.log(func1);

//c
function names(...args:string[])
{
    return args[0]+args[1];
}

const values = ["Priya","Jillu"];
let func3 = names(...values);
console.log(func3);
