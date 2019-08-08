import java.util.*;

public class Hashmaptesting {

	public static void main(String[] args) 
	{
		HashMap<Integer , String> hm =new HashMap<Integer, String>();
		HashMap<Object, Object> hm2 =new HashMap<Object, Object>();
		hm.put(1, "Alok");
		hm.put(2, "Rajesh");
		hm.put(3, "Kanchan");
		hm.put(1, "Sunil");
		hm.put(5, "seepu");
		hm.put(6,"Rajesh");
		hm.put(1,"Aloksfsfs");
		hm.put(7,"Deepika");
		hm.put(7,"Sunil");
		hm.put(null, null);
		
		hm.put(null, "Null 3");
		
//		hm2.put(8, "Alok");
//		hm2.put(null, null);
		System.out.println(hm.keySet());
		for(Integer key:hm.keySet())
	    {
	     System.out.println("This is key "+key);	
	    }
		hm2.putAll(hm);//putAll method are use for copy all the element from hm to hm2 object;
	    Collection<String> c = hm.values();
	    //Collection<String> c2 = hm2.values();
	    Set<?> st=hm.entrySet();
	    for(String str:c)
	    {
	     System.out.println("This is Hm2 "+c);	
	    }
		 
		    //obtain an Iterator for Collection
		    Iterator<?> itr = st.iterator();
		
		while(itr.hasNext())
		{
			@SuppressWarnings("unchecked")
			Map.Entry<Integer,String> m=(Map.Entry<Integer, String>)itr.next();
			//Object i=itr.next();
			//System.out.println("Employee code->"+i.hashCode());
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	System.out.println(hm);
	System.out.println("Size of Map "+hm.size());
	//System.out.println(hm2);
		

	}

}
