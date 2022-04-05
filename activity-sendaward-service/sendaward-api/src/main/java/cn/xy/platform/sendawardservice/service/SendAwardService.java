package cn.xy.platform.sendawardservice.service;

import cn.xy.platform.sendawardservice.rpc.dto.CompanyDTO;

public interface SendAwardService {

    /**
     *  发送接口
     * @param dto
     */
    void sendRedPacket(CompanyDTO dto);
}
