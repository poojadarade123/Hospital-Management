import React from "react";
import { Col, Container, Row } from "react-bootstrap";
import { Card } from "react-bootstrap";
import "./CardSection.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faCalendarCheck,
  faVideo,
  faTablets,
  faVial,
  faHeartbeat,
  faHospital,
} from "@fortawesome/free-solid-svg-icons";

export const CardSection = () => {
  return (
    <div>
      <Container className="container">
        <Row>
          <Col>
            <Card className="card">
              <FontAwesomeIcon
                icon={faCalendarCheck}
                size="7x"
                className="icon"
              ></FontAwesomeIcon>
              <Card.Title className="title">Book Appointment</Card.Title>
            </Card>
          </Col>
          <Col>
            <Card>
              <FontAwesomeIcon
                icon={faVideo}
                size="7x"
                className="icon"
              ></FontAwesomeIcon>
              <Card.Title className="title">Online Consultancy</Card.Title>
            </Card>
          </Col>
          <Col>
            <Card>
              <FontAwesomeIcon
                icon={faTablets}
                size="7x"
                className="icon"
              ></FontAwesomeIcon>
              <Card.Title className="title">Buy Medicine</Card.Title>
            </Card>
          </Col>
          <Col>
            <Card>
              <FontAwesomeIcon
                icon={faVial}
                size="7x"
                className="icon"
              ></FontAwesomeIcon>
              <Card.Title className="title">Lab Test</Card.Title>
            </Card>
          </Col>
          <Col>
            <Card>
              <FontAwesomeIcon
                icon={faHeartbeat}
                size="7x"
                className="icon"
              ></FontAwesomeIcon>
              <Card.Title className="title">Health</Card.Title>
            </Card>
          </Col>
          <Col>
            <Card>
              <FontAwesomeIcon
                icon={faHospital}
                size="7x"
                className="icon"
              ></FontAwesomeIcon>
              <Card.Title className="title">Find Hospitals</Card.Title>
            </Card>
          </Col>
        </Row>
      </Container>
    </div>
  );
};
