package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.CoffeeMachine;

public class CoffeeMachineImpl implements CoffeeMachine {
    @Override
    public void onMachine() {
        System.out.println("Running onMachine in CoffeeMachine");
    }
    }
