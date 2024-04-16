import './App.css';
// import { Constructor_Method } from './Lifecycle_Methods/Constructor_Method';
// import { Render_Method } from './Lifecycle_Methods/Render_Method';
// import { ComponentDidMount_Method } from './Lifecycle_Methods/ComponentDidMount_Method';
// import { ComponentDidUpdate_Method } from './Lifecycle_Methods/componentDidUpdate_Method';
// import { ShouldComponentUpdate_Method } from './Lifecycle_Methods/ShouldComponentUpdate_Method';
// import { ComponentWillUnmount } from './Lifecycle_Methods/ComponentWillUnmount';
//=======================================================================

import { UseState_Hook } from './Functional_Lifecycle_Methods/UseState_Hook';

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
       <UseState_Hook/>
     </div>
  );
}

export default App;
