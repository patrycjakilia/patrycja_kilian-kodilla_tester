public class User {

    private int age;
    private String name;

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

 /*   public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User(15, "Mark");
        users[1] = new User(20, "John");
        users[2] = new User(25, "Maria");
        users[3] = new User(30, "Jack");
        users[4] = new User(35, "Monica");


       double average =  avgAge(users);

        for(int i = 0; i< users.length; i++){

            if(users[i].getAge() < average){
                System.out.println(users[i].getName());
            }

        }
    }
*/
    public static double avgAge(User[] user){
        int sum = 0;

        for(int i =0; i<user.length; i++){
            sum += user[i].getAge();
        }

        return sum / user.length;
    }

}
