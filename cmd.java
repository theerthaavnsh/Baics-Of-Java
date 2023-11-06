public class JavaFeatures {
    public static void main(String[] args) {
        String[] features = {
            "Simple", "Object-Oriented", "Distributed", "Robust",
            "Secure", "Portable", "Multithreaded", "Dynamic"
        };

        for (int i = 0; i < args.length; i++) {
            int index = Integer.parseInt(args[i]);
            if (index >= 1 && index <= features.length) {
                System.out.println(index + ". JAVA is " + features[index - 1]);
            }
        }
    }
}
