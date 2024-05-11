import { BrowserRouter, Link, Route } from "react-router-dom"
import { User } from "./User"


export function Dyanamic_Routing()
{

    let users = [
                   { id:1, name : "Shubham", email:"shubham@gmail.com"},
                   { id:2, name : "Omkar", email:"omkar@gmail.com"},
                   { id:3, name : "Sid", email:"sid@gmail.com"},
                   { id:4, name : "Shiv", email:"shiv@gmail.com"},
                   { id:6, name : "Vaibhav", email:"vaibhav@gmail.com"},
                   { id:16, name : "Vivek", email:"vivek@gmail.com"},
                ]

    return(
        <>
           <h3>Dyanamic Routing Example</h3>

         
            {/* <BrowserRouter>
            
                {
                   users.map((item)=>
                   <div><Link to={"/user/"+item.id}><h3>{ item.name }</h3></Link></div>)
                }

                <Route path="/user/:id"><User/></Route>
            
            </BrowserRouter> */}

        </>
    )
}