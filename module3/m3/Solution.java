import java.util.*;
public class Solution 
{
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
			int v=Integer.parseInt(args[0]);
			int e=Integer.parseInt(args[1]);
			Solution s=new Solution(v);
		for(int i=0;i<e;i++)
		{
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			s.addEdge(v1,v2);
		}
		s.display();
	}
	int vertex;
	LinkedList<Integer> adjlist[];
	private static Scanner sc;
	@SuppressWarnings("unchecked")
	public Solution(int v)
	{
		vertex=v;
		adjlist=new LinkedList[vertex];
		for(int i=0;i<vertex;i++)
		{
			adjlist[i]=new LinkedList<Integer>();
		}
	}
    public void addEdge(int v1,int v2)
    {
    	adjlist[v1].add(v2);
    }
    public void display()
    {
    	 int count=0;
    	for(int i=0;i<vertex;i++)
    	{
    		for(Integer a: adjlist[i])
    		{
            for(Integer p: adjlist[i])
            { 
            	if (p==i  || a==p  )
            	{
            		count++;
            	}  
            } 
    		}
    	}
    	if(count>0)
    	{
    		System.out.println("Cycle exists");
    	}
    	else
    	{
    		System.out.println("Cycle doesn't Exists");
    	}
    }
}
