package exceptions;

public class ExceptionEmptyField extends Exception{
    public ExceptionEmptyField() {
        super("Заполнены не все обязательные поля");
    }
}
