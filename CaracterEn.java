import java.util.Scanner;
    public class CaracterEn {

        public static void main(String[] args) {
            Scanner Opciones= new Scanner(System.in);
            String opcion = "";
            System.out.printf("Elige el programa que quieras realizar  1. 1er programa 2. 2do programa  Opcion: ");
            opcion= Opciones.nextLine();
            switch(opcion){
                case "1":  if(opcion.equals("1")){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Introduce un numero: ");
                    int numero = scanner.nextInt();
                    try{
                        if(numero<0){
                            throw new NumeroNegativoExcepcion();
                        }else{
                            double raiz = Math.sqrt(numero);
                            System.out.println("La raiz cuadrada es:  " + raiz);
                        }
                    }catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "2": if(opcion.equals("2")){
                    System.out.println("Escribe una frase: ");
                    Scanner scanner = new Scanner(System.in);
                    String lectura = scanner.nextLine();
                    try{
                        char car = CaracterEn.caracterEn(lectura,7);

                        System.out.println("El caracter en la posicion 7 es: " + car);
                    }catch(Exception e){
                        System.out.println("No hay caracter en la posicion");
                    }
                }
            }
        }
        public static char caracterEn(String cad, int ent) throws Exception{

            if(ent >= 0 && ent < cad.length()){
                return cad.charAt(ent);
            }else{
                throw new Exception("No existe");
            }

        }

    }
