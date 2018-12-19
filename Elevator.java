public class Elevator extends Building implements Behavior{

    private int id;
    private int floor;

    public Elevator(int id, int floor, int floors) {
        super(floors);
        this.id = id;
        this.floor = floor;
    }

    //Getter et setter
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void useElevator(int fromFloor, int toFloor) {
        int elevatorFloor = this.floor;

        System.out.println("ELEVATOR IS COMING");

        if (fromFloor != elevatorFloor) {
            request(fromFloor, elevatorFloor);
        }

        System.out.println("DOORS OPEN");
        System.out.println("DOORS CLOSE");

        if (fromFloor != toFloor) {
            request(toFloor, fromFloor);
        }

        System.out.println("DOORS OPEN");
        System.out.println("DOORS CLOSE");
    }

    @Override
    public void request(int target, int elevatorFloor) {
        
        if (target < elevatorFloor) {
            goDown(target);
        } else {
            goUp(target);
        }
    }

    @Override
    public void goUp(int target){
        int elevatorFloor = this.floor;
        System.out.println(elevatorFloor);
        
        while (elevatorFloor < target) {
            elevatorFloor ++;
            System.out.println(elevatorFloor);
            setFloor(elevatorFloor);
        }
        System.out.println("ARRIVED");
    }

    @Override
    public void goDown(int target){
        int elevatorFloor = this.floor;
        System.out.println(elevatorFloor);
        
        while (elevatorFloor > target) {
            elevatorFloor --;
            System.out.println(elevatorFloor);
            setFloor(elevatorFloor);
        }
        System.out.println("ARRIVED");
    }
    
    
}
