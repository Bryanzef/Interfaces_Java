# Estudo de interfaces em Java

## Etapa 1

Primeiro, vamos criar uma interface chamada Vendavel, que terá um método chamado getPreco() que retorna o preço do produto:

## Etapa 2

Agora, vamos criar uma classe chamada Produto que implementa a interface Vendavel. Essa classe representa um produto que pode ser adicionado ao carrinho de compras:

## Etapa 3

Em seguida, vamos criar uma interface chamada CarrinhoDeCompras, que terá um método chamado adicionarVendavel(Vendavel vendavel) que adiciona um produto ao carrinho e um método chamado getTotal() que retorna o preço total dos produtos no carrinho:

## Etapa 4

Agora, vamos criar uma classe chamada CarrinhoDeComprasImpl que implementa a interface CarrinhoDeCompras. Essa classe representa o carrinho de compras:

## Etapa 5

Por fim, vamos criar uma classe chamada Loja que simula uma loja virtual, onde produtos podem ser adicionados ao carrinho de compras:
