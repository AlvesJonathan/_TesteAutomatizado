#language: pt
#encoding: UTF-8
Funcionalidade: Admin
      
@CadastrarUruario
Cenario: Cadastrar usuario
Dado que eu realizei login
E que eu acesse o menu Admin
E clicar no botao add
Quando eu preencher o campo Employer name "John Smith"
E preencher o campo user name "Jonathan"
E preencher o campo password "11223344"
E preencher o campo confirm password "11223344"
E clicar no botao salvar
Entao o sistema apresenta o usuario cadastro "Jonathan"