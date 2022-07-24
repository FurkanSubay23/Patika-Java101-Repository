package ClassInstance;

public class Course {

    Teacher teacher;
    String name;
    String code;
    int note;
    int sozluNote;

    Course(String name, String code){
        this.name = name;
        this.code = code;
        this.note = note;
        this.sozluNote = sozluNote;
    }

    void addTeacher(Teacher t1){
        if (this.code.equals(t1.branch)){
            this.teacher = t1;
            printCourseTacher();
        }
        else {
            System.out.println(t1.name +" Hocasi ile dersin branchi uyusmuyor !");
        }

    }

    void printCourseTacher(){
        System.out.println(teacher.name+ " isimli hoca ile "+ this.name+ " Dersine baslayacagiz");
    }



}
