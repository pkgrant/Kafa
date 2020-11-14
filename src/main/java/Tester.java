import Controller.Curator;


public class Tester {
    //test main method
    public static void main(String[] args) {

        Curator curator = new Curator("84ffcb111f074ae4aa8ba95190e88b39", "42iEFW9NS6L74hkRrPLMHMH0tAg688Tl");

        if( curator != null ) {
            System.out.println("IT MAYBE WORKED!");
        }
        else {
            System.out.println("IT DIDN'T WORK!");
        }

        System.out.println(curator.getCharacterStatistics("stormrage", "maphus").toString());

    }
}
