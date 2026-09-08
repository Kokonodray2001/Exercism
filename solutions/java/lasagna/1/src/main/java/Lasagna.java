public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutesAlreadyPassed){
        if(minutesAlreadyPassed >expectedMinutesInOven()) return 0;
        int minutesRemaning =  expectedMinutesInOven()-minutesAlreadyPassed;
        return minutesRemaning;
    }

    public int preparationTimeInMinutes( int numberOfLayers ){
        return 2*numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers , int minutesAlreadyPassed){
        int totalMinutesSpent = preparationTimeInMinutes(numberOfLayers) + minutesAlreadyPassed;
        return totalMinutesSpent;
    }
}