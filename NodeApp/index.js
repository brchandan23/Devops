const http = require("http");
const port = 5000;

http.createServer((req, res) => {
    // Allow the browser to accept the request
    res.setHeader("Access-Control-Allow-Origin", "*");
    res.end("Hello Chandan B R");
})
.listen(port, () => {
    console.log("Server started at Port 5000");
});

