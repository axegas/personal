/*
CALCULADORA:
Operaciones implementadas:
    - Sumar
    - Restar
    - Multiplicar
    - Dividir
    - Raiz cuadrada
    - Elevar a un numero
*/
var res;
var operandoa = "";
var operandob = "";
var operacion = "";
var resuelto = "";
var tiene = false;
var prueba = "";
function ponNumero(num){
    if(resuelto){
        limpiar();
        resuelto=false;
    }
    resultado.textContent = resultado.textContent + num;       
}
function ponComa(coma){
    prueba = resultado.textContent;
    for(i=0;i<prueba.length;i++){
        if(prueba.charAt(i)=="."){
            tiene=true;
            break;
        }
    }
    if(!tiene){
        if(resuelto){
            limpiar();
            resuelto=false;
        }
        resultado.textContent = resultado.textContent + coma; 
    }    
}

function opera(op){
    operandoa = resultado.textContent;
    operacion = "" + op;
    limpiar();
    tiene=false;
}

function resolver(){ 
    res = "";
    operandob=resultado.textContent;
    switch(operacion){
        case "+":
            res = parseFloat(operandoa) + parseFloat(operandob);
            break;
        case "-":
            res = parseFloat(operandoa) - parseFloat(operandob);
            break;
        case "*":
            res = parseFloat(operandoa) * parseFloat(operandob);
            break;
        case "/":
            res = parseFloat(operandoa) / parseFloat(operandob);
            break;    
        case "^":
            res = Math.pow(parseFloat(operandoa),parseFloat(operandob));
            break;
        }
    resultado.textContent = res;  
    operacion = "";
    operandob = "";
    resuelto=true;
}

function resuelveRaiz(){ 
    res = "";
    operandob=resultado.textContent;
    num = parseFloat(operandob);
    res = Math.sqrt(num);
    resultado.textContent = res;  
    operacion = "";
    operandob = "";
    resuelto=true;
}

function limpiar(){
    resultado.textContent = "";
}

function reset(){
    resultado.textContent = "";
    operandoa = "";
    operandob = "";
    res = "";
    resuelto = "";
}
