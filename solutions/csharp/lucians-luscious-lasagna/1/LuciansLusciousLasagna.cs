using System.Net;

class Lasagna
{
    // TODO: define the 'ExpectedMinutesInOven()' method
    public static int totalTime =40;
    public int ExpectedMinutesInOven()
    {
        return totalTime;
    }

    // TODO: define the 'RemainingMinutesInOven()' method
    public int RemainingMinutesInOven(int ovenTime)
    {
        return totalTime - ovenTime;
    }

    // TODO: define the 'PreparationTimeInMinutes()' method
    public int PreparationTimeInMinutes(int layers)
    {
        return layers*2;
    }

    // TODO: define the 'ElapsedTimeInMinutes()' method
    public int ElapsedTimeInMinutes(int layers , int ovenTime)
    {
        return layers*2 + ovenTime;
    }
}
