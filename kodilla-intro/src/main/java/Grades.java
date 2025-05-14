public class Grades {
    private int grades [];
    private int size;

    public Grades (){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int returnLastGrade(int value){

        if (this.size == 10) {
            System.out.println("W tablicy występuje 10 ocen ostatnia z nich to: ");
        }
        this.grades[this.size] = value;
        this.size++;

        return value;
    }


    public float  returnAvg(int value){

        if (this.size == 10) {
            System.out.println("W tablicy występuje 10 ocen ostatnia z nich średnia liczb to: ");
        }
        this.grades[this.size] = value;
        this.size++;

        return returnAvg( this.grades[10]);
    }
}
