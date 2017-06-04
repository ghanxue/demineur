public class affiautour{
	monde m;
	ecran e;
	
	
	public affiautour(monde mo,ecran ec){
		
		 m=mo;
		 e=ec;
	}
	
		
	public void autour(int x,int y){
		if (e.ecr[x][y].equals("|    ")){
			e.ecr[x][y] = String.valueOf(m.num[x-1][y-1]);
			for(int i = x-1; i < x+2; i++){
				for (int j = y-1; j < y+2; j++){
					if(i>0&&i<e.taille&&j>0&&j<e.taille&&m.num[i-1][j-1]==0)
						this.autour(i,j);
					if(i>0&&i<e.taille&&j>0&&j<e.taille&&m.num[i-1][j-1]!=0)
						e.ecr[i][j] = String.valueOf(m.num[i-1][j-1]);
				}
			}
		}
		else
			return;
				
		
	}
	
	

}
	
	
		
				
			
						
		
		
		 
	
	
	
	
	
