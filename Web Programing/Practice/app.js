var express = require("express")
const { deflateSync } = require("zlib")
// app can any variable
var app = express() // constructer express
app.get("/", function(req,resp){
    resp.send("Welcome to Express!!") // like create content length conteten type all that code no need 
    //already return in exprees
})
app.get("/foo", function(req,resp){
    resp.send("<h1>Hello Fooo</h1>")  // if i wrte http://localhost:3000/foo shoow these statement
})
app.get("/Details",(req,resp)=>{
    var namesarr = ['dsdas','ddasdsd','deflatec']
    resp.send(namesarr)
})
app.get("/user", (req,resp)=>{
       var user = {uname : "yash", age :"22"}
       resp.send(user)
})
app.get("/users", (req,resp)=>{
       var users = [
        {uname : "yash", age :"22"},
                {uname : "tiger", age :"42"},
                {uname : "om", age :"32"},
                {uname : "raj", age :"22"},
                


       
       ]
       resp.send(users)
})
app.listen(3000,function(){
    console.log("Server is Listening.....")
})

