package wpioo.lecture03.activity;

/**
 * This class is about concert information
 * @author Ben
 */

public class Concert {

    /**
     * name of concert
     */
    public String name;
    /**
     * running time in minutes
     */
    public int runningTime;
    /**
     * genre, like "rock"
     */
    public String genre;
    /**
     * location for Concert
     */
    public String location;
    /**
     * concert date
     */
    public Date concertDate;

    /**
     *
     * @param n
     * @param time
     * @param g
     * @param l
     * @param d
     */
    public Concert(String n, int time, String g, String l, Date d) {
        this.name = n;
        this.runningTime = time;
        this.genre = g;
        this.location = l;
        this.concertDate = d;
    }

    public boolean literallyEpic() {
        //Don't use == to compare strings. use equals or equalsIgnoreCase
//        if (this.genre.equalsIgnoreCase("rock") && this.runningTime > 120){
//            return true;
//        }
//        else{
//            return false;
//        }

//    }

        return this.genre.equalsIgnoreCase("rock") && this.runningTime > 120;
    }

    public String openEarlier(Concert other){
        if (this.concertDate.compareTo(other.concertDate) == -1){
            return this.name;
        }
        else if (this.concertDate.compareTo(other.concertDate) == -1){
            return other.name;
        }
        else{
            return "Twinsies";
        }
    }



}
