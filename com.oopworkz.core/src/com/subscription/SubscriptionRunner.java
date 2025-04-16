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

        Subscription subscription = new Subscription();
        subscription.setServiceName("Netflix");
        subscription.setDurationMonths(12);

        Subscription sub2 = new Subscription(subscription);
        System.out.println(sub2);

    }
}
