class Travel {
    
HashMap<String, Integer> holidayPkg = new HashMap<String, Integer>();
int mincost=0;
public int cheapestPackage(int numberOfPlaces)
{
    mincost = Collections.min(holidayPkg.values()); 
    return mincost*2;
}

public int maximumPlace(int budget)
{
    int re = budget/mincost;
    return re;
}
    public static void main(String[] args) {
    }
}
