package it.aulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;

//annotation
@Configuration
@ComponentScan("it.aulab")
public class AppConfig {

    @Bean(name = "jeeg")
    @Scope("prototype")
    public Jeeg getJeeg(){
        System.out.println("Sto creando un jeeg");
        return new Jeeg(getArmSx(), getArmDx(), getLegSx(), getLegDx());
    }

    @Bean(name = "armSx")
    public Arm getArmSx(){
        System.out.println("Sto creando un braccio sinistro");
        return new Arm(Side.Sx);
    }

    @Bean(name = "armDx")
    public Arm getArmDx(){
        System.out.println("Sto creando un braccio destro");
        return new Arm(Side.Dx);
    }

    @Bean(name = "legSx")
    public Leg getLegSx(){
        System.out.println("Sto creando una gamba sinistra");
        return new Leg(Side.Sx);
    }

    @Bean(name = "legDx")
    public Leg getLegDx(){
        System.out.println("Sto creando una gamba destra");
        return new Leg(Side.Dx);
    }

}
