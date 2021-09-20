package com.pogu.bootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootstudyApplication extends SpringBootServletInitializer {

    /**
     * springboot内置了一个tomcat, 所以在开发阶段直接启动main方法就相当于开启了一个web服务
     *      war包是JavaWeb程序打的包, war包里面包括写的代码编译成的class文件, 依赖的包, 配置文件, 所有的网站页面, 包括html, jsp等等;
     *          一个war包可以理解为是一个web项目, 里面是项目的所有东西; 打war包的时候需要注意, tomcat如果是10的话, 会有路劲加载不出来的问题
     *      jar相当于是工具类的包, 别人写好的程序; jar包也可以是一个web程序的打包, 通过使用java -jar ***启动jar包的程序;
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BootstudyApplication.class, args);
    }


    /**
     * 重写configure(), 实现外部Tomcat启动服务
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootstudyApplication.class);
    }


}
