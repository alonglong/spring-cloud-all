package com.along.order.exception;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;

/**
 * @Description: 统一异常处理
 * @Author along
 * @Date 2023/12/17 2:02
 */
@Component
public class MyBlockExceptionHandler implements BlockExceptionHandler {

    Logger logger = LoggerFactory.getLogger(MyBlockExceptionHandler.class);

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        logger.info("BlockExceptionHandler BlockException=========" + e.getRule());

        if (e instanceof FlowException) {
            System.out.println("流控");
        } else if (e instanceof DegradeException) {
            System.out.println("服务降级");
        } else if (e instanceof ParamFlowException) {
            System.out.println("热点参数限流");
        } else if (e instanceof SystemBlockException) {
            System.out.println("系统规则");
        } else if (e instanceof AuthorityException) {
            System.out.println("权限不足");
        }

    }
}
