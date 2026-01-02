// async function sayHello(){  // by using async it became promise
// // promise give {Heelllo} object
//     return "Helllo"
// }
// sayHello().then(
//     data=>(console.log(data))  // give hello
// )
// console.log(sayHello()) // give {}
// var sayHello1 = async function name(params) {
//     return "Hello"
// }
// var add = async ()=>
// {
//     return sayHello()
// }
var promise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("Promise Fullfiled")
    },3000) // promise take 3 seconds
})
async function fetchData() {  // not just promise now it any other javaScript function because await need function
    var data = await promise //let the promise take time it Async 
    // promise use then but in these we not use then
    console.log(data)
    console.log("End of Function")
    
}
fetchData();
