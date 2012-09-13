def r = (2..100)
// a one line Sieve of Erasthene which computes the prime numbers within the given range
(r.first()..Math.sqrt(r.last())).each {r -= ((2*it)..(r.last())).step(it) } 
 


   



println r
assert r.size() == 25