#language: pt
#encoding: UTF-8
Funcionalidade: Admin

Contexto: 
      Dado que eu realizei login

@Admin
Cenario: Acessar Menu Admin
Dado que eu acesse o menu Admin
Quando eu preencher o campo Username
E acionar o botao Search
Entao o sistema realizara a consulta com sucesso

@AdminTeste2
Cenario: Validar Consulta Combo User Role
Dado que eu acesse o menu Admin
Quando eu selecionar a combo userRole com "Admin"
E acionar o botao Search
Entao o sistema realiza a consulta do userRole com sucesso

@MoverMouse
Cenario: acessar submenu user
Quando eu acessar o submenu user
Entao o sistema apresenta a tela de system user
