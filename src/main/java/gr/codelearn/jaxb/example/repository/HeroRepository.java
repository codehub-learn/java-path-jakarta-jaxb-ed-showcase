/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.jaxb.example.repository;

import gr.codelearn.jaxb.example.domain.Hero;
import java.util.List;

/**
 *
 * @author giannis
 */
public interface HeroRepository {
    Hero save(Hero hero);
    List<Hero> findAll();
}
