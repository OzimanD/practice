package Sergey.OOP.task20;
//испорт библиотеки массов далее
import java.util.ArrayList;
//создается класс далее
public class Main implements StudInter{
    //создаем маин, котороый запускает программу далее
    public static void main(String[] args) {
        //создаем объект arr_students с типом данных Students[] и инициализируем его далее
        Students[] arr_students = {
                new Students("Familia1", "PCO", 2000, 100, 29, 45),
                new Students("Familia2", "EBT", 2002, 14, 21, 46),
                new Students("Familia3", "PCO-2", 2001, 60, 94, 38),
                new Students("Familia4", "EBT-2", 1998, 40, 96, 43),
                new Students("Familia5", "PCO", 1999, 68, 95, 78)
        };
        //создаем ссылку для вызовов методов исключительно из интерфейса StudInter
        //делаем это для возможности вызова переопределенных методов StudInter далее
        StudInter main = new Main();
        //выводим значение i_kolvo из переопределенного метода интерфейса i_kolvo
        //передав параметры arr_students далее
        System.out.println(main.i_kolvo(arr_students));
        //выводим значение al_st_ln из переопределенного метода интерфейса al_ln
        //передав параметры arr_students далее
        System.out.println(main.al_ln(arr_students));
    }

    //создаем переопределенный метод (@Override)
    @Override
    //создался метод, где public - модификатор доступа, который доступен всем
    //int - тип данных, i_kolvo - имя метода, (Students[] students) - параметры, которые передаем далее
    public int i_kolvo(Students[] students) {
        //создаем переменную с типом int и инициализируем ее далее
        int i_kolvo = 0;
        //создаем цикл фор далее
        for (int i = 0; i < students.length; i++) {
            //создаем условие иф, где выбираем значения в поле интерфейса matesha,
            //которое больше или равно 95 далее
            if(students[i].getMatesha() >= 95){
                //увеличиваем значение на 1 переменной i_kolvo далее
                ++i_kolvo;
            }

        }
        //возвращаем результат переменной i_kolvo далее
        return i_kolvo;
    }

    //создаем переопределенный метод (@Override)
    @Override
    //создался метод, где public - модификатор доступа, который доступен всем
    //ArrayList<String> - тип данных, al_ln - имя метода,
    //(Students[] students) - параметры, которые передаем далее
    public ArrayList<String> al_ln(Students[] student) {
        //создаем ArrayList, чтобы вернуть этот объект далее
        //al_st_ln - динамический массив
        ArrayList<String> al_st_ln = new ArrayList<>();
        //создаем цикл далее
            for (int i = 0; i < student.length; i++) {
                //создаем условие иф, где выбираем значения в поле интерфейса matesha,
                //которое больше или равно 95 далее
                if(student[i].getMatesha() >= 95){
                    //добавляем в переменную al_st_ln значение поля интерфейса lastname далее
                    al_st_ln.add(student[i].getLastname());
                }
            }
        //возвращаем результат переменной al_st_ln далее
            return al_st_ln;
    }
}