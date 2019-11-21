import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * EXTRA CREDIT:
 * Making helper method private in our class gives us 
 * advantage because it can not be called accidently
 * from else where ,it will be easy to follow , 
 * it can add safely more paramterers, it will be 
 * fast for JVM for compilation and easy to
 * modify.In addition, It can not be accesseble 
 * outside of the class and can not be overridden.
 *   
 */
/**
 * A Circle set class is designed to read file, which contains
 * number of circles, radius, center points, and colors. Also it
 * counts number of circles, calculates closest center points of
 * the circle, finds out smallest and largest radius, and 
 * determines changing brightness.
 *
 * @author Adilet Momunaliev
 * 
 */
public class CircleSet
{
    private Circle[] set;
    
    /**
      * This is constructor CircleSet, which is designed to 
      * read properties of the circle and fill the array of the 
      * Circle Set width data, which is stored in file.
      * @param File source for uploading the file
      * @throws Exception if number of circles is less then two
     */
    
    public CircleSet(File source) throws FileNotFoundException
    {       
        Scanner input = new Scanner(source);
        int number_circles = input.nextInt();
        set = new Circle[number_circles];
        int index=0;
        if (number_circles < 2)
        {
                throw new IllegalArgumentException();
        }
        else
        {
                while (input.hasNext())
                {
                    double h = input.nextDouble();
                    double k =input.nextDouble();
                    double radius =input.nextDouble();
                    int red = input.nextInt();
                    int green = input.nextInt();
                    int blue = input.nextInt();
                    Circle circle = new Circle(h,  k,
                    radius,  red,  green,  blue);
                    set[index]=circle;
                    index++;
                    
                     
                    
                    
                    
            
            
                }
                
                
                
        }
    }
    
    /**
      * Count length  of the array of the CircleSet
      * @return length of the array of the CircleSet 
     */
    public int getCount()
    {
        return set.length;
    
    }
    
    /**
     *  Determines the overall change in brightness from one 
     *  Circle to the next Circle.
     *  @return overall change in brightness within Circles 
     */
    public double changingBrightness()
    { 
        double overallchange = 0;
        for (int i=0; i<set.length-1; i++)
        {
            if (set[i].brightness()>set[i+1].brightness())
            {
                overallchange =overallchange -1;
            }
            else if( set[i+1].brightness()> set[i].brightness())
            {
                overallchange = overallchange +1;
                
            }
            else
            {
            }
        }
         return overallchange;
    }
    
    /**
     * Determines smallest and largest radius of Circle within 
     * CircleSet
     * @return array with smallest and largest radius if Circles
     *  have the same radius then returns radius of the Circle 
     *  with lowest index 
     */
    public Circle [] smallLarge()
    {
        double max_radius = set[0].getRadius();
        double min_radius = set[0].getRadius();
        int large_idx=0;
        int min_idx = 0;
       
        Circle [] array = new Circle[2];
       
        for (int i = 0; i < set.length; i++)
        {
           if(max_radius < set[i].getRadius())
           {
              
               large_idx = i;
               
            }
            
           if (min_radius > set[i].getRadius())
           {
               min_idx =i;
               
            }
        }
        array[0] = set[min_idx];
        array[1] = set[large_idx];
        return  array;
    }
    /**
     * Determines pair of Circles, which is located close to each
     * other 
     *  @return pair of Circles , which is closest to each other
     *  @throws Exception if length of CircleSet is less then two 
     */
    public Circle[] getClosest()
    {
        Circle [] array = new Circle[2];
        int first_idx = 0;
        int second_idx = 1;
        if (set.length < 2)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            double min_dis = set[0].getCenter().distance(set[1].getCenter());
            for (int i=0; i<set.length; i++)
            {
                for (int j=0; j<set.length; j++)
                {
                    if (j!=i)
                    {
                        if(min_dis > set[i].getCenter().distance(
                        set[j].getCenter()))
                        {
                            min_dis = set[i].getCenter().distance(
                            set[j].getCenter());
                            first_idx = i;
                            second_idx = j;
                        }
                    }
                }
            }
        }
        array[0] = set[first_idx];
        array[1] = set[second_idx];
        return array;
    }
    /**
     * The string version of this CircleSet is designed to put 
     * all Circles within CircleSet for output. 
     * @return the String representation
     */
    public String toString()
    {
        String output="";
        for (int i=0; i<set.length; i++)
        {
            output += "Circle " + (i+1) + ":\n"+set[i].toString()+"\n";
        }
        return output;
    }
}
