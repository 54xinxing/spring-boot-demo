# spring-boot-jdbc

1. mysql建表 resources/user.sql

2. 修改 mysql jdbc 配置

 ``` 
 # mysql
 spring.datasource.url=jdbc:mysql://127.0.0.1:3306/springboot?useUnicode=yes&characterEncoding=UTF-8
 spring.datasource.username=root
 spring.datasource.password=root
 spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

3. 运行测试 

```
com.xinxing.demo.springboot.TestSpringJpa
```