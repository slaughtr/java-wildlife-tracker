import React, {StyleSheet, Dimensions, PixelRatio} from "react-native";
const {width, height, scale} = Dimensions.get("window"),
    vw = width / 100,
    vh = height / 100,
    vmin = Math.min(vw, vh),
    vmax = Math.max(vw, vh);

export default StyleSheet.create({
    "h1": {
        "color": "white"
    },
    "h2": {
        "color": "white"
    },
    "h3": {
        "color": "white"
    },
    "li": {
        "color": "white"
    },
    "ul": {
        "float": "right",
        "marginTop": "40%"
    }
});