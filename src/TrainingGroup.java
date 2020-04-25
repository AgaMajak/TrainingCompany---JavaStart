public class TrainingGroup {

    protected String subject;
    protected Teacher teacher;
    protected Student[] students = new Student[10];

    public TrainingGroup(String subject, Teacher teacher, Student[] students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
    }

    void showGroupInfo(){

    }
}

