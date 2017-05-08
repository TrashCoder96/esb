package com.esb.rest;

import com.esb.types.ChannelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itimofeev on 07.05.2017.
 */

@RestController
@RequestMapping("/vk")
public class VkController {

    @Autowired
    private MessageChannel mainQueueCnannel;

    @RequestMapping("/receive")
    public String receiveMessage() {
        mainQueueCnannel.send(MessageBuilder.withPayload("vk").setHeader("channelType", ChannelType.VK_CHANNEL).build());
        return "c28219b6";

    }

}
