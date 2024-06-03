import logo from './logo.svg';
import './App.css';

import { useState } from 'react';

let adjust = undefined;

function App() {

 const [watch,setWatch] = useState(0);
 const [started,setStarted] = useState(false);

 const startwatch = () =>{

  adjust = setInterval(()=>{
    setWatch((x) => x+1)
  },1000)

  setStarted(true);
 }

 const stopwatch = () =>{

  clearInterval(adjust);
  setStarted(false);
  
 }


 const resetwatch = () =>{

  setWatch(0);
  clearInterval(adjust);
  setStarted(false);
  
 }


  return (
    <div className="App">
      
    <h1>{watch}</h1>

    <button disabled={started} onClick={startwatch}>Start</button>
    <button onClick={stopwatch}>Stop</button>
    <button onClick={resetwatch}>Reset</button>

    </div>
  );
}

export default App;
