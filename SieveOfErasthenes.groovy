def r = (2..100)
// a one line Sieve of Erasthene which computes the prime numbers within the given range
// we only need to check to the sqrt since given any c= a*b, sqrt*sqrt = c thus if a < sqrt, b must > sqrt and we
// already found out about c's primality at a
(r.first()..Math.sqrt(r.last())).each {r -= ((2*it)..(r.last())).step(it) } 
 


   



println r
assert r.size() == 25