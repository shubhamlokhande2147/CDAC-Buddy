import { useLocation } from "react-router-dom"

export function UseLocation_Hook()
{
  const location = useLocation();
  console.log(location);
    return(
        <>
          <h2>UseLocation Hook Example</h2>
          check object in console.
        </>
    )
}