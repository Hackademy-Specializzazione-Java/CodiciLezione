package it.aulab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.repositories.JeegRepository;

@Component("jeegService")// dichiara che questo è un componente dell'epplication context capirà cosa è grazie alle logiche
public class JeegServiceImpl implements JeegService{

    //Dependency injection
    @Autowired
    private JeegRepository repository;

    @Override
    public void attack() {

        Jeeg jeeg = this.repository.getJeeg();

        Arm armSx = jeeg.getArmSx();
        Arm armDx = jeeg.getArmDx();

        armSx.attack();
        armDx.attack();

        //System.out.println("Jeeg attacca!");
    }

    @Override
    public void move() {

        if(this.repository.getJeeg() != null){

            Jeeg jeeg = this.repository.getJeeg();
            
            Leg legSx = jeeg.getLegSx();
            Leg legDx = jeeg.getLegDx();
            
            legSx.walkBackward();
            legDx.walkForward();
        }

        //System.out.println("Jeeg si muove!");
    }

    public JeegRepository getRepository() {
        return repository;
    }
    
    public void setRepository(JeegRepository repository) {
        this.repository = repository;
    }



}
