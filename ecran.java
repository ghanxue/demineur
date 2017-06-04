public class ecran{
	String[][] ecr;
	int taille;
	
	public ecran(String c){
		if(c.equals("A"))
			taille = 9;
		if(c.equals("B"))
			taille = 17;
		
		ecr = new String[taille][taille];
		for(int k=0; k < taille; k ++){
			for(int l=0; l < taille; l++){
				ecr[k][l] = "|    ";
			}
		}	
		for(int i=0; i<taille; i++){
			if (i <= 9 )
				ecr[i][0] = "  " + String.valueOf(i) + "  ";
			else
				ecr[i][0] = " " +String.valueOf(i) + "  ";
		}
		for(int j=0; j<taille;  j++){
			if (j <= 9 )
				ecr[0][j] = "  " + String.valueOf(j) + "  ";
			else
				ecr[0][j] = " " + String.valueOf(j) + "  ";
		}
	}
	
	public void tabmort(monde m){
		for(int h = 0; h < 20; h++){
			System.out.println("");
		}		
		for(int i=1; i < taille; i ++){
			for(int j=1; j < taille; j++){
				if(m.mine(i,j)){
					if(ecr[i][j].equals("| A  "))
						System.out.print("| A  ");
					else
						System.out.print("| *  ");
				}else{
					if(ecr[i][j].equals("| A  "))
						System.out.print("| X  ");
					else
						System.out.print("| " +ecr[i][j]+"  ");
				}
			}
			System.out.println("");	
			System.out.println("");
		}
	}
	
} 
