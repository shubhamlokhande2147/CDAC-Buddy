import './App.css';
import './Components/User'
import User from './Components/User';
import { User2_class } from './Components/User2_class';
import JSX_Example from './Components/JSX_Example';
import { Click_Event } from './Components/Click_Event';
import { State_Example } from './Components/State_Example';
import { State_Class } from './Components/State_Class';
import { Props_Functional } from './Components/Props_Functional';
import { Props_Class } from './Components/Props_Class';
import { Hide_Show } from './Components/Hide_Show';
import { SampleForm } from './Components/SampleForm';
import { Basic_Validation } from './Components/Basic_Validation'; 
import { Function_As_Props } from './Components/Function_As_Props';

function App() {

  function getdata()
  {
    alert("Hello from App");
  }
  return (
    <div className="App">
    
    {/* functional Component - */}
    <User></User>
    <User/>

    {/* class Component - */}
    <User2_class></User2_class>
    <User2_class/> 

    {/* JSX  Component - */}
     <JSX_Example></JSX_Example>

    {/* Click event Component - */}
     <Click_Event></Click_Event>

    {/* State functional Example Component - */}
     <State_Example></State_Example>

    {/* State class Example Component - */}
    <State_Class></State_Class> 
    
    {/* props in functional Component - */}
    {/* <Props_Functional name={"Shubham"} college = { "DOT" }></Props_Functional> 
    <Props_Functional name={"Omkar" } college = { "KIT" }></Props_Functional>  */}
    <Props_Functional name={"Vivek" } college = {"VCK"} other={{address : "Malharpeth" , mobile : "9404112147"}}></Props_Functional> 
 
     {/* props in class Component - */}
    <Props_Class name={"Vivek" } college = {"VCK"} other={{address : "Malharpeth" , mobile : "9404112147"}}></Props_Class> 
  
    <Hide_Show></Hide_Show>

    {/* Form Example -  */}
    <SampleForm></SampleForm>

    {/* Basic_Validation -  */}
    <Basic_Validation></Basic_Validation>

    {/* Function_As_Props use getdata() function write in top -  */}
    <Function_As_Props data={getdata}></Function_As_Props>
    </div>
  );
}

export default App;
