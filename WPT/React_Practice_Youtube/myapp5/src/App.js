import './App.css';

import { API_Get_Method } from './Components/API_Get_Method';
import { API_Post_Method } from './Components/API_Post_Method';

//-----------------------------------------------------------

import { Previous_State } from './Others/Previous_State';
import { Previous_Props_Parent } from './Others/Previous_Props_Parent'
import { State_With_Object } from './Others/State_With_Object'


function App() {
  return (
    <div className="App">
           
           {/* API Get Method Example -  */}
           {/* <API_Get_Method/> */}

           {/* API Post Method Example -  */}
           {/* <API_Post_Method/> */}


           {/* Previous State Example -  */}
           {/* <Previous_State/> */}

           {/* Previous Props Example -  */}
           {/* <Previous_Props_Parent/> */}

           {/* State With Object Example -  */}
           <State_With_Object/>

    </div>
  );
}

export default App;
