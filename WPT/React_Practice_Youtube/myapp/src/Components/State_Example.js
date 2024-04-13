

 // using Variable - 

// export function State_Example()
// {
//     var data = "Shubham";
     
//      function updateData()
//      {
//         data = "Omkar";
//         alert(data);
//      }
     
//     return(
//         <div>
//            <h4>------------------------------------------------</h4>
//            <h3>State_Example</h3>
//             <h4>{data}</h4>
//            <button onClick={()=>updateData()}>Update Data</button>

//         </div>
//     )
// }

//------------------------------------------------------------
// using State - 

import { useState } from "react";

export function State_Example()
{
    const [data, setData] = useState(0);

     function updateData()
     {
       setData(data + 1);
     }
     
    return(
        <div>
           <h4>------------------------------------------------</h4>
           <h3>State_Example</h3>
            <h4>{data}</h4>
           <button onClick={()=>updateData()}>Update Data</button>

        </div>
    )
}