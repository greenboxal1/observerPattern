package mx.iteso.observer;

import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;
import java.util.List;
import java.util.ArrayList;
import mx.iteso.observer.impl.MobileAppDisplay;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        MobileAppDisplay mobileAppDisplay = new MobileAppDisplay(scoresData);

        List<Scorer> scorersTacitIntel = new ArrayList<Scorer>();
        List<Scorer> scorersChivasQueretaro = new ArrayList<Scorer>();
        List<Scorer> scorersLaGangaMA = new ArrayList<Scorer>();

        scorersTacitIntel.add(new Scorer("Salvador","Defense",7, "Tacit Knowledge"));
        scorersTacitIntel.add(new Scorer("Jose", "GoalKeeper", 5, "Tacit Knowledge"));

        scorersChivasQueretaro.add(new Scorer("Antonio","MidFielder",8, "Chivas"));
        scorersChivasQueretaro.add(new Scorer("Jorge","Forward",10, "Chivas"));

        scorersLaGangaMA.add(new Scorer("Enrique","GoalKeeper",9, "La Ganga"));
        scorersLaGangaMA.add(new Scorer("Guillermo","Defense",12, "La Ganga"));

        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1,scorersTacitIntel);
        scoresData.setScore("Chivas", "Queretaro", 2, 1,scorersChivasQueretaro);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0,scorersLaGangaMA);
    }
}
