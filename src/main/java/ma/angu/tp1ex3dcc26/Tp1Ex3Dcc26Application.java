package ma.angu.tp1ex3dcc26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "ma.angu.tp1ex3dcc26.client")
public class Tp1Ex3Dcc26Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp1Ex3Dcc26Application.class, args);
    }

}
