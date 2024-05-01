import com.sun.javafx.scene.traversal.WeightedClosestCorner;

public class CheckInDesk
{
    private int totalWeight;

    CheckInDesk()
    {
        totalWeight = 0;
    }

    public void add(Weighable w)
    {
        this.totalWeight += w.getWeight();
    }



}
