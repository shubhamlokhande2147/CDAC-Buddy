export default function Icard(props)
{
    let {name,dob,phone} = props.obj;
    let sty = {
        border :"1", width:"300px",backgroundColor:"red"
    }
    return(
        <div style={sty}>
            <p>Name: {name}</p>
            <p>dob: {dob}</p>
            <p>phone: {phone}</p>
        </div>
    )
}