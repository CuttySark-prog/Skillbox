
public class Loader
{

    public static void main(String[] args)
    {

        Cat murzic= new Cat();
        Cat barsic = new Cat();
        Cat masya = new Cat();
        Cat fox = new Cat();
        Cat vasya = new Cat();
        Cat tig = new Cat();

        Cat leo = new Cat();

      //  Cat mini = new Cat(300);

        Cat mimi = Cat.getKitten();

        System.out.println(Cat.getCount());


        barsic.makeTwin(murzic);

        System.out.println("Вес Мурзика до кормежки "+murzic.getWeight());
        System.out.println("Вес Барсика до кормежки "+barsic.getWeight());

        murzic.feed(10000.);

        System.out.println("Мурзика покормили:  "+murzic.getStatus());
        System.out.println("Барсика не кормили: "+barsic.getStatus());

        System.out.println(murzic.getStatus());
        System.out.println(barsic.getStatus());
        System.out.println(masya.getStatus());
        System.out.println(fox.getStatus());
        System.out.println(vasya.getStatus());
        System.out.println(tig.getStatus());
        System.out.println(leo.getStatus());

        System.out.println(murzic.getWeight());
        System.out.println(barsic.getWeight());
        System.out.println(masya.getWeight());
        System.out.println(fox.getWeight());
        System.out.println(vasya.getWeight());
        System.out.println(tig.getWeight());
        System.out.println(leo.getWeight());



        for (Integer i=0; i<6; i=i+1)

           {
           murzic.meow();
            }
        barsic.meow();
        masya.feed(0.1);
        fox.feed(9000.3);
        fox.shit();
        vasya.drink(1000.4);
        tig.drink(9000.5);
        leo.feed(3000.0);
        leo.drink(3000.9);

        System.out.println(murzic.getWeight());
        System.out.println(barsic.getWeight());
        System.out.println(masya.getWeight());
        System.out.println(fox.getWeight());
        System.out.println(vasya.getWeight());
        System.out.println(tig.getWeight());
        System.out.println(leo.getWeight());
        
        System.out.println(murzic.getStatus());
        System.out.println(barsic.getStatus());
        System.out.println(masya.getStatus());
        System.out.println(fox.getStatus());
        System.out.println(vasya.getStatus());
        System.out.println(tig.getStatus());
        System.out.println(leo.getStatus());
        System.out.println(mimi.getWeight());

        System.out.println(Cat.getCount());
    }


}