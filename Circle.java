import java.util.*;
import java.awt.*;
/**
 * A Circle class is designed to set center point, radius, and 
 * color of the circle.In addition,it calculates area, 
 * circumference, distance, and brightness of the circle.
 * @author Adilet Momunaliev
 * 
 * 
 */
public class Circle
{
    private CSC142Point center;
    private Color color;
    private double radius;
     /**
     *  This is constructor Circle ,which is defined by given
     *  center points, red ,green, blue colors and radius.
     *  @param double h and k center points ,double radius, and 
     *  int red, int green ,int blue colors 
     *  @throws Exception if radius less or equal to zero and
     *  if colors such as red, green, and blue less then zero or
     *  greater then two hundred fifty five.   
     */
    public Circle (double h, double k, double radius, int red,
    int green, int blue )// Constructor width properties.
    {
         if (radius<=0 )
         {
            throw new IllegalArgumentException();
            
        }
        else if (red<0 || red>255)
        {
            throw new IllegalArgumentException();
            
        }
        else if (green<0 || green > 255)
        {
            throw new IllegalArgumentException();
            
        }
        else if (blue<0 || blue > 255)
        {
            throw new IllegalArgumentException();
            
        }
        else
        { 
            this.radius = radius;
            this.center = new CSC142Point(h,k);
            this.color = new Color(red,green,blue);
            
        }
        
    }
    
    /**
     * Get center points of the circle 
     * @return center of this circle
     */
    public CSC142Point getCenter()
    {
        return new CSC142Point(center.getX(),center.getY());
        
    }
    
    /**
      * Get radius of this circle
      * @return radius of this circle
      */
     public double getRadius()
    {
        return this.radius;
        
    }
    
    /**
       * Get color of this circle
       * @return red, green, and blue colors
     */
    public Color getColor()
    {
        return new Color(color.getRed(),color.getGreen(),
        color.getBlue());
        
    }
    
    /**
       *The string version of this Circle
       *@return the String representation
     */
     public String toString()
    {
        String str = "Center = "+center+"\nRadius = "+
        radius;
        return str;
        
    }
    
    /**
      *Calculate the area of this Circle 
      *@return the area of this Circle  
     */
    public double area()
     {
        double area = (Math.PI) * this.radius  * this.radius;
        return area;
        
    }
    
    /**
      *Calculate the circumference of this Circle 
      *@return the circumference of this Circle 
     */
    public double circumference()
    {
        double circumOFcircle = 2 * Math.PI * this.radius;
        return circumOFcircle;
        
    }
    /**
       * Check if Circle contains point on the perimeter 
       * @return true if Circle contains point on the perimeter
       * false if Circle doesn't contain point on the perimeter     
     */
    public boolean contains(CSC142Point p)
    {
        double distance = this.center.distance(p);
        
        if ( distance > radius)
        {
            return false;
            
        }
        else
        {
            return true;
            
        }        
    }
    
    /**
     * Calculates distance from Circle center to other Circle's
     * center.
     * @return the distance from Circle center to other Circle's
     * center
     */
     public double distance(Circle other)
    {
        CSC142Point otherCenter = other.getCenter();
        return this.center.distance(otherCenter);
        
    }
    
    /**
     *  Calculate brightness of the Circle based on given RGB.
     *  @return brightness of this Circle 
     */
     public double brightness()
    {
        double brightnes =
        Math.sqrt(0.241*color.getRed()*color.getRed()+
        0.691*color.getGreen()*color.getGreen()+
        0.068*color.getBlue()*color.getBlue());
        return brightnes;
      
    }
    /**
     *Set the center of this Circle based on given h and 
     * k coordinates
     * @param double h and k to set the  point of the Circle 
     * 
     */
    public void setCenter(double h , double k)
    {
        center.setPoint(h,k);
         
    }
    /**
     * Set the radius of this Circle
     * @param double r set the radius of this Circle
     * @throws Exception if radius is equal to zero or less
     * then zero.
     */
     public void setRadius(double r)
    {
        if(r<=0)
        {
            throw new IllegalArgumentException();
            
        }
        else
        {
            this.radius=r;
            
        }
    }
    
    /**
     * Set the color of this Circle based on given red, green,
     *  and blue colors.
     *  @param R,G,and B set color for the Circle
     *  @throws Exception if red, green, and blue parameters less
     *   then zero or greater then two hundred fifty five
     */
    public void setColor( int R, int G, int B)
    {
        if (R<0 || R>255)
        {
             throw new IllegalArgumentException();
            
        } 
        else if (G<0 || G>255)
        {
             throw new IllegalArgumentException();
            
        }
        else if (B<0 || B>255)
        {
             throw new IllegalArgumentException();
            
        }
        else
        {
            this.color= new Color(R,G,B);
          
        }
    }
    public String toString(){
        String str="Center's radius:"+this.radius;
        return(str);
    }
    public static void main(String[] args) {
        Circle ref = new Circle(12,1,23,34,45,56);
        System.out.println(ref);
    }
}
