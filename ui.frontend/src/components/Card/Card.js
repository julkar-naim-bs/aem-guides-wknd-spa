import React from "react";
import {MapTo} from "@adobe/aem-spa-component-mapping";

const Card = props => {
    return <div>
        {props.imageURL}
        {props.title}
        {props.body}
    </div>
}

const CardConfig = {
    emptyLabel: 'Card',
    isEmpty: props => !props || !props.text || props.text.time().length < 1
}

MapTo('wknd-spa-react/components/card')(Card, CardConfig)

export default Card

