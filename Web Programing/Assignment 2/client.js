const fs = require("fs");

fs.readFile("emp.txt", "utf8", (err, data) => {
    if (err) {
        console.log("Error reading file:", err);
        return;
    }

    let lines = data.trim().split("\n");

    lines.forEach((line, index) => {
        console.log(`${index + 1}. ${line}`);
    });
});
