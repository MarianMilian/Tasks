package java_may_06._2;

public class Main {
    Staff[] staff = {
            new Staff("Ivan", "Petrov", 10, "boss"),
            new Staff("Ivan1", "Petrov", 10, "boss"),
            new Staff("Ivan2", "Petrov", 10, "boss"),
            new Staff("Ivan3", "Petrov", 10, "boss"),
            new Staff("Ivan4", "Petrov", 10, "boss"),
    };
    Department[] departments = {
            new Department("first", staff),
            new Department("first", staff)
    };
    Company company = new Company("MyCompany", departments);

}
//2. Компанія.
//        назва
//        Департаменти []
//          назва
//          Працівників []
//           ім'я
//           прізвище
//           стаж
//           посаду
//        3. Зявка
//         номер
//         дату
//         Тип(enum?)
//        Клієнат
//        прізвище
//        ім'я
//        дату народження
//        Паспорт
//        серію
//        номер
//        ким виданий