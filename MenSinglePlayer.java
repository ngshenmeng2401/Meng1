package badminton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenSinglePlayer extends BadmintonPlayer{
    @Override
    public ArrayList<Badminton> getPlayer(){
        ArrayList<Badminton> menSinglePlayer = super.getPlayer();
        for (int i=0; i<menSinglePlayer.size(); i++){
            if (menSinglePlayer.get(i).getGender().equals("Female")){
                menSinglePlayer.remove(i);
                i--;
            }
        }
        return menSinglePlayer;
    }

    @Override
    public ArrayList<Badminton> sortPoint(){
        ArrayList<Badminton> sortMenSinglePoint = this.getPlayer();
        for(int i=0; i<sortMenSinglePoint.size(); i++){
            for(int a=i+1; a<sortMenSinglePoint.size(); a++){
                if(sortMenSinglePoint.get(i).getPoint() < sortMenSinglePoint.get(a).getPoint()){
                    Collections.swap(sortMenSinglePoint,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortMenSinglePoint.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortMenSinglePoint.size(); i++){
                pw.println(sortMenSinglePoint.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(MenSinglePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortMenSinglePoint;
    }

    @Override
    public ArrayList<Badminton> sortTournament(){
        ArrayList<Badminton> sortMenSingleTournament = this.getPlayer();
        for(int i=0; i<sortMenSingleTournament.size(); i++){
            for(int a=i+1; a<sortMenSingleTournament.size(); a++){
                if(sortMenSingleTournament.get(i).getTournament() < sortMenSingleTournament.get(a).getTournament()){
                    Collections.swap(sortMenSingleTournament,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortMenSingleTournament.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortMenSingleTournament.size(); i++){
                pw.println(sortMenSingleTournament.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(MenSinglePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortMenSingleTournament;
    }

    @Override
    public ArrayList<Badminton> sortGoldMedal(){
        ArrayList<Badminton> sortMenSingleGoldMedal = this.getPlayer();
        for(int i=0; i<sortMenSingleGoldMedal.size(); i++){
            for(int a=i+1; a<sortMenSingleGoldMedal.size(); a++){
                if(sortMenSingleGoldMedal.get(i).getGoldMedal() < sortMenSingleGoldMedal.get(a).getGoldMedal()){
                    Collections.swap(sortMenSingleGoldMedal,i,a);
                }
            }
        }

        try (FileWriter fw = new FileWriter("doc/sortMenSingleGoldMedal.csv")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Age,Gender,Country,Point,Tournament,GoldMedal,Picture");
            for(int i=0; i<sortMenSingleGoldMedal.size(); i++){
                pw.println(sortMenSingleGoldMedal.get(i).toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(MenSinglePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortMenSingleGoldMedal;
    }

}
