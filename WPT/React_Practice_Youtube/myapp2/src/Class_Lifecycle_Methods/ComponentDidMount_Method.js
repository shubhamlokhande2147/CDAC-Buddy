
import React from'react';

export class ComponentDidMount_Method extends React.Component
{
    constructor()
    {
        super();
        console.log("Call Constructor()"); //call first
    }  

    componentDidMount()
    {
        console.log("Call componentDidMount()"); //call last
    }
    componentDidUpdate()
    {
        console.log("Call componentDidUpdateeeee()"); //call last
    }

    render()
    {
        console.log("Call render()"); //then call second   

        return(
            <h3>ComponentDidMount_Method Example</h3>
        )
    }
}