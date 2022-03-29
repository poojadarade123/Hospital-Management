import React, { useState } from "react";
import { Link } from "react-router-dom";
import "./Navbar.css";

export const Navbar = () => {
  const [isMobile, setIsMobile] = useState(false);

  return (
    <div className="navbar">
      <h3 className="logo"> CliniCo </h3>
      <ul
        className={isMobile ? "nav-links-mobile" : "nav-links"}
        onClick={() => setIsMobile(false)}
      >
        <Link to="/" className="home">
          <li> Home </li>
        </Link>
        <Link to="/about" className="about">
          <li> About Us </li>
        </Link>
        <Link to="/services" className="services">
          <li> Services </li>
        </Link>
        <Link to="/contact" className="contact">
          <li> Contact Us </li>
        </Link>
        <Link to="/signup" className="signup">
          <li> Signup </li>
        </Link>
      </ul>

      <button
        className="mobile-menu-icon"
        onClick={() => setIsMobile(!isMobile)}
      >
        {isMobile ? (
          <i className="fas fa-times" />
        ) : (
          <i className="fas fa-bars"></i>
        )}
      </button>
    </div>
  );
};
