/**
 * 
 */
package com.example.demo.form;

import java.time.LocalDate;

public class EventRegistrationForm {

    private String participantName;
    private String email;
    private LocalDate eventDate;

    public String getParticipantName() { // ⓵ participantNameのゲッター
        return participantName;
    }

    public void setParticipantName(String participantName) { // ⓶ participantNameのセッター
        this.participantName = participantName;
    }

    public String getEmail() { // ⓷ emailのゲッター
        return email;
    }

    public void setEmail(String email) { // ⓸ emailのセッター
        this.email = email;
    }

    public LocalDate getEventDate() { // ⓹ eventDateのゲッター
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) { // ⓺ eventDateのセッター
    	this.eventDate = eventDate;
    }
}

