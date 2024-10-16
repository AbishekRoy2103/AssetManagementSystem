package exception;

public class AssetNotMaintainException extends Exception {
    
    public AssetNotMaintainException(String message) {
        super(message);
    }
    
    public AssetNotMaintainException(String message, Throwable cause) {
        super(message, cause);
    }
}
