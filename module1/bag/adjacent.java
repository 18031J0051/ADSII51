package bag;
public class adjacent
{
   boolean matrix[][];
   int vertex,edge;
   
   public adjacent(int v,int e)
   {
	   vertex=v;
	   edge=e;
	   matrix=new boolean[v][v];
   }
   public void addedge(int i, int j)
   {
	   if(i>=0 && i<vertex && j>0 && j<vertex)
	   {
		   matrix[i][j]=true;
		   matrix[j][i]=true; 
	   } 
   }
   public int V()
   {
	   return vertex;
   }
   public int E()
   {
	   return edge;
   }
   public boolean hasedge(int i,int j)
   {
	   if(i>=0 && i<vertex && j>0 && j<vertex)
	   {
		   return matrix[i][j];
	   } 
	   else
		   return false; 
   }
  public void printList()
  {
	  for(int i=0;i<vertex;i++)
	  {
		  for(int j=0;j<vertex;j++)
		  {
		     matrix[i][j]=hasedge(i,j);
		     if(matrix[i][j]==true || matrix[j][i]==true)
		     {
		    	 System.out.print("1"+" ");
		     }
		     else
		     System.out.print("0"+" ");
		  }
		  System.out.println();
	  }
  }
}