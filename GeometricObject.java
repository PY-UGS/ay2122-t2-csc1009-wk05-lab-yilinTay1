package wk05_Lab;
import java.util.Date;

public class GeometricObject {

    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;
    Date date = new Date();

    public GeometricObject(){
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        this.dateCreated = date;
        return date;
    }

    public String toStringg(){
        String passSentance = ("created on "+date.toString()+"\ncolor: "+this.color+" and filled: "+this.filled);
        return passSentance;
    }
}
