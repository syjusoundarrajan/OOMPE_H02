

import inf.v3d.view.Viewer;


public class pattern1 {
	boolean[][] state= new boolean[40][40];
	public  boolean[][] newstate= new boolean[40][40];
	public boolean[][] evol = new boolean [40][40];
    public  Rectangle2D[][] R= new Rectangle2D[40][40];
    
    public  pattern1() {
		
		for(int i=0;i<state.length;i++) {
			 
			for(int j=0;j<state[i].length;j++) {
			 
				state[i][j]=false;
			}}	

	    
		state[19][19]=true;
		
		state[20][20]=true;

		state[19][20]=true;

		state[20][19]=true;
		
		
		
			}
    
public void Moore(int Evol,Viewer v1) {
    	
		 
    	

		for (int gen = 1; gen < Evol; gen++)
		{
			
 	  		for(int x=0;x<state.length;x++) {
 	  			
    			for(int y=0; y <state[x].length; y++) {
					
				//Living AutoMat
    				
    			
//    				if(count<n) { 
				if ( state[x][y] == true) {
					
					float neighbors=0;
					try { if (state[x-1][y-1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x-1][y]   == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x-1][y+1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x]  [y-1] == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x]  [y+1] == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x+1][y]   == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x+1][y-1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x+1][y+1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }

                            
					if ( neighbors ==3 || neighbors == 2 ) 
					
					{
						
						newstate[x][y]=true;	
						
						}
					else { 										
						newstate[x][y]=false;   
						
						}
				} 

				// Dead Automat
				
				if ( state[x][y] == false ) {
					float neighbors=0;
				
					try { if (state[x-1][y-1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x-1][y]   == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x-1][y+1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x]  [y-1] == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x]  [y+1] == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x+1][y]   == true)   { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x+1][y-1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }
					try { if (state[x+1][y+1] == true) 	 { neighbors++ ;} } catch (Exception e) {  }
				
					if ( neighbors ==3 ) 
					{
						newstate[x][y]=true;	
					}
					else { 						
						newstate[x][y]=false; 
						}
					
					}
                }
 	  		}
 	  		
 	  		if (Evol > 1)
 			{
 	  			//pointer messing
 	  			//state = newstate;
 	  			
 	  			for(int x=0;x<state.length;x++) {
 	 	  			
 	    			for(int y=0; y <state[0].length; y++) {
 	    				state[x][y] = newstate[x][y];
 	    			}
 	  			}
 			}
		}
		

    	
    	for(int x=0;x<state.length;x++) {
     	 			
        for(int y=0; y <state[0].length; y++) {
				
			if(state[x][y]==true) 
			{
			 R[x][y]=new Rectangle2D(x,y,1,1);	
			 R[x][y].draw(v1);
			}
			else 
			{
				
			R[x][y]=new Rectangle2D(x,y,1,1);		
			R[x][y].draw(v1);
			 
			}
         }
	  }
 	  		
    }
}