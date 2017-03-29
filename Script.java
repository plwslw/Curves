import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Script{

    public static void main(String[] args){

	Canvas c = new Canvas();
	//EdgeMatrix E = new EdgeMatrix();
	TMatrix T = new TMatrix();
	Pixel p = new Pixel(255, 0, 255);
    
	//Scanner s = new Scanner( "script");

	File file = new File(args[0]);
	Scanner s;

	try {
	    s = new Scanner(file);
	} 
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	    s = new Scanner("");
	}
	String line = "";
	String axis = "";

    
	while (s.hasNextLine()){
	    //System.out.println("Entering loop");

	    line = s.nextLine();
	    System.out.println(line);
	
	    if (line.equals("line")){
		E.addEdge(s.nextDouble(),s.nextDouble(),s.nextDouble(),
			  s.nextDouble(),s.nextDouble(),s.nextDouble());
	    }

	    else if (line.equals("display")){
		c.draw (p);
		System.out.println("edge matrix:\n" + C.E);
		c.display();
		c.clear();
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

	    else if (line.equals("move")){
		T.translate( s.nextDouble(),s.nextDouble(),s.nextDouble());
	    }

	    else if (line.equals("rotate")){
		axis = s.next();

		if (axis.equals("z")) T.zRotate(s.nextDouble());
		else if (axis.equals("x")) T.xRotate(s.nextDouble());
		else if (axis.equals("y")) T.yRotate(s.nextDouble());
	    }

	    else if (line.equals("circle")){
		Canvas.circle( s.nextInt(), s.nextInt(), s.nextInt(),
			s.nextInt());
	    }

	    else if (line.equals("bezier")){
		Canvas.spline( s.nextDouble(), s.nextDouble(), s.nextDouble(),
			s.nextDouble(), s.nextDouble(), s.nextDouble(),
			       s.nextDouble(), s.nextDouble(), 0);
	    }
	    
	    else if (line.equals("hermite")){
		Canvas.spline( s.nextDouble(), s.nextDouble(), s.nextDouble(),
			s.nextDouble(), s.nextDouble(), s.nextDouble(),
			       s.nextDouble(), s.nextDouble(), 1);
	    }

	    else if (line.equals("save")){
		System.out.println("edge matrix:\n" + C.E);
		c.save_extension(s.next());
	    }

	}

    }
}
