import React, { useState } from 'react';
import './App.css';
import axios from 'axios';
import qs from 'qs';
import $ from 'jquery'; // jQuery import 추가

const WriteContent = () => {
  const [nickname, setNickname] = useState('');
  const [title, setTitle] = useState('');
  const [content, setContent] = useState('');
  const [image, setImage] = useState(null);

  const handleWriteSubmit = async () => {
    const res = await axios.get("/api/board", {
      params: {
        nickname: $(".input-nickname").val(),
        title: $(".input-title").val(),
        content: $(".input-desc").val(),
      },
      paramsSerializer: params => {
        return qs.stringify(params, { arrayFormat: 'brackets' });
      }
    });
    console.log(res);
  };

  return (
    <div className="board">
      <input type="text" placeholder="닉네임" value={nickname} onChange={(e) => setNickname(e.target.value)} className='input-nickname' />
      <input type="text" placeholder="제목" value={title} onChange={(e) => setTitle(e.target.value)} className='input-title' />
      <textarea placeholder="내용" value={content} onChange={(e) => setContent(e.target.value)} className='input-desc' />
      <input type="file" accept="image/*" onChange={(e) => setImage(e.target.files[0])} />
      {image && (
        <div className="image-preview">
          <img src={URL.createObjectURL(image)} alt="미리보기" />
        </div>
      )}
      <button onClick={() => handleWriteSubmit()}>작성 완료</button>
    </div>
  );
};

const App = () => {
  return (
    <div className="app">
      <WriteContent />
    </div>
  );
};

export default App;

















