package pro.sky.javacourse1.classes;

public class Medium {

    private static Employee[] employees = new Employee[10];

    public static int salaryIncrease(int percent) {

        int salary = 0;
        for (Employee employee : employees) {
            System.out.println("Employee's ID: " + employee.getId() + ". " + "Name: " + employee.getName() + ". " + "Department: " + employee.getDepartment() + ". ");
            System.out.println("Salary before increasing = " + employee.getSalary());
            salary = employee.getSalary() + percent * employee.getSalary() / 100;
            System.out.printf("Salary after increasing = %d %n", salary);
            employee.setSalary(salary);
        }
        System.out.printf("%n");
        return salary;
    }

    public static int getTotalDepartmentsAmount() {
        int result = Integer.MIN_VALUE;
        for (Employee employees : employees) {
            if (employees.getDepartment() > result) result = employees.getDepartment();
        }
        return result;
    }

    public static void printEmployeesOfTheDepartment(int department) {
        System.out.println("Employees of department № " + department);
        if (department < 1 || department > getTotalDepartmentsAmount()) {
            System.out.printf("Incorrect department number. Please, input number from 1 to %d. %n %n", getTotalDepartmentsAmount());
        } else {
            for (Employee employee : employees) {
                if (department == employee.getDepartment()) {
                    System.out.printf("Employee's ID: %d. Name: %s. Salary: %d. %n %n", employee.getId(), employee.getName(), employee.getSalary());
                }
            }
        }
    }

    public static int totalMonthSalaryOfTheDepartment(int department) {
        if (department < 1 || department > getTotalDepartmentsAmount()) {
            return 0;
        }
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null || department != employee.getDepartment()) {
                continue;
            } else sum += employee.getSalary();
        }
        return sum;
    }

    public static void printTotalMonthSalaryOfTheDepartment(int department) {
        int totalMonthSalaryOfTheDepartment = totalMonthSalaryOfTheDepartment(department);
        if (totalMonthSalaryOfTheDepartment == 0) {
            System.out.printf("Total month salary of department № %d. %n", department);
            System.out.printf("Incorrect department number. Please, input number from 1 to %d. %n %n", getTotalDepartmentsAmount());
        } else {
            System.out.printf("Total month salary of department № %d  = %d rubles. %n %n", department, totalMonthSalaryOfTheDepartment);
        }
    }

    public static Employee employeeWithMinSalaryOfTheDepartment(int department) {
        if (department < 1 || department > getTotalDepartmentsAmount()) {
            return null;
        }
        Employee result = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee == null || department != employee.getDepartment()) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static void printEmployeeWithMinSalaryOfTheDepartment(int department) {
        Employee employeeWithMinSalaryOfTheTeam = employeeWithMinSalaryOfTheDepartment(department);
        if (employeeWithMinSalaryOfTheTeam == null) {
            System.out.printf("Employee with minimum salary of department № %d. %n", department);
            System.out.printf("Incorrect department number. Please, input number from 1 to %d. %n %n", getTotalDepartmentsAmount());
        } else
            System.out.printf("Employee with minimum salary of department № %d: %s %n %n", employeeWithMinSalaryOfTheTeam.getDepartment(), employeeWithMinSalaryOfTheTeam);
    }

    public static Employee employeeWithMaxSalaryOfTheDepartment(int department) {
        if (department < 1 || department > getTotalDepartmentsAmount()) {
            return null;
        }
        Employee result = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee == null || department != employee.getDepartment()) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static void printEmployeeWithMaxSalaryOfTheDepartment(int department) {
        Employee employeeWithMaxSalaryOfTheTeam = employeeWithMaxSalaryOfTheDepartment(department);
        if (employeeWithMaxSalaryOfTheTeam == null) {
            System.out.printf("Employee with maximum salary of department № %d. %n", department);
            System.out.printf("Incorrect department number. Please, input number from 1 to %d. %n %n", getTotalDepartmentsAmount());
        } else
            System.out.printf("Employee with maximum salary of department № %d: %s %n %n", employeeWithMaxSalaryOfTheTeam.getDepartment(), employeeWithMaxSalaryOfTheTeam);
    }

    public static int averageMonthSalaryOfTheDepartment(int department) {
        if (department < 1 || department > getTotalDepartmentsAmount()) {
            return 0;
        }
        int membersAmount = 0;
        int average = 0;
        for (Employee employee : employees) {
            if (employee == null || department != employee.getDepartment()) {
                continue;
            } else membersAmount++;
        }
        average = totalMonthSalaryOfTheDepartment(department) / membersAmount;
        return average;
    }

    public static void printAverageMonthSalaryOfTheDepartment(int department) {
        int averageMonthSalaryOfTheDepartment = averageMonthSalaryOfTheDepartment(department);
        if (averageMonthSalaryOfTheDepartment == 0) {
            System.out.printf("Average salary of department № %d. %n", department);
            System.out.printf("Incorrect department number. Please, input number from 1 to %d. %n %n", getTotalDepartmentsAmount());
        } else {
            System.out.printf("Average salary of department № %d  = %d rubles. %n %n", department, averageMonthSalaryOfTheDepartment);
        }
    }


    public static int salaryIncreaseOfTheDepartment(int percent, int department) {
        if (department < 1 || department > getTotalDepartmentsAmount()) {
            return 0;
        }
        int salary = 0;
        for (Employee employee : employees) {
            if (employee == null || department != employee.getDepartment()) {
                continue;
            } else {
                salary = employee.getSalary() + percent * employee.getSalary() / 100;
                employee.setSalary(salary);
                System.out.printf("ID = %d. Salary after increasing = %d %n", employee.getId(), employee.getSalary());
            }
        }
        return salary;
    }

    public static void printSalaryIncreaseOfTheDepartment(int percent, int department) {
        System.out.printf("Increasing salary of department № %d on %d percent %n", department, percent);
        if (salaryIncreaseOfTheDepartment(percent, department) == 0) {
            System.out.printf("Incorrect department number. Please, input number from 1 to %d. %n %n", getTotalDepartmentsAmount());
        }
    }


    public static void employeesWithSalaryLessThan(int salaryToCompare) {
        System.out.printf("Employees with salary less, than %d rubles. %n", salaryToCompare);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryToCompare)
                System.out.println(
                        "Employee's ID: " + employee.getId() + ". " +
                                "Name: " + employee.getName() + "." +
                                "Salary: " + employee.getSalary() + ". ");
        }
        System.out.printf("%n");
    }

    public static void employeesWithSalaryEqualOrMoreThan(int salaryToCompare) {
        System.out.printf("Employees with salary equal or more, than %d rubles. %n", salaryToCompare);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salaryToCompare)
                System.out.println(
                        "Employee's ID: " + employee.getId() + ". " +
                                "Name: " + employee.getName() + "." +
                                "Salary: " + employee.getSalary() + ". ");
        }
        System.out.printf("%n");
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

        salaryIncrease(1);
        printEmployeesOfTheDepartment(1);
        printTotalMonthSalaryOfTheDepartment(1);
        printEmployeeWithMinSalaryOfTheDepartment(1);
        printEmployeeWithMaxSalaryOfTheDepartment(1);
        printAverageMonthSalaryOfTheDepartment(1);
        printSalaryIncreaseOfTheDepartment(0, 0);
        employeesWithSalaryLessThan(70000);
        employeesWithSalaryEqualOrMoreThan(66392);

    }
}

