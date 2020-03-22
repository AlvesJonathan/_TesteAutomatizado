#language: pt
#encoding: UTF-8
	
Funcionalidade: Login

@RealizarLogin	
Cenario: Realizar Login
	Dado que eu acesse o sistema
	Quando eu informar no campo user "Admin"
	E informar no campo senha "admin123"
	E clicar no botao login
	Entao o sistema apresenta o usuario logado
	

