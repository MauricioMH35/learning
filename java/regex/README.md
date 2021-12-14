# REGEX
**Notes or Projects for learning the language Java**

## Modificadores

| Modificador | Descrição                      |
| ----------- | ------------------------------ |
| (?i)        | Ignora minúsculas e maiúsculas |
| (?x)        | Reconhece Comentários          |
| (?m)        | Trabalha com Multilinhas       | 
| (?s)        | Dottal                         |

## Metacaracteres

| Metacaracter         | Descrição da Representação                |
| -------------------- | ----------------------------------------- |
| .                    | Qualquer tipo de caracter                 |
| \d ou [0-9]          | Números/Dígitos                           |
| \D ou [^0-9]         | Não é número/dígito                       |
| \s ou [ \t\n\x0B\f\r | Qualquer tipo de espaço                   |
| \S ou [^\s]          | Não é qualquer tipo de espaço             |
| \w ou [a-zA-Z_0-9    | Letras minúsculas ou maiúsculas e números |
| \W ou [^\w]          | Não é letra nem número                    | 

## Quantificadores

| Quantificador | Descrição Ocorrências |
| ------------- | --------------------- |
| X{n}          | 'n' vezes             |
| X{n,}         | Minimo 'n' maximo ... |
| X{n, m}       | Minimo 'n' maximo 'm' |
| X?            | 0 ou 1 vez            |
| X*            | 0 ou mais vezes       |
| X+            | 1 ou mais vezes       |

## Metacaracteres de Fronteira

| Met. Fronteira | Descrição Padrão |
| -------------- | ---------------- | 
| ^              | Inicia           |
| $              | Termina          |
| |              | Ou               |

## Agrupadores

| Agrupadores    | Descrição                                  |
| -------------- | ------------------------------------------ |
| [...]          | Agrupamento                                |
| [a-z]          | Alcance de 'a' atè 'z'                     |
| [a-c][e-g]     | União de 'a' até 'c' e 'e' até 'g'         |
| [a-z&&[aeiou]] | Interseção de 'a' até 'z' mais as vogais   |
| [^abc]         | Exceção quando tiver 'abc'                 |
| [a-z&&[^m-p]]  | Subtração de 'a' até 'z' menos 'm' até 'p' |
| \x             | Fuga de literal                            |

## Compilando um Pattern

Quando se compila um 'pattern' ou padrão é possivel que o padrão seja já pre-definido sem que haja a necessidade de que ele tenha que executar a varificação do padrão em tempo de execução em todas as chamadas:

```
    String strDoce = "Existe DocE mais dOce que a batata DoCe";
    Metcher metcher = Pattern.compile("(?i)doce").matches(strDoce);
```

## Métodos

### Substituição com Pattern

É possivel substituir utilizando padrões/patterns partes de uma 'String' usando 'regex':

```
    String strDoce = Existe DocE mais dOce que a batata DoCe";
    String replaceStr = strDoce.replaceAll("(?i)doce", "DOCINHO");
```

### Criação de Variáveis em Expressões Regulares

Para criar variáveis utilizando 'pattern' se coloca a "parte" desejada que indica o valor dessa variável, para opós isso, se consiga recuperar os valores dessas variáveis que serão dispostas em sequência a que foram alocadas utilizando o '$' seguido do número que representa sua posição:

```
    String url = "www.meu-site.com.br/customers-2021.html"
    String regularExpr = "(www.meu-site.com.br)/(\\w{2,})-(\\d{2,4}).html";
    String replace = "http://$1/$3/$2.jsp"; // http://www.meu-site.com.br/2021/customers.jsp"
    String newUrl = url.replaceAll(regularExpr, replace);   
```

