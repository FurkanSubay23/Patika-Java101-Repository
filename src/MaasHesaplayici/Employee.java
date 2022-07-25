package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void printEmployee() {
        System.out.println("New Employee!!");
        System.out.println("Elemanin ismi: " + this.name);
        System.out.println("Elemanin normal maasi: " + this.salary);
        System.out.println("Elemanin haftalik calisma saati: " + this.workHours);
        System.out.println("Elemanin ise giris senesi: " + this.hireYear);
        System.out.println("Elemanin vergisi: " + tax());
        System.out.println("Elemanin bonuslari: " + bonus());
        System.out.println("Elemanin yillik maas artisi: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + toplam());
        System.out.println("\tToplam maas: " + (this.salary + toplam()));

    }

    int toplam() {
        int toplam = raiseSalary() + bonus() - tax();
        return toplam;
    }

    int tax() {                           //Vergi methodu!
        int tax = 0;
        if (this.salary < 1000) {
            return 0;
        }
        tax = (int) (this.salary * 0.03);
        return tax;
    }

    int bonus() {
        int workHours = 0;
        if (this.workHours > 40) {
            workHours = this.workHours - 40;
            return workHours * 120;
        }
        return 0;
    }

    int raiseSalary() {
        int raise;
        if ((2021 - this.hireYear) < 10) {
            raise = (int) (this.salary * 0.05);
            return raise;
        } else if (((2021 - this.hireYear) < 20) && ((2021 - this.hireYear > 9))) {
            raise = (int) (this.salary * 0.1);
            return (int) raise;
        } else if ((2021 - this.hireYear) > 19) {
            raise = (int) (this.salary * 0.15);
            return raise;
        }
        return (int) this.salary;
    }

}
