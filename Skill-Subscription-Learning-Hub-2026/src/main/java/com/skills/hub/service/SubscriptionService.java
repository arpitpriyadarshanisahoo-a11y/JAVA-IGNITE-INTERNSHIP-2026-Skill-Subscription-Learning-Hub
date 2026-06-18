package com.skills.hub.service;

import com.skills.hub.entity.Subscription;

import java.util.List;

public interface SubscriptionService {
    List<Subscription> getAll();
    Subscription save(Subscription subscription);
    void deleteById(Long id);
}
