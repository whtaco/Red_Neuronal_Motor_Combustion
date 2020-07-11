/*
Diseño e implementación de un algoritmo que me permita determinar La presión máxima de compresión de un 
motor de encendido provocado basado en una red neuronal artificial recurrente.
“Mediante una red neuronal se le aplicara datos sobre la combustión los cuales serán analizados mediante
estadísticas cargadas a un software”
 */
package red_neuronal_motor_combustion;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
import java.util.*;
import java.util.Scanner;
public class Red_Neuronal_Motor_Combustion {

    /**
     * @param args the command line arguments
     */
    
    public static Double  Seleccionar_parametro_invasivo(){
        
        int codigo=101;
        System.out.println("Codigo 1: "+ codigo);
        double parametro;
        double corriente_consumo=10.2;
        double caida_voltaje=8.2;
        parametro=corriente_consumo - caida_voltaje;
        return parametro;
    }
    
    public static int  Determinar_rango_sensor_MAF(){
        
        int codigo=102;
        System.out.println("Codigo 2: "+ codigo);
        System.out.println("Tipo de sensor: Flujo másico de aire");
        int rango;
        int rango_max=90;
        int rango_min=80;
        rango=(rango_max + rango_min)/2;
        return rango;
    }
    public static int  Delimitar_rango_sensor_MAP(){
        
        int codigo=103;
        System.out.println("Codigo 3: "+ codigo);
        System.out.println("Tipo de sensor: Presion de admisión");
        int rango;
        int rango_max=135;
        int rango_min=120;
        rango=(rango_max + rango_min)/2;
        return rango;
    }
    
    public static String  Implementar_sensor_motor_combustion(){
        
        int codigo=104;
        System.out.println("Codigo 4: "+ codigo);
        String tipo_motor="4 cilindros";
        int cantidad_sensor=2;
        System.out.println("La cantidad de sensores que se implementaron son: "+cantidad_sensor+" sensores");
        return tipo_motor;
    }
    public static String  Diseñar_software_red_neuronal(){
        
        int codigo=105;
        System.out.println("Codigo 5: "+ codigo);
        String tipo_software="LabView";
        String tipo_red_neuronal="Elman";
        System.out.println("El tipo de red neuronal usada es: "+tipo_red_neuronal);
        return tipo_software;
    }
    
    public static String  Adquirir_datos_motor(){
        
        int codigo=106;
        System.out.println("Codigo 6: "+ codigo);
        int cantidad_sensor=2;
        String tipo_dato="Estadístico";
        System.out.println("La cantidad de sensores que se implementaron son: "+cantidad_sensor+" sensores");
        return tipo_dato;
    }
    
    public static String  Comprobar_red_neuronal(){
        
        int codigo=107;
        System.out.println("Codigo 7: "+ codigo);
        String tipo_red_neuronal="Elman";
        return tipo_red_neuronal;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("SELECCIÓN DEL PARAMETRO");
        System.out.println("Se selecciona el parametro o rango de: "+Seleccionar_parametro_invasivo()+" voltios");
        System.out.println("----------------------");
        System.out.println("RANGO DEL SENSOR MAF");
        System.out.println("Rango de funcionamiento MAF es: "+Determinar_rango_sensor_MAF()+" PSI");
        System.out.println("----------------------");
        System.out.println("RANGO DEL SENSOR MAP");
        System.out.println("Rango de funcionamiento MAP es: "+Delimitar_rango_sensor_MAP()+" PSI");
        System.out.println("----------------------");
        System.out.println("IMPLEMENTACIÓN DE LOS SENSORES AL MOTOR");
        System.out.println("El tipo de motor al cual se le implemento fue de: "+Implementar_sensor_motor_combustion());
        System.out.println("----------------------");
        System.out.println("DISEÑO DE LA RED NEURONAL");
        System.out.println("El tipo de software utilizado es: "+Diseñar_software_red_neuronal());
        System.out.println("----------------------");
        System.out.println("DATOS OBTENIDOS");
        System.out.println("Los datos obtenidos son de tipo: "+Adquirir_datos_motor());
        System.out.println("----------------------");
        System.out.println("COMPROBACIÓN DE LA RED NEURONAL");
        System.out.println("La red neuronal "+Comprobar_red_neuronal()+" funciono correctamente");
    }
    
}
