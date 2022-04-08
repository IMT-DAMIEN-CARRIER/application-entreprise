const response = require('../template');
test('generation response', () => {
    var date = new Date();

    expect(response).toBe('{"heure":"14", "minute":"53"}');
});