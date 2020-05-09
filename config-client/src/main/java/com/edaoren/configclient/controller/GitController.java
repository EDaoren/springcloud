package com.edaoren.configclient.controller;

import com.edaoren.configclient.config.GitAutoRefreshConfig;
import com.edaoren.configclient.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RefreshScope
public class GitController {

    @Autowired
    private GitConfig gitConfig;

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping(value = "/show")
    public Object show(){
        return gitConfig;
    }

    @GetMapping(value = "/autoShow")
    public Object autoShow(){
        return gitAutoRefreshConfig;
    }
}
