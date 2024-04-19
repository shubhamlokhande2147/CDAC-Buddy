
export function Array_MapFun()
{
    const students = ["shubham","omkar","vivek","shiv","sid","shiv"];

    //using map() function
    students.map((items)=>{
        console.log("using map() function :",items);
    })

    //using for loop
    for(let i = 0; i < students.length; i++)
    {
        console.log("Using for loop : ", students[i]);
    }
    return(
        <div>
            <h2>Array With List</h2>
            {
                students.map((data)=>
                 <h3>Hello {data}</h3>   
                )
            }

        </div>
    )
}