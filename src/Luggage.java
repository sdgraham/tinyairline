public class Luggage implements Weighable
{
    private String labelNumber;
    private int weight;

    public Luggage(String aNumber, int aWeight)
    {
        this.labelNumber = aNumber;
        this.weight = aWeight;
    }

    public int getWeight()
    {
        return this.weight;
    }

}
