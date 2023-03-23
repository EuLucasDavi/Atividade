const mysql =require('mysql');

const connection = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'',
    database: 'fatec_diadema'
});

connection.connect((err) => {
    if (err){
        console.error('Erro ao conectar ao banco de dados', err);
        return;
    }
    console.log('Conexão estabelecida com o banco de dados');
});
connection.end;

module.exports = connection;

//instalação da extenção: digitar no terminal => npm install mysql 