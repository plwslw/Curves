public class Curve{

    //All goes in  Canvas

    //Canvas in Canvas
    public static bezier (double x0, double x1, double x2, double x3,
			  double y0, double y1, double y2, double y3,
			  int steps){

	double x0, y0;
	Matrix xcor, ycor;
	

	double [][] T = {{t*t*t, t*t, t, 1}};
	
	double [][] A1 = {{-1, 3, -3, 1}, {3, -6, -3, 0}, {-3, 3, 0, 0}, {1, 0, 0, 0}};
	double [][] X = {{x0}, {x1}, {x2}, {x3}};
	double [][] Y = {{y0}, {y1}, {y2}, {y3}};
	
	Matrix coeffX = new Matrix(X);
	Matrix coeffY = new Matrix(Y)

	coeffX.matrixMultiply(A1);
	coeffY.matrixMultiply(A1);
	
	double t;

	xcor = new Matrix( coeffX);
	ycor = new Matrix( coeffY);
	xcor.matrixMultiply(T);
	ycor.matrixMultiply(T);

	x0 = xcor.A[0][0];
	y0 = ycor.A[0][0];
	
	for (int i=0;i<steps;i++){
	    t=(1.0*i)/steps;

	    xcor = new Matrix( coeffX);
	    ycor = new Matrix( coeffY);
	    xcor.matrixMultiply(T);
	    ycor.matrixMultiply(T);

	    //in Canvas
	    line(x0, 
	}

    }

}









/*Matrix notes
Accessor array function
Static matrix multiply function of double [][]
