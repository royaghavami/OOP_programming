import java.util.ArrayList;

public class Advertiser extends BaseAdvertising{
    private int id;
    private String name;
    private static ArrayList<Advertiser> advertisers = new ArrayList<>();
    private static ArrayList<Integer> totalClicks = new ArrayList<>();

    public Advertiser(int id, String name) {
        this.id = id;
        this.name = name;
        advertisers.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        return "id : unique identifier for each advertiser and its type is INT" +
                "\n" +
                "name: name of advertiser and its type is STRING" +
                "\n" +
                "clicks: number of clicks on advertise and its type is INT" +
                "\n" +
                "views: number of times an advertise got viewed";
    }


    public static int getTotalClicks() {
        int total = 0;
        for (Advertiser advertiser : advertisers) {
            total += advertiser.getClicks();
        }
        return total;
    }

    @Override
    public String describeMe(){
        return "This is Advertiser class.";
    }

}


