package cn.pxy.platform.surpport.controller;

import cn.xy.platform.sendawardservice.rpc.dto.CompanyDTO;
import cn.xy.platform.sendawardservice.service.SendAwardService;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program activity-platform
 * @description:
 * @author: pengxuanyu
 * @create: 2022/04/17 22:14
 */
@RestController
@RequestMapping("/send")
public class SupportController {
    @Autowired
    SendAwardService service;

    @GetMapping("/get")
    public void get(CompanyDTO dto) {
        service.sendRedPacket(dto);
    }
}
