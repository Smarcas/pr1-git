package local.ex5;

public class Zona {
    // ATRIBUTOS
    public int tickets;
    // CONSTRUCTOR
    public Zona (int tickets) {
        this.tickets=tickets;
    }
    // GETTER
    public int getTickets() {
        return tickets;
    }
    // SETTER
    public void setTickets(int tickets) {
        this.tickets=tickets;
    }
    // METHODS
    public void venderTickets(int tickets) {
        if (this.getTickets()==0) {
            System.out.println("No nos quedan tickets para esa zona.");
        } else if (tickets<=this.getTickets()) {
            this.tickets-=tickets;
        } else if (tickets>this.getTickets()) {
            System.out.println("Solo me quedan " + this.getTickets() + " tickets.");
        }
    }
}
