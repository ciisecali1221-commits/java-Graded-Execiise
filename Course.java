public class Course {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[4];
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] newStudents = new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public class Main {
        public static void main(String[] args) {

            Course course = new Course("Java");

            course.addStudent("Ali");
            course.addStudent("Ahmed");
            course.addStudent("Abdi");

            System.out.println("Course: " + course.getCourseName());
            System.out.println("Number of Students: "
                    + course.getNumberOfStudents());

            course.dropStudent("Ahmed");

            System.out.println("After dropping Ahmed: "
                    + course.getNumberOfStudents());
        }
    }
}