package mx.iteso.observer.impl;
import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;
import mx.iteso.observer.Scorer;
import java.util.List;

public class MobileAppDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    private List<Scorer> scorers;


    public MobileAppDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);

        for (Scorer scorer: scorers) {
            System.out.println("Name: " + scorer.getName() + " Number: " + scorer.getNumber()
                + " Position: " + scorer.getPosition()
                + " Team: " + scorer.getTeam());
        }
    }

    public void update(String home, String away, int homeGoals, int awayGoals, List<Scorer> scorers) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers = scorers;
        display();
    }
}
