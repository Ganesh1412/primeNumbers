package com.example.springboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Slf4j
@Configuration
@EnableCaching
public class CacheingConfigClass implements CacheingConfig {

    @Bean
    @Override
    public CacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheFactoryBean().getObject());
    }

    @Override
    @Bean
    public EhCacheManagerFactoryBean ehCacheFactoryBean() {
        EhCacheManagerFactoryBean ehCacheFactoryBean = new EhCacheManagerFactoryBean();
        ehCacheFactoryBean.setConfigLocation(new ClassPathResource(ECACHE_CONFIG));
        ehCacheFactoryBean.setShared(true);
        return ehCacheFactoryBean;

    }
}
