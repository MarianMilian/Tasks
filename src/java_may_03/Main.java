package java_may_03;

import java_may_03.sport.F1;

import java.util.Scanner;

public class Main {
public static void selectingGar(){


    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter chose car Sport/Regular");
    if (sc.nextLine().equals("Sport")){
        System.out.println("Please enter chose car F1/Rally");
        if (sc.nextLine().equals("F1")){

            F1 f1 = new F1(0111,"Red",320.5,"RedBull","Schumacher");
            System.out.println(f1);

        }
    }

}

    public static void main (String []args){
        selectingGar();

    }

}
//    Замовнику потрібно програму для реєстрації авто.
//        Види авто які можна зареєструвати:
//        седан
//        купе
//        мінівен
//        бус(для перевезення вантажу)
//        TIR
//        F1
//        Rally
//        параметри по яких повинi реєструватися авто:
//        vin номер (cars)
//        колір (cars)
//        розгін (легк)
//        швидкість (cars)
//        об'єм баку (звич)
//        кількість місць (легк)
//        реклама спонсора (спорт)
//        розхід (звич)
//        максимальне навантаження (вант)
//        вартість 1км перевезення (вант)
//        покриття дороги (rally)
//        ім'я пілота (f1)
//        розприділити по класах ці параметри з можливістю додавати нові якщо треба буде.
//
//        Зробити метод який вираховує і повертає кількість затраченого пального на певну відстань, яку можна ввести вручну.