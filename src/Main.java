//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание №1
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        //Задание №2
        byte temperatur = 4;
        if (temperatur < 5) {
            System.out.println("На улице " + temperatur + " градуса, нужно надеть шапку");
        }
        if (temperatur > 5) {
            System.out.println("На улице " + temperatur + " градусов, можно идти без шапки");
        }
        //Задание №3
        short speed = 59;
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        //Задание №4
        byte age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете");
        } if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу");
        }
        //Задание №5
        byte age3 = 15;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        } if (age3 > 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении");
        }if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //Задание №6
        byte passenger = 10;
        byte carriage = 102;
        byte seat = 60;
        int standingRoom = carriage - seat;
        if (passenger < seat){
            System.out.println("В вагоне " + passenger + " пассажиров. Есть сидячие места");
        }if (passenger >= seat && passenger < carriage){
            System.out.println("В вагоне " + passenger + " пассажиров. Есть стоячие места");
        }
        if (passenger >= carriage){
            System.out.println("В вагоне " + passenger + " пассажиров. Нет места");
        }
        //Задание №7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one >three){
            System.out.println("one самое большое");
        }if (two > one && two > three){
            System.out.println("two самое большое");
        }if (three > one && three > two){
            System.out.println("three самое большое");
        }
    }
}