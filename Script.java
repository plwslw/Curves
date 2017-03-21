import java.util.*;
import java.io.*;

public class Script{

    public static void main(String[] args){

	Canvas c = new Canvas(500, 500, 0, 0, 0);
	EdgeMatrix E = new EdgeMatrix();
	TMatrix T = new TMatrix();
	Pixel p = new Pixel(255, 255, 0);
    
	Scanner s = new Scanner( "turtles");
	String line = "";
	String axis = "";

    
	while (s.hasNextLine()){
	    System.out.println("Entering loop");

	    line = s.nextLine();
	    System.out.println(line);
	
	    if (line.equals("line")){
		E.addEdge(s.nextDouble(),s.nextDouble(),s.nextDouble(),
			  s.nextDouble(),s.nextDouble(),s.nextDouble());
	    }

	    else if (line.equals("display")){
		c.draw (E,p);
	    }

	    else if (line.equals("ident")){
		T = new TMatrix();
	    }

	    else if (line.equals("scale")){
		T.scale( s.nextDouble(),s.nextDouble(),s.nextDouble());
	    }

	    else if (line.equals("apply")){
		E.matrixMultiply(T);
	    }

	    else if (line.equals("rotate")){
		axis = s.next();

		if (axis.equals("z")) T.zRotate(s.nextDouble());
		else if (axis.equals("x")) T.xRotate(s.nextDouble());
		else if (axis.equals("y")) T.yRotate(s.nextDouble());
	    }

	    else if (line.equals("save")){
		try{
		    c.save(s.next());
		} catch (FileNotFoundException r) {
		    System.out.println("Error: File not found");
		}
	    }

	}

    }
}
