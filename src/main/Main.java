package main;

import com.chinasoftware.inherit.animal.Cat;
import com.chinasoftware.inherit.animal.Dog;
import com.chinasoftware.inherit.monkey.Monkey;
import com.chinasoftware.inherit.monkey.People;
import com.chinasoftware.inherit.rectangle.Cuboid;
import com.chinasoftware.inherit.rectangle.Rectangle;
import com.chinasoftware.inherit.shape.Triangle;

import java.text.ParseException;

/**
 * @author DX
 */
public class Main {

    public static void main(String[] args) throws ParseException {


//        System.out.println("Hello World!");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(str+"\n"+main.ReverseWord.reserve(str));
//        System.out.println(str.equals(main.ReverseWord.reserve(str)));
//        main.ReverseWord.seekNumberOfTracts(100000);
//        int[] guess={1,2,3};
//        int[] answer={1,3,3};
//        System.out.println(main.Solution.game(guess,answer));
//        main.Solution.calculateMi();
//        String com = "RRU";
//        int [][] obs =new int[3][2];
//        int x=3,y=2;
//        boolean b =main.Solution.robot(com,obs,x,y);
//        System.out.println(b);
//        main.MazePathFinding.createAMaze(10,10);
//        main.MazePathFinding.selectDirection();
//        main.Solution.atm();
//        main.Solution.tellLogin();

//        main.Solution.makeRandomString();
        //main.Solution.atm();

//        int [] i = {1,5,4,6,7,9,1,3};
//        int [] j = {1,1,3,4,5,6,7,9};
//        int [] k = {666,198,256,131,396,100,818,947,346,365,767,565,699,996};

//        main.Sort.selectionSort(i);
//
//
//        for (int a:i){
//            System.out.print(a+" ");
//        }
//        main.Sort.monkeySort(i);

//        System.out.println(main.Sort.order(i,i.length));
//        System.out.println(main.Sort.order(j,j.length));
//        System.out.println(main.Sort.order(k,k.length));

//        main.Sort. monkeySort(k);
//        k = new int[]{666, 198, 256, 131, 396, 100, 818, 947, 346};
//        main.Sort.monkeySort(k);
//        k = new int[]{666, 198, 256, 131, 396, 100, 818, 947, 346};
//        main.Sort.bubbleSort(k);
//        k = new int[]{666, 198, 256, 131, 396, 100, 818, 947, 346};
//        main.Sort.selectSort(k);

//        System.out.println(main.Solution.sum(100));
//        //0,1,1,2,3,5,8,13
//        System.out.println(main.Solution.fibonacci(12));
//        main.PerpetualCalendar.perpetualCalendar(2000,2);
//        CinemaTicketingSystem.startSys();

//        CinemaSystem cinemaSystem = new CinemaSystem();
//        cinemaSystem.startMenu();

        Dog dog =new Dog("小黄","29","yellow");
         dog.eat();
         dog.playGame();

        Cat cat = new Cat("小黑","4","black");
        cat.eat();
        cat.playGame();

        Monkey monkey = new Monkey("猴子");
        People people = new People("人类");
        monkey.speak();
        people.speak();
        people.think();

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(12.2d);
        rectangle.setLength(13.3d);
        System.out.println(rectangle.getArea());

        Cuboid cuboid = new Cuboid();
        cuboid.setWidth(12.2d);
        cuboid.setLength(13.3d);
        cuboid.setHeight(10d);
        System.out.println(cuboid.getArea()+" m^2");
        System.out.println(cuboid.getVolume()+" m^3");

        Triangle triangle = new Triangle(3d,5d,4d);
        System.out.println("周长："+triangle.perimeter()+" 面积："+triangle.area());

        com.chinasoftware.inherit.shape.Rectangle rectangle1 = new com.chinasoftware.inherit.shape.Rectangle(10d,10d);
        System.out.println("周长："+rectangle1.perimeter()+" 面积："+rectangle1.area());
        System.out.println(triangle.toString()+"\n"+Triangle.class);
    }

}
