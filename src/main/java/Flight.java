public class Flight {
    private int number;
    private String destination;

            public Flight(int number, String destination){
            this.number = number;
            this.destination = destination;
            }

    public int hasFlightNumber() {
    return this.number;
    }


    public String getDestination() {
                return this.destination;
    }
}
