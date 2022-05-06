package autolote;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Autolote {

    static ArrayList<Carro> Carros = new ArrayList();
    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {

        int menu = 0;
        while (menu != 10) {
            menu = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "1) Add Carro"
                            + "\n2) Edit Marca de Carro"
                            + "\n3) Edit Modelo de Carro"
                            + "\n4) Edit Rueda"
                            + "\n5) Edit Motor"
                            + "\n6) Delete Carro"
                            + "\n7) SOUT Carros"
                            + "\n8) SOUT Ruedas"
                            + "\n9) SOUT Motores"
                            + "\n10) Salir", "Inventario Maxidespensa", JOptionPane.PLAIN_MESSAGE));
            switch (menu) {
                case 1: {

                    String marca = JOptionPane.showInputDialog(null, "Ingrese la Marca del Vehículo", "Add Carro", JOptionPane.PLAIN_MESSAGE);
                    String modelo = JOptionPane.showInputDialog(null, "Ingrese el Modelo del Vehículo", "Add Carro", JOptionPane.PLAIN_MESSAGE);

                    String seriemotor = JOptionPane.showInputDialog(null, "Ingrese la Serie del Motor", "Add Carro", JOptionPane.PLAIN_MESSAGE);
                    int potenciamotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Potencia del Motor", "Add Carro", JOptionPane.PLAIN_MESSAGE));
                    int cilindrosmotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los Cilindros del Motor", "Add Carro", JOptionPane.PLAIN_MESSAGE));
                    int temperaturamotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Temperatura Máxima del Motor", "Add Carro", JOptionPane.PLAIN_MESSAGE));
                    Motor m = new Motor(seriemotor, potenciamotor, cilindrosmotor, temperaturamotor);

                    String marcarueda = JOptionPane.showInputDialog(null, "Ingrese la Marca de la Rueda", "Add Carro", JOptionPane.PLAIN_MESSAGE);
                    int tamañorueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Tamaño de la Rueda del Motor", "Add Carro", JOptionPane.PLAIN_MESSAGE));
                    String tiporueda = JOptionPane.showInputDialog(null, "Ingrese el Tipo de Rueda", "Add Carro", JOptionPane.PLAIN_MESSAGE);
                    Rueda r = new Rueda(marcarueda, tamañorueda, tiporueda);

                    Carro c = new Carro(marca, modelo, m);
                    c.getRuedas().add(r);
                    c.getRuedas().add(r);
                    c.getRuedas().add(r);
                    c.getRuedas().add(r);
//                    c.getRuedas().add(new Rueda());

                    Carros.add(c);
                }
                break;
                case 2: {

                    System.out.println("--- EDIT MARCA :: AUTOLOTE ---");
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - Carro");
                        System.out.println("Marca: " + Carros.get(i).getMarca());
                        System.out.println("Modelo: " + Carros.get(i).getModelo());
                        System.out.println();
                    }

                    int edit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número del Carro con la Marca a Editar", "Edit Marca", JOptionPane.PLAIN_MESSAGE));
                    String marca = JOptionPane.showInputDialog(null, "Ingrese la Nueva Marca", "Edit Marca", JOptionPane.PLAIN_MESSAGE);
                    Carros.get(edit).setMarca(marca);

                }
                break;
                case 3: {

                    System.out.println("--- EDIT MODELO :: AUTOLOTE ---");
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - Carro");
                        System.out.println("Marca: " + Carros.get(i).getMarca());
                        System.out.println("Modelo: " + Carros.get(i).getModelo());
                        System.out.println();
                    }

                    int edit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número del Carro con el Modelo a Editar", "Edit Modelo", JOptionPane.PLAIN_MESSAGE));
                    String modelo = JOptionPane.showInputDialog(null, "Ingrese el Nuevo Modelo", "Edit Modelo", JOptionPane.PLAIN_MESSAGE);
                    Carros.get(edit).setModelo(modelo);

                }
                break;
                case 4: {

                    System.out.println("--- EDIT RUEDA :: AUTOLOTE ---");
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - Carro");
                        System.out.println("Marca: " + Carros.get(i).getMarca());
                        System.out.println("Modelo: " + Carros.get(i).getModelo());
                        System.out.println("Llantas:");
                        for (int j = 0; j < Carros.get(i).getRuedas().size(); j++) {
                            System.out.println("  " + j + " - Llanta");
                            System.out.println("Marca: " + Carros.get(i).getRuedas().get(i).getMarca());
                            System.out.println("Número: " + Carros.get(i).getRuedas().get(i).getNumero());
                            System.out.println("Tipo: " + Carros.get(i).getRuedas().get(i).getTipo());
                        }
                        System.out.println();
                    }

                    int edit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número del Carro con la Llanta a Editar", "Edit Llanta", JOptionPane.PLAIN_MESSAGE));
                    int editllanta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número de la Llanta a Editar", "Edit Llanta", JOptionPane.PLAIN_MESSAGE));

                    String marcarueda = JOptionPane.showInputDialog(null, "Ingrese la Marca de la Rueda", "Edit Llanta", JOptionPane.PLAIN_MESSAGE);
                    int tamañorueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Tamaño de la Rueda", "Edit Llanta", JOptionPane.PLAIN_MESSAGE));
                    String tiporueda = JOptionPane.showInputDialog(null, "Ingrese el Tipo de Rueda", "Edit Llanta", JOptionPane.PLAIN_MESSAGE);

                    Carros.get(edit).getRuedas().set(editllanta, new Rueda(marcarueda, tamañorueda, tiporueda));

                }
                break;
                case 5: {
                    
                    System.out.println("--- EDIT MOTOR :: AUTOLOTE ---");
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - Carro");
                        System.out.println("Marca: " + Carros.get(i).getMarca());
                        System.out.println("Modelo: " + Carros.get(i).getModelo());
                        System.out.println("Motor:");
                        System.out.println(Carros.get(i).getMotor());
                        System.out.println();
                    }

                    int edit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número del Carro con el Motor a Editar", "Edit Motor", JOptionPane.PLAIN_MESSAGE));

                    String seriemotor = JOptionPane.showInputDialog(null, "Ingrese la Serie del Motor", "Edit Motor", JOptionPane.PLAIN_MESSAGE);
                    int potenciamotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Potencia del Motor", "Edit Motor", JOptionPane.PLAIN_MESSAGE));
                    int cilindorsmotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los Cilindros del Motor", "Edit Motor", JOptionPane.PLAIN_MESSAGE));
                    int tempmotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Temperatura Máxima del Motor", "Edit Motor", JOptionPane.PLAIN_MESSAGE));
                    
                    Carros.get(edit).setMotor(new Motor(seriemotor, potenciamotor, cilindorsmotor, tempmotor));

                    
                }
                break;
                case 6: {
                    
                    System.out.println("--- DELETE CARRO :: AUTOLOTE ---");
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - Carro");
                        System.out.println("Marca: " + Carros.get(i).getMarca());
                        System.out.println("Modelo: " + Carros.get(i).getModelo());
                        System.out.println();
                    }
                    
                    int delete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número del Carro a Eliminar", "Delete Carro", JOptionPane.PLAIN_MESSAGE));
                    Carros.remove(delete);
                    JOptionPane.showMessageDialog(null, "Carro Eliminado con Éxito!", "Delete Carro", JOptionPane.PLAIN_MESSAGE);
                    
                }
                break;
                case 7: {
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - " + Carros.get(i));
                        System.out.println();
                    }
                }
                break;
                case 8: {
                    
                    System.out.println("--- RUEDAS ---");
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - Carro");
                        System.out.println("Marca: " + Carros.get(i).getMarca());
                        System.out.println("Modelo: " + Carros.get(i).getModelo());
                        System.out.println("Llantas:");
                        for (int j = 0; j < Carros.get(i).getRuedas().size(); j++) {
                            System.out.println("  " + j + " - Llanta");
                            System.out.println("Marca: " + Carros.get(i).getRuedas().get(i).getMarca());
                            System.out.println("Número: " + Carros.get(i).getRuedas().get(i).getNumero());
                            System.out.println("Tipo: " + Carros.get(i).getRuedas().get(i).getTipo());
                        }
                        System.out.println();
                    }
                    
                }
                break;
                case 9: {
                    
                    System.out.println("--- MOTORES ---");
                    for (int i = 0; i < Carros.size(); i++) {
                        System.out.println(i + " - Carro");
                        System.out.println("Marca: " + Carros.get(i).getMarca());
                        System.out.println("Modelo: " + Carros.get(i).getModelo());
                        System.out.println("Motor:");
                        System.out.println(Carros.get(i).getMotor());
                        System.out.println();
                    }
                    
                }
                break;
            }
        }
    }
}
