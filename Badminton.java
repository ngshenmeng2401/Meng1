package badminton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Badminton extends GetData{

    public Badminton(String name,int age,String gender,String country,int point,int tournament, int goldMedal,String picture) {
        super(name, age, gender, country, point, tournament, goldMedal, picture);
    }

    public ArrayList<Badminton> readData(){
        ArrayList<Badminton> badmintonPlayer = new ArrayList();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("doc/Badminton.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Badminton.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Badminton.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            line = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Badminton.class.getName()).log(Level.SEVERE, null, ex);
        }

        while(line != null){
            String[]data = line.split(",");
            Badminton badminton = createPlayer(data);
            badmintonPlayer.add(badminton);
            try {
                line = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Badminton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return badmintonPlayer;
    }

    public Badminton createPlayer(String[]data) {
        super.name = data[0];
        super.age = Integer.parseInt(data[1]);
        super.gender = data[2];
        super.country = data[3];
        super.point = Integer.parseInt(data[4]);
        super.tournament = Integer.parseInt(data[5]);
        super.goldMedal = Integer.parseInt(data[6]);
        super.picture = data[7];
        return new Badminton(name,age,gender,country,point,tournament,goldMedal,picture);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getPoint() {
        return point;
    }

    public int getTournament() {
        return tournament;
    }

    public int getGoldMedal() {
        return goldMedal;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age + "," + this.gender + "," + this.country + "," +
                this.point + "," + this.tournament + "," + this.goldMedal + "," + this.picture;
    }

}
