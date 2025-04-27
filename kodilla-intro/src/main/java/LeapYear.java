public class LeapYear {
    public static void main(String[] args) {
        int year = 1920;
      boolean result =  LeapOrNotLeapYear(year);

        System.out.println(result);
    }

    private static boolean LeapOrNotLeapYear(int a){
        if (a%4 == 0 && a%100 == 0 && a%400 == 0){
            return true;
        } else if(a%4 == 0 && a%100 >0){
            return true;
        } else {
            return false;
        }
    }
}
