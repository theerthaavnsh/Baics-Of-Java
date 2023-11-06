public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageCollectionDemo obj = new GarbageCollectionDemo();
        obj = null; // Make the object eligible for garbage collection
        System.gc(); // Request the garbage collector to run
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected.");
    }
}
