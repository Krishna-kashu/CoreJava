package com.subscription;

public class PremiumSubscription extends Subscription {
    public PremiumSubscription() {
        System.out.println("no-arg constructor of PremiumSubscription");
    }

    @Override
    public void activate() {
        System.out.println("Running overridden activate() in PremiumSubscription");
    }

    void accessPremiumContent() {
        System.out.println("Running accessPremiumContent() in PremiumSubscription");
    }
}
