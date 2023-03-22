function paginas(irPaginas){
switch(irPaginas){
   case"cursos":
      window.location.href = "cursos.html";
      break;
   case"sobre":
      window.location.href = "sobre.html";
      break;
   case"cadastro":
      window.location.href = "cadastro.html";
      break;
   default:
      break;
   }
}

document.getElementById("botao1").addEventListener("click",function(){
   paginas("cursos")
});
document.getElementById("botao2").addEventListener("click",function(){
   paginas("cadastro")
});
document.getElementById("botao3").addEventListener("click",function(){
   paginas("sobre")
})