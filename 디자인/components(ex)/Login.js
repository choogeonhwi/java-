// src/components/Login.js
import React from 'react';

const LoginContainerStyle = {
  display: 'flex',
  justifyContent: 'center',
  alignItems: 'center',
  height: '100vh',
};

const LoginFormStyle = {
  background: '#f5f5f5',
  padding: '20px',
  borderRadius: '8px',
  boxShadow: '0 0 10px rgba(0, 0, 0, 0.1)',
};

const FormTitleStyle = {
  textAlign: 'center',
  color: '#333',
};

const InputFieldStyle = {
  width: '100%',
  padding: '10px',
  margin: '8px 0',
  boxSizing: 'border-box',
};

const SubmitButtonStyle = {
  width: '100%',
  padding: '10px',
  background: '#007bff',
  color: '#fff',
  border: 'none',
  borderRadius: '4px',
  cursor: 'pointer',
};

const Login = () => {
  const handleLogin = (e) => {
    e.preventDefault();
    // Handle login logic here
  };

  return (
    <div style={LoginContainerStyle}>
      <form style={LoginFormStyle} onSubmit={handleLogin}>
        <h2 style={FormTitleStyle}>Login</h2>
        <label htmlFor="username">Username:</label>
        <input style={InputFieldStyle} type="text" id="username" required />
        <label htmlFor="password">Password:</label>
        <input style={InputFieldStyle} type="password" id="password" required />
        <button style={SubmitButtonStyle} type="submit">Login</button>
      </form>
    </div>
  );
};

export default Login;
