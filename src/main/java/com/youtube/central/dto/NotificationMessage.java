package com.youtube.central.dto;

public class NotificationMessage {
    String purpose; //user-registration, video-upload -notification, new-video-available
    String email; //user we need to send notification

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
