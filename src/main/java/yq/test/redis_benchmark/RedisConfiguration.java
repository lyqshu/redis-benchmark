package yq.test.redis_benchmark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by Yingqiao on 17-6-16.
 */
@Configuration
@ComponentScan
public class RedisConfiguration {
    private static String REDIS_HOST = "localhost";
    private static int  REDIS_PORT = 6379;
    private static int REDIS_DB = 1;

    @Bean
    JedisConnectionFactory connectionFactory() {
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory();

        connectionFactory.setHostName(REDIS_HOST);
        connectionFactory.setPort(REDIS_PORT);
        connectionFactory.setDatabase(REDIS_DB);
        connectionFactory.setUsePool(true);

        return connectionFactory;
    }


    @Bean
    StringRedisTemplate stringRedisTemplate(JedisConnectionFactory connectionFactory) {
        return new StringRedisTemplate(connectionFactory);
    }
}
