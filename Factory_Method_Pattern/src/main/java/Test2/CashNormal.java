package code.chapter8.factorymethod1;

public class CashNormal implements ISale {
    //正常收费，原价返回
    public double acceptCash(double price,int num){
        return price * num; 
    }    
}
