import { render, screen } from '@testing-library/react';
import App from './App';
import Todo from './todo';

test('Should display completed todos', () => {
  const todo = { day: 1, topic: 'Topic 1', completed: false}; 
  render(<Todo todo={todo}/>);

  const todoElement = screen.getByTestId('todo-1');
  expect(todoElement).toBeInTheDocument();
  expect(todoElement).toHaveTextContent('Day-1 => Topic 1');
});

test('Should display uncompleted todos', () => {
  const todo = { day: 2, topic: 'Topic 2', completed: true}; 
  render(<Todo todo={todo}/>);

  const todoElement = screen.getByTestId('todo-2');
  expect(todoElement).toBeInTheDocument();
  expect(todoElement).toHaveTextContent('Day-2 => Topic 2');
});
