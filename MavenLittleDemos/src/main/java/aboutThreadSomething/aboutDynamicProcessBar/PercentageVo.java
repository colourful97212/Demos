package aboutThreadSomething.aboutDynamicProcessBar;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description
 * @Version
 * @Date 8/27/2020
 * @Author Gon
 */

@Data
@Accessors(chain = true)
public class PercentageVo
{
    private String percent;
    private String title;
    private String info;
}
