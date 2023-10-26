package Composition;
import java.util.ArrayList;

public class Table {
    private Integer width, length;
    private int numOfLegs;
    private int legLength;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(int numOfLegs, int legLength, int width, int length) {
        this.numOfLegs = numOfLegs;
        this.width = width;
        this.length = length;
        this.legLength = legLength;
    }
    
    public void addLegs(int leg){
        legs.add(new Leg(legLength));
    }

    public class Leg {
        private Integer legLength;
        public Leg(Integer legLength) {
            this.legLength = legLength;
        }
    }

    public static void main(String[] args){
        var myTable = new Table(4, 25, 20, 10);
    }
}
