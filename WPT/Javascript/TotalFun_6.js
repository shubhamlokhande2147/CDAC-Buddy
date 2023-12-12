

function add(...nums)
{
    let sum=0;

    for(let i=0;i<nums.length;i++)
    {
        sum = sum + nums[i];
    }
 return sum;
}

console.log(add(12,23,34,56))
console.log(add("as","adsad","sads","etertf"))