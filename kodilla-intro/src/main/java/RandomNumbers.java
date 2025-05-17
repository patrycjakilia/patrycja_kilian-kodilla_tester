import java.util.Random;

class RandomNumbers {

    Random rand = new Random();

    int highestNumber = Integer.MIN_VALUE;
    int lowestNumber = Integer.MAX_VALUE;

    public void generateNumber(){
        int sum = 0;

        for(int count = 0; sum < 5000; count++){
            int generateNumber = rand.nextInt(31);
            sum += generateNumber;

            if(highestNumber < generateNumber){
                highestNumber = generateNumber;
            }

            if (lowestNumber > generateNumber){
                lowestNumber = generateNumber;
            }

            System.out.println(count + ": number: " + generateNumber + ", sum: " + sum);
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
