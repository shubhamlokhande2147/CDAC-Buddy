
import { useSearchParams } from "react-router-dom"

export function SearchParam_Hook()
{
    const [searchParam,setSearchParam] = useSearchParams();
    console.log(searchParam.get('age'));

    const age = searchParam.get('age');
    const city = searchParam.get('city')

    return(
        <>
            <h2>SearchParam Hook Example</h2>
            <h2>Age : {age}</h2>
            <h2>City : {city}</h2>

            <button onClick={()=>setSearchParam({age: 40, city : "Kolhapurkr"})}>Set SearchParam</button>
        </>
    )
}