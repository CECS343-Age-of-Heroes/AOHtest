/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kazunori
 */
public class Player {
    String race;
    String age;
    Object cards;
    Object resources;
    Object building;
    Object tiles;
    Integer victoryPoints;
    boolean turn;
    public Player(){
        race = "";
        age = "Archaic";
        cards = null;
        resources = null;
        building = null;
        tiles = null;
        victoryPoints = 0;
        turn = false;
    }
    public String getRace(){
        return race;
    }
    public void chooseRace(String newRace){
        race = newRace;
    }
    public String getAge(){
        return age;
    }
    public void newAge(){
        
    }
}
