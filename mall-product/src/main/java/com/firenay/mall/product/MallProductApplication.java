package com.firenay.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author luna
 */ // 开启redis 存储session
@EnableRedisHttpSession
// 开启缓存
@EnableCaching
@EnableFeignClients(basePackages = "com.firenay.mall.product.feign")
@EnableDiscoveryClient
@MapperScan("com.firenay.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

//	http://localhost:9040/product/category/list/tree
//	http://127.0.0.1:88/api/product/category/list/tree
//	http://127.0.0.1:88/api/product/attrgroup/list/1?page=1&key=aa

//	JSR303最终测试：POSTman :{"name":"aaa","logo":"https://github.com/1046762075","sort":0,"firstLetter":"d","showStatus":0}

//	http://localhost:9040/index/catalog.json

//	分布式锁：http://localhost:9040/index/hello

//	读写锁：http://localhost:9040/index/write
//			http://localhost:9040/index/read

//	闭锁：	http://localhost:9040/index/lockDoor
//			http://localhost:9040/index/go/1
//	信号量:	http://localhost:9040/index/go/park
//	http://localhost:9040/index/park
    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }
}
