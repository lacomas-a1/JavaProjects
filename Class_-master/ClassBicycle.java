public class ClassBicycle {
    //the bicycle has 3 fields
    public int Cadence;
    public int Gear;
    public int Speed;
    // The Bicycle class has one constructor
    public ClassBicycle(int StartCadence, int StartSpeed, int StartGear){
        Gear =StartGear;
        Cadence=StartCadence;
        Speed=StartSpeed;
    }
    //The bicycle class has four Methods.
    public void setCadence(int newValue){
        Cadence=newValue;
    }
    public void setGear(int newValue){
        Gear=newValue;
    }
    public void applyBrakes(int decrement){
        Speed-=decrement;
    }
    public void speedUp(int increment){
        Speed += increment;
    }

}
