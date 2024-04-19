
import { Table } from "react-bootstrap";

export function Nested_List()
{
    const students = [  {name : "shubham" , college : "IET" , mobile : 2147, address : [ 
                                                                                         { hn : "11", city : "Kolhapur", country : "India" } ,
                                                                                         { hn : "22", city : "Pune", country : "India" },
                                                                                         { hn : "32", city : "Solapur", country : "India" }] },
                        {name : "omkar" , college : "DRK" , mobile : 233147, address : [ 
                                                                                         { hn : "122", city : "Kolhapur", country : "India" } ,
                                                                                         { hn : "222", city : "Kolhapur", country : "India" },
                                                                                         { hn : "322", city : "Kolhapur", country : "India" }] },     
                        {name : "Vivek" , college : "VCK" , mobile : 21332247, address : [ 
                                                                                         { hn : "1222", city : "Kolhapur", country : "India" } ,
                                                                                         { hn : "2222", city : "Kolhapur", country : "India" },
                                                                                         { hn : "33", city : "Kolhapur", country : "India" } ] }
                     ]

    return(
        <div>
           <h3> Nested List using map() </h3>
         
            <h3>List with Bootstrap Table</h3>

             <Table striped variant="dark">
                <thead>
                  <tr>
                     <th>Sr.</th>
                     <th>Name</th>
                     <th>College</th>
                     <th>Mobile</th>
                     <th>Address</th>
                  </tr>
                </thead>
                <tbody>
                {
                //here, i used for unique kay in child 
                students.map((data,i) => (
                    <tr key={i}>
                        <td>{ i + 1 }</td>
                        <td>{data.name}</td>
                        <td>{data.college}</td>
                        <td>{data.mobile}</td>
                            <td>
                                     <Table striped variant="dark">
                                        <tbody> 
                                        {
                                           data.address.map((items,i)=>
                                             <tr key={ i }>
                                                <td>{items.hn}</td>
                                                <td>{items.city}</td>
                                                <td>{items.country}</td>
                                             </tr>
                                            )}
                                          </tbody>
                                        </Table>
                                    
                            </td>
                    </tr>
                ))
                }
                
                </tbody>
                </Table>

          
        </div>
    )
}