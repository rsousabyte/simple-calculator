Calculadora Java

Calculadora simples via terminal, feita em Java como exercício de aprendizado. 
Permite realizar operações matemáticas básicas com validação de entrada e 
histórico de resultados salvo em arquivo.

Funcionalidades:
- Soma, subtração, multiplicação e divisão
- Validação de números digitados (evita travar com entrada inválida)
- Validação do símbolo da operação escolhida
- Tratamento de divisão por zero
- Histórico de cálculos salvo automaticamente em historico.txt
- Loop para realizar múltiplos cálculos sem precisar reiniciar o programa

Como executar:
javac Main.java
java Main

Tecnologias utilizadas:
- Java
- Classe Scanner para entrada de dados
- Classe FileWriter para escrita de arquivo (histórico)
- Tratamento de exceções (try/catch)
