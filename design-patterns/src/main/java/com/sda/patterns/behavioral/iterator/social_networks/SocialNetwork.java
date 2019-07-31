package com.sda.patterns.behavioral.iterator.social_networks;

import com.sda.patterns.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
