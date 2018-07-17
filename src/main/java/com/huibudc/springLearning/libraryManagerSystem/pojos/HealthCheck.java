package com.huibudc.springLearning.libraryManagerSystem.pojos;

import java.util.Date;

public class HealthCheck {
    private boolean isAvailable;
    private Date lastUpdated;

    public HealthCheck(boolean isAvailable, Date lastUpdated) {
        this.isAvailable = isAvailable;
        this.lastUpdated = lastUpdated;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
