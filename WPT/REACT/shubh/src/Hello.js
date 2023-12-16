import React from 'react'
import "./exp.css";
export default class Hello extends React.Component{
    render(){
        return(
            // <div id="outer">
            // <div id="inner">
            //     <p style="background-color: aqua;">Hello</p>
            // </div>
            // <div id="inner">
            //     this is second 
            // </div>
        // </div> 
        <div className="outer">
            <div className="inner">
                <p style={{backgroundColor:this.props.col}}>Hello {this.props.name}</p>
            </div>
            <div className="inner">
                <p>this is inner div class</p>
            </div>
        </div>
        )
        }
}