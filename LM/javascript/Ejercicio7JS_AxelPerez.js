/*
var operandoa;
var operandob;
var operacion;
var operando = 0;
function init(){
    //variables
    var resultado = document.getElementById('resultado');
    var reset = document.getElementById('reset');
    var suma = document.getElementById('suma');
    var resta = document.getElementById('resta');
    var multiplicacion = document.getElementById('multiplicacion');
    var division = document.getElementById('division');
    var igual = document.getElementById('igual');
    var uno = document.getElementById('uno');
    var dos = document.getElementById('dos');
    var tres = document.getElementById('tres');
    var cuatro = document.getElementById('cuatro');
    var cinco = document.getElementById('cinco');
    var seis = document.getElementById('seis');
    var siete = document.getElementById('siete');
    var ocho = document.getElementById('ocho');
    var nueve = document.getElementById('nueve');
    var cero = document.getElementById('cero');
    var coma = document.getElementById('coma');
    
    //Eventos de click
    coma.onclick = function(e){
        resultado.textContent = resultado.textContent  + ",";
    }
    uno.onclick = function(e){
        resultado.textContent = resultado.textContent  + "1";
    }
    dos.onclick = function(e){
        resultado.textContent = resultado.textContent  + "2";
    }
    tres.onclick = function(e){
        resultado.textContent = resultado.textContent  + "3";
    }
    cuatro.onclick = function(e){
        resultado.textContent = resultado.textContent  + "4";
    }
    cinco.onclick = function(e){
        resultado.textContent = resultado.textContent  + "5";
    }
    seis.onclick = function(e){
        resultado.textContent = resultado.textContent  + "6";
    }
    siete.onclick = function(e){
        resultado.textContent = resultado.textContent  + "7";
    }
    ocho.onclick = function(e){
        resultado.textContent = resultado.textContent  + "8";
    }
    nueve.onclick = function(e){
        resultado.textContent = resultado.textContent  + "9";
    }
    cero.onclick = function(e){
        resultado.textContent = resultado.textContent  + "0";
    }
    reset.onclick = function(e){
        resetear();
    }
    suma.onclick = function(e){
        operandoa = resultado.textContent;
        operacion = "+";
        limpiar();
    }
    resta.onclick = function(e){
        operandoa = resultado.textContent;
        operacion = "-";
        limpiar();
    }
    multiplicacion.onclick = function(e){
        operandoa = resultado.textContent;
        operacion = "*";
        limpiar();
    }
    division.onclick = function(e){
        operandoa = resultado.textContent;
        operacion = "/";
        limpiar();
    }
    igual.onclick = function(e){
        operandob = resultado.textContent;
        resolver();
    }
}

function limpiar(){
    resultado.textContent = "";
}
function resetear(){
    resultado.textContent = "";
    operandoa = 0;
    operandob = 0;
    operacion = "";
}

function resolver(){
    var res = 0;
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
    }
    resetear();
    resultado.textContent = res;
}

*/
var res;
var operandoa = 0;
var operandob;
var operacion;
var resultado;
function ponNumero(num){
    
    //resultado.textContent = resultado.textContent + num; 
    document.getElementById('resultado').innerHTML=resultado.textContent99999999999999999999999;
    res = resultado.textContent;
    window.alert(res);
   /* window.alert(res);*/
    
}
/*
function divide(){
    operandoa = res;
    operacion = "/";
    limpiar();
}
function multiplica(){
    operandoa = res;
    operacion = "*";
    limpiar();
}
function suma(){
    operandoa = res;
    operacion = "+";
    limpiar();
}
function resta(){
    operandoa = res;
    operacion = "-";
    limpiar();
}




function resuelve(){    
    if(operandoa!=0){
        operandob=parseFloat(res);
        switch(operacion){
            case "+":
                resultado = parseFloat(operandoa) + parseFloat(operandob);
                break;
            case "-":
                resultado = parseFloat(operandoa) - parseFloat(operandob);
                break;
            case "*":
                resultado = parseFloat(operandoa) * parseFloat(operandob);
                break;
            case "/":
                resultado = parseFloat(operandoa) / parseFloat(operandob);
                break;     
        }
    }else{
        operandoa = parseFloat(res);
    }    
    window.alert(resultado);
    limpiar();    
}

function limpiar(){
    resultado.textContent = "";
}

*/
