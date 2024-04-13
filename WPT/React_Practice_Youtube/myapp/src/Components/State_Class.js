
import React from "react";

export class State_Class extends React.Component
{
//    constructor()
//    {
//      super();
//      this.state = {data : "Shubham"}
//    }

//    updateData()
//    {
//     this.setState({data : "Omkar"})
//    }
// for incremet the number by 1
        constructor()
        {
        super();
        this.state = {data : 0}
        }

        updateData()
        {
        this.setState({data : this.state.data + 1})
        }
   render(){
    return(
        <div>
           <h4>------------------------------------------------</h4>
           <h3>State_Class_Example</h3>
            <h4>{this.state.data}</h4>
           <button onClick={()=>this.updateData()}>Update Data</button>

        </div>
    )

   }
     

}