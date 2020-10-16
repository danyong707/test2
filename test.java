package com.xxx.xx.xx.xx.xx;

import com.xxx.lib.DistributedLock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    @Value("${XX_ZOOKEEPER_HOST}")
    private String zookeeperUrl;

    @Bean
    public DistributedLock DistributedLock() throws Exception{
        return new DistributedLock(zookeeperUrl, "sgcai-flyinglines-translate-editer-core");
    }
    
    
}
