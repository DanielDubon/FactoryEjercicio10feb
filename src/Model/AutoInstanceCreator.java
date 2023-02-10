package Model;

public class AutoInstanceCreator implements AutoFactory { //Se aplica la dependencia ya que depende de la interfaz para obtener el metodo getAuto


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

