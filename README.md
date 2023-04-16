# java-eureka-zuluu-human-resources-microservices
POC to experiment spring eureka and zuluu using Java microservices.

This project implements
- Two microservices. 
- Rest Template and Feign Client.
- Ribbon to load balance requests.
- Eureka as Service Discovery.
- Zuluu as API Gateway.
- 
- At first, the two microservices communicate with each other through a REST template in a known network, with binded hosts and ports. However, they later transition to using a Feign client for enhanced efficiency and seamless communication, and integrate with Ribbon. With the implementation of Eureka, the need for Ribbon is eliminated, and the hosts and ports are dynamically assigned for greater flexibility and scalability.