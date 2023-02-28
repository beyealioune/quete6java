public class Classroom {

    public static void main(String... args){
        Wilder alioune = new Wilder("alioune", true);
        Wilder tony = new Wilder("tony", false);

        System.out.println(alioune.whoAmI());
        System.out.println(tony.whoAmI());
    }
}