package ALina.OOP.page120_1;

import java.util.ArrayList;
//інтерфейс зберігає методи, котрі ми зобовєʼязані перевизначати

public interface Interface {
    ArrayList<Engeneers> ageOver60F (Engeneers[] engeneers);
    ArrayList<Engeneers> ageOver60M (Engeneers[] engeneers);



}
// ArrayList<Engeneers>  - це тип даних для методу
// ageOver60F  - імʼя методу
// (Engeneers[] engeneers) - це параметри методу (масив обʼєктів)