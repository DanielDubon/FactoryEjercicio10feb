package UI;

import Model.Auto;
import Model.AutoFactory;
import Model.AutoInstanceCreator;

public class Main {


    public static void main(String[] args) {

        AutoFactory autoFactory = new AutoInstanceCreator();

        Auto auto1 = autoFactory.getAuto("SEDAN");
        auto1.velocidad();

        Auto auto2 = autoFactory.getAuto("CAMIONETA");
        auto2.velocidad();
    }


    }

