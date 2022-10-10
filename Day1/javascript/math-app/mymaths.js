var firstNum = 0.0;
var secondNum = 0.0;
var result = 0.0;

function extractInputs() {
    firstNum = parseFloat( document.getElementById('num1').value);
    secondNum = parseFloat( document.getElementById('num2').value);
//    alert ( firstNum );
//    alert ( secondNum );
}

function add() {
    extractInputs();
    result = firstNum + secondNum;
    document.getElementById('result').value = result;
}

function subtract() {
    extractInputs();    
    result = firstNum - secondNum;
    document.getElementById('result').value = result;
}

function multiply() {
    extractInputs();    
    result = firstNum * secondNum;
    document.getElementById('result').value = result;
}

function divide() {
    extractInputs();    
    result = firstNum / secondNum;
    document.getElementById('result').value = result;
}
