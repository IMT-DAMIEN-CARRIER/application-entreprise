var express = require("express");
var http = require("http");

var app = express();

app.get("/heure", (req, res) => {
    var date = new Date();
    res.setHeader("Content-Type", "text/html");
    res.end('{"heure":"' + date.getHours() +'", "minute":"' + date.getMinutes() +'"}')
});

app.listen(3000, () => {
    console.log(`Listening on port 3000`);
});
