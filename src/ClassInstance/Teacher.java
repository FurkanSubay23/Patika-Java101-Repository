package ClassInstance;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void printTeacher(){
        System.out.println("Ogretmen ismi: "+this.name);
        System.out.println("Ogretmen tel no: "+this.mpno);
        System.out.println("Ogretmen branchi: "+this.branch);
    }




}
