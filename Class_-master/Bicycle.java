public class Bicycle {
    int cadence=0;
    int speed =0;
    int gear=1;

    void changeCadence(int newValue){
        cadence=newValue;
    }
    void changeGear(int newValue){
        gear=newValue;
    }
    void speedUp(int Increment){
        speed = speed + Increment;
    }
    void applyBrakes (int decrement){
        speed = speed - decrement;
    }
    void printStates(){
        System.out.println("Cadence: " + cadence + " Speed: " +speed + " Gear: "+ gear);
    }
}

// The fields cadence, speed, and gear
// represent the object's state, and the methods (changeCadence, changeGear, speedUp etc.) define
// its interaction with the outside world.
//its main class is bicycles