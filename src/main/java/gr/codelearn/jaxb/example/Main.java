package gr.codelearn.jaxb.example;

import gr.codelearn.jaxb.example.domain.Abillity;
import gr.codelearn.jaxb.example.domain.Hero;
import gr.codelearn.jaxb.example.repository.HeroRepository;
import gr.codelearn.jaxb.example.repository.HeroRepositoryImpl;
import gr.codelearn.jaxb.example.service.HeroService;
import gr.codelearn.jaxb.example.service.HeroServiceImpl;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final String FILE = "./hero.xml";
    public static void main(String[] args) {
        HeroRepository heroRepository = new HeroRepositoryImpl();
        HeroService heroService = new HeroServiceImpl(heroRepository);
        Hero hero = null;
        try {
            marshal();
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            hero = unmarshal();
        } catch (JAXBException | FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        heroService.create(hero);
        heroService.findAll().forEach(System.out::println);
        
    }
    
    public static void marshal() throws JAXBException{
        List<Abillity> abillities = new ArrayList<>();
        abillities.add(new Abillity(1l,"Smash",100));
        abillities.add(new Abillity(2l,"Slam",150));
        Hero hero1 = new Hero(2,"Hulk","Green",LocalDateTime.now(),abillities,"nothing");
        JAXBContext context = JAXBContext.newInstance(Hero.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(hero1, new File(FILE));
    }
    
    public static Hero unmarshal() throws JAXBException, FileNotFoundException{
        JAXBContext context = JAXBContext.newInstance(Hero.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Hero hero = (Hero) unmarshaller.unmarshal(new FileReader(FILE));
        return hero;
    }
}
