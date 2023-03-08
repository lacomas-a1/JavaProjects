public class MountainBike extends ClassBicycle {
    //the Mountainbike subclass has one field
    public int seatHeight;

    //the mountainbike has one constractor.
    public MountainBike(int StartHeight, int StartCadence, int StartGear, int StartSpeed){
        super(StartCadence, StartGear, StartSpeed);
        seatHeight=StartHeight;
    }

    //the MountainBike subclass has One Method.
    public void seatHeight(int newValue){
        seatHeight=newValue;
    }
      
}
//its a subclass of classBicycle
