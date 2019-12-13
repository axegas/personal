// validaEdad(): pregunta la edad al cargar la pagina. Si es mayor de edad, se carga sin problemas. Si es menor, lo redirige a otra página
// validaFormulario(): comprueba que todos los datos estén introducidos y te muestra un pequeño formulario para confirmar que son correctos
// esCorrecto(): si los datos son correctos, te muestra un mensaje. 
// 
//

function validaEdad(){
    var num = prompt("introduce tu edad:");
    if(num<18){
        window.alert("Cuidado! Tienes menos de 18 años!");
        window.location.replace("error.html");
        
    }else{
        window.alert("Bienvenido/a!");
    } 
}

function validaFormulario(){
    var nombre = document.forms["curriculum"]["nombre"].value;
    var apellidos = document.forms["curriculum"]["apellidos"].value;
    var dni = document.forms["curriculum"]["dni"].value;
    var mail = document.forms["curriculum"]["email"].value;
    var sexo = document.forms["curriculum"]["sexo"].value;
    var area = document.forms["curriculum"]["cuenta"].value;   
                                   
    document.getElementById("formulario").innerHTML='<h3>RESUMEN:</h3><form name="confirmacion" method="get" class="text" onsubmit="return esCorrecto()"><label class="label">Nombre: </label> '+nombre+'<br><label class="label">Apellidos: </label>'+apellidos+'<br><label class="label">Sexo: </label> '+sexo+'<br><label class="label">DNI: </label> '+dni+'<br><label class="label">E-MAIL: </label> '+mail+'<br><br><b>Es correcto?</b><br><input type="radio" name="correcto" value="Si" checked="checked" />Si<input type="radio" name="correcto" value="No" />No<br/><br><input type="submit" name="enviar" value="Enviar" /></form>'; 
    
}
function esCorrecto(){
    var corr = document.forms["confirmacion"]["correcto"].value; 
    
    if(corr=="Si"){
        document.getElementById("formulario").innerHTML="<h3>Muchas gracias!</h3>";
    }    
}
