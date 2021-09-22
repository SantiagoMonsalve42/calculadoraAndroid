package com.example.conversion;

public class Calculator {
    private int num1;
    public Calculator() {

    }
    public Calculator(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public String binario(){
        String resul="";
        int numero=this.getNum1();
        while(numero >0){
            int resultado=numero%2;
            numero=numero/2;
            resul+=resultado;
        }
        String resuldef="";
        for (int x=resul.length()-1;x>=0;x--)
            resuldef = resuldef + resul.charAt(x);
        return resuldef;
    }
    public String octal(){
        String resul="";
        int numero=this.getNum1();
        while(numero >0){
            int resultado=numero%8;
            numero=numero/8;
            resul+=resultado;
        }
        String resuldef="";
        for (int x=resul.length()-1;x>=0;x--)
            resuldef = resuldef + resul.charAt(x);
        return resuldef;
    }
    public String hexa(){
        String resul="";
        int numero=this.getNum1();
        while(numero >0){
            int resultado=numero%16;
            numero=numero/16;
            switch (resultado){
                case 10:
                    resul+='A';
                    break;
                case 11:
                    resul+='B';
                    break;
                case 12:
                    resul+='C';
                    break;
                case 13:
                    resul+='D';
                    break;
                case 14:
                    resul+='E';
                    break;
                case 15:
                    resul+='F';
                    break;
                default:
                    resul+=resultado;
                    break;
            }

        }
        String resuldef="";
        for (int x=resul.length()-1;x>=0;x--)
            resuldef = resuldef + resul.charAt(x);
        return resuldef;
    }

}
