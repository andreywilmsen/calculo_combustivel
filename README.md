# Calculadora de Gasto de Combustível para Viagens

Este é um aplicativo Android desenvolvido para calcular o custo de combustível em viagens. O projeto foi criado com o objetivo de praticar conceitos essenciais de desenvolvimento Android, como manipulação de interface de usuário, eventos de clique, validação de dados e lógica de cálculo.

## Funcionalidades

O aplicativo realiza o cálculo do gasto de combustível com base em três parâmetros principais:

- **Distância a ser percorrida**: O usuário informa a distância da viagem.
- **Consumo do veículo**: O usuário informa o consumo do veículo em quilômetros por litro.
- **Preço do combustível**: O usuário informa o valor do combustível por litro.

Com esses dados, o aplicativo calcula o custo total da viagem.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal.
- **Android Studio**: Ambiente de desenvolvimento integrado (IDE) para o desenvolvimento Android.
- **ViewBinding**: Para facilitar a interação com os elementos de interface do usuário.
- **Eventos de clique**: Para interatividade com os elementos do layout.

## Estrutura do Projeto

O projeto segue a seguinte estrutura:

- **MainActivity**: A atividade principal do aplicativo, onde os usuários interagem com a interface.
- **Layout**: A interface do usuário foi construída usando o XML, contendo os campos de entrada para a distância, consumo e preço do combustível, além de um botão para calcular o gasto total.
- **ViewBinding**: Utilizado para facilitar o acesso aos elementos de UI no código Kotlin.
- **Lógica de Cálculo**: A lógica para calcular o gasto de combustível é implementada em Kotlin e é acionada por um evento de clique no botão.

## Como Funciona

1. O usuário insere os valores de distância, consumo de combustível e preço do combustível nos campos apropriados.
2. Ao clicar no botão de calcular, a lógica de cálculo é executada.
3. O aplicativo valida os dados inseridos para garantir que todos os campos tenham valores válidos.
4. O gasto total de combustível é calculado e exibido para o usuário.

## Tópicos Aprendidos

Durante o desenvolvimento deste projeto, foram abordados os seguintes conceitos:

- **Criação do Projeto**: Como criar um projeto Android do zero no Android Studio.
- **Layout - MainActivity**: Construção da interface inicial usando XML.
- **Identificação de Elementos de Interface**: Técnicas para acessar e manipular elementos da interface do usuário.
- **ViewBinding**: Como utilizar o ViewBinding para acessar elementos de layout de maneira segura e eficiente.
- **Evento de Clique**: Como configurar eventos de clique para interagir com o usuário.
- **Lógica de Cálculo**: Desenvolvimento da lógica para realizar o cálculo do gasto de combustível.
- **Validação de Dados**: Como validar os dados de entrada do usuário para garantir a integridade das informações.
