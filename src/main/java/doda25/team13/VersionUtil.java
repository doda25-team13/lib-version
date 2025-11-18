package doda25.team13;

public class VersionUtil {

    public static String getVersion() {
        String version = VersionUtil.class.getPackage().getImplementationVersion();
        return version != null ? version : "unknown";
    }
}
