public class MostScoredOver 
{
    public static int getMostScoredOver(int[] runs)
    {
        if(runs == null || runs.length == 0)
        {
            return -1;
        }
        int mostRuns = runs[0];
        int MostScoredOver = 1;
        for(int i = 1; i < runs.length; i++)
        {
            if(runs[i] > mostRuns)
            {
                mostRuns = runs[i];
                MostScoredOver = i + 1;
            }
        }
        return MostScoredOver;
    }
    public static void main(String[] args) 
    {
        int[] runs = {6, 12, 4, 15, 9};
        System.out.println(getMostScoredOver(runs));
        
    }
    
}
