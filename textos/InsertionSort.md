# 📥 INSERTION SORT

A ordenação por inserção percorre o vetor da esquerda para a direita, mantendo, a cada iteração, um subvetor à esquerda já ordenado. Em cada passo, o elemento corrente é selecionado e comparado com os elementos anteriores. Aqueles de maior valor são deslocados uma posição à direita, de modo a abrir espaço para a inserção na posição adequada. O processo é repetido sucessivamente até que todos os elementos estejam ordenados.

Em resumo, valores maiores são empurrados para a esquerda até serem "encaixados" na posição correta do vetor.

---

# 📊 COMPLEXIDADE

## ⏱️ Tempo

O melhor cenário para este algoritmo, na complexidade temporal, encaixa-se no *O(n)*, caso o vetor já esteja ordenado, tendo cada elemento comparado com seus precedentes. Para casos medianos e o pior possível, seria *O(n²)*, pois exige, pela natureza do algoritmo, comparações e trocas, piorando o cenário caso os elementos deste vetor estejam inversos.

---

## 🎲 Espaço

A ordenação de inserção entra no caso *O(1)* em complexidade espacial, usando um único espaço constante, independendo da entrada de dados.
