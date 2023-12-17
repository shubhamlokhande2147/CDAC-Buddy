
import React from "react";

export default class HalfString extends React.Component
{

   constructor()
   {
     super();
     this.state={half :"Not yet computed"}
   }

   handler = (event)=>{
     let str = event.target.value;
     let substr = str.substring(0,str.length/2).toUpperCase()
    this.setState({half:substr})      

   }

    render()
    {
        return(
            <div>  
                Input String : <input type="text" onBlur={this.handler}/>
                <p>String : {this.state.half} </p>    
            </div>
        )
    }
}