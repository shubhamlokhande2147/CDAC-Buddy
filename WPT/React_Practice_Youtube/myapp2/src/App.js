import './App.css';
// import { Constructor_Method } from './Lifecycle_Methods/Constructor_Method';
// import { Render_Method } from './Lifecycle_Methods/Render_Method';
// import { ComponentDidMount_Method } from './Lifecycle_Methods/ComponentDidMount_Method';
// import { ComponentDidUpdate_Method } from './Lifecycle_Methods/componentDidUpdate_Method';
// import { ShouldComponentUpdate_Method } from './Lifecycle_Methods/ShouldComponentUpdate_Method';
// import { ComponentWillUnmount } from './Lifecycle_Methods/ComponentWillUnmount';
//=======================================================================

import { UseState_Hook } from './Functional_Lifecycle_Methods/UseState_Hook';
import { UseEffect_Hook } from './Functional_Lifecycle_Methods/UseEffect_Hook'
import { Condition_with_UseEffect_Hook } from './Functional_Lifecycle_Methods/Condition_with_UseEffect_Hook'

//==========================================================================================

import { Stylesheets_Types } from './CSS Example/Stylesheets_Types';
import { Bootstrap_Example } from './Bootstrap/Bootstrap_Example'

//==============================================================================================

import { Array_MapFun } from './Array With List/Array_MapFun';
import { Array_of_Object } from './Array With List/Array_of_Object';
import { Nested_List } from './Array With List/Nested_List';

function App() {
  return (
    <div className="App">
      
      {/* Constructor_Method Example -  */}
      {/* <Constructor_Method></Constructor_Method> */}
      
      {/* Render_Method Example -  */}
      {/* <Render_Method></Render_Method> */}

      {/* ComponentDidMount_Method Example -  */}
      {/* <ComponentDidMount_Method /> */}
      
      {/* ComponentDidUpdate_Method Example -  */}
      {/* <ComponentDidUpdate_Method /> */}

       {/* ShouldComponentUpdate_Method Example -  */}
       {/* <ShouldComponentUpdate_Method /> */}

       {/* ComponentWillUnmount_Method Example use Student component -  */}
       {/* <ComponentWillUnmount/> */}
 
       {/* UseState_Hook Example -  */}
       {/* <UseState_Hook/> */}

       {/* UseEffect_Hook Example -  */}
       {/* <UseEffect_Hook/> */}

       {/* Condition_with_UseEffect_Hook with specific condition - */}
       {/* <Condition_with_UseEffect_Hook /> */}

       {/* Stylesheets Types Example - */}
       {/* <Stylesheets_Types /> */}

       {/* Bootstrap_Example -  */}
       {/* <Bootstrap_Example /> */}

       {/* Array with list using map() function -  */}
       {/* <Array_MapFun/> */}

       {/* Arra of Object with list using map() function  - */}
       {/* <Array_of_Object/> */}

       {/* Nested List using map() function -  */}
       <Nested_List/>
     </div>
  );
}

export default App;
