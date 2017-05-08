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
@RequestMapping("/telegram")
public class TelegramController {

    @Autowired
    private MessageChannel mainQueueCnannel;

    @RequestMapping("/receive")
    public void receiveMessage() {
        mainQueueCnannel.send(MessageBuilder.withPayload("telegram").
                setHeader("channelType", ChannelType.TELEGRAM_CHANNEL).build());

    }
}
