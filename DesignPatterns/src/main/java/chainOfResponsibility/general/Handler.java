package chainOfResponsibility.general;

/**
 * Created by yh on 2018/7/21.
 *
 */
public abstract class Handler {

    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者，业务自行处理
            }
        }

        return response;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);
}
