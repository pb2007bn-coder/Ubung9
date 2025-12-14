package h2;

public class Passenger {
  
  private String name;
  private int planned;
  private int visited;
  private boolean ticket;
  
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
