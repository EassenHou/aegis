# aegis

spring-cloud-gateway+sentinel+nacos 

## 说明
基于spring-cloud-gateway实现的分布式网关服务，可用于api网关和微服务网关
其中整合了sentinel作为限流和熔断的实现，nacos作为规则持久化的配置中心和下游服务的注册中心

## 核心功能
+ 路由
+ 流控
+ 熔断
+ jwt鉴权
+ 黑白名单

## 版本说明

spring-cloud-alibaba: 2021.1
spring-boot: 2.3.4.RELEASE
sentinel: sentinel-dashboard-1.8.1 (轻微二开)
sentinel-gateway-adapter: 1.8.1 (1.8.0有bug)
nacos: 1.8.0


## 快速开始
```shell
# 打包
mvn clean package
# 启动 -Dcsp.sentinel.app.type=1 以网关的形式注册到sentinel控制台
java -Dcsp.sentinel.app.type=1 -jar aegis-1.0-SNAPSHOT.jar
```