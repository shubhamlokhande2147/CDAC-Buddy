import './App.css';

import { API_Get_Method } from './Components/API_Get_Method';
import { API_Post_Method } from './Components/API_Post_Method';


function App() {
  return (
    <div className="App">
           
           {/* API Get Method Example -  */}
           <API_Get_Method/>

           {/* API Post Method Example -  */}
           {/* <API_Post_Method/> */}

    </div>
  );
}

export default App;
