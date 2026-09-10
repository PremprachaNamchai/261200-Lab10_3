public abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void passToNext(File file) {
        if (nextHandler != null) {
            System.out.println(getHandlerName() + " cannot process, passing to "
                    + nextHandler.getHandlerName());
            nextHandler.process(file);
        } else {
            System.out.println(file.getFileType() + " is not supported");
        }
    }
}