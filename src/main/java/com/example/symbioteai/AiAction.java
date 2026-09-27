package com.example.symbioteai;

public class AiAction {
    public String mode = "idle";
    public String target = "none";
    public boolean refuse = false;
    public boolean mutiny = false;

    public static AiAction idle() {
        AiAction a = new AiAction();
        a.mode = "idle";
        return a;
    }
}
