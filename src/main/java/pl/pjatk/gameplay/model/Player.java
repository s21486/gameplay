package pl.pjatk.gameplay.model;

public class Player {
    private String name;
    private int hp;
    private int id;
    private int attack;

    public Player(int id, String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.id = id;
        this.attack = attack;
    }

    public Player() {
    }

    public Player(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
