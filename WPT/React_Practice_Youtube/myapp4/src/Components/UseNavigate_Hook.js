
import {useNavigate} from "react-router-dom";

export function UseNavigate_Hook()
{

    const navigate = useNavigate();

    function navigateFun()
    {
        //here, we also write the condition to navigate
        navigate('/');
    }
   return(
      <>
         <h2>UseNavigate_Hook Example</h2>

         {/* navigating using 'navigate' variable -  */}
         <button onClick={()=>{navigate('/about')}}>Go to About Page</button> <br/><br/>

         {/* navigating using 'navigateFun' function -  */}
         <button onClick={()=>{navigateFun()}}>Go to Home Page</button> 

      </>
   )
}