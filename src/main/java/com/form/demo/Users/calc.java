package com.form.demo.Users;

public class calc {
    private String operation;
    private int number1;
    private int number2;
    private double sonuc;

    public calc() {
    }

    public calc(int number1, int number2 , String operation) {
        this.operation = operation;
        this.number1 = number1;
        this.number2 = number2;
    }

    // Getters and Setters
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getNumber1(){
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public double getSonuc() {
        return sonuc;
    }

    public void setSonuc(double sonuc) {
        if(operation.equals("+")){
            sonuc = number1 + number2;
            this.sonuc = sonuc;
        }
        else if(operation.equals("-")){
            sonuc = number1 - number2;
            this.sonuc = sonuc;
        }
        else if(operation.equals("*")){
            sonuc = number1 * number2;
            this.sonuc = sonuc;
        }
        else if(operation.equals("/")){
            if(number2 == 0){
                this.sonuc = sonuc;
            }
            else{
            sonuc = (float) number1 / (float) number2;
            this.sonuc = sonuc;
        }
        }
        else{
            this.sonuc = sonuc;
        }
        
    }
}
