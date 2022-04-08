const request = require("supertest");
const app = require("./tp6.js");

describe("template test", () => {
  it("GET /heure - success", async () => {
    const { statusCode, body } = await request(app).get("/heure");
    expect(statusCode).toEqual(200);
    // change to actual time
    expect(JSON.stringify(body)).toEqual('{"heure":"12","minute":"34"}');
  });
});
