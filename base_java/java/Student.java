public class Student {
    private final int roll;
    private final String name;
    private final String course;
    private final int m1,m2,m3;

    public Student(int roll, String name, String course, int m1, int m2, int m3) {
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int total(){
        return m1+m2+m3;
    }

    public int average(){
        return total() / 3;
    }

    public char grade(){
        int avg = average();
        if(avg >= 70)
            return 'A';
        else if (avg >=60)
            return 'B';
        else if( avg >= 50)
            return 'C';
        else if(avg >= 40)
            return 'D';
        return 'F';
    }
}
