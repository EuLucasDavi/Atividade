const mysql = require('mysql')
const connection = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'1234',
    database:'fatec'
})

connection.connect((err) =>{
    if(err){
        console.log("Banco conectado!")
    }else{
        console.log("Erro de conexão")
    }
})

connection.end()