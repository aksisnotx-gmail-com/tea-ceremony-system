package com.config;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.Config;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author jamesaks
 * @since 2025/2/13
 */
@Configuration
@Data
@ConfigurationProperties(prefix = "alipay")
@Slf4j
public class AlipayConfigure {

    private String appId;
    private String appPrivateKey;
    private String alipayPublicKey;

    @PostConstruct
    public void init() {
        // 设置参数（全局只需设置一次）
        Config config = new Config();
        config.protocol = "https";
        config.gatewayHost = "openapi.alipaydev.com";
        config.signType = "RSA2";
        config.appId = this.appId;
        config.merchantPrivateKey = this.appPrivateKey;
        config.alipayPublicKey = this.alipayPublicKey;
        Factory.setOptions(config);
        log.info("=======支付宝SDK初始化成功=======");
    }
}
