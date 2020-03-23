package badminton;

public class GetData implements FileOperation{

    protected String name;
    protected int age;
    protected String gender;
    protected String country;
    protected int point;
    protected int tournament;
    protected int goldMedal;
    protected String picture;

    public GetData(String name,int age,String gender,String country,int point,int tournament, int goldMedal, String picture){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.point = point;
        this.tournament = tournament;
        this.goldMedal = goldMedal;
        this.picture = picture;
    }

}
