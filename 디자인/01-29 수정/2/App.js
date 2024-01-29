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
  const [isSubmitted, setIsSubmitted] = useState(false); // 작성 완료 여부 상태 추가

  const handleWriteSubmit = async () => {
    // 작성 완료 후 사용자에게 안내 문구를 표시하기 위해 isSubmitted를 true로 설정
    setIsSubmitted(true);

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

  // 작성 취소 핸들러
  const handleWriteCancel = () => {
    setNickname('');
    setTitle('');
    setContent('');
    setImage(null);
  };

  // 모달 닫기 핸들러
  const handleCloseModal = () => {
    setIsSubmitted(false);
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
      {/* 작성 완료 후 모달 팝업 창으로 안내 문구 표시 */}
      {isSubmitted && (
        <div className="modal">
          <div className="modal-content">
            <span className="close" onClick={handleCloseModal}>&times;</span>
            <p>게시물이 작성되었습니다!</p>
          </div>
        </div>
      )}
      {/* 작성 완료 및 취소 버튼 */}
      <div className="button-container">
        <button onClick={() => handleWriteSubmit()}>작성 완료</button>
        <button onClick={handleWriteCancel}>취소</button>
      </div>
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


















