// CounterButtons.js
import React from 'react';
import { useCounter } from '../Context_API/Context';

const CounterButtons = () => {
  const { count, setCount } = useCounter();

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  return (
    <div>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
    </div>
  );
};

export default CounterButtons;
