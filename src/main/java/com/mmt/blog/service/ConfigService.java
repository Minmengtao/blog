package com.mmt.blog.service;

import java.util.Map;

/**
 * @author minmengtao
 * @date 2021-5-17
 */
public interface ConfigService {
    /**
     * 修改配置项
     *
     * @param configName
     * @param configValue
     * @return
     */
    int updateConfig(String configName, String configValue);

    /**
     * 获取所有的配置项
     *
     * @return
     */
    Map<String, String> getAllConfigs();
}
