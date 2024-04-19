
import { Table } from "react-bootstrap"

export function Array_of_Object()
{
    const students = [  {name : "shubham" , college : "IET" , mobile : 2147 },
                        {name : "omkar" , college : "DRK" , mobile : 233147 },     
                        {name : "Vivek" , college : "VCK" , mobile : 21332247 } ]

    return(
        <div>
           <h3> Array of Object using map() </h3>
           <h3> List with Simple Table</h3>

         <table border="1">
            <thead>
                <tr>
                <th>Name</th>
                <th>College</th>
                <th>Mobile</th>
                </tr>
            </thead>
            <tbody>
                {
                //here, i used for unique kay in child 
                students.map((data,i) => (
                    <tr key={i}>
                        <td>{data.name}</td>
                        <td>{data.college}</td>
                        <td>{data.mobile}</td>
                    </tr>
                ))
                }
            </tbody>
            </table> <br/><br/>

            <h3>List with Bootstrap Table</h3>

             <Table striped>
                <thead>
                  <tr>
                     <th>Sr.</th>
                     <th>Name</th>
                     <th>College</th>
                     <th>Mobile</th>
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
                    </tr>
                ))
                }
                
                </tbody>
                </Table>

          
        </div>
    )
}