package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
        //super(name, salary);
        //this.hireDate = LocalDate.now();
    }

    public LocalDate getDate() {
        return this.hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", hiredate: " + hireDate.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Manager m = (Manager) obj;
        if (this.hireDate.equals(m.hireDate)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Amanda", 200);
        System.out.println(m1);

        Manager m2 = new Manager("Amanda", 200);
        System.out.println(m2);

        System.out.println(m2.equals(m1));
    }
}
