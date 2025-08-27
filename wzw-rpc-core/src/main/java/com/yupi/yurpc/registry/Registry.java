package com.yupi.yurpc.registry;

import com.yupi.yurpc.config.RegistryConfig;
import com.yupi.yurpc.model.ServiceMetaInfo;

import java.util.List;

/**
 * 注册中心
 */
public interface Registry {

    /**
     * 初始化
     */
    void init(RegistryConfig registryConfig);

    /**
     * 注册服务(服务端)
     */
    void register(ServiceMetaInfo serviceMetaInfo) throws Exception;

    /**
     * 注销服务(服务端)
     */
    void unRegister(ServiceMetaInfo serviceMetaInfo);

    /**
     * 服务发现(消费端)
     */
    List<ServiceMetaInfo> serviceDiscover(String serviceKey);

    /**
     * 服务销毁
     */
    void destroy();

    /**
     * 心跳检测（服务端）
     */
    void heartBeat();

    /**
     * 监听（消费端）
     */
    void watch(String serviceNodeKey);
}
