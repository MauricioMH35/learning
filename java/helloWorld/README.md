# HELLO WORLD
~~Aprendezado linguagem Java > Hello World~~

## Gerando JAR da aplicação
```
    javac src/org/learning/hello/world/HelloWorld.java
```

## Execução da aplicação
```
    java src/org/learning/hello/world/HelloWorld
```

## Compreendendo o código

Em linguagens de programação orientadas a objeto é necessário que se inicie um objeto que represente as caracteristicas desse objeto, mas essas caracteristicas podem ser descritas de forma objetiva, onde as informações ou funcionalidades (coisas que o objeto faz), podem e devem ser reduzidas para que não haja uma quantidade enorme de informações desnecessárias que não serão utilizadas, uma forma de abstração do objeto.

Java utiliza para iniciar um objeto a palavra reservada e que não pode ser utilizada para definir outros objetos, variáveis ou qualquer coisa que seja escrita utilizando a palavra 'class' como outras palavras reservadas que representam outras coisas ja preestabelecidas pela linguagem, e essa denominação de classe que representa as caracteristicas que compoem esse objeto também vem junda as abre '{' e fecha '}'. 

Isso diz ao nosso programa/aplicação que haverá um bloco que representa todas as instruções que são pertencentes as classes e métodos/funções que fazem parte da construção desta:

```
    public class HelloWorld {

    }
```

Há também os tipos de acesso que tal 'class' pode possuir:

| Tipo de acesso | Descrição                   |
| -------------- | --------------------------- |
| public         | Qualquer um pode acessar    |
| private        | Apenas os que derivam       |
| protected      | Apenas os que tem permissão |

**Obs:** Esses tipos de acesso podem servir tanto para classes, como também para métodos e variáveis.

Toda aplicação desenvolvida deve iniciar com o método 'main' para indicar que tudos os processos envolvidos da aplicação se iniciarão desse ponto de partida:

```
    public static void main(String[] args) {

    }
```

Tudo que está dentro do '(' e fecha ')' é um atributo que também pode ser considerado como uma variável mas com escopo local da função/método que a possui. No caso do método 'main', ele possui o atributo 'args', que representa os argumentos que serão passados antes da execução da aplicação e que serão utilizados para que em alguma parte dessa aplicação vá a utiliza-la para alguma finalidade estabelecida.

É possivel visualizar que o tipo que representa o atributo é do tipo 'String' mas em 'arrays', que seria como se tivessemos muitos 'args' (argumentos) que devem ser alocados na memória virtual (RAM), para que sejam utilizados para armazenar tais argumentos:

```
    String[] args
```

E por fim o comando que consegue mostrar na tela do terminal a mensagem desejada:

```
    System.out.println("Hello World!");
```

