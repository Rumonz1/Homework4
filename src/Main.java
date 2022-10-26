public class Main {
    public static void main(String[] args) {
        //Задание 1
        int userAge = 17;
        if (userAge >=18) {
            System.out.println("Поздравляем! Вы уже совершеннолетний!");
        }
        if (userAge<18) {
            System.out.println("Вы ещё не достигли совершеннолетнего возраста, пожалуйста подождите немного!");
        }
        //Задание 2
        int childAge = 17;
        if (childAge >= 7 && childAge < 18){
            System.out.println("Ребёнок уже ходит в школу!");}
        if (childAge >= 18 && childAge <24){
            System.out.println("Человек уже закончил школу и может отправляться в университет!");}
        if (childAge >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу!");}
        if (childAge < 7){
            System.out.println("Ребёнок ещё не ходит в школу!");
        }
        //Задание 3
        int trainCapacity = 102;
        int seat = 60;
        int standPlace = 42;
        if(seat < 60 && standPlace < 42){
            System.out.println("В вагоне остались стоячие и сидячие места!");}
        if(seat == 60 && standPlace == 42){
            System.out.println("В вагоне не осталось мест");
        }
        if(seat < 60 && standPlace == 42){
            System.out.println("В вагоне остались только сидячие места!");
        }
        if(seat==60&&standPlace<42){
            System.out.println("В вагоне остались только стоячие места!");
        }
        if(seat>60&&standPlace>60){
            System.out.println("Невозможно разместить больше людей в вагоне");
        }


    }
}