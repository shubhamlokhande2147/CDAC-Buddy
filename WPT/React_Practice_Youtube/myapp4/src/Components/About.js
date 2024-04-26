
import { Link,NavLink } from "react-router-dom";

export function About()
{
    return(
        <>
         <h2>About Component Page</h2>
         <p>This is Home PAge of Our System</p>
         <p>And Here we are Learning about Router</p>
         <Link to="/">Go to Home Page</Link><br/><br/>

         {/* here uses params -  */}
            <Link to="/params_users/omkar">About Omkar</Link><br/><br/>
            <NavLink to="/params_users/shubham" style={{backgroundColor:"yellow", color:"green"}}>About Shubham</NavLink>

        </>
    )
}