import { Link } from "react-router-dom";

const NavBar = () => {

    return (

        <nav className="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark" style={{ color: 'white' }}>
            <div className="container-fluid">
                <Link to="http://localhost:5173/candidates">Home</Link>
                <span> HR Management App </span>
                {/* <div>
                    <span style={{marginLeft: '1rem'}}>pokeball</span>
                    <button style={{marginLeft: '1rem'}}>Clear</button>
                    <button style={{marginLeft: '1rem'}}>Show</button>
                </div> */}
            </div>
        </nav>

    );
}

export default NavBar;