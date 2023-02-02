var total = "";
var text ="";
var num1 = 0;
var num2 = 0;
var contador = 0;

function limpiar(){
  input.textContent = "";
  total = "";
}

function pulsarNumeros(num){
  if(contador === 0){
    let numeros = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]; 
    let valor = [document.getElementById("cero").value, document.getElementById("uno").value, document.getElementById("dos").value, document.getElementById("tres").value, document.getElementById("cuatro").value, document.getElementById("cinco").value, document.getElementById("seis").value, document.getElementById("siete").value, document.getElementById("ocho").value, document.getElementById("nueve").value];
    valor[num] = numeros[num];
    total += valor[num];
    input.textContent = total;
    num1 = parseInt(total);
  } else if (contador === 1) {
    let numeros = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]; 
    let valor = [document.getElementById("cero").value, document.getElementById("uno").value, document.getElementById("dos").value, document.getElementById("tres").value, document.getElementById("cuatro").value, document.getElementById("cinco").value, document.getElementById("seis").value, document.getElementById("siete").value, document.getElementById("ocho").value, document.getElementById("nueve").value];
    valor[num] = numeros[num];
    total += valor[num];
    input.textContent = total;
    num2 = parseInt(total);
  }
    
}

function sumar(){
  contador = 1;
  limpiar();
  operador = "+";
}

function restar(){
  contador = 1;
  limpiar();
  operador = "-";
}

function multiplicar(){
  contador = 1;
  limpiar();
  operador = "*";
}

function dividir(){
  contador = 1;
  limpiar();
  operador = "/";
}


function resultado(){ 
  switch(operador){
    case "+":
        document.getElementById("resultado").innerHTML = num1 + num2;
        contador = 0;
        limpiar();
      break;
    
    case "-":
        document.getElementById("resultado").innerHTML = num1 - num2;
        contador = 0;
        limpiar();
    break; 
    case "*":
        document.getElementById("resultado").innerHTML = num1 * num2;
        contador = 0;
        limpiar();
    break; 
    case "/":
        document.getElementById("resultado").innerHTML = num1 / num2;
        contador = 0;
        limpiar();
    break;
  }
  
}
