import React from "react";
import { Link } from "react-router-dom";
import "./Registration.css";

export const Registration = ({ role }) => {
  const userRole = role;

  return (
    <div className="register">
      <div className="container">
        <div className="regtitle">Registration</div>
        <form action="/register/user">
          <div className="user-details">
            {/* Common */}

            <div className="input-box">
              <span className="details">First Name</span>
              <input
                type="text"
                placeholder="Enter your first name"
                name="fname"
                id="fname"
                required
              />
            </div>
            <div className="input-box">
              <span className="details">Last Name</span>
              <input
                type="text"
                placeholder="Enter your last name"
                name="lname"
                id="lname"
                required
              />
            </div>
            <div className="input-box">
              <span className="details">User Name</span>
              <input
                type="text"
                placeholder="Enter your user name"
                name="username"
                id="username"
                required
              />
            </div>
            <div className="input-box">
              <span className="details">Email</span>
              <input
                type="email"
                placeholder="Enter your email"
                name="email"
                id="email"
                required
              />
            </div>
            <div className="input-box">
              <span className="details">Phone</span>
              <input
                type="text"
                placeholder="Enter your number"
                name="phone"
                id="phone"
                required
              />
            </div>

            {/* User */}
            {userRole === "user" && (
              <>
                <div className="input-box">
                  <span className="details">Blood Group</span>
                  <input
                    type="text"
                    placeholder="Enter your blood group"
                    name="blood"
                    id="blood"
                    required
                  />
                </div>
                <div className="input-box">
                  <span className="details">Date</span>
                  <input type="date" name="date" id="date" required />
                </div>
                <div className="input-box">
                  <span className="details">Marital Status</span>
                  <input
                    type="text"
                    placeholder="Enter your status"
                    name="status"
                    id="status"
                    required
                  />
                </div>
                <div className="input-box">
                  <span className="details">Age</span>
                  <input type="number" name="age" id="age" required />
                </div>
              </>
            )}

            {/* Doctor */}
            {userRole === "doctor" && (
              <>
                <div className="input-box">
                  <span className="details">Experience</span>
                  <input type="text" name="exp" id="exp" required />
                </div>
                <div className="input-box">
                  <span className="details">Speciality</span>
                  <input
                    type="text"
                    name="speciality"
                    id="speciality"
                    required
                  />
                </div>
                <div className="input-box">
                  <span className="details">Qualification</span>
                  <input type="text" name="qualifi" id="qualifi" required />
                </div>
                <div className="input-box">
                  <span className="details">Arrival Time</span>
                  <input type="text" name="arrival" id="arrival" required />
                </div>
                <div className="input-box">
                  <span className="details">Leaving Time</span>
                  <input type="text" name="leaving" id="leaving" required />
                </div>
                <div className="input-box">
                  <span className="details">Available Days</span>
                  <input type="text" name="days" id="days" required />
                </div>
              </>
            )}
          </div>
          <div className="button">
            <input type="submit" value="Register" />
          </div>
          <div className="text">
            <h4>
              Already an user login?
              <Link id="reglinks" to="/login">
                Login
              </Link>
            </h4>
          </div>
        </form>
      </div>
    </div>
  );
};
