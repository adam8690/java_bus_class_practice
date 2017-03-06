class Bus{
  private String route;
  private Person[] passengers;

  public Bus(String route){
    this.route = "1";
    this.passengers = new Person[10];
  }

  public boolean isEmpty(){
    boolean result = false;
    for (int i = 0; i < passengers.length; i++){
      if (passengers != null){
        result = true;
      } 
    }
    return result;
  }

  public int count(){
    int count = 0;
    for (int i = 0; i< passengers.length; i++){
      if (passengers[i] != null){
        count++;
      }
    }
    return count;
  }
  
  // adds the specified number of persons to the bus if there is space and returns the number of people who there is not room for. 
  public int add(int persons){
    for (int i = 0; i < passengers.length && persons > 0; i++){
      if (passengers[i] == null){
        passengers[i] = new Person();
        persons = persons - 1;
        } 
    }
  return persons;
  }

  public boolean isFull(){
    return this.add(1) == 1;
  }

}


