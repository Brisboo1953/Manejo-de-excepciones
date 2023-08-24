public class NumeroNegativoExcepcion extends Exception {
        public NumeroNegativoExcepcion(){
            super("No existe raiz cuadrada");
        }
        public NumeroNegativoExcepcion(String m){
            super(m);
        }
    }

