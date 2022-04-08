/*
 * doit etre avec Commonjs pour les imports de module, sinon ne marche pas avec es6
 */
// eslint-disable-next-line @typescript-eslint/no-var-requires
const path = require("path");

const communConfiguration = {
    resolve: {
        extensions: [".js"]
    },
    devServer: {
        contentBase: path.join(__dirname, "/distwp/"),
        compress: true,
        port: 9001,
        //  host: '0.0.0.0'
    },
    devtool: "source-map",
}

module.exports = [{
    name: 'heure',
    entry: {
        'heure': "./src/index.js",
    },
    // fichier generé lors du build
    output: {
        path: path.resolve(__dirname, "distwp"),
        library: 'EntryPoint'
    },
    ...communConfiguration
}];