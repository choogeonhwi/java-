import React, { useState, useEffect } from 'react';
import './App.css';
import axios from 'axios';
import qs from 'qs';
import $ from 'jquery'; // jQuery import 추가

const WriteContent = () => {
  const [memberId, setMemberId] = useState('');
  const [nickname, setNickname] = useState('');
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const [image, setImage] = useState(null);
  const [imageSize, setImageSize] = useState('');

  const handleWriteSubmit = async () => {
    const formData = new FormData();
    formData.append('memberId', memberId);
    formData.append('nickname', nickname);
    formData.append('title', title);
    formData.append('description', description);
    formData.append('image', image);

    try {
      const response = await axios.post("/api/board", formData, {
        headers: {
          'Content-Type': 'multipart/form-data'
        }
      });
      console.log(response.data);
      // 팝업창 띄우기 예시
      alert('글이 성공적으로 작성되었습니다.');
    } catch (error) {
      console.error('글 작성에 실패했습니다:', error);
      // 실패 시 에러 메시지 팝업창 띄우기 예시
      alert('글 작성에 실패했습니다.');
    }
  };

  useEffect(() => {
    // 사용자 정보 로드 및 설정 코드 작성
    fetchMemberInfo();
  }, []);

  const fetchMemberInfo = async () => {
    try {
      const response = await axios.get("/api/member"); // 예시 URL, 실제 URL로 수정 필요
      const { memberId } = response.data;
      setMemberId(memberId);
    } catch (error) {
      console.error('사용자 정보를 불러오는데 실패했습니다:', error);
    }
  };

  const handleImageChange = (e) => {
    const file = e.target.files[0];
    setImage(file);
    setImageSize(file.size);
  };

  $(document).ready(function() {
    $("#imageInput").change(function() {
      const fileSize = this.files[0].size;
      setImageSize(fileSize);
    });
  });

  return (
    <div className="board">
      <h2>글쓰기</h2>
      <label>작성자 ID:</label>
      <input type="text" value={memberId} readOnly />
      <label>닉네임:</label>
      <input type="text" placeholder="닉네임을 입력하세요" value={nickname} onChange={(e) => setNickname(e.target.value)} />
      <input type="text" placeholder="제목" value={title} onChange={(e) => setTitle(e.target.value)} />
      <textarea placeholder="내용" value={description} onChange={(e) => setDescription(e.target.value)} />
      <input id="imageInput" type="file" accept="image/*" onChange={handleImageChange} />
      {imageSize && <p>이미지 크기: {imageSize} bytes</p>}
      <div className="button-container">
        <button onClick={handleWriteSubmit}>작성 완료</button>
        <button onClick={() => window.location.reload()}>취소</button>
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


















