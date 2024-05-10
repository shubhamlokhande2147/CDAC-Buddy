import { Link } from "react-router-dom";

export function Home()
{
    return(
        <>
         <h2>Home Component Page</h2>
         <p>This is Home PAge of Our System</p>
         <p>And Here we are Learning about Router</p>
         <Link to="/about">Go to About Page</Link><br/><br/>
         <Link to="/usenavigate_hook">Go to Usenavigate Hook Page</Link>

        </>
    )
}