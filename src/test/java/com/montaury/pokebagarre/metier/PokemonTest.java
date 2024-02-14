package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void premier_a_une_meilleure_attaque(){
        // GIVEN
        var premier = new Pokemon("Jamie", "urlImage", new Stats(156, 140));
        var second = new Pokemon("MissJirachi", "urlImage2", new Stats(2, 5));
        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);
        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void deuxieme_a_une_meilleure_attaque(){
        // GIVEN
        var premier = new Pokemon("Jamie", "urlImage", new Stats(3, 5));
        var second = new Pokemon("MissJirachi", "urlImage2", new Stats(156, 140));
        // WHEN
        var estVainqueur = second.estVainqueurContre(premier);
        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void meme_attaque_premier_meilleure_defense(){
        // GIVEN
        var premier = new Pokemon("Jamie", "urlImage", new Stats(5, 140));
        var second = new Pokemon("MissJirachi", "urlImage2", new Stats(5, 5));
        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);
        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void meme_attaque_second_meilleure_defense(){
        // GIVEN
        var premier = new Pokemon("Jamie", "urlImage", new Stats(3, 5));
        var second = new Pokemon("MissJirachi", "urlImage2", new Stats(3, 140));
        // WHEN
        var estVainqueur = second.estVainqueurContre(premier);
        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void memes_stats_premier_gagne(){
        // GIVEN
        var premier = new Pokemon("Jamie", "urlImage", new Stats(3, 5));
        var second = new Pokemon("MissJirachi", "urlImage2", new Stats(3, 5));
        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);
        // THEN
        assertThat(estVainqueur).isTrue();
    }
}