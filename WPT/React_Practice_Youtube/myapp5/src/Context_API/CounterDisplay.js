// CounterDisplay.js
import React from 'react';
import { useCounter } from './Context';

const CounterDisplay = () => {
  const { count } = useCounter();

  return (
    <div>
      <h2>Count: {count}</h2>
    </div>
  );
};

export default CounterDisplay;
