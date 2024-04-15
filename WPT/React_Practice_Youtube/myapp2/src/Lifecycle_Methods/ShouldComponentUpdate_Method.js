
import React from'react';

export class ShouldComponentUpdate_Method extends React.Component
{
    constructor()
    {
        super();
        this.state = { count : 0} 
        console.log("Call Constructor()"); //call first
    }  

    shouldComponentUpdate()
    {
        console.log("Call shouldComponentUpdate()", this.state.count); //display updated count in console
        return true;  //update component if true
        //return false; //not update component if false
    }

    render()
    {
        return(
            <> 
                <h3>ShouldComponentUpdate_Method Example {this.state.count } </h3>
                <button onClick={()=>this.setState({ count : this.state.count + 1 })}>Update</button> 
            </>
        )
    }
}