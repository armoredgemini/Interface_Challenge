import java.util.ArrayList;

/**
 * Created by ac003588 on 8/18/2017.
 */
public class Person {

    private String   first;
    private String   last;
    private IPersist p;
    private ArrayList<String> populator = null;

    /**
     *
     * @param p is an IPersist object
     */

    public Person(IPersist p)
    {
        this.p = p;
    }

    public void enterValues()
    {

        this.populator = p.readValues();
        if(populator.size() != 2)
        {
            this.first = "unset";
            this.last  = "unset";
            return;
        }
        this.first = populator.get(0);
        this.last  = populator.get(1);
    }


    public void save() {
        p.setValues(this);
    }


    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", p=" + p +
                ", populator=" + populator +
                '}';
    }

}
