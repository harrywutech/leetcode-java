package LinearSearch;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
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
}
