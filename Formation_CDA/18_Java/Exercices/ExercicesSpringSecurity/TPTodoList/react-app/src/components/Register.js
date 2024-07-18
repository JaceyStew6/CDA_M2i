import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import authService from '../services/authService';

const Register = () => {
  const navigate = useNavigate();
  const [userData, setUserData] = useState({
    lastname: '', 
    firstname: '', 
    email: '', 
    password: '', 
    role: 'ROLE_USER',
});

//TODO: voir si name ne pose pas de problème
  const handleChange = (e) => {
    const { name, value } = e.target;
    setUserData(prevState => ({
      ...prevState,
      [name]: value
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const { lastname, firstname, email, password, role } = userData;
      await authService.register(lastname, firstname, email, password, role);
      console.log('User registered successfully');
      navigate('/login'); 
    } catch (error) {
      console.error('Error registering user:', error);
    }
  };

  return (
    <div className="container mt-5">
      <h2>Inscription</h2>
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label htmlFor="lastname" className="form-label">Nom</label>
          <input
            type="text"
            className="form-control"
            id="lastname"
            name="lastname"
            value={userData.lastname}
            onChange={handleChange}
            required
          />
        </div>
        <div className="mb-3">
          <label htmlFor="firstname" className="form-label">Prénom</label>
          <input
            type="text"
            className="form-control"
            id="firstname"
            name="firstname"
            value={userData.firstname}
            onChange={handleChange}
            required
          />
        </div>
        <div className="mb-3">
          <label htmlFor="email" className="form-label">Email</label>
          <input
            type="email"
            className="form-control"
            id="email"
            name="email"
            value={userData.email}
            onChange={handleChange}
            required
          />
        </div>
        <div className="mb-3">
          <label htmlFor="password" className="form-label">Mot de passe</label>
          <input
            type="password"
            className="form-control"
            id="password"
            name="password"
            value={userData.password}
            onChange={handleChange}
            required
          />
        </div>
        <div className="mb-3">
          <label htmlFor="role" className="form-label">Rôle</label>
          <select
            className="form-control"
            id="role"
            name="role"
            value={userData.role}
            onChange={handleChange}
            required
          >
            {/* TODO: changer les values */}
            <option value="ROLE_USER">Utilisateur</option>
            <option value="ROLE_ADMIN">Administrateur</option>
          </select>
        </div>
        <button type="submit" className="btn btn-primary">S'inscrire</button>
      </form>
    </div>
  );
};

export default Register;
