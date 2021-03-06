# language: pt
Funcionalidade: Preencher o formulario no site SampleApp
  O projeto consiste em preencher os formularios do site da Sampleapp e enviar, 
  validando todas as ações.
  
  Esquema do Cenario: Preencher Enter Vehicle Data
    Quando entro no site
    E seleciono uma opcao Make
    E seleciono o Model
    E digito o <Cylinder> Capacity
    E digito no campo <Engine> Performance
    E seleciono Date of Manufacture
    E seleciono Number of Seats
    E seleciono Right Hand Drive
    E seleciono Number of Seats motorcycle
    E seleciono Fuel Type
    E digito campo <Payload> [kg]
    E digito Total <Weight> [kg]
    E digito List <Price>
    E digito <License> Plate Number
    E digito Annual <Mileage>
    Entao clico next para Insurant

    Exemplos:
      |Cylinder|Engine|Payload|Weight|Price |License |Mileage|
      |600     |600   |6000   |600   |6000  |KER1603 |600    |
  
  Esquema do Cenario: Preencher Enter Insurant Data
    E digito First "<First>" Name
    E digito Last "<Last>" Name
    E escolho Date of Birth "<Nascimento>"
    E escolho Gender
    E digito Street "<Address>"
    E escolho Country
    E digito "<Zip>" Code
    E digito cidade "<City>"
    E escolho Occupation
    E escolho Hobbies
    E digito website "<Website>"
    Entao clico next para Product
      
    Exemplos:
      |First  |Last   |Nascimento|Address                  |Zip     |City  |Website                             |
      |Kerollainy|Gomes|03/16/2000|Avenida Inácio Monteiro |12345677|Recife|www.linkedin.com/in/kerollainy-gomes|

  Cenario: Preencher Enter Product Data
    Quando seleciono uma data Start Date
    E seleciono um valor de seguro Insurance Sum
    E escolho uma nota Merit Rating
    E escolho uma cobertura Damage Insurance
    E seleciono opcionais Optional Products 
    E seleciono uma cortesia Courtesy Car
    Entao clico em next para ver a tabela de precos
  
  Cenario: Escolher tipo de Select Price Option
    Quando escolhe uma opcao 
    Entao clico em Next para receber orcamento

  Esquema do Cenario: Preencher os campos Send Quote
    E preencho o email "<E-Mail>"
    E digito um telefone "<Phone>"
    E escolho um nome de usuario "<Username>"
    E escolho uma senha "<Password>"
    E confirmo a senha Confirm "<ConfirmPassword>"
    Quando clico em Send
    Entao Verifico a mensagem "Sending e-mail success!"
    E clico no botao Ok
 
    Exemplos:
      |E-Mail           |Phone      |Username |Password|ConfirmPassword|
      |kerodsg@gmail.com|81986406205|kerogomes|ZWLap90n|ZWLap90n       |