// quicksort O(nlgn)
def quicksort(list)
 
    {
        if ( list.size() < 2 )
            return list;
        def pivot    = list[list.size().intdiv(2)];
    
        def left     = list.findAll {item -> item < pivot};
    
        def middle   = list.findAll {item -> item == pivot};
    
        def right    = list.findAll {item -> item > pivot};
    
        return (quicksort(left) + middle + quicksort(right));
    
    }   
    
quicksort([1,2,67,3,6,7632,3,6,32,78,2,1])