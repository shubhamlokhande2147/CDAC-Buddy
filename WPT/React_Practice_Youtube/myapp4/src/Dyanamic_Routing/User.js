

export function User(props)
{
    console.log(props.match.params)
    return(
        <>
            <h2>User -{ props.match.params } </h2>
        </>
    )
}