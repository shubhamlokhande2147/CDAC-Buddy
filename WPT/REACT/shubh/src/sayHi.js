import React, { useState } from "react";

export default function SayHi() {
    let [msg, setmsg] = useState("");

    function handler() {
     
        setmsg("Hi Shubham and Harsh");

      console.log("Hi Shubham and Harsh",msg);
    }

    return (
      <>
        <input type="button" value="Print Hi" onClick={handler} />
        <p>msg : {msg}</p>
      </>
    );
  
}
