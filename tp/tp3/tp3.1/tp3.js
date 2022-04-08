var http = require("http");

var server = http.createServer(requestHandler);
server.listen(3000);

function requestHandler(req, res) {
    console.log("Une requête est arrivée.");
    res.send("Bienvenue sur Node!");
}
