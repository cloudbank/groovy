// O(nlgn)
   def mergesort(list) {
        mergesort(list, 0, list.size()- 1);
    }
    
    def mergesort(list, start, end) {
    
        if (start < end) {
            def middle = (int)(start + end) / 2;
            mergesort(list, start, middle);
            mergesort(list, middle+1, end);
           merge(list, start, middle, end);
        }    
           return list
    }
    
    
    def merge(list, start, middle, end) {
        def l = list[start..middle];
        def r = list[middle+1..end];
        l+= 10000000
        r+= 10000000
        def i=0;
        def j=0;
        for ( k in start..end) {
            if (l[i] <= r[j]) {
                list[k] = l[i]
                i+=1
            }else {
                list[k] = r[j]
                j+=1
            }
        }
    }
    
  
    
  mergesort([1,2,67,3,6,7632,3,6,32,78,2,1])