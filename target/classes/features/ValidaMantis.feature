#language:pt
Funcionalidade: Acessar mantis
Cenário: Validar Login
Dado que esteja na página: "http://mantis-prova.base2.com.br"
Quando informo o usuario "Wagner_Jamar"
E informo a senha "Teste@b2" e entro
E que seleciono criar tarefa:"Criar Tarefa"
E seleciono a categoria: "[Todos os Projetos] categoria teste"
E seleciono a frequencia: "aleatório"
E seleciono a prioridade: "alta"
E informo o resumo: "Resumo da descricao do problema encontrado no sistema xxxx"
E informo a descricao:  "Descricao de teste a ser registrado no mantis"
E informo os passos para reproduzir: "1. Acessar o Mantis (https://mantis-prova.base2.com.br/)\n Passo2 \n paso 3"
Então seleciono o botao: "Criar Nova Tarefa"
