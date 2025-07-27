import java.util.*;


public class BookStore {
    public static void main(String [] args){
        Scanner a = new Scanner (System.in);
        Scanner b = new Scanner (System.in);
        Scanner c = new Scanner (System.in);
        
        System.out.print("pencil cost: ");
        float pencil = a.nextFloat();
         System.out.print("pen cost: ");
        float pen = b.nextFloat();
         System.out.print("eraser cost: ");
        float eraser = c.nextFloat();

        float gst = (pencil+pen+eraser);
    
        System.out.println("The total cost : " + gst);

        float Gst = gst + (0.18f * gst);

        System.out.print("cost with gst: " + Gst);



    }
}
