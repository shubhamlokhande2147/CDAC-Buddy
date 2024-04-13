
export function Props_Functional(props)
{
    console.log(props.name);
    return(
        <div style={{backgroundColor : "skyblue"}}>
               <p>------------------------------------------------------</p>
               <h3>Props_Functional Example</h3>
               <h2>Hello { props.name }</h2>
               <h2>College : { props.college }</h2>
               <h2>Address : {props.other.address} </h2>
               <h2>Mobile : {props.other.mobile} </h2>

        </div>
    )
}