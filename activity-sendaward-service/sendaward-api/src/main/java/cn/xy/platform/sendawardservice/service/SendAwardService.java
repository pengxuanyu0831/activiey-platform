package cn.xy.platform.sendawardservice.service;

import cn.xy.platform.sendawardservice.rpc.dto.CompanyDTO;

public interface SendAwardService {

    void sendRedPacket(CompanyDTO dto);
}
