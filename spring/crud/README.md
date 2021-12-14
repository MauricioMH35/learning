# CRUD

## Definição
| Prefixo                            | Descrição          | Método                                              | Código           |
|------------------------------------|--------------------|-----------------------------------------------------|------------------|
| <span style="color:cyan;">C</span> | Create / Criar     | <span style="color:rgb(0, 255, 150);">POST</span>   | 201 (CREATED)    |
| <span style="color:cyan;">R</span> | Read / Ler         | <span style="color:rgb(0, 150, 255);">GET</span>    | 200 (OK)         |
| <span style="color:cyan;">U</span> | Update / Atualizar | <span style="color:rgb(220, 0, 200);">PUT</span>    | 200 (OK)         |
| <span style="color:cyan;">D</span> | Delete / Deletar   | <span style="color:rgb(255, 50, 50);">DELETE</span> | 204 (NO CONTENT) |

## Execução
```
    mvn spring-boot:run
```

## Caminhos da API
<!--#
    id=
$-->
| Prefixo                            | Descrição     | Método                                              | URI                                                         | Link                          |
| ---------------------------------- | ------------- | --------------------------------------------------- | ----------------------------------------------------------- | ----------------------------- |
| <span style="color:cyan;">C</span> | Cria Elemento | <span style="color:rgb(0, 255, 150);">POST</span>   | localhost:8080/crud                                         | [link](localhost:8080/crud)   |
| <span style="color:cyan;">R</span> | Lê Elemento   | <span style="color:rgb(0, 150, 255);">GET</span>    | localhost:8080/crud/<span style="color:yellow">{id}</span> | [link](localhsot:8080/crud/0) |
| <span style="color:cyan;">U</span> | Atualiza      | <span style="color:rgb(220, 0, 200);">PUT</span>    | localhost:8080/crud/<span style="color:yellow">{id}</span> | [link](localhost:8080/crud/0) |
| <span style="color:cyan;">D</span> | Deleta        | <span style="color:rgb(255, 50, 50);">DELETE</span> | localhost:8080/crud/<span style="color:yellow">{id}</span> | [link](localhost:8080/crud/0) |

## Resultado Operação para visualizar os Métodos
```
    [
        {
            "id": 0, 
            "prefix": "C", 
            "description": "Create", 
            "method": "POST", 
            "statusCode": 201, 
            "status": "CREATED"
        }, 
        {
            "id": 1, 
            "prefix": "R", 
            "description": "Read", 
            "method": "GET", 
            "statusCode": 200, 
            "status": "OK"
        }, 
        {
            "id": 2, 
            "prefix": "U", 
            "description": "Update", 
            "method": "PUT", 
            "statusCode": 200, 
            "status": "OK"
        }, 
        {
            "id": 3, 
            "prefix": "D", 
            "description": "Delete", 
            "method": "DELETE", 
            "statusCode": 204, 
            "status": "NO CONTENT"
        }, 
    ]
```
