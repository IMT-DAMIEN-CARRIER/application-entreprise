var express = require("express");
var app = express();
var Mustache = require("mustache");

app.get("/", (req, res) => {
    res.send("Bienvenue sur Node");
});

app.get("/heure", (req, res) => {
    var date = new Date();
    res.setHeader("Content-Type", "application/json");

    // utilisation d'un template / squelette
    var result = Mustache.render('{"heure":"{{hours}}","minute":"{{minutes}}"}', {
        hours: date.getHours(),
        minutes: date.getMinutes(),
    });
    res.send(result);
});

app.listen(3000, () => {
    console.log(`Listening on port 3000`);
});

module.exports = app;
