package com.tutorial;

// player
class Player{
    String name;
    double health;
    int level;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    // object member
    Weapon weapon;
    Armor armor;

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        double damage;
        if(this.armor.defensePower < attackPower){
            damage = attackPower - this.armor.defensePower;
        }else{
            damage = 0;
        }

        this.health = health - damage;
        System.out.println(this.name + " gets damage " + damage);
        System.out.println(this.name + "'s health = " + this.health);

        if(this.health <= 0){
            System.out.println(this.name + " looser");
        }
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\n\tDeskripsi Player");
        System.out.println("===================================");
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health + " Hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon{
    String name;
    double attackPower;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    String name;
    double defensePower;

    Armor(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defensePower);
    }
}

public class Main {
    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("Mayora", 100);
        Player player2 = new Player("WAC1901", 120);

        // membuat object weapon
        Weapon pedang = new Weapon("Pedang", 12);
        Weapon kriss = new Weapon("Kriss SV", 23);

        // membuat object armor
        Armor bajuBesi = new Armor("Baju Besi", 10);
        Armor bajuKayu = new Armor("Baju Kayu", 5);

        // equip weapon dan armor
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player2.equipWeapon(kriss);
        player2.equipArmor(bajuKayu);
        player1.display();
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEpisode 1\n");
        player1.attack(player2);
        System.out.println("\nEpisode 2\n");
        player2.attack(player1);
    }
}
