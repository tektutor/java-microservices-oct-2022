import React from 'react';

function todo({ todo }) {
   const { day, topic, completed } = todo;

   const todoItem = <ul><h1>Day-{day} => {topic}</h1></ul>;
   const text = completed ? <strike>{todoItem}</strike> : todoItem; 
   return <div data-testid={`todo-${day}`}>{ text }</div>
}

export default todo;
