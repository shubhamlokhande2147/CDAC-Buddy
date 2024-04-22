
import { useRef } from "react";

export function Uncontrolled_Component()
{
    let inputRef1 = useRef(null);

    function submitForm(e)
    {
        e.preventDefault();
        console.log("inputRef1 value : ", inputRef1.current.value);

        let inputRef2 = document.getElementById("id1").value;
        console.log("inputRef2 value : ", inputRef2);

    }
    return(
        <>
          <h3>Uncontrolled Component Example</h3>
              <form onSubmit={submitForm}>
                 <input type="text" ref={inputRef1} /><br/><br/>
                 <input type="text" id="id1" /><br/><br/>
                 <button>Submit</button>
              </form>                
        </>
    )
}