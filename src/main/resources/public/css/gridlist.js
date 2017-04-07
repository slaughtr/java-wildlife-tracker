import React, {StyleSheet, Dimensions, PixelRatio} from "react-native";
const {width, height, scale} = Dimensions.get("window"),
    vw = width / 100,
    vh = height / 100,
    vmin = Math.min(vw, vh),
    vmax = Math.max(vw, vh);

export default StyleSheet.create({
    "glyphicon": {
        "marginRight": 5
    },
    "thumbnail": {
        "marginBottom": 20,
        "paddingTop": 0,
        "paddingRight": 0,
        "paddingBottom": 0,
        "paddingLeft": 0,
        "WebkitBorderRadius": 0,
        "MozBorderRadius": 0,
        "borderRadius": 0
    },
    "itemlist-group-item": {
        "float": "left",
        "width": "100%",
        "backgroundColor": "#fff",
        "marginBottom": 10
    },
    "itemlist-group-item:nth-of-type(odd):hover": {
        "background": "#428bca"
    },
    "itemlist-group-item:hover": {
        "background": "#428bca"
    },
    "itemlist-group-item list-group-image": {
        "marginRight": 10
    },
    "itemlist-group-item thumbnail": {
        "marginBottom": 0
    },
    "itemlist-group-item caption": {
        "paddingTop": 9,
        "paddingRight": 9,
        "paddingBottom": 0,
        "paddingLeft": 9
    },
    "itemlist-group-item:nth-of-type(odd)": {
        "background": "#eeeeee"
    },
    "itemlist-group-item:before": {
        "display": "table",
        "content": " "
    },
    "itemlist-group-item:after": {
        "display": "table",
        "content": " ",
        "clear": "both"
    },
    "itemlist-group-item img": {
        "float": "left"
    },
    "list-group-item-text": {
        "marginTop": 0,
        "marginRight": 0,
        "marginBottom": 11,
        "marginLeft": 0
    }
});