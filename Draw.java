import java.io.*;
import java.util.*;

public class Draw{

    public static void main(String[] args){
	Canvas c = new Canvas(500, 500,0,0,0);
	double x, y;
	Pixel p = new Pixel(100, 100,200);
	EdgeMatrix E = new EdgeMatrix();
	
	//
	E.addEdge(0,100,0,100,0,0);
	E.addEdge(500,200,500,200,0,0);
	c.draw(E, p);
	//
	
	try{
	    c.save("out.ppm");
	} catch (FileNotFoundException r) {
	    System.out.println("Error: File not found");
	}
    }

}
