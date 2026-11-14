const webpack = require("webpack");

config.plugins = config.plugins || [];
config.plugins.push(
    new webpack.DefinePlugin({
        "import.meta.url": "self.location.href",
        "import.meta": "({ url: self.location.href })",
    })
);
