public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        int yearDivision4 = year % 4;
        int yearDivision100 = year % 100;
        int yearDivision400 = year % 400;

        if (yearDivision4==0 && yearDivision100!=0 || yearDivision4==0 && yearDivision100==0 && yearDivision400==0){
            System.out.println("rok przestęny");
        } else {
            System.out.println("rok zwykły");

        }


    }
}
