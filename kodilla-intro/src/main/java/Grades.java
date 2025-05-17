public class Grades {
   private int [] grades;
   private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value){
        if(this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade(){
        return this.grades[this.size];
    }

    public int avgGrade(){
        int sum = 0;
        if(this.size < 10){
            sum = sum + this.grades[this.size];
        }
        return sum / size;
    }
}
