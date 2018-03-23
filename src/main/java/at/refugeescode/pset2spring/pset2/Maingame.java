package at.refugeescode.pset2spring.pset2;


import at.refugeescode.pset2spring.pset2.controller.RockScissorsPaper;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Maingame {
    @Bean
    public ApplicationRunner main(RockScissorsPaper rockScissorsPaper) {
        return args -> {
          rockScissorsPaper.play();
        };
    }
}
