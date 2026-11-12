import com.microsoft.bean.*;

public class Application {
    public static void main(String[] args) {

        //
        Dogs zhangDog=new Dogs();
        zhangDog.setName("Jerry");
        zhangDog.setAge(2);
        zhangDog.setVariety("拉布拉多");
        zhangDog.setFood("狗粮");

//        System.out.println(zhangDog.getName());
//        System.out.println(zhangDog.getAge());
//        System.out.println(zhangDog.getVariety());
//        System.out.println(zhangDog.getFood());

        zhangDog.sleep();
        zhangDog.barking();

        System.out.println("zhangDog = " + zhangDog);




        // 多态

        // 替父从军 向上转型
        Huahu huahu=new HuaMulan();

        System.out.println(huahu.name);
        System.out.println(huahu.age);
        huahu.sayMe();
        huahu.fight();

        //有一天，仗打完了遇到自己心爱的人，想要做回自己，向下转型，开始变化
        HuaMulan huaMulan= (HuaMulan) huahu;
        System.out.println(huaMulan.name);
        System.out.println(huaMulan.age);
        HuaMulan.sayMe();
        HuaMulan.dressing();
    }
}
