var express = require('express');
var app = express();

app.get('/GetForm.html', function (req, res) {
    res.sendFile('public/GetForm.html', { root: __dirname });
});

app.get('/submit-getdata', function (req, res) {
    console.log("First Name:", req.query.firstName);
    console.log("Last Name:", req.query.lastName);

    res.send("Received: " + req.query.firstName + " " + req.query.lastName);
});

app.listen(3000, function () {
    console.log("Server running at http://localhost:3000/GetForm.html");
});
