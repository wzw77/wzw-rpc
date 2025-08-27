package com.yupi.yurpc.retry;

import com.yupi.yurpc.fault.retry.FixedIntervalRetryStrategy;
import com.yupi.yurpc.fault.retry.NoRetryStrategy;
import com.yupi.yurpc.fault.retry.RetryStrategy;
import com.yupi.yurpc.model.RpcResponse;
import org.junit.Test;

/**
 * 重试策略测试
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @learn <a href="https://codefather.cn">程序员鱼皮的编程宝典</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class RetryStrategyTest {

    RetryStrategy retryStrategy = new FixedIntervalRetryStrategy();

    @Test
    public void doRetry() {
        try {
            RpcResponse rpcResponse = retryStrategy.doRetry(() -> {
                System.out.println("测试重试");
                throw new RuntimeException("模拟重试失败");
            });
            System.out.println(rpcResponse);
        } catch (Exception e) {
            System.out.println("重试多次失败");
            e.printStackTrace();
        }
    }
}