package org.example.lec12;

public abstract class StringUtils {

    private StringUtils() {}

    public static boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }

}
