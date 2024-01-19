// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route, NavLink } from 'react-router-dom';
import './App.css';

const Header = () => {
  return (
    <div className="header">
      <nav>
        <NavLink to="/" end className="active">홈</NavLink>
        <NavLink to="/board" className="active">게시판</NavLink>
      </nav>
    </div>
  );
};

const Logo = () => {
  return (
    <div className="logo">
      <img src="logo.png" alt="로고" />
    </div>
  );
};

const Content = () => {
  return (
    <div className="content">
      <div className="content-left">
        <Routes>
          <Route path="/board" element={<HomeContent />} />
        </Routes>
      </div>
      <div className="content-right">
        <Routes>
          <Route path="/board" element={<Board />} />
        </Routes>
      </div>
    </div>
  );
};

const HomeContent = () => {
  return (
    <div>
      <h3>게시물 홈</h3>
      <p>게시물 홈 내용</p>
    </div>
  );
};

const Board = () => {
  const generateBoardContent = () => {
    const boardData = [
      { id: 1, title: '게시물 1', content: '내용 1' },
      { id: 2, title: '게시물 2', content: '내용 2' },
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

const App = () => {
  return (
    <Router>
      <div className="app">
        <Header />
        <Logo />
        <Content />
      </div>
    </Router>
  );
};

export default App;





