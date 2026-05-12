# 🗂️ TABELA HASH

É uma estrutura de dados usada para armazenar e acessar informações de forma rápida e flexível. A ideia central é trabalhar com uma chave e encontrar o valor associado a ela. Em vez de procurar item por item, a tabela hash utiliza um cálculo para acessar diretamente o dado desejado. Cada chave é processada por uma função determinística, chamada função hash.

---

# ⚙️ FUNÇÃO HASH

É a função responsável por transformar a chave em um número. Esse número representa a posição onde o valor será armazenado na tabela. 

Exemplo: o nome "Wagner" é passado pela função hash e retorna o valor 6. Assim, a posição 6 da tabela será utilizada para armazenar esse dado.

Quando diferentes chaves geram o mesmo valor (hashcode), ocorre uma *colisão*. Esse é um problema importante, pois mais de um elemento tenta ocupar a mesma posição.

---

# 🛠️ TRATAMENTO DE COLISÕES

Para lidar com colisões, existem algumas estratégias:

## 🔹 Sondagem Linear

Ao ocorrer uma colisão, verifica-se a próxima posição disponível na tabela até encontrar um espaço livre. Apesar de simples, essa estratégia não é a mais indicada, pois pode causar clustering (agrupamento), formando blocos de dados consecutivos que aumentam a probabilidade de novas colisões.

---

## 🔹 Encadeamento

Cada posição da tabela aponta para uma lista de elementos. Assim, quando ocorre colisão, os elementos são armazenados nessa lista, evitando ocupar posições consecutivas na tabela principal.

---

# 📊 NOTAÇÃO BIG O - TEMPORAL

No melhor e no caso médio, as operações em tabelas hash possuem complexidade *O(1)*, ou seja, tempo constante. Isso ocorre quando a distribuição das chaves é eficiente e há poucas ou nenhuma colisão.

No pior caso, a complexidade pode chegar a *O(n)*, quando muitas colisões acontecem e vários elementos acabam concentrados na mesma posição, exigindo uma busca linear.

---

# 📈 FATOR DE CARGA

O fator de carga mede o nível de ocupação da tabela hash. Ele é calculado pela razão entre a quantidade de elementos armazenados e o tamanho total da tabela. Para definir o tamanho total, multiplicamos a quantidade de elementos por dois e pegamos o número primo mais próximo. 

Quando esse valor está mais próximo de zero, o acesso aos dados é rápido, mas há desperdício de memória. Por outro lado, quando está próximo de um, a tabela está mais cheia, o que aumenta a ocorrência de colisões e torna as operações mais lentas, embora o uso de memória seja mais eficiente.

---

## 🧮 Exemplo

A quantidade de dados é 2000.

```text
2000 x 2 = 4000
```

O número primo mais próximo é 4001.

```text
2000 / 4001 = 0,49% de fator de carga
```
