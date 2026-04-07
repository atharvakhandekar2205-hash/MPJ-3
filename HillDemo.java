class HillBase {
    void showFood() {
        System.out.println("General food");
    }

    void showPlace() {
        System.out.println("Tourist place");
    }
}

class Leh extends HillBase {
    void showFood() {
        System.out.println("Thukpa");
    }

    void showPlace() {
        System.out.println("Cold desert");
    }
}

class Munnar extends HillBase {
    void showFood() {
        System.out.println("Kerala cuisine");
    }

    void showPlace() {
        System.out.println("Tea hills");
    }
}

class Nainital extends HillBase {
    void showFood() {
        System.out.println("North Indian food");
    }

    void showPlace() {
        System.out.println("Lake view");
    }
}

public class HillDemo {
    public static void main(String[] args) {

        HillBase obj;

        obj = new Leh();
        obj.showFood();
        obj.showPlace();

        obj = new Munnar();
        obj.showFood();
        obj.showPlace();

        obj = new Nainital();
        obj.showFood();
        obj.showPlace();
    }
}
