/**
        * Created by opilane on 19.10.2016.
        */
public class Time {
    public static void main(String args[]) {
        int hour, minute, second,  secondsToMidnight;
        double secondsSince, daypercentage;
        hour = 15;
        minute = 50;
        second = 48;
        System.out.println("Time is " + hour + ":" + minute + ":" + second + ".");
        secondsSince = hour * 60 * 60 + minute * 60 + second;
        System.out.print("Seconds since midnight " + secondsSince + "." + "\n");
        secondsToMidnight = (24 - 15) * 60 * 60 + (60 - 50) * 60 + (60 - 48);
        System.out.println("Seconds to midnight " + secondsToMidnight + ".");
        daypercentage = (secondsSince/86400)*100;
        System.out.print("Percent of a day that has passed is ");
        System.out.printf("%.3f",(float)daypercentage);
        System.out.println("\n"+"Started at 15.50 and finished doing chaper 2 excercises at 17.05."+"\n");
    }
}