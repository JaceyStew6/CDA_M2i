import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import Register from './components/Register';
import Header from './shared/Header';

import PrivateRoute from './helpers/PrivateRoute';
import TodoList from './components/TodoList';
import CreateTodo from'./components/CreateTodo';


function App() {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/" element={<Login />} />

        {/* Protéger la route /todos */}
        <Route path="/todos" element={
          <PrivateRoute>
            <TodoList />
          </PrivateRoute>
        } />

        {/* Protéger la route /todos/admin*/}
        <Route path="/todos/admin/post" element={
          <PrivateRoute>
            <CreateTodo />
          </PrivateRoute>
        } />
      </Routes>
    </Router>
  );
}
export default App;

