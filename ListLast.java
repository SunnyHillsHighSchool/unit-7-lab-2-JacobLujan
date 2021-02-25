//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    int last = ray.get(ray.size() - 1);
    for(int x = 0; x < ray.size() - 1; x++)
    {
      if(last == ray.get(x))
      {
        return true;
      }
    }
		return false;
	}
}