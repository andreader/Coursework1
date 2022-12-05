package pro.sky.javacourse1.classes;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.createEmployee("Горбунов Игорь Матвеевич", 65415, 2);
        employeeBook.createEmployee("Глухова Елена Вадимовна", 85492, 1);
        employeeBook.createEmployee("Круглова Вера Максимовна", 66941, 1);
        employeeBook.createEmployee("Свешникова Мария Никитична", 77849, 4);
        employeeBook.createEmployee("Глухов Глеб Русланович", 88912, 3);
        employeeBook.createEmployee("Латышев Ярослав Артемович", 88124, 5);
        employeeBook.createEmployee("Александрова Вероника Марковна", 85325, 2);
        employeeBook.createEmployee("Тимофеева Василиса Матвеевна", 98212, 3);
        employeeBook.createEmployee("Григорьев Вячеслав Антонович", 66392, 5);
        employeeBook.createEmployee("Иванов Игорь Геннадьевич", 87323, 4);

    }

}
