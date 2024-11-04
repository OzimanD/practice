package Mamontoboi.Task13;

public class Main implements MainInterface{
    public static void main(String[] args) {
        Player player0 = new Player("Robinson", 31, 150, 20);
        Player player1 = new Player("Smith", 28, 120, 15);
        Player player2 = new Player("Johnson", 24, 98, 12);
        Player player3 = new Player("Williams", 30, 140, 18);
        Player player4 = new Player("Brown", 22, 76, 9);
        Player player5 = new Player("Jones", 27, 115, 14);
        Player player6 = new Player("Miller", 25, 88, 11);
        Player player7 = new Player("Davis", 29, 130, 16);
        Player player8 = new Player("Garcia", 23, 60, 8);
        Player player9 = new Player("Martinez", 26, 100, 13);

        Player[] players = {player0, player1, player2, player3, player4, player5, player6, player7, player8, player9};

        MainInterface Object = new Main();
        Object.averageAge(players);
        Object.olderThan25(players);
    }

    @Override
    public void averageAge(Player[] players){
        int sumAge = 0;
        for (int i = 0; i < players.length; i++) {
            sumAge += players[i].getAge();
        }
        double averageAge = (double) sumAge / players.length;
        System.out.println("The average age of all players is " + averageAge + ".");
    }

    public void olderThan25(Player[] players){
        for (int i = 0; i < players.length; i++) {
            if (players[i].getAge() > 25){
                System.out.println(players[i]);
            }
        }
    }



}
