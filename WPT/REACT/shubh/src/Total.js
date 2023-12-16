//export default function Total(props)
export default function Total({nums})
{
    let sum=0;
    //let nums = props.nums;
    for(let i=0;i<nums.length;i++)
    {
        sum+=nums[i];
    }
    return(
        <p>Total:{sum}</p>
    )
}