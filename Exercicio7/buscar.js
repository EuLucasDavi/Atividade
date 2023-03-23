const connection = require('./conectar')


let sql = 'select * from aluno '

connection.query(sql,(err,rows) => {
    if(err) throw err
        console.log('Dados da tabela',rows)
})

connection.end