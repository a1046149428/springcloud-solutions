package fun.bryce.exception;

/**
 * @author : bryce
 */
public class CaptchaException extends RuntimeException {
    public CaptchaException () {
        super();
    }

    public CaptchaException ( String message ) {
        super( message );
    }

    public CaptchaException ( String message, Throwable cause ) {
        super( message, cause );
    }

    public CaptchaException ( Throwable cause ) {
        super( cause );
    }

    protected CaptchaException ( String message,
                                 Throwable cause,
                                 boolean enableSuppression,
                                 boolean writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
