// App.js

import React, { useState } from 'react';
import './App.css';
import axios from 'axios';
import jquery from 'jquery';

function App() {
  const [formData, setFormData] = useState({
    planDate: '',
    planAddr: '',
    planTitle: '',
    planDesc: '',
    gatheringId: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleWriteSubmit = () => {
    // 폼 데이터 가져오기
    const formData = {
      GAT_PLAN_DATE: $(".GAT_PLAN_DATE").val(),
      GAT_PLAN_ADDR: $(".GAT_PLAN_ADDR").val(),
      GAT_PLAN_TITLE: $(".input-title").val(),
      GAT_PLAN_DESC: $(".input-description").val(),
      GATHERING_GAT_ID: $(".input-gathering-id").val(),
    };
  
    // 데이터 전송
    $.ajax({
      url: "/api/board",
      method: "GET",
      data: formData,
      success: function(response) {
        console.log(response);
        // 작성 완료 안내 팝업창
        alert('일정이 성공적으로 생성되었습니다.');
      },
      error: function(xhr, status, error) {
        console.error('일정 생성에 실패했습니다:', error);
        // 실패 시 에러 메시지 팝업창
        alert('일정 생성에 실패했습니다.');
      }
    });
  };

  return (
    <div className="App">
      <h1>일정 생성</h1>
      <form onSubmit={handleWriteSubmit}>
        <label>
          만날 날짜:
          <input
            type="date"
            name="GAT_PLAN_DATE"
            value={formData.GAT_PLAN_DATE}
            onChange={handleChange}
            required
          />
        </label>
        <label>
          만날 장소:
          <input
            type="text"
            name="GAT_PLAN_ADDR"
            value={formData.GAT_PLAN_ADDR}
            onChange={handleChange}
            required
          />
        </label>
        <label>
          일정 제목:
          <input
            type="text"
            name="GAT_PLAN_TITLE"
            value={formData.GAT_PLAN_TITLE}
            onChange={handleChange}
            required
          />
        </label>
        <label>
          일정 설명:
          <textarea
            name="GAT_PLAN_DESC"
            value={formData.GAT_PLAN_DESC}
            onChange={handleChange}
            required
          />
        </label>
        <label>
          모임 ID:
          <input
            type="text"
            name="GATHERING_GAT_ID"
            value={formData.GATHERING_GAT_ID}
            onChange={handleChange}
            required
          />
        </label>
        <button type="submit">일정 생성</button>
      </form>
    </div>
  );
  
}

export default App;
















