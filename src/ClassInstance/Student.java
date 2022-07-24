package ClassInstance;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    double avarageMat;
    double avarageFizik;
    double avarageKimya;
    double avarageGenel;

    boolean isPass;
    String name;
    String stuNo;
    String classes;
    int not1;
    int not2;
    int not3;
    int sozluNot1;
    int sozluNot2;
    int sozluNot3;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;

    }

    void addBulkExamNote(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.not1 = not1;
        } else {
            System.out.println("Gecersiz not");
        }
        if (not2 >= 0 && not2 <= 100) {
            this.not2 = not2;
        } else {
            System.out.println("Gecersiz not");
        }
        if (not3 >= 0 && not3 <= 100) {
            this.not3 = not3;
        } else {
            System.out.println("Gecersiz not");
        }

        System.out.println(this.name+" isimli ogrencinin"+" Notlar toplami: " + (not1 + not2 + not3));
    }

    void addBulkExamSozluNote(int sozluNot1, int sozluNot2, int sozluNot3) {
        if (sozluNot1 >= 0 && sozluNot1 <= 100) {
            this.sozluNot1 = sozluNot1;
        } else {
            System.out.println("Gecersiz not");
        }
        if (sozluNot2 >= 0 && sozluNot2 <= 100) {
            this.sozluNot2 = sozluNot2;
        } else {
            System.out.println("Gecersiz not");
        }
        if (sozluNot3 >= 0 && sozluNot3 <= 100) {
            this.sozluNot3 = sozluNot3;
        } else {
            System.out.println("Gecersiz not");
        }

        System.out.println("Sozlu notlar toplami: " + (sozluNot1 + sozluNot2 + sozluNot3));
    }

    void avarage() {
        this.avarageMat = (this.not1 * 0.8) + (this.sozluNot1 * 0.2);       // Mat dersi için yazılmış olan notlar.
        this.avarageFizik = (this.not2 * 0.8) + (this.sozluNot2 * 0.2);     // Fizik dersi için yazılmış olan notlar.
        this.avarageKimya = (this.not3 * 0.8) + (this.sozluNot3 * 0.2);      // Kimya dersi için yazılmış olan notlar.
        this.avarageGenel = (this.avarageFizik + this.avarageKimya + this.avarageMat) / 3.0;
        System.out.println(this.name+"  isimli ogrencinin genel ortalamasi: "+this.avarageGenel);
    }

    void pass(){
        if (this.avarageGenel >=50){
            System.out.println("Sinifi gectiniz!!!!");
            this.isPass = true;
        }
        else {
            System.out.println("Sinifta kaldiniz");
            this.isPass = false;
        }
    }


}
