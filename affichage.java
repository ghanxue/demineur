import java.util.Scanner;
public class affichage {
	
	static int n;
	
	public static void main(String[]args){
		
			
		Scanner sc= new Scanner(System.in);	
		String d="A";
		do{
			if(d.equals("A")==false&&d.equals("B")==false)
				System.out.println("Entrez 'A'ou 'B' SVP");
			System.out.println("Vous voulez quelle taille de grille? Pour 8X8 tapez 'A'; pour 16X16 tapez 'B' ");
			d = sc.nextLine();
		}while (d.equals("A")==false&&d.equals("B")==false);
		
		System.out.print(d);
		ecran e = new ecran(d);
		monde m = new monde(d);	
		boolean gameover = false;
		n = m.numdemine();
		
		
			
		while(gameover==false){
			affitab(e.ecr);
			gameover = choix(m,e);
		}
				
	}	
	
	public static void affitab (String[][] ecr){	
		
		for(int k = 0; k < ecr.length; k++){
			for(int l = 0; l < ecr.length; l++){
				System.out.print(ecr[k][l] );
			}
			System.out.println("");
			if(ecr.length == 9)
				System.out.println("      ---- ---- ---- ---- ---- ---- ---- ---- ");
			if(ecr.length == 17)
				System.out.println("      ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ");
		}
	}

	public static boolean choix(monde m,ecran e){
		boolean re = false;
		Scanner sc= new Scanner(System.in);	
		int a;
		int b;
		
		System.out.println("Entrez la ligne de la case que vous voulez tester (un chiffre)");
		a=sc.nextInt();
		
		System.out.println("Entrez la colonne de la case que vous voulez tester (un chiffre)");
		b=sc.nextInt();
			
		System.out.println("Si vous trouvez que cette case n'a pas de mine,Entrez V /Si vous voulez faire ou enlèver le drapeau dans cette case,Entrez F");
		Scanner sc1= new Scanner(System.in);
		String c=sc1.nextLine();	
		
		if (c.equals("F")){
			if(e.ecr[a][b].equals("| A  ")){
			e.ecr[a][b]="|    ";
			n ++;
			}else{
			e.ecr[a][b]="| A  ";
			n --;
			
			}
		}
		if (c.equals("V")){
			if(m.num[a-1][b-1]==9){
				
				System.out.println("GAME OVER! cette case a une mine!");
				e.tabmort(m);
				re = true;				
			}else{ 
				if(m.num[a-1][b-1]!=0){
					e.ecr[a][b] = String.valueOf(m.num[a-1][b-1]);
				}else{
					affiautour af = new affiautour(m,e);	
					af.autour(a,b);
				}
				
			}				
		}
		return re;
	}
}
