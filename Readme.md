# Lista-1: Programação Orientada a Objetos

## Autor
**Eduardo Gerber Filho**

---

## Exercício 1: Arte ASCII

Este exercício permite desenhar três formas geométricas diferentes utilizando asteriscos: um **triângulo retângulo**, um **losango** e um **retângulo**. O usuário deve informar os parâmetros necessários via linha de comando.

### Como executar:

1. **Triângulo Retângulo**  
   Para desenhar um triângulo retângulo, informe a altura desejada como argumento.  
   **Exemplo de comando:**
   ```bash
   gradle run --args "triangulo 5"

   Saída:

        *
       **
      ***
     ****
    *****

1. **Losango**  
    Para desenhar um losango, informe a largura desejada como argumento.
    ```bash
    gradle run --args "losango 7"

      *
     ***
    *****
     ***
      *
3. **Retângulo**
    Para desenhar um retângulo, informe a largura e a altura como argumentos.
    ```bash
    gradle run --args "retangulo 8 5"

    Saída:

    ********
    *      *
    *      *
    *      *
    ********
   ```
## Exercício 2: Decodificador de Resistência

Este programa imprime o valor em Ohms de uma resistência e sua tolerância conforme as cores das faixas dadas por parâmetros do programa. Ele aceita de 3 a 4 parâmetros, sendo que a última cor pode ser omitida para significar a ausência de determinada faixa no resistor.

### Como executar:

1. **Primeiro parâmetro (Primeiro dígito)**  
   Primeiro dígito da resistência, representado numericamente pelas seguintes cores:

   - `"Preto"`    - 0
   - `"Marrom"`   - 1
   - `"Vermelho"` - 2
   - `"Laranja"`  - 3
   - `"Amarelo"`  - 4
   - `"Verde"`    - 5
   - `"Azul"`     - 6
   - `"Violeta"`  - 7
   - `"Cinza"`    - 8
   - `"Branco"`   - 9

2. **Segundo parâmetro (Segundo dígito)**  
   Segue a mesma função do primeiro parâmetro, com as mesmas cores associadas aos mesmos valores, mas representando o segundo dígito da resistência.

3. **Terceiro parâmetro (Multiplicador)**  
   Este parâmetro é o multiplicador da resistência, representado pelas seguintes cores:

   - `"Preto"`    - 1
   - `"Marrom"`   - 10
   - `"Vermelho"` - 100
   - `"Laranja"`  - 1 K
   - `"Amarelo"`  - 10 K
   - `"Verde"`    - 100 K
   - `"Azul"`     - 1 M
   - `"Violeta"`  - 10 M
   - `"Cinza"`    - 100 M
   - `"Branco"`   - 1 G
   - `"Ouro"`     - 0,1
   - `"Prata"`    - 0,01

4. **Quarto parâmetro (Tolerância)**  
   Informa a tolerância da resistência. Este parâmetro não interage com os outros valores e pode ser omitido para representar um valor padrão. As cores disponíveis são:

   - `"Preto"`    - 0%
   - `"Marrom"`   - 1%
   - `"Vermelho"` - 2%
   - `"Verde"`    - 0,5%
   - `"Azul"`     - 0,25%
   - `"Violeta"`  - 0,1%
   - `"Cinza"`    - 0,05%
   - `"Ouro"`     - 5%
   - `"Prata"`    - 10%
   - Sem parâmetro - 20%

---

### Exemplo de comando:
```bash
gradle run --args "amarelo branco verde azul"

Saída: 

Resistência: 4,9 M Ohms (+- 0,25%)
```
---

## Exercício 3: Tabuleiro de Batalha Naval

   Esse programa imprime no terminal um tabuleiro 10x10 feito com impressões de caracteres envolvendo ponto e letras, onde as posições "." são as posições vazias, e cada letra é representa um navio diferente que é gerado em ordem aleatóriamente na horizontal ou vertical, e para rodar basta apenas de um "gradle run".

   ### Navios disponíveis:

   | Navio             | Tamanho (casas) | Símbolo |
   |--------------------|-----------------|---------|
   | Porta-aviões       | 5               | P       |
   | Encouraçado        | 4               | E       |
   | Cruzador           | 3               | C       |
   | Submarino          | 3               | S       |
   | Contratorpedeiro   | 2               | N       |

   ### Exemplo de execução

   ```bash
   gradle run

   C C C . . . . . . .
   . . . . . . . . . .
   . . . . . S S S . .
   . . . . . . . . . .
   . P P P P P . . . .
   . . . . . . . E . .
   . . . . . . . E . .
   . . . . . . . E . .
   . . . . . . . E . .
   . . . N N . . . . .
   ```
   --- 
## Exercício 4: Validação Tabuleiro

   O programa feito recebe um arquivo como redirecionamento de entrada, onde o arquivo deve ter um tabuleiro do mesmo formato do **Exercício 3: Tabuleiro de Batalha Naval** e verifica se está válido ou inválido seguindo as regras do jogo.

   ### Tabuleiro inválido

   Um tabuleiro é considerado inválido quando:
   -  não tem a dimensão correta de 10×10 casas 
   -  inclui navios desconhecidos 
   -  não inclui um navio de cada tipo 
   -  inclui múltiplos navios do mesmo tipo 
   -  inclui navios que não estão na horizontal ou vertical 
   
   ### Exemplo de execução


   **arquivo exemplo**
   ```bash
   P P P P P . . . . .
   . . . . . . . . . .
   . . . . . . . . . .
   E E E E . . . . . .
   . . . . . . . . . .
   C C C . . . . . . .
   . . . . . . . . . .
   . . . . S S S . . .
   . . . . . . . . . .
   . . . . N N . . . .

   ``` 

   ```bash
   gradle run < tabuleiro.txt
   
   Tabuleiro válido
   ```

   **arquivo exemplo**
   ```bash
   P P P P P . . . . .
   . . . . . . . . . .
   . . . . . . . . . .
   E E E E . . . . . .
   . . . . . . . . . .
   C C C . . . . . . .
   . . . . S . . . . .
   . . . . . S . . . .
   . . . . . . S . . .
   . . . . N N . . . .

   ``` 

   ```bash
   gradle run < arquivo.txt
   Tabuleiro inválido: barco S não está na horizontal nem vertical.
   Tabuleiro inválido.
   ```

   --- 
