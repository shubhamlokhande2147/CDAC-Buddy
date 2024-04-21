
import React, { useState } from 'react'

export function UseMemo_Hook_Functional()
{
    const [count, setData] = useState(1)
    const [item, setItem] = useState(10)
  
    const newApple=React.useMemo(
      function appleTime() {
        console.warn("useMemo call")
        return 5 * count;
      }
    ,[count])
    return (
      <div className="App">
        <h1>Hooks in React <br/> Count : {count}</h1>
        <h1>Item : {item}</h1>
        <h1>{newApple}</h1>
        <button onClick={() => setData(count + 1)}>Update Count</button><br/><br/>
        <button onClick={() => setItem(item * 1000)}>Update Item</button>
  
      </div>
    );
}