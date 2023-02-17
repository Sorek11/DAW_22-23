"use strict"
window.addEventListener("load", function(){
    
    var imagenes =[
        "https://im.cyberport.de/is/image/cyberport/220802155757000301900014U?$Zoom_2000$",
        "https://im.cyberport.de/is/image/cyberport/220802155757900301900012Z?$Zoom_1000$",
        "https://im.cyberport.de/is/image/cyberport/220802155755000301900004W?$Zoom_1000$",
        "https://im.cyberport.de/is/image/cyberport/220802155755700301900006J?$Zoom_1000$",
        "https://im.cyberport.de/is/image/cyberport/220802155756600301900008E?$Zoom_1000$",
        "https://im.cyberport.de/is/image/cyberport/220802155757000301900010C?$Zoom_1000$"
    ];
    var i = 0;
    var imagen = document.querySelector("#imagen");
    imagen.src = imagenes[0];
    var left = document.querySelector("#left");
    var right = document.querySelector("#right");
    left.addEventListener("click",function(){
        if(i=0){
            i=0;
        }else{
            imagen.src =imagenes[i-1];
            i--; 
        }
    });
    right.addEventListener("click",function(){
        if(i=5){
            i=5;
        }else{
            imagen.src =imagenes[i+1];
            i++; 
        }
              
    });
    
});