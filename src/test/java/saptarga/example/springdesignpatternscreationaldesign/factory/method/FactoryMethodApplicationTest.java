package saptarga.example.springdesignpatternscreationaldesign.factory.method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryMethodApplication.class)
class FactoryMethodApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactorymethod(){
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);

        System.out.println(facebook);
        System.out.println(twitter);
    }
}