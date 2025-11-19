package doda25.team13;
public class VersionUtil {

    public static String getVersion() {
        String version = VersionUtil.class.getPackage().getImplementationVersion();
        return version != null ? version : "unknown";
    }

    public static void main(String[] args) {
        System.out.println("--- Library Version Check ---");
        System.out.println("Class Package: " + VersionUtil.class.getPackage().getName());
        System.out.println("Implementation Title: " + VersionUtil.class.getPackage().getImplementationTitle());
        System.out.println("Retrieved Version: " + getVersion());
        System.out.println("-----------------------------");
    }
}
