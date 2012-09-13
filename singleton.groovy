// prefer the enum definition in java esp. due to the deserialization problem 
// (two objects that are deserialized will be different breaking the pattern)
@Singleton(lazy = true) class T {}

//Would become more or less equivalent to this Groovy class:
//Lazy or not, once again, to access the instance, simply do T.instance (property access, shorcut for T.getInstance()).

class T {
    private static volatile T instance
    private T() {}
    static T getInstance () {
        if (instance) {
            instance
        } else {
            synchronized(T) {
                if (instance) {
                    instance
                } else {
                    instance = new T ()
                }
            }
        }
    }
}
