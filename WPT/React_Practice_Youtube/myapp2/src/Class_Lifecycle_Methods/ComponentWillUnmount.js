
import React from "react";
import { Student } from "./Student";

export class ComponentWillUnmount extends React.Component
{
    constructor()
    {
        super();
        this.state = { show : true }
    }
   
    render()
    {
        return(
          <div>
            {
                this.state.show ? <Student/> : <h1>Component is Removed from DOM</h1>
            }
            <button onClick={()=> this.setState({ show : !this.state.show })}>Toggle Child Component</button>
          </div>
        )
    }
}
