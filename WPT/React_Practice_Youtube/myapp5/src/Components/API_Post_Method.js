import { useState } from "react"


export function API_Post_Method()
{
    const [name,setName] = useState();
    const [location,setLocation] = useState();
    const [shift_time,setShift] = useState();

    function saveData() {
        let data = { name, location, shift_time };
      
        fetch("http://localhost:7373/activity/add_activity/:id", {
          method: 'POST',
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(data)
        })
        .then(response => {
          console.log("result", response);
          return response.json(); // Parse the response as JSON
        })
        .then(data => {
          console.log("response", data);
        })
        .catch(error => {
          console.error('Error:', error);
        });
      }
      
    return(
        <><br/>
           ---------------------------------------------
            <h2>API Post Method Example</h2>

            <input type="text" value={name} onChange={(e)=>{setName(e.target.value)}}/><br/><br/>
            <input type="text" value={location} onChange={(e)=>{setLocation(e.target.value)}} /> <br/><br/>
            <input type="text" value={shift_time} onChange={(e)=>{setShift(e.target.value)}} /><br/><br/>

            <button onClick={saveData}>Save Data</button><br/><br/>

        </>
    )
}