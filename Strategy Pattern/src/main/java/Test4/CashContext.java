package Test3;

import java.lang.annotation.Documented;

/**
 * ClassName: CashContext
 * Package: Test3
 * Description:
 *
 * @Author R
 * @Create 2024/4/25 15:58
 * @Version 1.0
 */
public class CashContext {
    private CashSuper cashSuper;
    //通过构造方法，传入具体的收费策略
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }
    public double getResult(double price,int num) {
        //根据收费策略的不同，获得计算结果
        return this.cashSuper.acceptCash(price,num);
    }
}
