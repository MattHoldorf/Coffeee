
public class Cup
{
    private int sips = 10;
    
    public Cup()
    {
        
    }
    
    public void takeOneSip()
    {
        System.out.println("Gulp..");
        sips--;
    }
    
    public boolean isEmpty()
    {
        return sips == 0;
    }
    
    
    
}
