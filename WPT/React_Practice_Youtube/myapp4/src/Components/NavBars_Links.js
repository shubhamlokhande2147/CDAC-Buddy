import { Link } from "react-router-dom";

export function NavBars_Links()
{
    return(
        <>
            <Link to="/">Home Page</Link><br/><br/>
            <Link to="/about">About Page</Link><br/><br/>
            <Link to="/contact">Contact Page</Link><br/><br/>
            <Link to="/services">Services Page</Link><br/><br/>

    
        </>
    )
}