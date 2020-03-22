#language: pt
#encoding: UTF-8
	
Funcionalidade: Pesquisar 


@Pesquisar	
Cenario: pesquisar no diretorio
	Dado que eu acesse o sistema
	Quando acionar o botao Directory
	E preencher o campo Name "John Smith"
	E clicar no botao Search
	Entao o sistema apresenta a pesquisa com sucesso