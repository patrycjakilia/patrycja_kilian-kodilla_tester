public class SimpleArray {
    public static void main (String[] args){
        int [] friendsAge = new int [5];
        friendsAge[0] = 22;
        friendsAge[1] = 23;
        friendsAge[2] = 25;
        friendsAge[3] = 40;
        friendsAge[4] = 50;

        String [] name = new String[] {"Patrycja", "Monika", "Marek", "Dawid", "Mateusz"};

        String myName = name[3];
        int myAge = friendsAge[3];

        System.out.println("3 indeks tablicy name[] to: " + myName + "\n3 indekst tablicy friendsAge[] to: " + myAge);

        int numberOfElements = friendsAge.length;
        int numberofElements2 = name.length;

        System.out.println("Liczba elementow tablicy friendsAge[] to: " + numberOfElements);
        System.out.println("Liczba elementow tablicy name[] to: " + numberofElements2);
    }
}
