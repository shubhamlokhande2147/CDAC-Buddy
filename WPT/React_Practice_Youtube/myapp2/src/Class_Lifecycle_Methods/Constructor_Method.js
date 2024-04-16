
import React from'react';

export class Constructor_Method extends React.Component
{
    constructor()
    {
        super();
        console.log("Call Constructor()"); //call first
    }  

    render()
    {
        console.log("Call render()"); //then call render() method

        return(
            <h3>Constructor_Method Example</h3>
        )
    }
}