package bag;
public class Adjacencygraph 
{
    int vertex;
    int a[][];

    public Adjacencygraph(int vertex) 
    {
        this.vertex = vertex;
        a = new int[vertex][vertex];
    }

    public void addEdge(int c, int d) 
    {
        a[c][d]=1;
        a[c][d] = 1;
    }
    public void printGraph() 
    {
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) 
        {
            for (int j = 0; j <vertex ; j++) 
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < vertex; i++) 
        {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 0; j <vertex ; j++) 
            {
                if(a[i][j]==1)
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }    
}