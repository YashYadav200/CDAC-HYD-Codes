const express = require("express");
const app = express();
const path = require("path");
const PORT = 3000;

let studs = [
    { sid: 101, sname: "Savita", course: "DioT" },
    { sid: 102, sname: "Kavita", course: "DAC" },
    { sid: 103, sname: "Anita", course: "DESD" },
    { sid: 104, sname: "Sunita", course: "DioT" },
    { sid: 105, sname: "Babita", course: "DMC" }
];

// Serve static HTML files
app.use(express.static(__dirname));

// REST Endpoint 1 → All students
app.get("/students", (req, res) => {
    res.json(studs);
});

// REST Endpoint 2 → Search by name
app.get("/students/:name", (req, res) => {
    let name = req.params.name.toLowerCase();
    let found = studs.filter(s => s.sname.toLowerCase() === name);

    if (found.length > 0) {
        res.json(found);
    } else {
        res.json({ message: "Student not found" });
    }
});

app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});
