package Sergey.OOP.task16;
//импортировали библиотеку массивов далее
import java.util.ArrayList;
//создали интерфейс далее
public interface HokeistInter{
    //создали метод в который передаем массив данных
    //double - тип данных, arr_hokip - имя метода, Hokeist[] hokeist -параметры
    double arr_hokip(Hokeist[] hokeist);
    //создаем метод далее. "<>" - называется дженерик.
    //ArrayList<Hokeist>- тип данных, viewRes - имя метода, Hokeist[] hokeists - параметры
    ArrayList<Hokeist> viewRes(Hokeist[] hokeists);
}
