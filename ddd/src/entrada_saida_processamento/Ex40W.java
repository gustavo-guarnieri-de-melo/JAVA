package entrada_processamento_saida;

public class Ex40w {

	public static void main(String[] args) {
	
		int a=1,b=1,c=1,d=b+a+c,i=1;
		
		
		while(i<=20) {
		    System.out.printf("\n%d.º: %d",i,a);
			d=b+a+c;
			a=b;
		    b=c;
		    c=d;
	    	i++;
		}
	}

}