package io.gitee.oldpassive.spring.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

  @Bean
  //  @LoadBalanced
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
