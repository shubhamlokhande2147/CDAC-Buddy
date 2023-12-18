import React from "react";
export default class LifeCycle extends React.Component{
    componentDidMount()
    {
        console.log("Component did Mount")
    }
    componentDidUpdate()
    {
        console.log("component did update")
    }
    componentWillUnmount()
    {
        console.log("Component will unmount");
    }
    render()
    {
        
        return(
            <div>
                <p>Life Cycle example 1</p>
                <p>{this.props.msg}</p>
            </div>
        )
    }
}