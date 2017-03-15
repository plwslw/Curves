import java.io.*;
import java.util.*;

public class Matrix{

    public double[][] A;

    public Matrix(){
	A = new double[4][0];
    }

    public Matrix(double [][] x){
	A = x;
    }

    public Matrix(Matrix x){
	A = x.A;
    }

    public int length(){
	return A[0].length;
    }
    
    public void scalarMultiply(double k){
	for (int i=0;i<A.length;i++)
	    for (int j=0;j<A[i].length;j++)
		A[i][j]*=k;
    }
    
    public static Matrix identity(int n){
	double [][]A = new double [n][n];
	for (int i=0;i<n;i++)
	    for (int j=0;j<n;j++){
		if (i==j) A[i][j] = 1;
		else A[i][j] = 0;
	    }
	Matrix ret = new Matrix(A);
	return ret;
    }

    public static Matrix identity(){
	return identity(4);
    }

    //Multiplies by B on the left
    //Updates A with result
    
    public void matrixMultiply(double[][] B){
	int m=B.length;
	int n=A[0].length;
	int r=A.length;
	
	double C[][] = new double [m][n];//Initialized with zeros

	for (int i=0;i<m;i++)
	    for (int j=0;j<n;j++)
		for (int k=0;k<r;k++)
		    C[i][j]+=B[i][k]*A[k][j];

	A=C;
	//return A;//To do right multiplication, can call B.matrixMultiply(A)
    }

    public void matrixMultiply(Matrix B){
	matrixMultiply(B.A);
    }

    public void addColumn(int [] x){
	double [] y = new double[x.length];
	for (int i=0;i<x.length;i++)
	    //y[i] =0;
	    y[i] = (double) (x[i]);
	addColumn(y);
    }
    
    public void addColumn(double [] x){
	for (int i=0;i<A.length;i++){
	    double [] B = A[i];
	    A[i] = new double[A[i].length + 1];
	    for (int j=0;j<A[i].length -1;j++)
		A[i][j] = B[j];
	    A[i][A[i].length-1] = x[i];
	}
    }

    public String toString(){
	String s = "";
	for (int i=0;i<A.length;i++){
	    s+="\t";
	    for (int j=0;j<A[i].length;j++){
		s+=(A[i][j]+"   ");
	    }
	    s+="\n";
	}
	return s;
    }

    public static void main(String[] args){
	System.out.println("4x4 Identity:");
	Matrix A = identity();
	System.out.print(A);

	double [][]B1 = {{1,2,3,4},{6,5,3,5},{-1,14,-6,3},{0,9,-3,4}}; //4x4
	double [][]E1 = {{5,6},{7,8},{9,8},{1,1}};

	Matrix B = new Matrix(B1);
	Matrix E = new Matrix(E1);
		
	System.out.println("\nMatrix E:\n" + E);
	E.scalarMultiply(2);
	System.out.println("\nTesting scalar Multiplication: 2xE\n" + E);

	System.out.println("B:" +B);
	System.out.println("\nTesting Matrix Multiplication: BxE");
	E.matrixMultiply(B);
	System.out.println(E);
	
	//System.out.println("\nMatrix E:\n");

    }
}
