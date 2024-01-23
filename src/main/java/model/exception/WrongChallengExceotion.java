package model.exception;

public class WrongChallengExceotion extends Exception{
    public WrongChallengExceotion() {
    }

    public WrongChallengExceotion(String message) {
        super(message);
    }

    public WrongChallengExceotion(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongChallengExceotion(Throwable cause) {
        super(cause);
    }

    public WrongChallengExceotion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
