import { Link, Outlet } from "react-router-dom";

export function Business()
{
    return(
        <>
          <h2>Nested Component Example</h2>
          <Link to="shivrudra">Go to Shivrudra Page</Link><br/>
          <Link to="hanuman">Go to Hanuman Hook Page</Link><br/>
          <Link to="om">Go to Om Hook Page</Link><br/>
          <Outlet/>
        </>
    )
}