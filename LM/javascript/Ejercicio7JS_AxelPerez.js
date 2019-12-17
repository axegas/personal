/*
CALCULADORA:
Operaciones implementadas:
    - Sumar
    - Restar
    - Multiplicar
    - Dividir
    - Raiz cuadrada
    - Elevar a un numero
    - OJO: no funcionan las operaciones acumulativas (la estructura siempre es a+b=c, no puede ser a+b+c+d=e).
*/
var res;
var a = "";
var b = "";
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
    a = resultado.textContent;
    operacion = "" + op;
    limpiar();
    tiene=false;
}

function resolver(){ 
    res = "";
    b=resultado.textContent;
    switch(operacion){
        case "+":
            res = parseFloat(a) + parseFloat(b);
            break;
        case "-":
            res = parseFloat(a) - parseFloat(b);
            break;
        case "*":
            res = parseFloat(a) * parseFloat(b);
            break;
        case "/":
            res = parseFloat(a) / parseFloat(b);
            break;    
        case "^":
            res = Math.pow(parseFloat(a),parseFloat(b));
            break;
        default:
            num = parseFloat(b);
            res = Math.sqrt(num);
            break;
        }
    resultado.textContent = res;  
    operacion = "";
    b = "";
    resuelto=true;
}

function limpiar(){
    resultado.textContent = "";
}

function reset(){
    resultado.textContent = "";
    a = "";
    b = "";
    res = "";
    resuelto = "";
}
