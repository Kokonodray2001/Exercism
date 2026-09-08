using System.Net;

class Lasagna
{
    // TODO: define the 'ExpectedMinutesInOven()' method
    public static int totalTime =40;
    public int ExpectedMinutesInOven() => totalTime;
    

    // TODO: define the 'RemainingMinutesInOven()' method
    public int RemainingMinutesInOven(int ovenTime) => ExpectedMinutesInOven() - ovenTime;

    // TODO: define the 'PreparationTimeInMinutes()' method
    public int PreparationTimeInMinutes(int layers) => layers*2;
    

    // TODO: define the 'ElapsedTimeInMinutes()' method
    public int ElapsedTimeInMinutes(int layers , int ovenTime) =>PreparationTimeInMinutes(layers) + ovenTime;
    
}
