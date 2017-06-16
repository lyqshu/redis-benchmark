package yq.test.redis_benchmark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yq.test.redis_benchmark.handler.RedisHandler;

/**
 * Created by yq on 17-6-16.
 */
public class App {
    private static int VALUE_LEN=1500;
    private static int NUM_SESSION=10000;

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RedisConfiguration.class);
        RedisHandler handler = ctx.getBean(RedisHandler.class);
        handler.write();
    }
}
