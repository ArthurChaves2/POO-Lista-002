POO-Java-Lista-01
Estácio Unimeta, 2025 – Sistemas de Informação

Professor: Érick Fernandes

Alunos
João Victor Rodrigues

Arthur Chaves

Exercício 1: Sistema de Gerenciamento de Veículos
Crie um sistema para gerenciar veículos de uma concessionária. Os veículos podem ser de dois tipos: Carro e Moto. Todos os veículos possuem marca, modelo, ano e preco, mas:

Carros têm um atributo adicional: numeroPortas.
Motos têm um atributo adicional: cilindradas.
Requisitos:

Use encapsulamento (atributos privados + getters/setters)
Crie uma classe abstrata Veiculo com o método comum exibirDetalhes() que exiba na tela informações sobre o Veículo
Utilize herança para Carro e Moto
Aplique polimorfismo para chamar exibirDetalhes() de cada tipo
(Bônus) Crie uma interface Desconto com um método aplicarDesconto(double porcentagem) e implemente nos veículos
No método main, crie duas instâncias das classes Carro e Moto
Exercício 2: Sistema de Figuras Geométricas
Desenvolva um programa que calcule a área e o perímetro da figuras geométricas Circulo, Retangulo, Triangulo, Esfera, Cubo e Cone.

Requisitos:

Crie uma classe abstrada Figura com o método comum exibirDetalhes()
Crie uma interface FiguraPlana com métodos calcularArea() e calcularPerimetro().
Crie uma interface FiguraEspacial com os métodos calcularVolume()
Crie uma classe para cada figura específica
Implemente a interface adequada em cada classe concreta.
Use encapsulamento para atributos como raio (Círculo), largura/altura (Retângulo), lado1/lado2/lado3 (Triângulo).
No main, crie uma instância de cada classe e mostre os detalhes de cada uma.
