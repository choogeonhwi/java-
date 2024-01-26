import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import qs from 'qs';
import $ from 'jquery';

function App() {

  const handleWriteSubmit = async () => {
    const res = await (await axios.get("/api/board", {
      params: {
        nickname:$(".id").val(),
        title:$(".pw").val(),
        content:$(".name").val(),
      },
      paramsSerializer: params => {
        return qs.stringify(params, {arrayFormat:'brackets'})
      }
    }
    )).data;
    console.log(res);
  }

  return (
    <div className="App">
      <input type="text" className="id"></input>
      <input type="text" className="pw"></input>
      <input type="text" className="name"></input>
      <input type="button" value="전송" onClick={handleWriteSubmit}></input>
    </div>
  );
}

export default App;
