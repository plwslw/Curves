Splines - cubic equations drawn through a set of points, smooth

Two classes of splines
##1. Hermite curves
*Two points P0, P1 where the curve begins and ends
*the slopes at the endpoints: m0, m1

x(t) = at^3 + bt^2 + ct + d

Let C=coefficient matrix,
then C = H^-1 G
|a| |2  -2 1  1 | |x0 |
|b|=|-3  3 -2 -1|x|x1 |
|c| |0  0  1  0 | |x0'|
|d| |1  0  0  0 | |x1'|

##2. Bezier curves
Given 2 endpoints [A,B] and 2 intermediate points [P1, P2, ...]. The 2 other points are NOT on the curve, but they pull the curve towards it.

Linear Bezier curve:
x(t) = (1-t)Ax + tBx
OR
P(t) = (1-t)A + tB

Quadratic:
P(t) = (1-t)Q0 + tQ1
where
Q0 = (1-t)A + tP1
Q1 = (1-t)P1 + tB

...
P(t) = (1-t)(1-t)A + 2*t(1-t)P1 t^2*B

Cubic:
P(t) = (1-t)^3*A + 3*t*(1-t)^2*P1 + 3*t^2*(1-t)*P2 + t^3*B

     = (-P0 + 3P1 - 3P2 + P3)*t^3 + (3P0 - 6P1 + 3P2)*t^2 + (-3P0 + 3P1)t + P0

OR
|a| |-1  3 -3  1| |P0|
|b|=| 3 -6 -3  0|*|P1|
|c| |-3  3  0  0| |P2|
|d| | 1  0  0  0| |P3|