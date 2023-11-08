interface E {
    void performAction();
}

class X implements E {
    public void shareMessage() {
        System.out.println("Be Creative");
    }

    @Override
    public void performAction() {
        shareMessage();
    }
}

class Y extends X implements E {
    public void inspireOthers() {
        System.out.println("Be Innovative");
    }

    @Override
    public void performAction() {
        super.performAction();
        inspireOthers();
    }
}

class Z extends Y implements E {
    public void demonstratePatience() {
        System.out.println("Practice Endurance");
    }

    @Override
    public void performAction() {
        super.performAction();
        demonstratePatience();
    }
}

class W extends Z implements E {
    public void exhibitHumility() {
        System.out.println("Show Modesty");
    }

    @Override
    public void performAction() {
        super.performAction();
        exhibitHumility();
    }
}

public class exampletoinh  {
    public static void main(String[] args) {
        W w = new W();
        w.performAction();
    }
}
