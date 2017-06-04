public class test{
	public static void main(String[]args){
		
		int taille = 8;
		boolean [][] tableau = new boolean[taille][taille];
		for(int i=0; i<taille; i++){
			for(int j=0; j<taille;  j++){
				if(Math.random()*5<1){
					tableau[i][j] = true;
				}else{
					tableau[i][j] = false;
				}
			}
		}
		
		
	
		int [][] num = new int[taille][taille];
		int n = 0;
		for(int x = 0; x < taille; x ++){
			for(int y = 0; y < taille; y ++){
				n = 0;
				if(tableau[x][y] == true){
					num[x][y] = 9;
				}else{
					for(int k = x-1; k < x+2; k ++){
						for (int l = y-1; l < y+2; l++){
							if(k >= 0 && l >= 0 && k < taille && l < taille){
								if(tableau[k][l]){
								n ++;
								}
							}
						}
					}
					num[x][y] = n;
				}
			}
		}
		
		for(int k = 0; k < taille; k ++){
			for(int l = 0; l < taille; l ++){
				System.out.print(num[k][l]+" " );
			}
			System.out.println("");
		}
		
		for(int kq = 0; kq <taille; kq++){
			for(int lq = 0; lq < taille; lq++){
				if (tableau[kq][lq])
					System.out.print("v " );
				else
					System.out.print("F " );
				
			}
			System.out.println("" );
		}
		
		String[][] ecr=new String [taille][taille];
		for(int k=0; k < taille; k ++){
			for(int l=0; l < taille; l++){
				ecr[k][l] = "    ";
			}
		}
		int xx=3;
		int yy=1;
		if(num[xx-1][yy-1]==0)
		autour(num,ecr,xx,yy,taille);
		else
		ecr[xx][yy] = String.valueOf(num[xx-1][yy-1]);
		
		affitab(ecr);
		
		
		
	}
	
	public static void autour(int [][]num,String[][]ecr,int x,int y,int taille){
		
				
		if (ecr[x][y].equals("    "))
			ecr[x][y] = String.valueOf(num[x-1][y-1]);
		
		else
			return;
			
			for(int i = x-1; i < x+2; i++){
			for (int j = y-1; j < y+2; j++){
				if(i>0&&i<taille&&j>0&&j<taille&&num[i-1][j-1]==0)
					autour(num,ecr,i,j,taille);
				if(i>0&&i<taille&&j>0&&j<taille&&num[i-1][j-1]!=0)
					ecr[i][j] = String.valueOf(num[i-1][j-1]);
					
			}
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

		
			
}
