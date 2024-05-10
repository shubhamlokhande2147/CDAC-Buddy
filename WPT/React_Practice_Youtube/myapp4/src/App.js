import './App.css';

import { BrowserRouter, Route, Routes, Navigate } from 'react-router-dom';

import { Home } from './Components/Home';
import { About } from './Components/About';
import { NavBars_Links } from './Components/NavBars_Links';
import { PageNot_404 } from './Components/PageNot_404';
import { Params_Users } from './Components/Params_Users';
import { SearchParam_Hook } from './Components/SearchParam_Hook';
import { UseNavigate_Hook } from './Components/UseNavigate_Hook';


function App() {
  return (
    <div className="App">

      <BrowserRouter>
         <NavBars_Links/>
           <Routes>
              <Route path='/' element={<Home/>}></Route>
              <Route path='/about' element={<About/>}></Route>

              {/* page not found erroe page or redirect to home page using Navigate -  */}
              <Route path='/*' element={<PageNot_404/>}></Route>
              {/* <Route path='/*' element={<Navigate to = "/" />}></Route> */}

              
              {/* here use params -  */}
              <Route path='/params_users/:name' element={<Params_Users/>}></Route>

              {/* useSearchParam Hook Example -  */}
              <Route path='/searchparam_hook' element={<SearchParam_Hook/>}></Route>

              {/* UseNavigate Hook Example -  */}
              <Route path='/usenavigate_hook' element={<UseNavigate_Hook/>}></Route>

           </Routes>
      </BrowserRouter>

     
    </div>
  );
}

export default App;
