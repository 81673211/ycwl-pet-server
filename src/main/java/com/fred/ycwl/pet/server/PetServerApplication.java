package com.fred.ycwl.pet.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/30 15:19
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.fred.ycwl.pet.server.dao")
public class PetServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PetServerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
