package badminton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WomenSinglePlayer extends BadmintonPlayer{
    @Override
    public ArrayList<Badminton> getPlayer(){
        ArrayList<Badminton> womenSinglePlayer = super.getPlayer();
        for (int i=0; i<womenSinglePlayer.size(); i++){
            if (womenSinglePlayer.get(i).getGender().equals("Male")){
                womenSinglePlayer.remove(i);
                i--;
            }
        }
        return womenSinglePlayer;
    }

    @Override
    public ArrayList<Badminton> sortPoint(){
        ArrayList<Badminton> sortWomenSinglePoint = this.getPlayer();
        for(int i=0; i<sortWomenSinglePoint.size(); i++){
            for(int a=i+1; a<sortWomenSinglePoint.size(); a++){
                if(sortWomenSinglePoint.get(i).getPoint() < sortWomenSinglePoint.get(a).getPoint()){
                    Collections.swap(sortWomenSinglePoint,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortWomenSinglePoint.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortWomenSinglePoint.size(); i++){
                pw.println(sortWomenSinglePoint.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(WomenSinglePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortWomenSinglePoint;
    }

    @Override
    public ArrayList<Badminton> sortTournament(){
        ArrayList<Badminton> sortWomenSingleTournament = this.getPlayer();
        for(int i=0; i<sortWomenSingleTournament.size(); i++){
            for(int a=i+1; a<sortWomenSingleTournament.size(); a++){
                if(sortWomenSingleTournament.get(i).getTournament() < sortWomenSingleTournament.get(a).getTournament()){
                    Collections.swap(sortWomenSingleTournament,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortWomenSingleTournament.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortWomenSingleTournament.size(); i++){
                pw.println(sortWomenSingleTournament.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(WomenSinglePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortWomenSingleTournament;
    }

    @Override
    public ArrayList<Badminton> sortGoldMedal(){
        ArrayList<Badminton> sortWomenSingleGoldMedal = this.getPlayer();
        for(int i=0; i<sortWomenSingleGoldMedal.size(); i++){
            for(int a=i+1; a<sortWomenSingleGoldMedal.size(); a++){
                if(sortWomenSingleGoldMedal.get(i).getGoldMedal() < sortWomenSingleGoldMedal.get(a).getGoldMedal()){
                    Collections.swap(sortWomenSingleGoldMedal,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortWomenSingleGoldMedal.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortWomenSingleGoldMedal.size(); i++){
                pw.println(sortWomenSingleGoldMedal.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(WomenSinglePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortWomenSingleGoldMedal;
    }

}
