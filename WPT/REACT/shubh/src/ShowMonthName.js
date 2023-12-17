import { useState } from "react";

export default function ShowMonthName() {
  let [month, setmonth] = useState("Not selected month");
  function handler(event) {
    console.log(event.target);
    let selectedMonth = parseInt(event.target.value);
    console.log(typeof selectedMonth);

    switch (selectedMonth) {
      case 1:
        setmonth("Jan");
        break;
      case 2:
        setmonth("Feb");
        break;
      case 3:
        setmonth("March");
        break;
      case 4:
        setmonth("April");
        break;
      case 5:
        setmonth("May");
        break;
      case 6:
        setmonth("June");
        break;
      case 7:
        setmonth("July");
        break;
      case 8:
        setmonth("Aug");
        break;
      case 9:
        setmonth("Sept");
        break;
      case 10:
        setmonth("Oct");
        break;
      case 11:
        setmonth("Nov");
        break;
      case 12:
        setmonth("Dec");
        break;
      default:
        break;
    }
  }
  return (
    <div>
      SetMonth:
      <select onChange={handler}>
        <option>Select Month</option>
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
      </select>
      <p>The Month Name is: {month}</p>
    </div>
  );
}
