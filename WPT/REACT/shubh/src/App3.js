import { useEffect, useState } from "react";
import "./App.css";
// import LifeCycle from "./LifeCycleExam1";
// import LifeCycleUsingFun from "./LifecycleUsingFun";
import AjaxUClass from "./AjaxUsingClass";
import AjaxCEx from "./AjaxCEx";
function App() {
  let[flag,setflag] = useState(false);
  let[msg,setmsg] = useState("this is msg")
 
 
   useEffect(()=>{
    console.log("App3 is mounting")
   },[])
  
    useEffect(()=>{
      console.log("App3 is msg updated")
    },[msg])
 
    useEffect(()=>{
      console.log("App3 flag updated")
    },[flag]) 

  return (
    <>
      <h1>Day 3 Example</h1>
      <input type="text" onChange={(e)=>{
        setmsg(e.target.value)
      }}/>
      <input type="checkbox" onClick={(e)=>{
        setflag(e.target.checked)
      }}/>
      {/* {flag && <LifeCycle msg={msg}></LifeCycle>} */}

      {/* {flag && <LifeCycleUsingFun msg={msg}></LifeCycleUsingFun>} */}
      <AjaxCEx></AjaxCEx>
    </>
  );
}

export default App;
