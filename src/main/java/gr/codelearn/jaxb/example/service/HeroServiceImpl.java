/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.jaxb.example.service;

import gr.codelearn.jaxb.example.domain.Hero;
import gr.codelearn.jaxb.example.repository.HeroRepository;
import java.util.List;

/**
 *
 * @author giannis
 */
public class HeroServiceImpl implements HeroService{
    private HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }    
    

    @Override
    public Hero create(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public List<Hero> findAll() {
        return heroRepository.findAll();
    }
    
}
