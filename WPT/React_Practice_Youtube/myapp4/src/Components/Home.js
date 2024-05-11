import { Link } from "react-router-dom";

export function Home()
{
    return(
        <>
         <h2>Home Component Page</h2>
         <p>This is Home Page of Our System</p>
         <p>And Here we are Learning about Router</p>
         <Link to="/about">Go to About Page</Link><br/><br/>

         <p><b>useNavigate Hook Example - </b></p>
         <Link to="/usenavigate_hook">Go to Usenavigate Hook Page</Link>

         <p><b>Nested Component Example - </b></p>
         <Link to="/business">Go to Nested Component Page</Link>

         
         <p><b>useLocation Hook Example - </b></p>
         <Link to="/uselocation">Go to useLocation Hook Page</Link>

         <p><b>Dyanamic_Routing Example - </b></p>
         <Link to="/dyanamic_routing">Go to Dyanamic Routing Page</Link><br/><br/>

        </>
    )
}