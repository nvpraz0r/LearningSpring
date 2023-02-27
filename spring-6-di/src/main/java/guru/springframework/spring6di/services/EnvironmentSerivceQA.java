package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentSerivceQA implements EnvironmentService{
    @Override
    public String getEnv() {
        return "qa";
    }
}
