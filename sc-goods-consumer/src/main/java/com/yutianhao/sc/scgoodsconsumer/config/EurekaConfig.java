package com.yutianhao.sc.scgoodsconsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author thyu
 * @title: EurekaConfig
 * @projectName yutianhao-eureka-ribbon-parent
 * @description: TODO
 * @date 2020/7/16 9:23
 */
@Configuration
public class EurekaConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule iRule(){
        //return new RoundRobinRule();
        return new RandomRule();
    }
}
