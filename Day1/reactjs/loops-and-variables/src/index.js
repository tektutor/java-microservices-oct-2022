import ReactDOM from 'react-dom';

function sayHello() {
   let elementArr = [ ]; //this variable scope is limited to sayHello function scope

   for ( let x=1; x<10; ++x ) {
      //The code inside push is the JSX code which is getting transpiled into JavaScript by babel
      elementArr.push(<li>{x}</li>); 
   }
   
   //alert ( x ); //this variable x is limited to for loop block
  
   ReactDOM.render( elementArr , document.getElementById( 'root' ) );
}

sayHello();
