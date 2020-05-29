package Entity;

import java.util.ArrayList;
import java.util.List;

public class Nfc {
	private ArrayList<Integer> listOfCars= new ArrayList<Integer>();
public List<Integer> getList()
{
	return listOfCars;
	
}
public int getCarNumAtIndex(int i)
{
	return listOfCars.get(i);
	
}
}
