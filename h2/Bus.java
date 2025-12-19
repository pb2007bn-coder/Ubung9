package h2;
import java.util.ArrayList;
public class Bus {
  public ArrayList  <Passenger> passenger;
  
  public Bus(){
    passenger = new ArrayList <Passenger>();
  }
  
  private void exitBus(){
	    for (int i = passenger.size() - 1; i >= 0; i--) {
	        if (passenger.get(i).getVisited() == passenger.get(i).getPlanned()) {
	            passenger.remove(i);
	        }
	    }
	}

  
  public void enterBus(Passenger p){
    passenger.add(p);
  }
  
  
  public void nextStop (Passenger [] boarding){
    for (int i = 0; i < passenger.size(); i++) {
      passenger.get(i).setVisited(passenger.get(i).getVisited() + 1);
    }
    exitBus();
    for (int i = 0 ;i< boarding.length ;i++ ) {
      passenger.add(boarding[i]);
    } // end of for
  }
  
  public void nextStop (){
    for (int i = 0; i < passenger.size(); i++) {
      passenger.get(i).setVisited(passenger.get(i).getVisited() + 1);
    }
    exitBus();
  }
  
  public ArrayList<Passenger> findPassengersWithoutTickets(){
	    ArrayList<Passenger> moin = new ArrayList<>();

	    for (int i = passenger.size() - 1; i >= 0; i--) {
	        if (!passenger.get(i).hasTicket()) {
	            moin.add(0, passenger.get(i)); // Reihenfolge korrekt
	            passenger.remove(i);
	        }
	    }
	    return moin;
	}

  
  public void transferPassengers(Bus otherBus, String[] passengerNames) {

	    for (int i = passenger.size() - 1; i >= 0; i--) {
	        Passenger p = passenger.get(i);

	        for (int j = 0; j < passengerNames.length; j++) {
	            if (p.getName().equals(passengerNames[j])) {
	                passenger.remove(i);
	                otherBus.enterBus(p);
	                break;
	            }
	        }
	    }
	}

    
  }

