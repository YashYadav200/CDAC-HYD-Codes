var fs = require("fs");

fs.appendFile("Demon","ghjj hhkhhk", function (err) {
    if (err) {
        console.log("Already Exist or Some Error");
    } else {
        console.log("Created Successfully");
    }
});
