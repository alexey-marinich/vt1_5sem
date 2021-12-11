import Task1.FirstTask;
import Task12.Book;
import Task15.Comparators;
import Task2.SecondTask;
import Task3.ThirdTask;
import Task4.FourthTask;
import Task5.FifthTask;
import Task6.SixthTask;
import Task7.SeventhTask;
import Task8.EighthTask;
import Task9.Ball;
import Task9.Basket;
import Task14.ClassComparable;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        System.out.println("\nПервое задание:");
        FirstTask firstTask = new FirstTask();
        firstTask.firstTask(5,25);

        System.out.println("\nВторое задание:");
        SecondTask secondTask = new SecondTask();
        secondTask.secondTask(1,11);
        secondTask.secondTask(2,1);

        System.out.println("\nТретье задание:");
        ThirdTask thirdTask = new ThirdTask();
        thirdTask.thirdTask(0, 1, 0.05);

        System.out.println("\nЧетвертое задание:");
        int[] fourthArr  = {2, 5, 7, 8, 13, 16, 27, 29, 83, 123};
        FourthTask fourthTask = new FourthTask();
        fourthTask.fourthTask(fourthArr);

        System.out.println("\nПятое задание:");
        int[] fifthArr  = {14, 3, 13, 6, 27, 54, 43, 120};
        FifthTask fifthTask = new FifthTask();
        fifthTask.fifthTask(fifthArr);

        System.out.println("\nШестое задание:");
        double[] sixthArr = {1, 2, 3, 4, 5};
        SixthTask sixthTask = new SixthTask();
        sixthTask.sixthTask(sixthArr);

        System.out.println("\nСедьмое задание:");
        double[] seventhArr = {15, 6, 85, 12, 64, 63, 13, 8, 3};
        SeventhTask seventhTask = new SeventhTask();
        seventhTask.seventhTask(seventhArr);

        System.out.println("\nВосьмое задание:");
        double[] firstEighthArr = {2, 5, 12, 34, 67, 100};
        double[] secondEighthArr = {1, 3, 15, 36, 63, 66};
        EighthTask eighthTask = new EighthTask();
        eighthTask.eighthTask(firstEighthArr, secondEighthArr);

        System.out.println("\nДевятое задание:");
        Basket basket = new Basket();
        String colorArr[] = {"blue", "Blue", "Green", "green", "Red", "red", "Yellow", "yellow", "Cyan", "cyan", "White", "white"};
        for (int i = 0; i < 20; i++){
            int tmpClrRdm = (int) (Math.random()*colorArr.length);
            int tmpWeight = (int) (Math.random()*50);
            Ball tmpBall = new Ball(colorArr[tmpClrRdm], tmpWeight);
            basket.addBall(tmpBall);
            System.out.printf("Мяч, цвета: %s и веса: %d добавлен в корзину\n", colorArr[tmpClrRdm], tmpWeight);
        }
        System.out.println("Количество синих мячей в корзине: " + basket.getCountBlueBalls());
        System.out.println("Вес мячей в корзине: " + basket.getWeight());


        System.out.println("\nЧетырнадцатое задание:");
        ClassComparable classComparable = new ClassComparable();
        classComparable.classComparable();

        System.out.println("Простите, что так поздно. Цветы вам: @>‑‑>‑‑ @>‑‑>‑‑ @>‑‑>‑‑");
    }
}
