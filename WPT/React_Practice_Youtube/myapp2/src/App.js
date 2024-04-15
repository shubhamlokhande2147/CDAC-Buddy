import './App.css';
import { Constructor_Method } from './Lifecycle_Methods/Constructor_Method';
import { Render_Method } from './Lifecycle_Methods/Render_Method';
import { ComponentDidMount_Method } from './Lifecycle_Methods/ComponentDidMount_Method';
import { ComponentDidUpdate_Method } from './Lifecycle_Methods/componentDidUpdate_Method';
import { ShouldComponentUpdate_Method } from './Lifecycle_Methods/ShouldComponentUpdate_Method';


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
       <ShouldComponentUpdate_Method />

    </div>
  );
}

export default App;
