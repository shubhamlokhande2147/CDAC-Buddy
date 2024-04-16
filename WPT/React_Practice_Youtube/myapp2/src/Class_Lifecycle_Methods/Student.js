
import React from "react";

export class Student extends React.Component
{
    componentWillUnmount()
    {
        console.log("componentWillUnmount() called");
        alert("componentWillUnmount() called");
    }

    render()
    {
        return(
         <h1>Student Component</h1>
        )
    }
}
