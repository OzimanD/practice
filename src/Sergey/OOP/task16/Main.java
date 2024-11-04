package Sergey.OOP.task16;
//импортировали библиотеку массивов далее
import java.util.ArrayList;
//создали класс далее
public class Main implements HokeistInter {
    //создали метов маин для запуска программы далее
    public static void main(String[] args) {
        //объявили переменные и внесли в них значения далее.
        //Hokeist[] - тип данных, arr_hok - имя переменной
        Hokeist[] arr_hok = {new Hokeist("Familia", 19, 3, 5),
                new Hokeist("Familia2", 34, 4, 0),
                new Hokeist("Familia3", 26, 12, 7),
                new Hokeist("Familia4", 20, 7, 1),
                new Hokeist("Familia5", 22, 3, 8),};
//создаем ссылку для вызовов методов исключительно из интерфейса HokeistInter далее
        //делаем это для возможности вызова переопределенных методов HokeistInter
        HokeistInter main = new Main();
//вызываем отображение данных далее
        System.out.println(main.viewRes(arr_hok));
        System.out.println(main.arr_hokip(arr_hok));
    }

    //имплементированный (переопределяем - @Override) метод интерфейса HokeistInter далее
    @Override
    //создался метод, где public - модификатор доступа, который доступен всем
    //double - тип данных метода, arr_hokip - имя метода,
    //(Hokeist[] - тип данных, hokeist - имя массива) - параметры
    public double arr_hokip(Hokeist[] hokeist) {
        //создаем переменную и вносим в нее значение далее
        double d_avgAge = 0;
        //создаем цикл фор далее
        for (int i = 0; i < hokeist.length; i++) {
            //вычисляем сумму возвраста далее
            d_avgAge += hokeist[i].getAge();
        }
        //возвращаем среднее значение (сумму делим на кол-во индексов массива) далее
        return d_avgAge/hokeist.length;

    }

    //имплементированный (переопределяем - @Override) метод интерфейса HokeistInter далее
    @Override
    //создался метод, где public - модификатор доступа, который доступен всем
    //ArrayList<Hokeist> - тип данных метода, viewRes - имя метода,
    //(Hokeist[] - тип данных, hokeist - имя массива) - параметры
    public ArrayList<Hokeist> viewRes(Hokeist[] hokeists) {
        //создаем ArrayList, чтобы вернуть этот объект далее
        //arrl_hokiRes - динамический массив
        ArrayList<Hokeist> arrl_hokiRes = new ArrayList<>();
        //создаем цикл фор далее
        for (int i = 0; i < hokeists.length; i++) {
            //создаем условие (иф), где проверяем возвраст меньше 25 далее
            if(hokeists[i].getAge() < 25){
                //массив пустой и мы его заполняем отфильтрованными параметрами далее
                arrl_hokiRes.add(hokeists[i]);
            }
        }
        //возвращаем результат отфильтрованных значений далее
        return arrl_hokiRes;
    }
}

