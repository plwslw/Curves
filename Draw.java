import java.io.*;
import java.util.*;

public class Draw{

    public static void draw(Canvas c, EdgeMatrix E, Pixel p){
	int lines = E.length();
	draw(c, E, p, lines);
    }

    public static void draw(Canvas c, EdgeMatrix E, Pixel p, int lines){
	int N = (lines < E.length()) ? lines : E.length();
	for (int i=0;i<N;i+=2)
	    c.line(E.A[0][i], E.A[0][i+1], E.A[1][i], E.A[1][i+1], p);
    }
    
    public static void main(String[] args){
	Canvas c = new Canvas(500, 500,0,0,0);
	double x, y;
	Pixel p = new Pixel(100, 100,200);
	EdgeMatrix E = new EdgeMatrix();
	
	//
	E.addEdge(0,100,0,100,0,0);
	E.addEdge(500,200,500,200,0,0);
	draw(c, E, p);
	//
	
	try{
	    c.save("out.ppm");
	} catch (FileNotFoundException r) {
	    System.out.println("Error: File not found");
	}
    }

}
