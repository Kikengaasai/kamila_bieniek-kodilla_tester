public class Grades {
    private int[] grades;
    public int size;

    public Grades() {
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

    public int last() {
        if (this.size == 0) {
            return 0;
        }
        return grades[this.size - 1];
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + grades[i];
        }if (this.size==0){
            return 0;
        }
        return sum / this.size;
    }

}