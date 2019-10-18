
public class Loader
{
    public static void main(String[] args)
    {
        Integer milkAmount = 1000; // ml
        Integer powderAmount = 1000; // g
        Integer eggsCount =1000; // items
        Integer sugarAmount = 1000; // g
        Integer oilAmount = 1000; // ml
        Integer appleCount = 1000;

        Boolean Pancaks = (milkAmount>= 1000 && powderAmount >=400 && sugarAmount>=10 &&oilAmount>=30);
        Boolean Omelette = (milkAmount>= 300 && powderAmount >=5 && eggsCount>=5);
        Boolean Applepie = (appleCount>= 3 && milkAmount>= 100 && powderAmount >=300 && eggsCount>=4);

        if (Pancaks)
        {
            System.out.println("You can do Pancakes");
        }
        if (Omelette)
        {
            System.out.println("You can do Omelette");
        }
        if (Applepie)
        {
            System.out.println("You can do Apple pie");
        }
        else
        {System.out.println("Дуй в магазин!");}
/*

        if (milkAmount>= 1000 && powderAmount >=400 && sugarAmount>=10 &&oilAmount>=30)
        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        {
            System.out.println("You can do Pancakes");
        }
        if (milkAmount>= 300 && powderAmount >=5 && eggsCount>=5)
        //milk - 300 ml, powder - 5 g, eggs - 5
        {
            System.out.println("You can do Omelette");
        }
        if (appleCount>= 3 && milkAmount>= 100 && powderAmount >=300 && eggsCount>=4)
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        {
            System.out.println("You can do Apple pie");
        }
        else
            {System.out.println("Дуй в магазин!");}
  */
    }
}
//данная программа предполагает, что вы выберете только  один из предложенных вариантов ;)