import './App.css';

import { Pure_with_Class } from './Pure Component & useMemo_Hook/Pure_with_Class';
import { UseMemo_Hook_Functional } from './Pure Component & useMemo_Hook/UseMemo_Hook_Functional';

//======================================================================

import { Ref_with_Class } from './Ref/Ref_with_Class';
import { UseRef_with_Function } from './Ref/UseRef_with_Function'; 
import { ForwardRef_Parent } from './Ref/ForwardRef_Parent';

//=======================================================================

import { Controlled_Component } from './Controlled_Component';
import { Uncontrolled_Component } from './Uncontrolled_Component';
import { HOC_Component } from './HOC_Component';


function App() {
  return (
    <div className="App">
     
     {/* Pure Component with Class Example */}
     {/* <Pure_with_Class/> */}

     {/* useMemo Hook Functional Example */}
     {/* <UseMemo_Hook_Functional/> */}

     {/* Ref using Class Example */}
     {/* <Ref_with_Class/> */}

     {/* Ref using useRef Hook with Function Example */}
     {/* <UseRef_with_Function/> */}

     {/* Ref using useRef Hook for forwordRef with parent and child Component Example */}
     {/* <ForwardRef_Parent/> */}

     {/* Controlled_Component Example -  */}
     {/* <Controlled_Component /> */}

     {/* Uncontrolled_Component Example -  */}
     {/* <Uncontrolled_Component /> */}

     {/* High Order Component Example -  */}
     <HOC_Component/>
    </div>
  );
}

export default App;
