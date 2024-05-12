
import { useEffect, useState} from "react";

export function API_Get_Method()
{
       const [data,setData] = useState([]);

    const [ac_id,setAc_id] = useState();
    const [name,setName] = useState();
    const [location,setLocation] = useState();
    const [shift_time,setShift] = useState();


    useEffect(()=>{

        getList()
   },[])

   function getList()
   {
    fetch("http://localhost:7373/activity/getallactivities").then((result)=>{
        result.json().then((response)=>{
            console.log(response);
            setData(response);


            setAc_id(response[0].ac_id);
            setName(response[0].name);
            setLocation(response[0].location);
            setShift(response[0].shift_time);
         })
      })
   }

 //function for updateData - 

//  function updateData(ac_id) {
//     console.log("ac_id", ac_id);
//     console.log("data", data);
  
//     let item = data.find(item => item.ac_id === ac_id);
    
//     if (item && ac_id !== ac_id) { // Check if ac_id is different
//       setAc_id(item.ac_id);
//       setName(item.name);
//       setLocation(item.location);
//       setShift(item.shift_time);
//     } else {
//       console.log(`Item with ac_id ${ac_id} not found.`);
//     }
//   }
  

   //function for delete - 

   //    function deleteData(ac_id) {
//     console.log(ac_id)
//     fetch(`http://localhost:7373/activity/delete_activity/${ac_id}`, {
//       method: "DELETE"
//     })
//     .then(response => {
//       if (!response.ok) {
//         throw new Error('Network response was not ok');
//       }
//       return response.json();
//     })
//     .then(data => {
//       console.log(data);
//       // Call getList() or any other function to update your data
//     })
//     .catch(error => {
//       console.error('Error:', error);
//     });
//   }
  
  
    return(
        <>
            <h2>API Get Method Example</h2>
                <table border={1}>
                  <tbody>
                       <tr>
                          <th>Id</th>
                          <th>Name</th>
                          <th>Location</th>
                          <th>Shift </th>
                          {/* <th>Action </th> */}

                       </tr>
                       {data.map((item) => (
                            <tr key={item.ac_id}>
                                <td>{item.ac_id}</td>
                                <td>{item.name}</td>
                                <td>{item.location}</td>
                                <td>{item.shift_time}</td>
                                {/* <td><button onClick={deleteData(item.ac_id)}>Delete</button></td> */}

                                {/* <td><button onClick={updateData(item.ac_id)}>Update</button></td> */}
                            
                            </tr>
                            ))}      
                  </tbody>
                </table>

                <div>

                <input type="text" value={ac_id} /><br/><br/>
                <input type="text" value={name} /><br/><br/>
                <input type="text" value={location}/> <br/><br/>
                <input type="text" value={shift_time}/><br/><br/>

                  <button >Update Data</button><br/><br/>

                </div>
        </>
    )
}