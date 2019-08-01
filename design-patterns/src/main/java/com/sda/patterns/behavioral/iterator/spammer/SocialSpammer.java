package com.sda.patterns.behavioral.iterator.spammer;

import com.sda.patterns.behavioral.iterator.iterators.ProfileIterator;
import com.sda.patterns.behavioral.iterator.social_networks.SocialNetwork;

public class SocialSpammer {

    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    // TODO: implement this
    public void sendSpamToFriends(String profileEmail, String message) {
        network.createFriendsIterator(profileEmail);
        iterator.getNext();
        if (iterator.hasNext()) {
            sendMessage(profileEmail, message);
        }

    }

    // TODO: implement this
    public void sendSpamToCoworkers(String profileEmail, String message) {

    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
