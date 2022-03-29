import React from "react";
import { CardSection } from "./CardSection/CardSection";
import { Centers } from "./CentersOfExcellence/Centers";
import { Slider } from "./Slider/Slider";

export const Home = () => {
  return (
    <>
      <Slider />
      <CardSection />
      <Centers />
    </>
  );
};
