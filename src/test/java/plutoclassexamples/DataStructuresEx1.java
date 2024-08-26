package plutoclassexamples;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStructuresEx1 {

	public static void main(String[] args) {
		
		int marks[] =new int[10];
		marks[0]=10;
		marks[1]=6;
		marks[2]=8;
		marks[3]=10;
		
		for (int i=0; i<marks.length; i++)
		{
			System.out.println("Marks of Student:" +marks[i]);
		}
		
		System.out.println("-------------------List Example----------------------");
		//List<WebElement> weList = driver.findElements(By.xpath(""));
		//weList.get(i).getText();
		List<Integer> marksList = new ArrayList<Integer>();
		marksList.add(10);
		marksList.add(6);
		marksList.add(5);
		marksList.add(10);
		System.out.println("size of the List:" +marksList.size());
		
		for (int i =0; i<marksList.size(); i++)
		{
			System.out.println(marksList.get(i));
		}

		System.out.println("-----------------Set Example-------------------------");
		
		//Set<String> windowSet = driver.getWindowHandles();
		Set<Integer> marksSet = new HashSet<Integer>();
		marksSet.add(10);
		marksSet.add(5);
		marksSet.add(10);
		System.out.println("size of Set:"+marksSet.size());
		
		//for Each Method
		
		for(Integer val: marksSet)
		{
			System.out.println(val);
		}
		
       System.out.println("-------------------------Map Example------------------------");
       
       Map<String, Integer> marksMap = new HashMap<String, Integer>();
       marksMap.put("Rupa", 9);
       marksMap.put("Pat", 9);
       marksMap.put("Tom", 10);
       System.out.println("size of Map" +marksMap.size());
       
                      Set<String> namesKeySet = marksMap.keySet(); //set of keys
                      
                      for(String key: namesKeySet)
                      {
                    	  System.out.println("key::::" +key+ "value:::::"+marksMap.keySet());
                      }
                      
       
       
      
                     
	}
	
	
      
}
