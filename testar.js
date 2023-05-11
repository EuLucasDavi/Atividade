const prp = require('prompt-sync')
const prompt = prp()

function bancoDados() {

    let dados = {
        "registros": [
            {
                "id": "1",
                "nome": "Davi",
                "idade": "30",
                "email": "lucas.pereira121@fatec.sp.gov.br",
                "senha": "123"
            }, {
                "id": "2",
                "nome": "Lucas",
                "idade": "25",
                "email": "lucas._.davi@hotmail.com",
                "senha": "321"
            }
        ]
    }
    return dados
}

function vetor() {

    let dados = bancoDados()

    console.log(dados.registros[0].id)
    console.log(dados.registros[0].nome + ' : ' + dados.registros[0].idade + ' : ' + dados.registros[0].email)
}
vetor()

function login() {
    let dados = bancoDados()

    let usuario = prompt('Qual é o seu login?')
    let senha = prompt('Qual é a sua senha?')

    for (let i = 0; dados.registros.length > i; i++) {
        if (usuario == dados.registros[0].nome && senha == dados.registros[0].senha) {
            console.log('Você está logado!')
        } else {
            console.log('Sem Registro!')
        }
    }
}

login()

//Inserir npm prompt sync