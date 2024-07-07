package pizza;

public class Pizza {
    private String name;

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    private Size size;
    private boolean sauce;
    private String address;
    private boolean accepted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Pizza(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
        this.accepted = false;
    }

    private String checkSauce() {
        if (this.sauce) {
            return "с соусом";
        } else {
            return "без соуса";
        }
    }

    private String checkSize() {
        return switch (this.size) {
            case SMALL -> "Маленькая";
            case MEDIUM -> "Средняя";
            case LARGE -> "Большая";
        };
    }

    public void order() {
        if (!this.accepted) {
            this.accepted = true;
            System.out.println("Заказ принят. " + checkSize() + " пицца «" + this.name + "» " + checkSauce() + " на адрес " + this.address);
        } else {
            System.out.println("Заказ уже принят!");
        }
    }

    public void cancel() {
        if (this.accepted) {
            this.accepted = false;
            System.out.println("Заказ отменён!");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    private String checkAccepted() {
        if (this.accepted){
            return " был принят";
        }
        else {
            return " не был принят или отменён";
        }
    }

    @Override
    public String toString () {
        System.out.println("Заказ " + checkSize() + " пицца «" + this.name + "» " + checkSauce() + " на адрес " + this.address + checkAccepted());
        return "";
    }
}
