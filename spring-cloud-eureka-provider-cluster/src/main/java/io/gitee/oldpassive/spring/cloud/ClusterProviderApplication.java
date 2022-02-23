package io.gitee.oldpassive.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClusterProviderApplication {
  public static void main(String[] args) {
    SpringApplication.run(ClusterProviderApplication.class, args);
  }
}
