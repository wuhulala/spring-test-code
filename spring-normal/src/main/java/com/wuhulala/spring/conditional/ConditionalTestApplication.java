package com.wuhulala.spring.conditional;

import com.wuhulala.api.User;
import com.wuhulala.spring.annotation.AoHuiAppAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 功能说明: com.wuhulala.spring.conditional<br>
 * 注意事项: <br>
 * 系统版本: v1.0<br>
 * 开发人员: xueah20964<br>
 * 开发时间: 2017/7/18<br>
 */
@AoHuiAppAnnotation
public class ConditionalTestApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ConditionalTestApplication.class);

        User user = annotationConfigApplicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    @Bean
    public String newString(){
        return new String("asd");
    }
}
