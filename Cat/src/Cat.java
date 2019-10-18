
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    static int count = 0;



    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

      public Cat(double weight)

    {
        this.weight=weight;
        originWeight = this.weight;
        minWeight = 100.0;
        maxWeight = 500.0;
    }

    public static Cat getKitten()
    {
        Cat kitten = new Cat(250);
        return new Cat();
    }



    public void shit()
    {
        weight = weight - (100 + 1000*Math.random());
        System.out.println("You feel a strange smell");
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        if (weight< minWeight) count --;
    }

    public Double feed(Double amount)
    {
        weight = weight + amount;
        if(weight > maxWeight) count--;
        System.out.println(amount);
        return weight - originWeight;

    }


    public void drink(Double amount)

    {
        weight = weight + amount;
    }


    public Double getWeight()
    {
        return weight;
    }

    static int getCount(){ return count; }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void makeTwin(Cat cat)

    {

        this.weight=cat.getWeight();

        this.originWeight=this.weight;

    }

}