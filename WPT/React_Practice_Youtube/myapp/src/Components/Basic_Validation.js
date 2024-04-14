import { useState } from "react";

export function Basic_Validation()
{
    const [user,setUser] = useState("");
    const [password,setPassword] = useState("");
    const [error,setError] = useState(false);
    const [passerror,setPasserror] = useState(false);

    function LoginHandle(e)
    {
        if(user.length <= 5 || password.length <=5)
        {
          alert("Type Correct Values");
        }
        else{
          alert("All is Good");
        }
        
        e.preventDefault();
    }

    function userdata(e)
    { 
        let item = e.target.value;
         if(item.length <=7 )
         {
          setError(true);
         } 
         else{
          setError(false);
         }   
         setUser(item);     
        console.log(e.target.value)
    }

    function passdata(e)
    { 
        let item = e.target.value;
         if(item.length <=7 )
         {
          setPasserror(true);
         } 
         else{
          setPasserror(false);
         }   
         setPassword(item);
        console.log(e.target.value)
    }

  
    return(
        <div>
           
          <form onSubmit={LoginHandle}>
            <h3>Basic Validation For Login Form</h3>
            <input type="text" placeholder="Enter UserId"  onChange={userdata}/> <span>{ error ? <h3>User not valid</h3> : null }</span> <br/><br/>         
            <input type="password" placeholder="Enter Password"  onChange={passdata}/> <span>{ passerror ? <h3>Password not valid</h3> : null }</span> <br/><br/>   
            <button type="submit">Login</button>

          </form>
          <h2>---------------------------------------------------------------------</h2>
        </div>
    )
}