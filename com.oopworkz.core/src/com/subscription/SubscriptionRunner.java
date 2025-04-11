package com.subscription;

public class SubscriptionRunner {
    public static void main(String[] args) {
        Subscription sub = new Subscription();
        sub.activate();

        Subscription sub1 = new PremiumSubscription();
        sub1.activate();

        System.out.println("**********");

        PremiumSubscription premium = new PremiumSubscription();
        premium.activate();
        premium.accessPremiumContent();
    }
}
