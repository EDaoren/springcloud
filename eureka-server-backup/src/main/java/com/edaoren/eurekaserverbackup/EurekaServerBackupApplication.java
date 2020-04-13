package com.edaoren.eurekaserverbackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka备份注册中心
 * @author EDaoren
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBackupApplication.class, args);
    }

}
