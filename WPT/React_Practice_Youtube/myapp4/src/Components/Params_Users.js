
import { useParams } from "react-router-dom"

export function Params_Users()
{
    const params = useParams();
    const {name} = params;
    return(
        <>
            <h2>This is {name}'s Page</h2>
        </>
    )
}