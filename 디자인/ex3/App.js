// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route, Outlet, NavLink } from 'react-router-dom';
import './App.css';

const Header = () => {
  return (
    <div className="header">
      <nav>
        <NavLink to="/" end className="active">Home</NavLink>
        <NavLink to="/board" className="active">Board</NavLink>
      </nav>
    </div>
  );
};

const Logo = () => {
  return (
    <div className="logo">
      {/* 로고 이미지 또는 텍스트를 넣어주세요 */}
      <img src="logo.png" alt="Logo" />
    </div>
  );
};

const Content = () => {
  return (
    <div className="content">
      {/* 여기에 좌4:우2 비율로 컨텐츠를 구성하는 내용을 추가하세요 */}
    </div>
  );
};

const Board = () => {
  // 게시판 내용을 배열로 만들어주는 함수
  const generateBoardContent = () => {
    // 예시: Zum.com에서 가져온 게시판 형식 데이터
    const boardData = [
      { id: 1, title: '게시물 1', content: '내용 1' },
      { id: 2, title: '게시물 2', content: '내용 2' },
      // 추가적인 데이터 추가 가능
    ];

    return boardData.map(item => (
      <div key={item.id} className="board-item">
        <h3>{item.title}</h3>
        <p>{item.content}</p>
      </div>
    ));
  };

  return (
    <div className="board">
      {generateBoardContent()}
    </div>
  );
};

const Home = () => (
  <div>
    <h2>Home</h2>
    <Content />
  </div>
);

const App = () => {
  return (
    <Router>
      <div className="app">
        <Header />
        <Logo />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/board" element={<Board />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;

