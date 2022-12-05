package pro.sky.javacourse1.classes;

public class Easy {

    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("");
    }

    public static int totalMonthSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.print("Total month salary = ");
        System.out.print(sum);
        System.out.println(" rubles.");
        return sum;
    }

    public static Employee employeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.print("Employee with min salary: ");
        System.out.println(result);
        return result;
    }

    public static Employee employeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.print("Employee with max salary: ");
        System.out.println(result);
        return result;
    }

    public static int averageMonthSalary() {
        int membersAmount = 0;
        int average = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                membersAmount = employee.getId();
                sum += employee.getSalary();
            }
        }
        average = sum/membersAmount;
        System.out.print("Average month salary: ");
        System.out.print(average);
        System.out.println(" rubles.");
        return average;
    }

    public static void printAllNames() {
        System.out.println("Employees full names: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public static void main(String[] args) {

        employees = new Employee[]{
                new Employee("Горбунов Игорь Матвеевич", 65415, 2),
                new Employee("Глухова Елена Вадимовна", 85492, 1),
                new Employee("Круглова Вера Максимовна", 66941, 1),
                new Employee("Свешникова Мария Никитична", 77849, 4),
                new Employee("Глухов Глеб Русланович", 88912, 3),
                new Employee("Латышев Ярослав Артемович", 88124, 5),
                new Employee("Александрова Вероника Марковна", 85325, 2),
                new Employee("Тимофеева Василиса Матвеевна", 98212, 3),
                new Employee("Григорьев Вячеслав Антонович", 66392, 5),
                new Employee("Иванов Игорь Геннадьевич", 87323, 4)};

        printEmployees();

        totalMonthSalary();

        employeeWithMinSalary();

        employeeWithMaxSalary();

        averageMonthSalary();

        printAllNames();

    }
}

