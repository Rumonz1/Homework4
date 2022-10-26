public class Main {
    public static void main(String[] args) {
        //Задание 1
        int userAge = 17;
        if (userAge >=18) {
            System.out.println("Поздравляем! Вы уже совершеннолетний!");
        }else {
            System.out.println("Вы ещё не достигли совершеннолетнего возраста, пожалуйста подождите немного!");
        }
        //Задание 2
        int childAge = 17;
        if (childAge >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        } else if (childAge>=18) {
            System.out.println("Человек закончил школу и может отправляться в университет!");
        } else if (childAge>=7) {
            System.out.println("Ребёнок ходит в школу!");
        } else if (childAge<7 && childAge>0) {
            System.out.println("Ребёнок ещё не вырос, чтобы пойти в школу!");
        }
        //Задание 3
        int trainCapacity = 102;
        int seat = 60;
        int standPlace =42;
        if(seat < 60 && standPlace < 42){
            System.out.println("В вагоне остались стоячие и сидячие места!");
        } else if (seat < 60 && standPlace == 42) {
            System.out.println("В вагоне остались только сидячие места!");
        } else if (seat==60&&standPlace<42) {
            System.out.println("В вагоне остались только стоячие места!");
        } else if (seat == 60 && standPlace == 42) {
            System.out.println("В вагоне не осталось мест");
        }else {System.out.println("Невозможно разместить больше людей в вагоне");}
    }
}