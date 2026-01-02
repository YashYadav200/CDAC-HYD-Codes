const { Console } = require("console")

var promis = new Promise(function(resolve, reject){// new alawys return object
    // //CODE IS EXECUTOR CODE
    // if(con=true){
    //     resolve(res) // if function is resolved pass reesult
    // }
    // else
    //     reject(err) // if function is not resolve
    var a =10, b = 4
    if(b!= 0){
        var res = a/b
        resolve(res)
    }
    else
        reject(new Error("Div Cannot be Zero"))
})
//console.log(promis)//giving object
//to consume promise 
//here when you consume promise as object there two argument a1 a2 1 call when promis is fuldil and other a2 when it fail
//thes code also ---------// promis.then(
//     res=> console.log("Output From Promisee : ",res),// Suucesfull// if single vaue no nees of (res) bracket
//     err=> console.log(err)//iunsuccesfull// if err all error it will sow so repleae it with message
//)
//consume promise -------]
promis.then(
    res => console.log("Output",res) // res, data we can use they are variable only
)
.catch(
   err => console.log(err)
)
const mypromise = new Promise((resolve,reject)=>{
setTimeout(()=>{
resolve ('foo')
},5600) // set time here 
})
mypromise
.then((x)=> {console.log("In A -"+x)})

.then((x)=> {console.log("In B -"+x)})
