package com.example.flashsale.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Redisson 配置类
@Configuration
public class RedissonConfig {
    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        // 配置 Redis 单节点模式
        config.useSingleServer().setAddress("redis://192.168.198.128:6379");
        return Redisson.create(config);
    }
}
