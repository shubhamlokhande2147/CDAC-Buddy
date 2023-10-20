
/*  small error ->one file is import
*/

function nestedsum(...args)
{
    function sumHelper(arr)
    {
        for(let item of arr)
        {
            let total=0;
            if(Array.isArray(item))
            {
                total=total+sumHelper(item)
            }
            else if(typeofitem === 'number')
            {
                total=total+item;
            }
        }
    }
      sumHelper(args);
      return total;
}

nestedsum([1,2,[3,[4],5,"6"],6]);
nestedsum([2,[[[[[3]]]]]]);
nestedsum([]);