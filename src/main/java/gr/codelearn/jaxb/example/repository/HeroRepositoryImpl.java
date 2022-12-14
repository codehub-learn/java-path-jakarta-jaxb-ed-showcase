/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.jaxb.example.repository;

import gr.codelearn.jaxb.example.domain.Hero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giannis
 */
public class HeroRepositoryImpl implements HeroRepository{
    private List<Hero> heroList = new ArrayList<>();

    @Override
    public Hero save(Hero hero) {
        hero.setId(heroList.size() + 1);
        heroList.add(hero);
        return hero;
    }

    @Override
    public List<Hero> findAll() {
        return heroList;
    }
    
}
