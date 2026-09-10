public class ImageHandler extends AbstractHandler {
    @Override
    public void process(File file) {
        if ("jpg".equalsIgnoreCase(file.getFileType())) {
            System.out.println(file + " is being processed by " + getHandlerName());
        } else {
            passToNext(file);
        }
    }

    @Override
    public String getHandlerName() {
        return "ImageHandler";
    }
}