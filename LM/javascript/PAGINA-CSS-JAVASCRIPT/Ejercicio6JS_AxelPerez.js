function validaEdad(){
    var num = prompt("introduce tu edad:");
    if(num<18){
        window.alert("Cuidado! Tienes menos de 18 años!");
        document.getElementById("cuerpo").innerHTML="Lo sentimos, tienes que ser mayor de edad.";
    }else{
        window.alert("Bienvenido/a!");
    } 
}