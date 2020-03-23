package badminton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class BadmintonPlayer implements FileOperation{

    public ArrayList<Badminton> getPlayer(){
        Badminton badminton = new Badminton(null,0,null,null,0,0,0,null);
        ArrayList<Badminton> badmintonPlayer = new ArrayList();
        try {
            badmintonPlayer = badminton.readData();
        } catch (IOException ex) {
            Logger.getLogger(BadmintonPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return badmintonPlayer;
    }

    public ArrayList<Badminton> sortPoint(){
        ArrayList<Badminton> sortBadmintonPoint = this.getPlayer();
        for(int i=0; i<sortBadmintonPoint.size(); i++){
            for(int a=i+1; a<sortBadmintonPoint.size(); a++){
                if(sortBadmintonPoint.get(i).getPoint() < sortBadmintonPoint.get(a).getPoint()){
                    Collections.swap(sortBadmintonPoint,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortBadmintonPoint.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortBadmintonPoint.size(); i++){
                pw.println(sortBadmintonPoint.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(BadmintonPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortBadmintonPoint;
    }

    public ArrayList<Badminton> sortTournament(){
        ArrayList<Badminton> sortBadmintonTournament = this.getPlayer();
        for(int i=0; i<sortBadmintonTournament.size(); i++){
            for(int a=i+1; a<sortBadmintonTournament.size(); a++){
                if(sortBadmintonTournament.get(i).getTournament() < sortBadmintonTournament.get(a).getTournament()){
                    Collections.swap(sortBadmintonTournament,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortBadmintonTournament.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortBadmintonTournament.size(); i++){
                pw.println(sortBadmintonTournament.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(BadmintonPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortBadmintonTournament;
    }

    public ArrayList<Badminton> sortGoldMedal(){
        ArrayList<Badminton> sortBadmintonGoldMedal = this.getPlayer();
        for(int i=0; i<sortBadmintonGoldMedal.size(); i++){
            for(int a=i+1; a<sortBadmintonGoldMedal.size(); a++){
                if(sortBadmintonGoldMedal.get(i).getGoldMedal() < sortBadmintonGoldMedal.get(a).getGoldMedal()){
                    Collections.swap(sortBadmintonGoldMedal,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortBadmintonGoldMedal.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortBadmintonGoldMedal.size(); i++){
                pw.println(sortBadmintonGoldMedal.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(BadmintonPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortBadmintonGoldMedal;
    }

}
