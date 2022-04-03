package cn.xy.platform.sendawardservice.rpc.dto;

import lombok.Data;
import lombok.NonNull;

/**
 * @program activity-platform
 * @description:
 * @author: pengxuanyu
 * @create: 2022/04/03 21:54
 */

@Data
public class CompanyDTO {
    @NonNull
    private String companyName;

    @NonNull
    private String orderNumber;
}
