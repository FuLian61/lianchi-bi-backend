package com.fulian.springbootinit.manager;

import com.fulian.springbootinit.common.ErrorCode;
import com.fulian.springbootinit.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import lombok.var;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AiManager {

    @Resource
    private YuCongMingClient yuCongMingClient;

    /**
     * AI 对话
     * @param message
     * @return
     */
    public String doChat(long modelId,String message){
        DevChatRequest devChatRequest = new DevChatRequest();
        devChatRequest.setMessage(message);
        devChatRequest.setModelId(modelId);
        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        if (response == null || response.getData() == null) {
            String msg = "AI 响应错误";
            if (response.getData() == null){
                msg = msg + "," + response.getMessage();
            }
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, msg);
        }
        return response.getData().getContent();
    }
}
