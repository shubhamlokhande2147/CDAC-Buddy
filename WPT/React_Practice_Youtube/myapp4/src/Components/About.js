
import { Link } from "react-router-dom";

export function About()
{
    return(
        <>
         <h2>About Component Page</h2>
         <p>This is Home PAge of Our System</p>
         <p>And Here we are Learning about Router</p>
         <Link to="/">Go to Home Page</Link>
        </>
    )
}