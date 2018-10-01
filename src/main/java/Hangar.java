import java.util.ArrayList;

public class Hangar {
    private int number;
    private String type;
    private String size;
    private ArrayList<Plane> planes;

    public Hangar(int number, String type, String size){
        this.number = number;
        this.type = type;
        this.size = size;
        this.planes = new ArrayList<>();
    }

    public int getNumber() {
       return this.number;
    }

    public String getType() {
        return this.type;
    }

    public String getSize() {
        return this.size;
    }

    public int numberOfPlanes() {
        return this.planes.size();
    }
}
