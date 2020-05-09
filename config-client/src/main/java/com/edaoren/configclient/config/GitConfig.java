package com.edaoren.configclient.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Data
@Component
public class GitConfig {

    @Value("${info.profile}")
    private String profile;
}
