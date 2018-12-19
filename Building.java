public abstract class Building {
  
    // attributs  
    private int id;  
    private int floors;
  
    // constructeurs  
    public Building(int floors) {  
        this.id = 0;  
        this.floors = floors;  
    }  
  
    // accesseurs et mutateurs  
    public int getId() {  
        return this.id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public int getFloors() {  
        return this.floors;  
    }  
  
    public void setFloors(int floors) {
        this.floors = floors;
    }

}
