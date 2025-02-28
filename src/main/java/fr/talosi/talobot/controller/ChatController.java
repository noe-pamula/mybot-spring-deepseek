package fr.talosi.talobot.controller;

import fr.talosi.talobot.service.DeepseekService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatController {

    private final DeepseekService deepseekService;

    public ChatController(DeepseekService deepseekService) {
        this.deepseekService = deepseekService;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return deepseekService.getChatResponse(message);
    }
}