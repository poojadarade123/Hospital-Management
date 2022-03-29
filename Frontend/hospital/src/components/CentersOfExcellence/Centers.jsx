import React from "react";
import "./Centers.css";
import {
  MdOutlineKeyboardArrowLeft,
  MdOutlineKeyboardArrowRight,
} from "react-icons/md";

export const Centers = () => {
  return (
    <div>
      <div className="center-container">
        <div className="main-slider-container">
          <MdOutlineKeyboardArrowLeft
            size="40px"
            className="slider-icon-left"
          />
          <div className="slider"></div>
          <MdOutlineKeyboardArrowRight
            size="40px"
            className="slider-icon-right"
          />
        </div>
      </div>
    </div>
  );
};
