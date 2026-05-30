package com.example;

import net.fabricmc.api.ClientModInitializer;

public class SpecterMarkClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExampleMod.LOGGER.info("SpecterMark Client loaded!");
    }
}
