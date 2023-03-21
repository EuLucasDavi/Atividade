const express = require("express")
const app = express()
app.get("/",function(req,res){
    res.send("Seja bem vindo(a) ao meu Site")
})

app.get("/cadastro",function(req,res){
    res.sendFile(__dirname + "/cadastro.html")
})

app.get("/profissoes",function(req,res){
    res.sendFile(__dirname + "/profissoes.html")
})

app.get("/cursos",function(req,res){
    res.sendFile(__dirname + "/cursos.html")
})

app.listen(8081, function(){
    console.log("Servidor funcionando na url localhost:8081")
})