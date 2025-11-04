package ma.angu.tp1ex3dcc26;

import ma.angu.tp1ex3dcc26.configuration.RsaKeys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "ma.angu.tp1ex3dcc26.client")
@EnableConfigurationProperties(RsaKeys.class)
public class Tp1Ex3Dcc26Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp1Ex3Dcc26Application.class, args);
    }

}
