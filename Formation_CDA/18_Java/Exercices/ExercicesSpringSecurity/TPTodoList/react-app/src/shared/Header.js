import React from 'react';
import { useNavigate } from 'react-router-dom';
import { getUserDetails } from '../helpers/user-details';
import authService from '../services/authService';

const Header = () => {
    const navigate = useNavigate();
    const userDetails = getUserDetails();

    const extractBeforeAt = (email) => {
        const atIndex = email.indexOf("@");
        return atIndex !== -1 ? email.substring(0, atIndex) : email;
    };

    const isAdmin = () => {
        return userDetails && userDetails.role === 'ROLE_ADMIN';
    };

    const isLoggedIn = () => {
        console.log(userDetails);
        const user = localStorage.getItem('user');
        return !!user;
    };


    // Fonction de déconnexion
    const handleLogout = () => {
        authService.logout();
        navigate('/login');
    };

    return (

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/todos">Todos</a>
                    </li>
                    <li>
                        {isAdmin() && (
                            <a class="nav-link" href="/todos/admin/post">Create</a>
                        )}
                    </li>


                </ul>
                <div class="form-inline my-2 my-lg-0">
                    {!isLoggedIn() ? (
                        // Afficher ces boutons si l'utilisateur n'est pas connecté
                        <>
                            <li className="nav-item mr-4" style={{ listStyleType: 'none' }}>
                                <button className="btn btn-outline-success me-2" onClick={() => navigate('/login')}>Connexion</button>
                            </li>
                            <li className="nav-item" style={{ listStyleType: 'none' }}>
                                <button className="btn btn-outline-primary" onClick={() => navigate('/register')}>Créer un compte</button>
                            </li>
                        </>
                    ) : (
                        // Afficher ce bouton si l'utilisateur est connecté
                        <li className="nav-item" style={{ listStyleType: 'none' }}>

                            <span className="navbar-text mr-4">
                                Bonjour, {extractBeforeAt(userDetails.name)}
                            </span>
                            <button className="btn btn-outline-danger" onClick={handleLogout}>Deconnexion</button>
                        </li>
                    )}

                </div>
            </div>
        </nav>
    );
};

export default Header;
