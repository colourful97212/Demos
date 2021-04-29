package aboutStrategyPatternSomeThing.solution;

import org.apache.commons.codec.binary.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 策略工厂 加 单例
 * @Version
 * @Date 2021/4/29
 * @Author Gon
 */
public class ReceiptHandleStrategyFactory
{
    private static Map<String,IReceiptHandleStrategy> receiptHandleStrategyMap;

    private ReceiptHandleStrategyFactory()
    {
        this.receiptHandleStrategyMap = new HashMap<>();
        this.receiptHandleStrategyMap.put("MT2101",new Mt2101ReceiptHandleStrategy());
        this.receiptHandleStrategyMap.put("MT8104",new Mt8104ReceiptHandleStrategy());
    }

    public static IReceiptHandleStrategy getReceiptHandleStrategy(String receiptType)
    {
//        IReceiptHandleStrategy receiptHandleStrategy = null;
//        if (StringUtils.equals("MT2101", receiptType))
//        {
//            receiptHandleStrategy = new Mt2101ReceiptHandleStrategy();
//        }
//        else if (StringUtils.equals("MT8104", receiptType))
//        {
//            receiptHandleStrategy = new Mt8104ReceiptHandleStrategy();
//        }
//        return receiptHandleStrategy;
        //单例
        if (receiptHandleStrategyMap == null)
        {
            new ReceiptHandleStrategyFactory();
        }
        return receiptHandleStrategyMap.get(receiptType);
    }

}
