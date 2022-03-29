import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import React from "react";
import { Col, Row } from "react-bootstrap";
import {
  faUsers,
  faUserDoctor,
  faUserPlus,
} from "@fortawesome/free-solid-svg-icons";
import "./Modal.css";
import { Link } from "react-router-dom";
// import { Registration } from "../Registration/Registration";

export const Modal = () => {
  const registration = () => {
    console.log("On click");
  };

  return (
    <div>
      <div className="box">
        <h4>Modal Box</h4>
        <Row>
          <Col className="insidebox">
            <FontAwesomeIcon
              icon={faUsers}
              size="6x"
              className="user-icon"
            ></FontAwesomeIcon>
            <Link to="register/user">
              <h3 className="user-title" onClick={registration()}>
                User
              </h3>
            </Link>
          </Col>
          <Col className="insidebox">
            <FontAwesomeIcon
              className="doctor-icon"
              icon={faUserDoctor}
              size="6x"
            ></FontAwesomeIcon>
            <h3 className="doctor-title" onClick={registration("doctor")}>
              Doctor
            </h3>
          </Col>
          <Col className="insidebox">
            <FontAwesomeIcon
              className="admin-icon"
              icon={faUserPlus}
              size="6x"
            ></FontAwesomeIcon>
            <h3 className="admin-title" onClick={registration("admin")}>
              Admin
            </h3>
          </Col>
        </Row>
      </div>
    </div>
  );
};
