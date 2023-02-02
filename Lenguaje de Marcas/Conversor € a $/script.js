function conversor(){
  const euro = document.getElementById("euro").value;
  const dolar = 1.09;
  var solucion = (euro / dolar);
  document.getElementById("dolar").innerHTML = Number(solucion.toFixed(2));
}
