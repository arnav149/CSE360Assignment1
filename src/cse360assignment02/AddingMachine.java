package cse360assignment02;

import java.util.ArrayList;
import java.util.List;

public class AddingMachine
{
    private int total;
    private List<String> list = new ArrayList<>(); //list to keep track of all the operations

    public AddingMachine ()
    {
        total = 0;
        list.add(total+""); //adding the initial total into the string
    }

    public int getTotal ()
    {
        return this.total;
    }

    public void add (int value)
    {
        list.add(" + "+value); //adding "+" operation along with value to the list
        this.total += value;
    }

    public void subtract (int value)
    {
        list.add(" - "+value); //adding "-" operation along with value to the list
        this.total -= value;
    }

    public String toString ()
    {
        //building the required string using StringBuilder
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<list.size(); i++)
        {
            sb.append(list.get(i));
        }

        return sb.toString();
    }

    public void clear()
    {
        //clearing the AddingMachine and adding 0 to the list to start with
        this.total = 0;
        list.clear();
        list.add(0+"");
    }
}
