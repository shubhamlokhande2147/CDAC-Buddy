import './App.css';
import './Components/User'
import User from './Components/User';
import { User2_class } from './Components/User2_class';

function App() {
  return (
    <div className="App">
    
    {/* functional Component - */}
    <User></User>
    <User/>

    {/* class Component - */}
    <User2_class></User2_class>
    <User2_class/>

    </div>
  );
}

export default App;
