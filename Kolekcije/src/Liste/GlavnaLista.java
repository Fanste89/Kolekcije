package Liste;
import java.util.ArrayList;
import java.util.List;
public class GlavnaLista {

	public static void main(String[] args) {
		String ime = "Pera";
		List lista = new ArrayList ();
		// dodavanje elemenata u listu
		
		lista.add(ime);
		lista.add(1987);
		lista.add(3.14);
		lista.add(false);
		lista.add("Stevo");
		
		//"hvatanje" elemenata liste
		
	    System.out.println("treci element liste : " + lista.get(2));
	    
		
		double x =(double) lista.get(2);
		
	    String y = (String)lista.get(4);
	    System.out.println(y);
		
		//genericke liste
	    
	    
	    List <String> imena = new ArrayList<String>();
	    
	    
	    imena.add("Djordje");
	    imena.add("Marina");
	    imena.add("Bojan");
	    String polaznik = (String)imena.get(1);
	   

        System.out.println(" Polaznici su: ");
        //ovo je prolaz kroz listu
        for(int i = 0; i < imena.size(); i++){
        	String imePolaznka = imena.get(i);
        	System.out.println(imePolaznka);
        }
	
	    
	    imena.remove(0);//
	   
	   for (String imePolaznika: imena) {
	    	
	    	System.out.println(imePolaznika);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
		
		
		
		
	}

}
