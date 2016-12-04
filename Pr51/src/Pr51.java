// Write your code here. This box should look like a real IDE.
import java.util.*;
import java.io.*;
import java.util.ArrayList;
class Pr51
{
	public String list;
	public Pr51(String l)
	{
	list = l;
	}
	  public String getList()
	{
	return list;
	}
public void setList(String list)
	{
	this.list = list;
	}
   public static <list> void main (String[] args) throws IOException
   {
      Scanner file = new Scanner(new File( "pr51.dat" ));
      int times = file.nextInt();      
      file.nextLine();
      int total = 0;
      for( int zz = 0; zz < times; zz++ )
      {
        //creates the array
    	 ArrayList<list> home= new ArrayList<list>();
        home.add((list) new String(file.nextLine()));
        //sorts the array
        for (int j = 0; j < (home.getList()).legnth-1; j++)
        {
          int minIndex = j;
          for (int k = j + 1; k < home.size(); k++)
          {
            if (home.get(k).getList() < home.get(k).getList())
            {
            minIndex = k;
            }
          }
          list temp =  home.get(j);
          home.get(j) = home.get(minIndex);
          home.get(minIndex) = temp;
        //removes duplicates
      if(home.contains(home.get(zz)))
            {
            home.remove(zz);
            }
            //removes spaces
        if(home.contains(" "))
            {
            home.remove(" ");
            }
      }
      //print the array
        for(int i= 0 ; i <home.size(); i ++)
        {
          System.out.println(home.get(i));
        }
  }
}
}

