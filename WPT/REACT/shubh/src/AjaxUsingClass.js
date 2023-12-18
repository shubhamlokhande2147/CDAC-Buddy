import axios from "axios";
import React from "react";
export default class AjaxUClass extends React.Component {
  constructor() {
    super();
    this.state = { arr: [], selectedObj: null };
  }
  componentDidMount() {
    let promises = axios.get("https://reqres.in/api/users?page=2");
    promises.then((res) => {
      this.setState({ arr: res.data.data });
    });
  }
  getOptions = () => {
    return this.state.arr.map((e) => {
      return <option key={e.id} value={e.id}>{e.first_name} </option>
      
    })
  };
  handler = (e) => {
    let selectid = e.target.value;
    let obj = this.state.arr.find((ele) => {
      if (ele.id == selectid) {
        return true;
      } else {
        return false;
      }
    });
    console.log(obj);
    this.setState({ selectedObj: obj });
  };

  render() {
    return (
      <div>
        <select onChange={this.handler}></select>
        {this.getOptions()}
        <p>Id:{this.state.selectedObj?.id}</p>
        <p> Emial:{this.state.selectedObj?.email}</p>
      </div>
    );
  }
}
