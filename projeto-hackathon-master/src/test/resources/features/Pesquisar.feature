#language: pt
#encoding: UTF-8
	
Funcionalidade: Pesquisar 

Contexto: 
      Dado que eu realizei login

@Pesquisar	
Cenario: pesquisar no diretorio
	Dado que eu acesso o menu Directory
	E preencher o campo Name "John Smith"
	E clicar no botao Search
	Entao o sistema apresenta a pesquisa com sucesso