import './App.css';
import Todo from './todo';

function App() {
  const todos = [ 
     { day: 1, topic: 'React JS', completed: true },
     { day: 2, topic: 'Getting started with SpringBoot Framework', completed: false },
     { day: 3, topic: 'Developing basic microservices using SpringBoot Framework', completed: false },
     { day: 4, topic: 'Developing advanced microservices using SpringBoot Framework', completed: false },
     { day: 5, topic: 'SpringBoot Microservices Best Practices', completed: false }
  ];

//  const todoList = todos.map( 
//     (todo) => {
//        return (
//           todo.completed ? <strike><ul><h1>Day-{todo.day} - {todo.topic}</h1></ul></strike> : <ul><h1>Day-{todo.day} - {todo.topic}</h1></ul>
//	)
//     }
//  )
//  return (
//     <div className="App">
//         {todoList}
//     </div>
//  );

     return (
        <div className="App">
          { todos.map((item) => {
            return (<Todo todo={item}/>)
          })
          }
        </div>
     );
}

export default App;
