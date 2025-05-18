public class Users {
    private String name;
    private double age;
    private double height;

    public Users(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public double getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }
}
