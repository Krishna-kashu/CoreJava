package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.AppDTO;
import com.myworkz.queryhub.dto.AppOwner;
import com.myworkz.queryhub.dto.AppVersion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppRepoImpl implements AppRepo{
    @Override
    public List<AppDTO> findAll() {

        List<AppDTO> list = new ArrayList<>();

        list.add(new AppDTO("WhatsApp", "Messaging", AppVersion.RELEASE, LocalDate.of(2023, 2, 10), 38.5, true, 0.0,
                Arrays.asList(new AppOwner("Meta Inc.", "support@meta.com"))));

        list.add(new AppDTO("Instagram", "Social Media", AppVersion.V4_0, LocalDate.of(2022, 11, 5), 125.0, true, 0.0,
                Arrays.asList(new AppOwner("Meta Inc.", "ig@meta.com"))));

        list.add(new AppDTO("Spotify", "Music", AppVersion.V3_0, LocalDate.of(2023, 9, 12), 98.0, true, 4.99,
                Arrays.asList(new AppOwner("Daniel Ek", "daniel@spotify.com"))));

        list.add(new AppDTO("Zoom", "Communication", AppVersion.V2_0, LocalDate.of(2023, 6, 1), 55.0, true, 9.99,
                Arrays.asList(new AppOwner("Eric Yuan", "eric@zoom.us"))));

        list.add(new AppDTO("Netflix", "Streaming", AppVersion.V4_0, LocalDate.of(2024, 1, 20), 102.3, false, 14.99,
                Arrays.asList(new AppOwner("Reed Hastings", "reed@netflix.com"))));

        list.add(new AppDTO("Gmail", "Email", AppVersion.RELEASE, LocalDate.of(2023, 10, 5), 45.5, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "gmail-support@google.com"))));

        list.add(new AppDTO("Google Drive", "Productivity", AppVersion.V3_0, LocalDate.of(2023, 3, 18), 92.1, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "drive-support@google.com"))));

        list.add(new AppDTO("Slack", "Team Chat", AppVersion.V2_0, LocalDate.of(2023, 4, 9), 88.9, true, 6.67,
                Arrays.asList(new AppOwner("Stewart Butterfield", "support@slack.com"))));

        list.add(new AppDTO("LinkedIn", "Professional Network", AppVersion.RELEASE, LocalDate.of(2023, 8, 30), 70.0, true, 0.0,
                Arrays.asList(new AppOwner("Microsoft Corp.", "support@linkedin.com"))));

        list.add(new AppDTO("YouTube", "Streaming", AppVersion.V4_0, LocalDate.of(2023, 12, 1), 150.0, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "yt-support@google.com"))));

        list.add(new AppDTO("Amazon", "Shopping", AppVersion.V3_0, LocalDate.of(2023, 9, 1), 130.0, true, 0.0,
                Collections.singletonList(new AppOwner("Amazon Inc.", "support@amazon.com"))));

        list.add(new AppDTO("Flipkart", "Shopping", AppVersion.V3_0, LocalDate.of(2023, 6, 21), 90.0, true, 0.0,
                Arrays.asList(new AppOwner("Binny Bansal", "binny@flipkart.com"), new AppOwner("Sachin Bansal", "sachin@flipkart.com"))));

        list.add(new AppDTO("Trello", "Project Management", AppVersion.V2_0, LocalDate.of(2023, 7, 1), 39.0, true, 0.0,
                Arrays.asList(new AppOwner("Atlassian", "trello@atlassian.com"))));

        list.add(new AppDTO("Google Maps", "Navigation", AppVersion.V4_0, LocalDate.of(2023, 11, 19), 110.0, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "maps-support@google.com"))));

        list.add(new AppDTO("Canva", "Design", AppVersion.V3_0, LocalDate.of(2023, 10, 10), 75.0, true, 6.99,
                Arrays.asList(new AppOwner("Melanie Perkins", "mel@canva.com"))));

        list.add(new AppDTO("Paytm", "Payments", AppVersion.V2_0, LocalDate.of(2024, 1, 2), 48.5, true, 0.0,
                Arrays.asList(new AppOwner("Vijay Shekhar Sharma", "vijay@paytm.com"))));

        list.add(new AppDTO("Telegram", "Messaging", AppVersion.RELEASE, LocalDate.of(2023, 12, 24), 42.3, true, 0.0,
                Arrays.asList(new AppOwner("Pavel Durov", "pavel@telegram.org"))));

        list.add(new AppDTO("Snapchat", "Social Media", AppVersion.V3_0, LocalDate.of(2023, 7, 14), 85.0, true, 0.0,
                Arrays.asList(new AppOwner("Snap Inc.", "support@snapchat.com"))));

        list.add(new AppDTO("Pinterest", "Lifestyle", AppVersion.V2_0, LocalDate.of(2023, 5, 8), 70.3, true, 0.0,
                Arrays.asList(new AppOwner("Ben Silbermann", "ben@pinterest.com"))));

        list.add(new AppDTO("PhonePe", "Finance", AppVersion.RELEASE, LocalDate.of(2023, 6, 9), 49.9, true, 0.0,
                Arrays.asList(new AppOwner("PhonePe Pvt Ltd", "support@phonepe.com"))));

        list.add(new AppDTO("Uber", "Transport", AppVersion.V3_0, LocalDate.of(2023, 8, 9), 72.2, true, 0.0,
                Arrays.asList(new AppOwner("Uber Technologies", "support@uber.com"))));

        list.add(new AppDTO("MX Player", "Media", AppVersion.RELEASE, LocalDate.of(2023, 11, 7), 92.4, true, 0.0,
                Arrays.asList(new AppOwner("MX Media", "support@mxplayer.in"))));

        list.add(new AppDTO("Koo", "Social", AppVersion.BETA, LocalDate.of(2023, 7, 30), 42.6, true, 0.0,
                Arrays.asList(new AppOwner("Koo App", "support@kooapp.com"))));

        list.add(new AppDTO("Zomato", "Food Delivery", AppVersion.V2_0, LocalDate.of(2023, 7, 4), 65.7, true, 0.0,
                Arrays.asList(new AppOwner("Deepinder Goyal", "deepinder@zomato.com"))));

        list.add(new AppDTO("Swiggy", "Food Delivery", AppVersion.V2_0, LocalDate.of(2023, 6, 30), 67.3, true, 0.0,
                Arrays.asList(new AppOwner("Sriharsha Majety", "sriharsha@swiggy.com"))));

        list.add(new AppDTO("Google Photos", "Cloud Storage", AppVersion.V3_0, LocalDate.of(2023, 10, 2), 89.6, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "photos@google.com"))));

        list.add(new AppDTO("Microsoft Word", "Productivity", AppVersion.RELEASE, LocalDate.of(2023, 11, 1), 195.0, false, 7.99,
                Arrays.asList(new AppOwner("Microsoft Corp.", "support@office.com"))));

        list.add(new AppDTO("Discord", "Voice Chat", AppVersion.V3_0, LocalDate.of(2023, 9, 25), 86.0, true, 0.0,
                Arrays.asList(new AppOwner("Jason Citron", "jason@discord.com"))));

        list.add(new AppDTO("Coursera", "Education", AppVersion.V3_0, LocalDate.of(2023, 12, 12), 120.5, true, 12.99,
                Arrays.asList(new AppOwner("Andrew Ng", "andrew@coursera.org"))));

        list.add(new AppDTO("Duolingo", "Education", AppVersion.V2_0, LocalDate.of(2023, 6, 18), 55.8, true, 0.0,
                Arrays.asList(new AppOwner("Luis von Ahn", "luis@duolingo.com"))));

        list.add(new AppDTO("Google Fit", "Health", AppVersion.RELEASE, LocalDate.of(2023, 10, 3), 41.0, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "fit-support@google.com"))));

        list.add(new AppDTO("Google Photos", "Utility", AppVersion.RELEASE, LocalDate.of(2024, 2, 14), 108.3, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "photos-support@google.com"))));

        list.add(new AppDTO("Google Lens", "Utility", AppVersion.ALPHA, LocalDate.of(2023, 3, 3), 45.1, true, 0.0,
                Arrays.asList(new AppOwner("Google LLC", "lens-support@google.com"))));

        list.add(new AppDTO("ShareChat", "Social", AppVersion.RELEASE, LocalDate.of(2023, 11, 13), 58.3, true, 0.0,
                Arrays.asList(new AppOwner("ShareChat", "help@sharechat.com"))));

        list.add(new AppDTO("True Caller", "Utility", AppVersion.RELEASE, LocalDate.of(2023, 8, 23), 59.1, true, 0.0,
                Arrays.asList(new AppOwner("TrueCaller", "support@truecaller.com"))));

        list.add(new AppDTO("Opera Browser", "Utility", AppVersion.ALPHA, LocalDate.of(2022, 12, 10), 78.4, true, 0.0,
                Arrays.asList(new AppOwner("Opera Software", "help@opera.com"))));

        list.add(new AppDTO("SkillShare", "Education", AppVersion.BETA, LocalDate.of(2023, 11, 25), 96.3, false, 15.99,
                Arrays.asList(new AppOwner("Skillshare", "support@skillshare.com"))));

        list.add(new AppDTO("Hotstar", "Streaming", AppVersion.V4_0, LocalDate.of(2023, 12, 31), 110.2, true, 7.99,
                Arrays.asList(new AppOwner("Disney+ Hotstar", "support@hotstar.com"))));

        return list;
    }
}
