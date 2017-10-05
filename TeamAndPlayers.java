
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Team {
    
    private String name;
    private ArrayList<Player> members;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (this.members.size() < this.maxSize) {
            this.members.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player dude : this.members) {
            System.out.println(dude + ", goals " + dude.goals());
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.members.size();
    }
    
    public int goals() {
        int teamGoals = 0;
        for (Player dude : this.members) {
            teamGoals += dude.goals();
        }
        return teamGoals;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Player {
    
    private String name;
    private int goals;
    
    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }
    
    public Player(String name) {
        this.name = name;
        this.goals = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int goals() {
        return this.goals;
    }
    
    @Override
    public String toString() {
        return this.name + ", goals " + this.goals; 
    }
}

public class Main {
    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());     
    }
}
