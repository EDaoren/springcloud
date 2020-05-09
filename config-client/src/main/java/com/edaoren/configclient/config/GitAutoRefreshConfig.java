package com.edaoren.configclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@Data
@ConfigurationProperties(prefix = "info")
public class GitAutoRefreshConfig {

    private String profile;
}
