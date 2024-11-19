# AP-POO
Atividade Pratica de POO - SpringBoot &amp; JWT Auth


Instruções de Endpoints:
Todos no "localhost:8080"

Registro de usuário em: "/auth/register"
  Body no Postman:
    {
      "login": "exemplo",
      "password": "123",
      "role": "ADMIN" (ou "USER" mas não tem diferença)
    }

Login em: "/auth/login"
  Body no Postman:
    {
      "login": "exemplo",
      "password": "123"
    }

Post em: "/task/post"
  Body no Postman:
    {
      "title": "titulo",
      "description": "descricao",
      "deadline": "21/10/2008"
    }

Edit em: "/task/update/{id}" (so colocar o numero do Id da Task que quer alterar)
  Body no Postman igual ao do Post mas pode colocar apenas as alterações necessárias, não precisa de todas as informações novamente. Exemplo de mudar apenas o título:
    {
      "title": "titulo alterado"
    }

Delete em: "/task/delete/{id}" (so colocar o numero do Id da Task que quer deletar)

Mudar Status em: "/task/status/{id}" (so colocar o numero do Id da Task que quer mudar o status - vai de A Fazer para Em Progresso para Concluido Para A Fazer de novo, caso erre e precise voltar)

Mudar Prioridade em: "/task/priority/{id}" (so colocar o numero do Id da Task que quer mudar a prioridade - vai de Baixa para Media para Alta Para Baixa de novo, caso erre e precise voltar)

Ver todas as tarefas em: "/task/get"

Filtrar por Status em: "/task/get/filterstatus/{status}" (onde tem "status" coloque 1 para A Fazer, 2 para Em Progresso e 3 para Concluido)

Filtrar por Prioridade em: "/task/get/filterstatus/{prioridade}" (onde tem "prioridade" coloque 1 para Baixa, 2 para Media e 3 para Alta)
