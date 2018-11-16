import java.util.*;
import bag.adjacent;
interface Graph {
    public int V();
    public int E();
    public void addEdge(int v, int w);
    public Iterable<Integer> adj(int v);
    public boolean hasEdge(int v, int w);
}
class Solution
{
	private static Scanner sc;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		String ch=sc.next();
		int v=sc.nextInt();
		int e=sc.nextInt();
		switch(ch)
		{
			case "List":
				/*String arr[]=new String[v];
				for(int i=0;i<v;i++)
				{
					arr[i]=sc.next(arr[i].split(","));
				}
	               break;*/
			case "Matrix":
				adjacent a=new adjacent(v,e);
	            for(int b=0;b<e;b++)
	            {
	            	int i1=sc.nextInt();
		            int j1=sc.nextInt();
		            a.addedge(i1,j1);
	            }
	            System.out.println(v+"vetices"+","+e+"edges");
	            a.printList();
				break;   			
        }
	}
}	