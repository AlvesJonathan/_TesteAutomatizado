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
 
Cenario: usuario invalido
	Quando eu informar no campo user "gfgf"
	E informar no campo senha "admin123"
  E clicar no botao login
  Entao o sistema apresenta a mensagem de "Qualquer mensagem"
  
Cenario: usuario vazio
	Quando eu informar no campo user ""
	E informar no campo senha "admin123"
  E clicar no botao login
  Entao o sistema apresenta a mensagem de "Username cannot be empty"
  
Cenario: senha vazia
	Quando eu informar no campo user "admin"
	E informar no campo senha ""
  E clicar no botao login
  Entao o sistema apresenta a mensagem de "Password cannot be empty"
  



  
  
  
  
  
  