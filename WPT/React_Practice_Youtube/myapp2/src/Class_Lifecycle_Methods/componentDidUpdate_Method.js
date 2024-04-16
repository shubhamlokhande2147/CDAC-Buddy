
import React from'react';

export class ComponentDidUpdate_Method extends React.Component
{
    constructor()
    {
        super();
        this.state = { count : 0} 
        console.log("Call Constructor()"); //call first
    }  

    componentDidUpdate(preProps,preState,snapshot)
    {
        console.log("Call componentDidUpdate()"); //call, when component is updated
        console.log("previous state ",preState);  //show previous state
    }

    render()
    {
        return(
            <> 
                <h3>ComponentDidUpdate_Method Example {this.state.count } </h3>
                <button onClick={()=>this.setState({ count : this.state.count + 1 })}>Update</button> 
            </>
        )
    }
}