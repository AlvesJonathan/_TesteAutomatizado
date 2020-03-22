$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Admin.feature");
formatter.feature({
  "name": "Admin",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu realizei login",
  "keyword": "Dado "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.queEuRealizeiLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar Consulta Combo User Role",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@AdminTeste2"
    }
  ]
});
formatter.step({
  "name": "que eu acesse o menu Admin",
  "keyword": "Dado "
});
formatter.match({
  "location": "stepsDefinitions.AdminSteps.queEuAcesseOMenuAdmin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a combo userRole com \"Admin\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.AdminSteps.euSelecionarAComboUserRoleCom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao Search",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.AdminSteps.acionarOBotaoSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema realizara a consulta com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.AdminSteps.oSistemaRealizaraAConsultaComSucesso()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[Admin]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat pageObjects.AdminPage.validarConsultaUserName(AdminPage.java:71)\r\n\tat stepsDefinitions.AdminSteps.oSistemaRealizaraAConsultaComSucesso(AdminSteps.java:29)\r\n\tat ✽.o sistema realizara a consulta com sucesso(file:///C:/Users/Jonathan/eclipse-workspace/projeto-hackaton-aulas/src/test/resources/features/Admin.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});