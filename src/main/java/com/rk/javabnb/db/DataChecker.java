package com.rk.javabnb.db;
public class DataChecker {

    public DataChecker() {}

    /**
     * Comprueba que un numero de teléfono tenga la longitud apropiada, y que sea un número
     * @param tfn Telefono a verificar
     * @return boolean
     * */
    public static boolean checkTfn(String tfn) {
        //verifica si el número de teléfono tiene nueve dígitos numéricos
        boolean longitud = false;
        boolean numeros = false;
        if(tfn.length()==9) {longitud = true;}
        try{
            Integer.parseInt(tfn);
            numeros = true;
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return longitud && numeros;
    }

    /**
     * Comprueba que un DNI tenga la longitud apropiada y que la letra sea la correcta
     * @param DNI DNI a verificar
     * @return boolean
     * */
    public static boolean checkDNI(String DNI) {
        //verifica si el DNI tiene ocho numeros y el digito correcto detras
        boolean correctLenght = false;
        boolean correctDigit = false;
        char[] letras = {'T', 'R','W', 'A','G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        try {
            int numeros = Integer.parseInt(DNI.substring(0, DNI.length()-1));
            int index = numeros % 23;
            if(DNI.charAt(DNI.length()-1) == letras[index]) { correctDigit = true; }
            if(DNI.length() == 9) { correctLenght = true; }
            return correctDigit&&correctLenght;
        }catch (Exception e) {
            return false;
        }
    }

    /**
     * Comprueba que la contraseña sea segura
     * @param pass contraseña a verificar
     * @return boolean
     * */
    public static  boolean checkPass(char[] pass) {
        return pass.length > 8;
    }

    /**
     * confirma si el año está entre 2023 (no nos sirven fechas pasadas) y 3000, confirma que el més está entre 1 y 12
     * y que el día está en el rango del respectivo més, teniendo en cuenta los años bisiestos para el mes de febrero
     * @param fecha es la fecha cuya validez se va a verificar, se pasa como una lista de tres Strings - el dia, el mes y el año
     * @return devuelve false si la fecha no existe y true si la fecha es válida y existe
     */
    public static boolean checkFecha(String[] fecha) {
        boolean correcto = false;
        int contador = 0;
        int ano = Integer.parseInt(fecha[2]);
        int mes = Integer.parseInt(fecha[1]);
        int dia = Integer.parseInt(fecha[0]);
        boolean anobisiesto = ano%4==0;

        if(ano%100==0&&!(ano%400==0)) {anobisiesto = false;}
        if(2023<ano&&ano<3000){contador+=1;}
        if(0<mes&&mes<13){contador+=1;}
        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            if(0<dia&&dia<32){contador+=1;}
        }else if(mes==4||mes==6||mes==9||mes==11){
            if(0<dia&&dia<31){contador+=1;}
        }else if(mes==2&&anobisiesto){
            if(0<dia&&dia<30){contador+=1;}
        }else if(mes==2&&(!anobisiesto)){
            if(0<dia&&dia<29){contador+=1;}
        }
        if(contador==3){correcto = true;}
        return correcto;
    }

    /**
     * los códigos postales de España tienen cinco dígitos, este método valida un CP introducido
     * @param cp - es el código postal que ha introducido el usuario
     * @return devuelve true si se ha podido validar el CP
     */
    public static boolean checkCP(String cp){
        if(cp.length()==5){return true;}else{return false;}
    }

}
