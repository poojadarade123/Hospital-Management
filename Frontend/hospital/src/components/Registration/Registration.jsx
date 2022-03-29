import React from "react";
import { Link } from "react-router-dom";
import "./Registration.css";
import register from "../../images/register.jpg";
import register2 from "../../images/reg.png";

export const Registration = () => {
  return (
    <div className="main-Register">
      <div className="left-register">
        <div className="header">
          <img src={register} alt="register" id="img-logo" />
        </div>
        <div className="body">
          <img src={register2} alt="register" id="reg-logo" />
        </div>
        <p>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Eaque optio
          fuga blanditiis magnam saepe, dolor quasi vitae laudantium rerum!
          Voluptatem consequuntur a blanditiis nobis tempora iusto ratione quo
          dignissimos provident!
        </p>
      </div>
      <div className="right-register">
        <div className="top-right">
          <h5>
            Already have an Account ?
            <Link id="reglinks" to="/login">
              Login Here
            </Link>
          </h5>
        </div>
        <div className="body-right">
          <div className="container">
            <form>
              <div className="input-group">
                <h5>First Name</h5>
                <input type="text" name="fname" id="fname" />
              </div>
              <div className="input-group">
                <h5>Last Name</h5>
                <input type="text" name="lname" id="lname" />
              </div>
              <div className="input-group">
                <h5>Email</h5>
                <input type="email" name="email" id="email" />
              </div>
              <div className="input-group">
                <h5>Gender</h5>
                <input type="radio" name="gender" id="gender" />
                Male
                <input type="radio" name="gender" id="gender" /> Female
              </div>
              <div className="input-group">
                <h5>Marital Status</h5>
                <input type="text" name="status" id="status" />
              </div>
              <div className="input-group">
                <h5>Password</h5>
                <input type="password" name="password" id="password" />
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};
