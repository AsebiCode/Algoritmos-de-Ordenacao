# 🐚 SHELL SORT

A ordenação Shell é uma generalização do Insertion Sort que permite a comparação entre dois elementos distantes entre si. O algoritmo consiste no percurso de um intervalo, definida em uma variável de nome `gap`, definindo qual será a distância que os elementos serão comparados.


A princípio, o intervalo inicia seu valor sendo a metade dos elementos do vetor, e a cada iteração, a distância diminui, sempre dividindo por 2, podendo chegar até 1. Quando a variável de distância (Gap) chega em 1, o algoritmo se comporta como o Insertion Sort, possuindo uma execução mais eficiente, visto que o Shell Sort ordenou parcialmente o vetor.

---

# 📊 COMPLEXIDADE

## ⏱️ TEMPO

A complexidade temporal do Shell Sort depende da variável de distância.

No melhor cenário, caso o vetor esteja parcialmente ordenado, usa-se a notação *O(n log n)*. Para casos medianos, avalia-se entre *O(n¹,²⁵)* e *O(n²)*, pois pela natureza do algoritmo, depende da escolha da sequência de lacunas na comparação. Em piores cenários, O(n²) para sequências de lacunas simples, como n/2, n/4 e na escolha ruim de intervalos.

---

## 🎲 ESPAÇO

O algoritmo possui complexidade espacial de *O(1)*, pois ordena os elementos diretamente no vetor, apenas um uso constante.
