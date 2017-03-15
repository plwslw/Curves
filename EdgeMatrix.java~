import java.io.*;
import java.util.*;

public class EdgeMatrix extends Matrix{

    public EdgeMatrix(){
	super();
    }

    public EdgeMatrix(double[][] x){
	super(x);
    }

    public EdgeMatrix(EdgeMatrix E){
	super();
    }
    
    public void addEdge(double x1, double x2, double y1, double y2, double z1, double z2){
	double [] P1={x1, y1, z1, 1};
	double [] P2={x2, y2, z2, 1};
	addColumn(P1);
	addColumn(P2);
    }

    public void addEdge(int x1, int x2, int y1, int y2, int z1, int z2){
	double a1 = (double) x1;
	double a2 = (double) x2;
	double b1 = (double) y1;
	double b2 = (double) y2;
	double c1 = (double) z1;
	double c2 = (double) z2;
	addEdge(a1, a2, b1, b2, c1, c2);
    }

    public static void main(String[] args){
	/*
	System.out.println("4x4 Identity:");
	Matrix A = identity();
	System.out.print(A);

	double [][]B1 = {{1,2,3,4},{6,5,3,5},{-1,14,-6,3},{0,9,-3,4}}; //4x4
	double [][]E1 = {{5,6},{7,8},{9,8},{1,1}};

	EdgeMatrix B = new EdgeMatrix(B1);
	EdgeMatrix E = new EdgeMatrix(E1);
		
	System.out.println("\nMatrix E:\n" + E);
	E.scalarMultiply(2);
	System.out.println("\nTesting scalar Multiplication: 2xE\n" + E);

	System.out.println("B:" +B);
	System.out.println("\nTesting Matrix Multiplication: BxE");
	E.matrixMultiply(B);
	System.out.println(E);
	
	//System.out.println("\nMatrix E:\n");
	*/
    }
}
