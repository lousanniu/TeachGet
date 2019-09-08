package com.springCloud.provider.config;

import com.google.common.base.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
@Configuration
@EnableSwagger2
@RefreshScope
public class SwaggerConfig {

    private static final int PATH_MAPPING_POSITION = 2;

    private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerConfig.class);

    //@Value("${server.contextPath}")

    private String pathMapping = "/";

    //@Value("${server.port}")
    private String port = "8504";

    private static ApiInfo initApiInfo() {
        return new ApiInfo("用户中心提供者9000-API",//大标题
                initContextInfo(),//简单的描述
                "1.0",//版本
                "服务条款",
                new Contact("Lousanniu", "", ""),//作者
                "三牛软件",//链接显示文字
                "http://baidu.com/"//网站链接
        );
    }

    private static String initContextInfo() {

        StringBuilder sb = new StringBuilder("本服务为三牛软件系统用户中心.");
        return sb.toString();

    }


    @Bean
    public Docket restfulApi() {

        if (pathMapping.indexOf('*') > -1) {
            pathMapping = pathMapping.substring(0, pathMapping.length() - PATH_MAPPING_POSITION);
        }

        LOGGER.info("http://localhost:" + port + pathMapping + "swagger-ui.html");

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("RestfulApi")
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .select()
                .paths(doFilteringRules())
                .build()
                .apiInfo(initApiInfo());

    }

    /**
     * 设置过滤规则
     * 这里的过滤规则支持正则匹配
     *
     * @return
     */
    private static Predicate<String> doFilteringRules() {
        return or(
                regex("/api.*")
        );
    }

}