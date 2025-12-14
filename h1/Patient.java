package h1;

public class Patient {
  
  private String name;
  private int prio;
  
  public Patient(String name, int prio){
    this.name = name;
    this.prio = prio;
  }
  
  public int getPrio (){
    return prio;
  }
  
  public String getName (){
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setPrio(int prio) {
    this.prio = prio;
  }
}
