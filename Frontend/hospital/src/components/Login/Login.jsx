import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faUserGroup } from "@fortawesome/free-solid-svg-icons";
import React, { useState } from "react";
import "./Login.css";
import { Link } from "react-router-dom";
import welcome from "../../images/welcome.jpg";

export const Login = () => {
  const [emailval, setEmailVal] = useState("");
  const [passval, setPassVal] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
  };

  return (
    <div className="main-login">
      <div className="login-contain">
        <div className="left-side">
          <form action="/login" onSubmit={handleSubmit}>
            <FontAwesomeIcon
              icon={faUserGroup}
              size="3x"
              className="icon-logo"
            ></FontAwesomeIcon>
            <label htmlFor="email">Email</label>
            <input
              type="email"
              name="email"
              id="email"
              placeholder="Enter your Email"
              value={emailval}
              onChange={(e) => {
                setEmailVal(e.target.value);
              }}
            />
            <label htmlFor="password">Password</label>
            <input
              type="password"
              name="password"
              id="password"
              placeholder="Enter Password"
              value={passval}
              onChange={(e) => {
                setPassVal(e.target.value);
              }}
            />
            <button type="submit" id="btn">
              Submit
            </button>
          </form>
          <div className="footer">
            <h4 className="text">
              Don't Have an Account ?{" "}
              <Link to="/register" className="link">
                Register Here
              </Link>
            </h4>
          </div>
        </div>
        <div className="right-side">
          <div className="welcomeNote">
            <h3>Welcome Back!</h3>
          </div>
          <div className="welcomeImg">
            <img src={welcome} id="wel-img" alt="welcome" />
          </div>
        </div>
      </div>
    </div>
  );
};
