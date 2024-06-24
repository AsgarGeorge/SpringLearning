package car.example.bean;

public class MyBean {
    private String message;

    public MyBean() {
    }

    public MyBean(String message) {
        this.message = message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void showMessage(){
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
