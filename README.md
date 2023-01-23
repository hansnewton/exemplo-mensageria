# Exemplo de Mensageria Spring AMQP

Este projeto representa um exemplo de um Tutorial comunicação com mensageria na prática com Spring AMQP e RabbitMQ

Fonte: https://www.youtube.com/watch?v=SzcvuHjRJKE

## Descrição do comportamento

3 microserviços
1 microserviço recebe as requisições e cria uma nova entidade e durante essa criação é enviado uma mensagem assincrona para os outros 2 microserviços via uma FanoutExchange
Cada microserviço tem a sua fila e elas são bindadas com a FanoutExchange.

SpringBoot
RabbitMQ
AMQP