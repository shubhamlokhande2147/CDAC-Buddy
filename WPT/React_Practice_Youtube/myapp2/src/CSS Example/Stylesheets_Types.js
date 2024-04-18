
import React  from 'react';
import './style_1.css'; //import for type_1
// import style from './custom_module.css'; // Import CSS module for type_3

export function Stylesheets_Types()
{
    return(
        <div>
              <h1 className='primary'>Stylesheets Type 1</h1>
              <h1 style={{backgroundColor : 'blueviolet', color : 'red', marginTop : '5%'}}>Stylesheets Type 2</h1>
              {/* <h1 className={style.success}>Stylesheets Type 3</h1> */}


        </div>
    )
}