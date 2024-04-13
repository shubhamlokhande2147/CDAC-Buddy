
import React from "react";

export class Props_Class extends React.Component
{
     render()
     {
         console.log(this.props);
        return(
            <div style={{backgroundColor : "skyblue"}}>
                   <p>------------------------------------------------------</p>
                   <h3>Props_Class Example</h3>
                   <h2>Hello { this.props.name }</h2>
                   <h2>College : { this.props.college }</h2>
                   <h2>Address : {this.props.other.address} </h2>
                   <h2>Mobile : {this.props.other.mobile} </h2>
    
            </div>
        )
     }

   
}