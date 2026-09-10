public class File {
    private final String path;
    private final String name;
    private final String fileType;

    public File(String path, String name, String fileType) {
        this.path = path;
        this.name = name;
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public String toString() {
        String separator = path.endsWith("/") ? "" : "/";
        return path + separator + name + "." + fileType;
    }
}
