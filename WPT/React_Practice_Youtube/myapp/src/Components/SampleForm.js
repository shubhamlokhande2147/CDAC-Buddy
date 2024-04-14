
import { useState } from "react";

export function SampleForm() {
    const [name, setName] = useState("");
    const [mobile, setMobile] = useState("");
    const [team, setTeam] = useState("");
    const [tnc, setTnc] = useState(false);

    function getData(e) {
        e.preventDefault(); // Corrected spelling of preventDefault
        console.log("-------------------------");
        console.log(name, mobile, team, tnc);
    }

    return (
        <div>
            <h3>IPL FORM</h3>
            <form onSubmit={getData}>
                <input type="text" placeholder="Enter Name" onChange={(e) => setName(e.target.value)} required/><br /><br />
                <input type="text" placeholder="Enter Mobile No." onChange={(e) => setMobile(e.target.value)} required/><br /><br />
                <select onChange={(e) => setTeam(e.target.value)} required>
                    <option>Select your Team</option>
                    <option>MI</option>
                    <option>CSK</option>
                    <option>RCB</option>
                    <option>RR</option>
                    <option>GT</option>
                    <option>LSJ</option>
                    <option>DC</option>
                </select><br /><br />
                <input type="checkbox" onChange={(e) => setTnc(e.target.checked)} required/><span>Accept Terms and Conditions.</span><br /><br />
                <button type="submit">Submit</button>
            </form>
            <h2>---------------------------------------------------------------------</h2>
        </div>
    );
}
