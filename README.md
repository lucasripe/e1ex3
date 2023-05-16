# EX1 - Estruturas básicas no Java

## Objetivo
Este exercício tem como objetivo fornecer prática no uso das estruturas básicas de controle do Java, como estruturas condicionais e de repetição.

## Exercício
Desenvolva um programa em Java que possa ler os dados de um círculo (x, y e raio) e também de um outro ponto (x e y). Utilize esses dados para calcular a área e o perímetro do círculo e verificar se o ponto é interno, externo ou pertence ao círculo.

Para calcular a área e o perímetro do círculo, você pode utilizar as fórmulas matemáticas tradicionais de área e perímetro.

Para verificar se o ponto é interno, externo ou pertence ao círculo, você pode utilizar a distância entre o centro do círculo e o ponto em questão. Se a distância for menor que o raio do círculo, então o ponto é interno ao círculo. Se for maior, então é externo. E se for igual ao raio, então o ponto pertence à circunferência do círculo.

Certifique-se de implementar todas as funcionalidades e testar o seu programa para garantir que ele está funcionando corretamente.

### Exemplo

| Entrada | Saída |
| :-- | :-- |
|<pre><br>3<br>3 1 2 2 0<br>4.3 2.4 3 5.12 6.23<br>5 4 5 9 7<br><pre>|<pre>12.57 12.57 interno<br>28.27 18.85 externo<br>78.54 31.42 pertence<pre>|

## Dicas
 - $\ PI = 3.141592 $
 - Aréa do círculo: $\ A = PI * r^2 $
 - Perímetro do círculo: $\ A = 2 * PI * r $
 - Um ponto é interno ao círculo se:
    - $\ (Xponto - Xcentro)^2 + (Yponto - Ycentro)^2 < r^2 $
 - Um ponto pertence ao círculo se:
    - $\ (Xponto - Xcentro)^2 + (Yponto - Ycentro)^2 = r^2 $
 - Um ponto é externo ao círculo se:
    - $\ (Xponto - Xcentro)^2 + (Yponto - Ycentro)^2 > r^2 $
 - Após a impressão da ultima linha contendo a resposta deve se imprimir **uma** linha em branco.

## Entrega
Após concluir o programa, envie os arquivos fontes respeitando a hierarquia de pastas para o repositório. Os testes criados estão baseados nessa estrutura.

**Observação:** Neste exercício, não é necessário utilizar conceitos de orientação a objetos.
