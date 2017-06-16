package yq.test.redis_benchmark.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yq.test.redis_benchmark.config.RedisRespository;

/**
 * Created by developer on 17-6-16.
 */
@Service
public class RedisHandler {
    @Autowired
    private  RedisRespository redisRespository;

    public void write(){
        redisRespository.set("yq", "888");
    }
}
