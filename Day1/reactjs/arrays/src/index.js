import ReactDOM from 'react-dom';

const dayOfWeeks = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday','Saturday'];
const items = dayOfWeeks.map( day => <li>{day}</li> );
console.log ( items );

ReactDOM.render( items, document.getElementById('root') );