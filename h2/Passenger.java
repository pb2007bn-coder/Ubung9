package h2;

public class Passenger {
  
  public String name;
  public int planned;
  public int visited;
  public boolean ticket;
  
  public Passenger(String name, int planned, boolean ticket){
    this.name = name;
    this.planned = planned;
    this.ticket = ticket;
    visited = 0;
  
  
  }
  public String getName() {
      return name;
  }

  public int getPlanned() {
      return planned;
  }

  public int getVisited() {
      return visited;
  }

  public boolean hasTicket() {
      return ticket;
  }
  
  public void setVisited(int visited) {
	    this.visited = visited;
	}
}
