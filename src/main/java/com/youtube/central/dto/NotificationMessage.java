package com.youtube.central.dto;

public class NotificationMessage {
    String type; //user-registration, video-upload -notification, new-video-available
    String email; //user we need to send notification
    String name;//name of the user
    public String getPurpose() {
        return type;
    }

    public void setPurpose(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String s) {
    }
}
