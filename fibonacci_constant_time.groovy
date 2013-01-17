/*  CONSTANT TIME FIBONACCI  

the nth fibonacci number can be expressed as a recurrence relation 
Fn = Fn-1 + Fn-2
This is often solved via recursion in CS with a such a soln: 
fibonacci(int n) { 
    n <= 1 ? n :  fibonacci(n-1) + fibonacci(n-2);
}    
in exponential time O(2^n) as each call creates two more recursive calls.
The problem can also be solved in linear time using memoization to cache the result.
Even better, is the constant time soln which uses the characteristic polynomial
approach and is known as Binet's Theorem.  It was derived by Binet in 1843, although 
the result was known to Euler, Daniel Bernoulli, and de Moivre more than a century earlier.

r^2 = r + 1
== r^2 - r -1 = 0
solving for the roots in the normal way we get
r =  (1 +- sqrt(5)) / 2 or the golden section phi and its inverse rho

Fn = A[(phi)^n] + B[(rho)^n]
Solving the boundary conditions given by the definition of the fibonacci sequence F(0) =0 and F(1) =1 gives:
A + B = 0
A = -B
phi + rho = 1
==> yields
A = 1 /sqrt(5), B = - 1/sqrt(5)
which gives
Fn = 1/sqrt(5)[(phi)^n - (rho)^n]
*/


def phi = (1 + Math.sqrt(5)) / 2
def rho = (1 - Math.sqrt(5)) / 2


def fibonacci = { ( (1 / Math.sqrt(5)) * (phi**it - rho**it)).intValue() }

assert fibonacci(3) == 2
assert fibonacci(0) == 0
assert fibonacci(6) == 8
