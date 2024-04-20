
export function Student(props)
{
    return(
    <div>
        <h3>Student Component</h3>
        <p>Name :{props.data.name}</p>
        <p>College: {props.data.college}</p>
        <p>Mobile: {props.data.mobile}</p>
    </div>
        
    )
}