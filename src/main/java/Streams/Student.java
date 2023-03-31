package Streams;

public class Student {
        String name;
        int id;
        double score;
        Gender gender;
        static int ID = 11;
        Student(String name, double score, Gender gender){
            this.name = name;
            this.id = ID;
            this.score = score;
            this.gender = gender;
            ID += 1;
        }
        public String toString(){
            return "Student Name: "+ name+"\nStudent ID: "+id+"\nScore: "+score+"\n";
        }

    public double getScore() {
        return score;
    }
}
