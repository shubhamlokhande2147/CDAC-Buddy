
// import "./App.css";
// import Hello from "./Hello";
// // import Maths from "./Maths";
// // import MathsPassPara from "./MathsPassPara";
// // import Icard from "./Icard";
// // import Welcome, { Greeting } from "./welcome";
// // import Total from "./Total";
// function App() {
//   // let arr=[10,20,30,200]
//   // let obj={name:"Harshvardhan Wadavane",dob:"30/05/2000",phone:"xxxxxxxx"}
//   // let obj1={name:"Shubham Lokhande",dob:"17/04/2000",phone:"xxxxxxxx"}

//   return (
//     <>
//       {/* <Welcome></Welcome>
//       <Greeting></Greeting>
//       <Maths></Maths>
//       <MathsPassPara num1={15} num2={35} op={"*"}></MathsPassPara>
//       <Total nums ={arr}></Total>
//       <Icard obj={obj}></Icard>
//       <Icard obj={obj1}></Icard> */}


//     </>
//   );
// }

// export default App;



//------------------------------
//day2

//import { useState } from "react";
import "./App.css";
import CaseExample from "./CaseExample";
import HalfString from "./HalfString";
import Hello from "./Hello";
import ShowList from "./ShowList";
import ShowMonthName from "./ShowMonthName";
import StudentData from "./StudentData";
import SayHi from "./sayHi";
import EduDetails from "./EduDetails";

function App() {
  //let [col] = useState("red")

  return (
    <>
      <Hello name={"harsh"} col={"red"}></Hello>
      <SayHi></SayHi>
      <ShowMonthName></ShowMonthName>
      <HalfString></HalfString>
      <CaseExample></CaseExample>
      <StudentData></StudentData>
      <ShowList></ShowList>
      <EduDetails></EduDetails>
    </>
  );
}


export default App;
