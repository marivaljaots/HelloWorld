/**
 * Created by opilane on 19.10.2016.
 */
public class Date{
        public static void main(String args[]) {
            String day, month;
            int date, year;
            day = "Wednesday";
            month = "October";
            date = 19;
            year = 2016;
            System.out.print("Today is ");
            System.out.print(day + "," + date + " " + month + " , " + year + "."+"\n");
            System.out.print("American format: ");
            System.out.print(day + " " + month + " " + date + ", " + year+"."+"\n");
            System.out.print("European format: ");
            System.out.print(day + " " + date + " " + month + " " + year+ "."+"\n");

        }
}
