public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat +4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat +4;
        paper = paper + 4;
        dog = dog - 3.5 ;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var vesA = 78.2;
        var vesB = 82.7;
        var sum = vesA + vesB;
        var raz = vesB - vesA;
        System.out.println("Вес первого боксёра: " + vesA + " кг");
        System.out.println("Вес второго боксёра: " + vesB + " кг");
        System.out.println("Общий вес двух бойцов: " + sum + " кг");
        System.out.println("Разница между весами бойцов: " + raz + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var vesA = 78.2;
        var vesB = 82.7;
        var raz = vesB - vesA;
        var ost = vesB % vesA;
        System.out.println("1-й способ. Разница между весами бойцов: " + raz + " кг");
        System.out.println("2-й способ. Разница между весами бойцов: " + ost + " кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var obsh = 80;
        var vrem = 8;
        var sotr = obsh / vrem;
        System.out.println("Пример 1. Всего работников в компании — " + sotr + " человек");
        var sotrNew = sotr + 94;
        var obshNew = sotrNew * vrem;
        System.out.println("Пример 2. Если в компании работает " + sotrNew + " человек(а), то всего " + obshNew + " часа(ов) работы может быть поделено между сотрудниками");

    }
}