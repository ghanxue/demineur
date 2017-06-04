public class monde{
	
	boolean[][] tableau;
	int taille;
	int [][] num;
	
		
	public monde(String c){
		if(c.equals("A"))
			taille = 8;
		if(c.equals("B"))
			taille = 16;
		tableau = new boolean[taille][taille];
		for(int i=0; i<taille; i++){
			for(int j=0; j<taille;  j++){
				if(Math.random()*5<1){
					tableau[i][j] = true;
				}else{
					tableau[i][j] = false;
				}
			}
		}
		
	}	
	public void calcul(){
		num = new int[taille][taille];
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
		
	}
	public int numdemine(){
		int n = 0;
		for(int i=0;i<taille;i++){
			for(int j=0; j<taille;  j++){
				if(tableau[i][j]){
					n ++;
				}
			}
		} 
		return n;
	}
	
	public boolean mine(int i, int j){
		if(tableau[i][j])
		return true;
		else
		return false;
	}
	
	
		
}
 
