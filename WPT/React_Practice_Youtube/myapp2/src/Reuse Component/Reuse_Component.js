
import { Student } from "./Student";

export function Reuse_Component()
{
    const students = [  {name : "shubham" , college : "IET" , mobile : 2147 },
                        {name : "omkar" , college : "DRK" , mobile : 233147 },     
                        {name : "Vivek" , college : "VCK" , mobile : 21332247 } ]
    
    // data is pass in Reuse_Component to Student Component

    return(
        <div>
        <h3>Reuse Component Example</h3>
        {students.map((item, i) => (
            <Student key={i} data={item} />
        ))}
    </div>
    )
}