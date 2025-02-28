package fr.talosi.talobot.service;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class DeepseekService {
    private final OllamaChatModel ollamaChatModel;

    public DeepseekService(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    public String getChatResponse(String prompt) {
        return ollamaChatModel.call(prompt);
    }
}
