package yq.test.redis_benchmark.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * Created by yq on 17-6-16.
 */
@Service
public class RedisRespository {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void set(String key, String value) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(key, value);
    }

    public String get(String key) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        return ops.get(key);
    }
}
