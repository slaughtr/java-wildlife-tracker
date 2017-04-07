import React, {StyleSheet, Dimensions, PixelRatio} from "react-native";
const {width, height, scale} = Dimensions.get("window"),
    vw = width / 100,
    vh = height / 100,
    vmin = Math.min(vw, vh),
    vmax = Math.max(vw, vh);

export default StyleSheet.create({
    "[class^=\"icon-\"]:before": {
        "fontFamily": "FontAwesome",
        "marginRight": 0.5,
        "opacity": 0.2
    },
    "[class*=\" icon-\"]:before": {
        "fontFamily": "FontAwesome",
        "marginRight": 0.5,
        "opacity": 0.2
    },
    "icon-glass:before": {
        "content": "\\f000"
    },
    "icon-music:before": {
        "content": "\\f001"
    },
    "icon-search:before": {
        "content": "\\f002"
    },
    "icon-envelope:before": {
        "content": "\\f003"
    },
    "icon-heart:before": {
        "content": "\\f004"
    },
    "icon-star:before": {
        "content": "\\f005"
    },
    "icon-star-empty:before": {
        "content": "\\f006"
    },
    "icon-user:before": {
        "content": "\\f007"
    },
    "icon-film:before": {
        "content": "\\f008"
    },
    "icon-th-large:before": {
        "content": "\\f009"
    },
    "icon-th:before": {
        "content": "\\f00a"
    },
    "icon-th-list:before": {
        "content": "\\f00b"
    },
    "icon-ok:before": {
        "content": "\\f00c"
    },
    "icon-remove:before": {
        "content": "\\f00d"
    },
    "icon-zoom-in:before": {
        "content": "\\f00e"
    },
    "icon-zoom-out:before": {
        "content": "\\f010"
    },
    "icon-off:before": {
        "content": "\\f011"
    },
    "icon-signal:before": {
        "content": "\\f012"
    },
    "icon-cog:before": {
        "content": "\\f013"
    },
    "icon-trash:before": {
        "content": "\\f014"
    },
    "icon-home:before": {
        "content": "\\f015"
    },
    "icon-file:before": {
        "content": "\\f016"
    },
    "icon-time:before": {
        "content": "\\f017"
    },
    "icon-road:before": {
        "content": "\\f018"
    },
    "icon-download-alt:before": {
        "content": "\\f019"
    },
    "icon-download:before": {
        "content": "\\f01a"
    },
    "icon-upload:before": {
        "content": "\\f01b"
    },
    "icon-inbox:before": {
        "content": "\\f01c"
    },
    "icon-play-circle:before": {
        "content": "\\f01d"
    },
    "icon-repeat:before": {
        "content": "\\f01e"
    },
    "icon-refresh:before": {
        "content": "\\f021"
    },
    "icon-list-alt:before": {
        "content": "\\f022"
    },
    "icon-lock:before": {
        "content": "\\f023"
    },
    "icon-flag:before": {
        "content": "\\f024"
    },
    "icon-headphones:before": {
        "content": "\\f025"
    },
    "icon-volume-off:before": {
        "content": "\\f026"
    },
    "icon-volume-down:before": {
        "content": "\\f027"
    },
    "icon-volume-up:before": {
        "content": "\\f028"
    },
    "icon-qrcode:before": {
        "content": "\\f029"
    },
    "icon-barcode:before": {
        "content": "\\f02a"
    },
    "icon-tag:before": {
        "content": "\\f02b"
    },
    "icon-tags:before": {
        "content": "\\f02c"
    },
    "icon-book:before": {
        "content": "\\f02d"
    },
    "icon-bookmark:before": {
        "content": "\\f02e"
    },
    "icon-print:before": {
        "content": "\\f02f"
    },
    "icon-camera:before": {
        "content": "\\f030"
    },
    "icon-font:before": {
        "content": "\\f031"
    },
    "icon-bold:before": {
        "content": "\\f032"
    },
    "icon-italic:before": {
        "content": "\\f033"
    },
    "icon-text-height:before": {
        "content": "\\f034"
    },
    "icon-text-width:before": {
        "content": "\\f035"
    },
    "icon-align-left:before": {
        "content": "\\f036"
    },
    "icon-align-center:before": {
        "content": "\\f037"
    },
    "icon-align-right:before": {
        "content": "\\f038"
    },
    "icon-align-justify:before": {
        "content": "\\f039"
    },
    "icon-list:before": {
        "content": "\\f03a"
    },
    "icon-indent-left:before": {
        "content": "\\f03b"
    },
    "icon-indent-right:before": {
        "content": "\\f03c"
    },
    "icon-facetime-video:before": {
        "content": "\\f03d"
    },
    "icon-picture:before": {
        "content": "\\f03e"
    },
    "icon-pencil:before": {
        "content": "\\f040"
    },
    "icon-map-marker:before": {
        "content": "\\f041"
    },
    "icon-adjust:before": {
        "content": "\\f042"
    },
    "icon-tint:before": {
        "content": "\\f043"
    },
    "icon-edit:before": {
        "content": "\\f044"
    },
    "icon-share:before": {
        "content": "\\f045"
    },
    "icon-check:before": {
        "content": "\\f046"
    },
    "icon-move:before": {
        "content": "\\f047"
    },
    "icon-step-backward:before": {
        "content": "\\f048"
    },
    "icon-fast-backward:before": {
        "content": "\\f049"
    },
    "icon-backward:before": {
        "content": "\\f04a"
    },
    "icon-play:before": {
        "content": "\\f04b"
    },
    "icon-pause:before": {
        "content": "\\f04c"
    },
    "icon-stop:before": {
        "content": "\\f04d"
    },
    "icon-forward:before": {
        "content": "\\f04e"
    },
    "icon-fast-forward:before": {
        "content": "\\f050"
    },
    "icon-step-forward:before": {
        "content": "\\f051"
    },
    "icon-eject:before": {
        "content": "\\f052"
    },
    "icon-chevron-left:before": {
        "content": "\\f053"
    },
    "icon-chevron-right:before": {
        "content": "\\f054"
    },
    "icon-plus-sign:before": {
        "content": "\\f055"
    },
    "icon-minus-sign:before": {
        "content": "\\f056"
    },
    "icon-remove-sign:before": {
        "content": "\\f057"
    },
    "icon-ok-sign:before": {
        "content": "\\f058"
    },
    "icon-question-sign:before": {
        "content": "\\f059"
    },
    "icon-info-sign:before": {
        "content": "\\f05a"
    },
    "icon-screenshot:before": {
        "content": "\\f05b"
    },
    "icon-remove-circle:before": {
        "content": "\\f05c"
    },
    "icon-ok-circle:before": {
        "content": "\\f05d"
    },
    "icon-ban-circle:before": {
        "content": "\\f05e"
    },
    "icon-arrow-left:before": {
        "content": "\\f060"
    },
    "icon-arrow-right:before": {
        "content": "\\f061"
    },
    "icon-arrow-up:before": {
        "content": "\\f062"
    },
    "icon-arrow-down:before": {
        "content": "\\f063"
    },
    "icon-share-alt:before": {
        "content": "\\f064"
    },
    "icon-resize-full:before": {
        "content": "\\f065"
    },
    "icon-resize-small:before": {
        "content": "\\f066"
    },
    "icon-plus:before": {
        "content": "\\f067"
    },
    "icon-minus:before": {
        "content": "\\f068"
    },
    "icon-asterisk:before": {
        "content": "\\f069"
    },
    "icon-exclamation-sign:before": {
        "content": "\\f06a"
    },
    "icon-gift:before": {
        "content": "\\f06b"
    },
    "icon-leaf:before": {
        "content": "\\f06c"
    },
    "icon-fire:before": {
        "content": "\\f06d"
    },
    "icon-eye-open:before": {
        "content": "\\f06e"
    },
    "icon-eye-close:before": {
        "content": "\\f070"
    },
    "icon-warning-sign:before": {
        "content": "\\f071"
    },
    "icon-plane:before": {
        "content": "\\f072"
    },
    "icon-calendar:before": {
        "content": "\\f073"
    },
    "icon-random:before": {
        "content": "\\f074"
    },
    "icon-comment:before": {
        "content": "\\f075"
    },
    "icon-magnet:before": {
        "content": "\\f076"
    },
    "icon-chevron-up:before": {
        "content": "\\f077"
    },
    "icon-chevron-down:before": {
        "content": "\\f078"
    },
    "icon-retweet:before": {
        "content": "\\f079"
    },
    "icon-shopping-cart:before": {
        "content": "\\f07a"
    },
    "icon-folder-close:before": {
        "content": "\\f07b"
    },
    "icon-folder-open:before": {
        "content": "\\f07c"
    },
    "icon-resize-vertical:before": {
        "content": "\\f07d"
    },
    "icon-resize-horizontal:before": {
        "content": "\\f07e"
    },
    "icon-bar-chart:before": {
        "content": "\\f080"
    },
    "icon-twitter-sign:before": {
        "content": "\\f081"
    },
    "icon-facebook-sign:before": {
        "content": "\\f082"
    },
    "icon-camera-retro:before": {
        "content": "\\f083"
    },
    "icon-key:before": {
        "content": "\\f084"
    },
    "icon-cogs:before": {
        "content": "\\f085"
    },
    "icon-comments:before": {
        "content": "\\f086"
    },
    "icon-thumbs-up:before": {
        "content": "\\f087"
    },
    "icon-thumbs-down:before": {
        "content": "\\f088"
    },
    "icon-star-half:before": {
        "content": "\\f089"
    },
    "icon-heart-empty:before": {
        "content": "\\f08a"
    },
    "icon-signout:before": {
        "content": "\\f08b"
    },
    "icon-linkedin-sign:before": {
        "content": "\\f08c"
    },
    "icon-pushpin:before": {
        "content": "\\f08d"
    },
    "icon-external-link:before": {
        "content": "\\f08e"
    },
    "icon-signin:before": {
        "content": "\\f090"
    },
    "icon-trophy:before": {
        "content": "\\f091"
    },
    "icon-github-sign:before": {
        "content": "\\f092"
    },
    "icon-upload-alt:before": {
        "content": "\\f093"
    },
    "icon-lemon:before": {
        "content": "\\f094"
    },
    "icon-phone:before": {
        "content": "\\f095"
    },
    "icon-check-empty:before": {
        "content": "\\f096"
    },
    "icon-bookmark-empty:before": {
        "content": "\\f097"
    },
    "icon-phone-sign:before": {
        "content": "\\f098"
    },
    "icon-twitter:before": {
        "content": "\\f099"
    },
    "icon-facebook:before": {
        "content": "\\f09a"
    },
    "icon-github:before": {
        "content": "\\f09b"
    },
    "icon-unlock:before": {
        "content": "\\f09c"
    },
    "icon-credit-card:before": {
        "content": "\\f09d"
    },
    "icon-rss:before": {
        "content": "\\f09e"
    },
    "icon-hdd:before": {
        "content": "\\f0a0"
    },
    "icon-bullhorn:before": {
        "content": "\\f0a1"
    },
    "icon-bell:before": {
        "content": "\\f0a2"
    },
    "icon-certificate:before": {
        "content": "\\f0a3"
    },
    "icon-hand-right:before": {
        "content": "\\f0a4"
    },
    "icon-hand-left:before": {
        "content": "\\f0a5"
    },
    "icon-hand-up:before": {
        "content": "\\f0a6"
    },
    "icon-hand-down:before": {
        "content": "\\f0a7"
    },
    "icon-circle-arrow-left:before": {
        "content": "\\f0a8"
    },
    "icon-circle-arrow-right:before": {
        "content": "\\f0a9"
    },
    "icon-circle-arrow-up:before": {
        "content": "\\f0aa"
    },
    "icon-circle-arrow-down:before": {
        "content": "\\f0ab"
    },
    "icon-globe:before": {
        "content": "\\f0ac"
    },
    "icon-wrench:before": {
        "content": "\\f0ad"
    },
    "icon-tasks:before": {
        "content": "\\f0ae"
    },
    "icon-filter:before": {
        "content": "\\f0b0"
    },
    "icon-briefcase:before": {
        "content": "\\f0b1"
    },
    "icon-fullscreen:before": {
        "content": "\\f0b2"
    },
    "icon-group:before": {
        "content": "\\f0c0"
    },
    "icon-link:before": {
        "content": "\\f0c1"
    },
    "icon-cloud:before": {
        "content": "\\f0c2"
    },
    "icon-beaker:before": {
        "content": "\\f0c3"
    },
    "icon-cut:before": {
        "content": "\\f0c4"
    },
    "icon-copy:before": {
        "content": "\\f0c5"
    },
    "icon-paper-clip:before": {
        "content": "\\f0c6"
    },
    "icon-save:before": {
        "content": "\\f0c7"
    },
    "icon-sign-blank:before": {
        "content": "\\f0c8"
    },
    "icon-reorder:before": {
        "content": "\\f0c9"
    },
    "icon-list-ul:before": {
        "content": "\\f0ca"
    },
    "icon-list-ol:before": {
        "content": "\\f0cb"
    },
    "icon-strikethrough:before": {
        "content": "\\f0cc"
    },
    "icon-underline:before": {
        "content": "\\f0cd"
    },
    "icon-table:before": {
        "content": "\\f0ce"
    },
    "icon-magic:before": {
        "content": "\\f0d0"
    },
    "icon-truck:before": {
        "content": "\\f0d1"
    },
    "icon-pinterest:before": {
        "content": "\\f0d2"
    },
    "icon-pinterest-sign:before": {
        "content": "\\f0d3"
    },
    "icon-google-plus-sign:before": {
        "content": "\\f0d4"
    },
    "icon-google-plus:before": {
        "content": "\\f0d5"
    },
    "icon-money:before": {
        "content": "\\f0d6"
    },
    "icon-caret-down:before": {
        "content": "\\f0d7"
    },
    "icon-caret-up:before": {
        "content": "\\f0d8"
    },
    "icon-caret-left:before": {
        "content": "\\f0d9"
    },
    "icon-caret-right:before": {
        "content": "\\f0da"
    },
    "icon-columns:before": {
        "content": "\\f0db"
    },
    "icon-sort:before": {
        "content": "\\f0dc"
    },
    "icon-sort-down:before": {
        "content": "\\f0dd"
    },
    "icon-sort-up:before": {
        "content": "\\f0de"
    },
    "icon-envelope-alt:before": {
        "content": "\\f0e0"
    },
    "icon-linkedin:before": {
        "content": "\\f0e1"
    },
    "icon-undo:before": {
        "content": "\\f0e2"
    },
    "icon-legal:before": {
        "content": "\\f0e3"
    },
    "icon-dashboard:before": {
        "content": "\\f0e4"
    },
    "icon-comment-alt:before": {
        "content": "\\f0e5"
    },
    "icon-comments-alt:before": {
        "content": "\\f0e6"
    },
    "icon-bolt:before": {
        "content": "\\f0e7"
    },
    "icon-sitemap:before": {
        "content": "\\f0e8"
    },
    "icon-umbrella:before": {
        "content": "\\f0e9"
    },
    "icon-paste:before": {
        "content": "\\f0ea"
    },
    "icon-user-md:before": {
        "content": "\\f200"
    },
    "html": {
        "width": "100%",
        "height": "100%"
    },
    "body": {
        "width": "100%",
        "height": "100%",
        "backgroundImage": "radial-gradient(center top, ellipse cover, #474747 0%, #0e0e0e 100%)",
        "paddingTop": 0,
        "paddingRight": 0,
        "paddingBottom": 0,
        "paddingLeft": 0,
        "marginTop": 0,
        "marginRight": 0,
        "marginBottom": 0,
        "marginLeft": 0,
        "fontFamily": "Frutiger, \"Frutiger Linotype\", Univers, Calibri, \"Gill Sans\", \"Gill Sans MT\", \"Myriad Pro\", Myriad, \"DejaVu Sans Condensed\", \"Liberation Sans\", \"Nimbus Sans L\", Tahoma, Geneva, \"Helvetica Neue\", Helvetica, Arial, sans-serif"
    },
    "wrapper": {
        "position": "relative"
    },
    "wrapper h1": {
        "fontSize": 1.5,
        "position": "absolute",
        "top": 5,
        "left": "50%",
        "marginTop": 0,
        "marginRight": 0,
        "marginBottom": 0,
        "marginLeft": -6.8,
        "width": 13,
        "paddingTop": 4,
        "paddingRight": 0,
        "paddingBottom": 4,
        "paddingLeft": 0,
        "color": "#fff",
        "textAlign": "center",
        "border": "0.3em solid #fff",
        "WebkitBorderRadius": "100%",
        "MozBorderRadius": "100%",
        "MsBorderRadius": "100%",
        "OBorderRadius": "100%",
        "borderRadius": "100%",
        "WebkitBoxShadow": "0 0 1em rgba(0, 0, 0, 0.5)",
        "MozBoxShadow": "0 0 1em rgba(0, 0, 0, 0.5)",
        "boxShadow": "0 0 1em rgba(0, 0, 0, 0.5)",
        "textShadow": "0 0 0.3em rgba(0, 0, 0, 0.5)"
    },
    "wrapper h1 strong": {
        "fontSize": 2.5,
        "display": "block"
    },
    "access": {
        "zoom": 1,
        "fontSize": 1.5,
        "WebkitBoxShadow": "0 0 10px rgba(0, 0, 0, 0.5)",
        "MozBoxShadow": "0 0 10px rgba(0, 0, 0, 0.5)",
        "boxShadow": "0 0 10px rgba(0, 0, 0, 0.5)"
    },
    "access:before": {
        "content": "",
        "display": "table"
    },
    "access:after": {
        "content": "",
        "display": "table",
        "clear": "both"
    },
    "access a": {
        "backgroundColor": "#689384",
        "display": "block",
        "color": "#e5f1ea",
        "textDecoration": "none",
        "paddingTop": 0.5,
        "paddingRight": 0.5,
        "paddingBottom": 0.5,
        "paddingLeft": 0.5,
        "WebkitTransition": "-webkit-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "MozTransition": "-moz-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "MsTransition": "-ms-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "OTransition": "-o-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "transition": "transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in"
    },
    "access menu a": {
        "backgroundColor": "#689384",
        "display": "block",
        "color": "#e5f1ea",
        "textDecoration": "none",
        "paddingTop": 0.5,
        "paddingRight": 0.5,
        "paddingBottom": 0.5,
        "paddingLeft": 0.5,
        "WebkitTransition": "-webkit-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "MozTransition": "-moz-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "MsTransition": "-ms-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "OTransition": "-o-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "transition": "transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in"
    },
    "menu li a": {
        "backgroundColor": "#689384",
        "display": "block",
        "color": "#e5f1ea",
        "textDecoration": "none",
        "paddingTop": 0.5,
        "paddingRight": 0.5,
        "paddingBottom": 0.5,
        "paddingLeft": 0.5,
        "WebkitTransition": "-webkit-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "MozTransition": "-moz-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "MsTransition": "-ms-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "OTransition": "-o-transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "transition": "transform 500ms linear, box-shadow 500ms ease-in, background-color 250ms ease-in",
        "whiteSpace": "nowrap",
        "overflow": "hidden",
        "MsTextOverflow": "ellipsis",
        "OTextOverflow": "ellipsis",
        "textOverflow": "ellipsis",
        "MozBinding": "url('xml/ellipsis.xml#ellipsis')"
    },
    "access a:hover": {
        "backgroundColor": "#b9d9ce",
        "color": "#5a4741"
    },
    "access menu a:hover": {
        "backgroundColor": "#b9d9ce",
        "color": "#5a4741"
    },
    "access askip-linkfocus": {
        "backgroundColor": "#b9d9ce",
        "color": "#5a4741"
    },
    "access menu askip-linkfocus": {
        "backgroundColor": "#b9d9ce",
        "color": "#5a4741"
    },
    "menu li a:hover": {
        "backgroundColor": "#b9d9ce",
        "color": "#5a4741"
    },
    "access askip-link": {
        "position": "relative",
        "zIndex": 2
    },
    "access menu askip-link": {
        "position": "relative",
        "zIndex": 2
    },
    "access askip-link span": {
        "position": "absolute",
        "right": 0.5,
        "top": 0.5,
        "WebkitBoxShadow": "inset 0 0 0.5em rgba(0, 0, 0, 0.2)",
        "MozBoxShadow": "inset 0 0 0.5em rgba(0, 0, 0, 0.2)",
        "boxShadow": "inset 0 0 0.5em rgba(0, 0, 0, 0.2)",
        "paddingTop": 0,
        "paddingRight": 0.3,
        "paddingBottom": 0,
        "paddingLeft": 0.3
    },
    "access menu askip-link span": {
        "position": "absolute",
        "right": 0.5,
        "top": 0.5,
        "WebkitBoxShadow": "inset 0 0 0.5em rgba(0, 0, 0, 0.2)",
        "MozBoxShadow": "inset 0 0 0.5em rgba(0, 0, 0, 0.2)",
        "boxShadow": "inset 0 0 0.5em rgba(0, 0, 0, 0.2)",
        "paddingTop": 0,
        "paddingRight": 0.3,
        "paddingBottom": 0,
        "paddingLeft": 0.3
    },
    "access menu liactive a a": {
        "backgroundColor": "#5a4741",
        "color": "#fff",
        "cursor": "default"
    },
    "access menu liactive a a:hover": {
        "backgroundColor": "#5a4741",
        "color": "#fff",
        "cursor": "default"
    },
    "access menu liactive:nth-child(odd) a": {
        "backgroundColor": "#5a4741",
        "color": "#fff",
        "cursor": "default"
    },
    "access menu liactive:nth-child(odd) a:hover": {
        "backgroundColor": "#5a4741",
        "color": "#fff",
        "cursor": "default"
    },
    "menu": {
        "border": "0 none",
        "marginTop": 0,
        "marginRight": 0,
        "marginBottom": 0,
        "marginLeft": 0,
        "paddingTop": 0,
        "paddingRight": 0,
        "paddingBottom": 0,
        "paddingLeft": 0
    },
    "menu li": {
        "listStyleImage": "none",
        "listStyleType": "none",
        "paddingTop": 0,
        "paddingRight": 0,
        "paddingBottom": 0,
        "paddingLeft": 0,
        "marginTop": 0,
        "marginRight": 0,
        "marginBottom": 0,
        "marginLeft": 0,
        "WebkitTransition": "max-height 500ms linear",
        "MozTransition": "max-height 500ms linear",
        "MsTransition": "max-height 500ms linear",
        "OTransition": "max-height 500ms linear",
        "transition": "max-height 500ms linear"
    }
});