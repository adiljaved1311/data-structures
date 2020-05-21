package graphs;

public class DirectedGraph 
{
	static int size = 10;
	int edges[][];
	
	public void createGraph(int v, int e) 
	{
		for(int i=1;i<=v;i++) 
		{
			for(int j=1;j<=v;j++) 
			{
				edges[i][j] = 0;
			}
		}
		for(int i=1;i<=e;i++)
		{
			int sv,dv;
		}
	}

	public static void main(String[] args)
	{
		
	}
}
