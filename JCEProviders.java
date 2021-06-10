import java.security.Provider;
import java.security.Security;

// edit for linter

public class JCEProviders{
    public static void main(String[] args) {
System.out.println("\n\nHere is a list of the available SecurityProviders:\n ");
System.out.println("-------------------------------------------------- \n ");
        for (Provider provider : Security.getProviders()) {
            System.out.println("Provider: " + provider.getName());
            for (Provider.Service service : provider.getServices()) {
                System.out.println("  Algorithm: " + service.getAlgorithm());
            }
        }
// The meat of the section above is from:
// https://stackoverflow.com/questions/3683302/how-to-find-out-what-algorithm-encryption-are-supported-by-my-jvm
// The section below spills some additional information that can help with configuration.
//
System.out.println("\n\nNow some detailed information:\n ");
System.out.println("------------------------------ \n ");

        for (Provider provider : Security.getProviders()) {
            System.out.println("Provider: " + provider.getName());
            for (Provider.Service service : provider.getServices()) {
                System.out.println(" " + service);
            }
        }

    }
}
