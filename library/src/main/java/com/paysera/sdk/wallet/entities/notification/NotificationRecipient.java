package com.paysera.sdk.wallet.entities.notification;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
abstract public class NotificationRecipient {
    protected String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public abstract String getType();

    protected Boolean androidSingleChannel;

    public Boolean getAndroidSingleChannel() {
        return androidSingleChannel;
    }

    public void setAndroidSingleChannel(Boolean androidSingleChannel) {
        this.androidSingleChannel = androidSingleChannel;
    }

    @Override
    public boolean equals(Object object) {
        return
                object instanceof NotificationRecipient
            && this.getType().equals(((NotificationRecipient) object).getType())
        ;
    }
}
