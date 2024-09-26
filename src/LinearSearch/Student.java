package LinearSearch;

import com.sun.org.apache.xml.internal.security.c14n.helper.AttrCompare;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another) {
//        if(this.score < another.score)
//            return -1;
//        else if(this.score == another.score)
//            return 0;
//        return 1;

        //return this.score - another.score;
        return another.score - this.score;
    }

    //the default equals only compare address
    @Override
    public boolean equals(Object student) {

        //if they both have the same address
        if (this == student)
            return true;

        if (student == null)
            return false;

        if (this.getClass() != student.getClass())
            return false;

        Student another = (Student) student;
        return this.name.toLowerCase().equals(another.name.toLowerCase());
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }
}
