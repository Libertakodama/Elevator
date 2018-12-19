public interface Behavior {
    
    void request(int target, int elevatorFloor);
    
	void goUp(int target);
	
	void goDown(int target);

}