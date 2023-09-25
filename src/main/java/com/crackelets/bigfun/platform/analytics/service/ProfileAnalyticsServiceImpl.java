package com.crackelets.bigfun.platform.analytics.service;

import com.crackelets.bigfun.platform.analytics.domain.service.ProfileAnalyticsService;
import com.crackelets.bigfun.platform.profile.api.internal.ProfileContextFacade;
import org.springframework.stereotype.Service;

@Service
public class ProfileAnalyticsServiceImpl implements ProfileAnalyticsService {

    private final ProfileContextFacade profileContextFacade;

    public ProfileAnalyticsServiceImpl(ProfileContextFacade profileContextFacade) {
        this.profileContextFacade = profileContextFacade;
    }

    @Override
    public int getTotalOrganizers() {
        return profileContextFacade.getAllOrganizers().size();
    }

}
