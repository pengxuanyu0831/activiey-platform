package cn.pxy.platform.sendawardservice.rpc.impl;

import cn.xy.platform.sendawardservice.rpc.dto.CompanyDTO;
import cn.xy.platform.sendawardservice.service.SendAwardService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @program activity-platform
 * @description:
 * @author: pengxuanyu
 * @create: 2022/04/05 18:09
 */
@DubboService
@Slf4j
public class SendAwardServiceImpl implements SendAwardService {

    @Override
    public void sendRedPacket(CompanyDTO dto) {
        log.info("给{}发送红包",dto.getCompanyName());
    }
}
