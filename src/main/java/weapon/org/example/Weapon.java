package org.example;

public enum Weapon {
    SWORD(25, 1.2),
    AXE(35, 0.8),
    BOW(20, 1.5);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }
}