import './styles.css'; 
import { ReactComponent as Logo } from './logo.svg';
import { Link } from 'react-router-dom';
    
function Navbar() {
    return (
        <nav className="main-navbar">
            <Logo />
            <Link to="/" className="logo-text">STTI Delivery</Link>
        </nav>
    )
}

export default Navbar;