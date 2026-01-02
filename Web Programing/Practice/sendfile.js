var http = require("http");
var fs = require("fs");

// Request handler function
function ProcessRequest(req, res) {
    fs.readFile("welcome.html", (err, data) => {
        if (err) {
            res.writeHead(500, { "Content-Type": "text/plain" });
            res.end("Error loading file");
            return;
        }

        res.writeHead(200, {
            "Content-Type": "text/html",
            "Content-Length": data.length
        });

        res.end(data);  // send file content and close response
    });
}

// Create server
var server = http.createServer(ProcessRequest);

// Start server
server.listen(3000, "127.0.0.1", () => {
    console.log("Server Running on http://127.0.0.1:3000");
});
