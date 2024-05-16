
import React from 'react';

import VivoImage from '../Images/Vivo.jpeg' // Import the image


function Home(props)
{
    console.log("Home" , props);

    return(
        <div>
 
        <h1>Home Component</h1>
        <div className="cart-wrapper">
            <div className="img-wrapper item">
            <img src={VivoImage} alt="Vivo" /> {/* Use the imported image */}
            </div>
            <div className="text-wrapper item">
                <span>
                    <b>
                       Vivo V15
                    </b>
                </span><br/>
                <span>
                    Price: Rs.19,999/-
                </span>
            </div>
            <div className="btn-wrapper item">
                    <button 
                     onClick={
                        ()=>{props.addToCartHandler({pice:19999,name:'Vivo v15'})}
                        }>
                        Add To Cart
                    </button><br/>

                    <button className='remove-cart-btn' 
                     onClick={
                        ()=>{props.removeToCartHandler()}
                        }>
                        Remove To Cart
                    </button>
            </div>
        </div>
    </div>
    )
}

export default Home