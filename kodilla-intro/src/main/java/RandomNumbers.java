import java.util.Random;

class RandomNumbers {

    Random rand = new Random();

    int highestNumber = 0;
    int lowestNumber = 0;

    public void generateNumber(){
        int sum = 0;

        for(int i = 0; sum < 500; i++){
            int generateNumber = rand.nextInt(31);
            sum += generateNumber;

            if(highestNumber < generateNumber){
                highestNumber = generateNumber;
            }

            if (lowestNumber > generateNumber){
                lowestNumber = generateNumber;
            }

            System.out.println(i + ": number: " + generateNumber + ", sum: " + sum);
        }

    }

    public int getHighestNumber(){
        return highestNumber;
    }

    public int getLowestNumber(){
        return lowestNumber;
    }

    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers();
        random.generateNumber();
        System.out.println(random.getHighestNumber());
        System.out.println(random.getLowestNumber());


    }
}
