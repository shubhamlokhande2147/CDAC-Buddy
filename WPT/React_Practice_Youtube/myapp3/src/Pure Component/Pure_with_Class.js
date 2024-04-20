
import React from 'react';

export class Pure_with_Class extends React.PureComponent
{
    constructor()
    {
        super();
        this.state = {
            count : 0
        }
    }
    render()
    {
        console.log("Check Rendering...");
        return(
            <>
             <h2>Pure Component using Class</h2>
             <h3>Count : {this.state.count} </h3>
             <button onClick={()=>this.setState({count : this.state.count + 1 })}>Update</button>
            </>
        )
    }
}