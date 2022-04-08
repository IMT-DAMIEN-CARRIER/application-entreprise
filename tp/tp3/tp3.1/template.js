function createResponse() {
    var date = new Date();

    result = '{"heure":"' + date.getHours() +'", "minute":"' + date.getMinutes() +'"}';

    return result;
}

module.exports = createResponse();