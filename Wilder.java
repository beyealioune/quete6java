public class Wilder {
    private String firstname;
    private boolean aware;

    Wilder(String fn, boolean aw){
        this.firstname = fn;
        this.aware = aw;
    }

    String getFirstname(){
        return this.firstname;
    }

    void setFirstname(String fn){
        this.firstname = fn;
    }

    boolean isAware(){
        return this.aware;
    }

    void setAware(boolean aw){
        this.aware=aw;
    }

    String whoAmI(){
        return this.aware ? "Je m'appelle " + this.firstname + " et je suis aware" : "Je m'appelle " + this.firstname + " et je ne suis pas aware";
    }
}