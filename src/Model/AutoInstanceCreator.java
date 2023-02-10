package Model;

public class AutoInstanceCreator implements AutoFactory {


        @Override
        public Auto getAuto(String autoType) {
            if (autoType == null) {
                return null;
            }
            if (autoType.equalsIgnoreCase("SEDAN")) {
                return new Sedan();
            } else if (autoType.equalsIgnoreCase("CAMIONETA")) {
                return new Camioneta();
            }
            return null;
        }
    }

