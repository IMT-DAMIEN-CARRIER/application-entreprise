var http = require("http");

var server = http.createServer(requestHandler);
server.listen(3000);

function requestHandler(req, res) {
    var date = new Date();

    if (req.url === "/heure") {
        res.setHeader("Content-Type", "text/html");
        res.end(
            "L'heure du serveur est: " + date.getHours() + "h" + date.getMinutes()
        );
    } else if (req.url === "/heureJSON") {
        res.setHeader("Content-Type", "application/json");
        res.end(
            JSON.stringify({
                heure: date.getHours(),
                minutes: date.getMinutes(),
            })
        );
    } else {
        res.end("Bienvenue sur node!! ");
    }
}
