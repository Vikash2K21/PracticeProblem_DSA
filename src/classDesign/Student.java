package classDesign;

public class Student {
    int rollNo;
    String name;
    int[] marks;

    public Student(int rollNo, String name, int[] marks){
        this.rollNo = rollNo;
        this.name = name;
        if(marks.length == 5){
            this.marks = marks;
        }else{
            this.marks = new int[5];
        }
    }
    public double calculateAverage(){
        int sum = 0;
        for(int i=0; i<marks.length; i++){
            sum += marks[i];
        }
        return sum / 5.0;
    }
    public char calculateGrade(){
        double avg = calculateAverage();
        if(avg >= 90)return 'A';
        else if(avg >= 75)return 'B';
        else if(avg >= 60)return 'C';
        else return 'D';
    }
    public void displayDetails(){
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Average Marks: "+calculateAverage());
        System.out.println("Grade: "+calculateGrade());
    }

    public static void main(String[] args){
        int []marks ={87,92,82,98,90};
        Student s = new Student(102,"Shiloo",marks);
        s.displayDetails();
    }
}
