// import './App.css';

// import { API_Get_Method } from './Components/API_Get_Method';
// import { API_Post_Method } from './Components/API_Post_Method';

// //-----------------------------------------------------------

// import { Previous_State } from './Others/Previous_State';
// import { Previous_Props_Parent } from './Others/Previous_Props_Parent'
// import { State_With_Object } from './Others/State_With_Object'


// function App() {
//   return (
//     <div className="App">
           
//            {/* API Get Method Example -  */}
//            {/* <API_Get_Method/> */}

//            {/* API Post Method Example -  */}
//            {/* <API_Post_Method/> */}


//            {/* Previous State Example -  */}
//            {/* <Previous_State/> */}

//            {/* Previous Props Example -  */}
//            {/* <Previous_Props_Parent/> */}

//            {/* State With Object Example -  */}
//            {/* <State_With_Object/> */}

//     </div>
//   );
// }

// export default App;


// code for context API - 
//first all upward code is comment. 


import React from 'react';
import { CounterProvider } from './Context_API/Context'
import CounterDisplay from './Context_API/CounterDisplay'
import CounterButtons from './Context_API/CounterButtons'

function App() {
  return (
    <CounterProvider>
      <div className="App">
        <h1>Counter App</h1>
        <CounterDisplay />
        <CounterButtons />
      </div>
    </CounterProvider>
  );
}

export default App;

