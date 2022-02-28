package cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyf
 * @className Payment9003Application
 * @date 2022/2/27 15:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9004Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment9004Application.class, args);
    }
}