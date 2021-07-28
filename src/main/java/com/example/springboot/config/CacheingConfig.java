package com.example.springboot.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;

public interface CacheingConfig {
    String ECACHE_CONFIG = "echache.xml";

    @Bean
    CacheManager cacheManager();

    @Bean
    EhCacheManagerFactoryBean ehCacheFactoryBean();
}
