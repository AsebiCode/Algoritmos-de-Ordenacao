# 📘 DADOS ASSINTÓTICOS

A complexidade assintótica é uma forma de analisar como um algoritmo se comporta à medida que o tamanho da entrada (n) cresce, especialmente para valores muito grandes. Em vez de medir o tempo em segundos, analisa-se o crescimento do número de operações.

---

# 📊 NOTAÇÕES ASSINTÓTICAS

As notações assintóticas descrevem limites para o crescimento de algoritmos, possuindo limites superiores (Big O, pior caso), inferiores (Big Omega, melhor caso) e limites exatos, quando o melhor e pior caso coincidem (Theta). A notação Big O é a mais utilizada, pois permite analisar o comportamento do algoritmo no pior caso, focando no crescimento do número de operações.

---

# ⚖️ TEMPORAL X ESPACIAL

## ⏱️ TEMPORAL

A notação temporal representa quanto tempo o algoritmo levaria para executar, é diretamente ligada ao número de operações, como quantas iterações e comparações são feitas.

## 🎲 ESPACIAL

A notação espacial representa quanto espaço de memória o algoritmo usa. Muitos algoritmos utilizam espaço constante O(1), porém outros podem exigir mais memória, dependendo das estruturas de dados utilizadas.

---

# 🧠 *NOTAÇÕES BIG O PRINCIPAIS*

## 🔹 *O(1) - Complexidade constante*

Tempo e espaço são constantes, não se alteram conforme a entrada de dados.

Exemplo: o acesso de um elemento, em termos temporais, de um vetor de índice 2, não importa qual elemento estará, o acesso será sempre o mesmo.

```java
int num = array[2];
```

---

## 🔹 *O(n) - Complexidade linear*

O tempo cresce proporcionalmente ao tamanho da entrada, comumente vista em iterações de um único laço `for`.

```java
for (int i = 0; i < n; i++) {
    // código
}
```

---

## 🔹 *O(n²) - Complexidade quadrática*

O tempo cresce mais rápido, proporcional ao quadrado da entrada. É comum em algoritmos menos eficientes, especialmente com laços aninhados. Visto em iterações aninhadas.

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        //
    }
}
```
