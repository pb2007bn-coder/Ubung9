package h1;
import java.util.ArrayList;

public class PrioListe {
  
  private ArrayList <Patient> myList = new ArrayList <Patient> ();
  
  
  public void addPatient(Patient p){
    if (myList.isEmpty()) {
      myList.add(p);
      return;
    } // end of if  
    
    for (int i = 0; i < myList.size(); i++) {
      if (p.getPrio() < myList.get(i).getPrio()) {
        myList.add(i,p);
        return;
      } // end of if
    }
    myList.add(p);
    return;
  }
  
  public Patient getNextPatient (){
    if (!myList.isEmpty()) {
      Patient first = myList.getFirst();
      myList.remove(first);
      return first;
    } // end of if
    return null;
  }
  
  
  public int getPosition(Patient p){
    if (myList.indexOf(p) == -1) {
      return -1;
    } // end of if
    return myList.indexOf(p);
  }
}
        
    