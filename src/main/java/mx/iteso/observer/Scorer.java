package mx.iteso.observer;

public class Scorer {
    private String name;
    private int number;
    private String position;
    private String team;

    public Scorer() {}

    public Scorer(String name, String position,int number,  String team) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public String getTeam() { return team; }

    public void setTeam(String team) { this.team = team; }

    public String getPosition() { return position; }

    public void setPosition(String position) { this.position = position; }
}
